import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas
{
    public void cria(InputStream inputStream, String nomeArquivo, String texto, InputStream imagemAluno) throws Exception
    {
        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;

        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
        
        //copiar a imagem original para nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        //Colocando imagem do aluno
        BufferedImage imagemWilliam = ImageIO.read(imagemAluno);
        graphics.drawImage(imagemWilliam, 0, altura, null);

        // Configurar a fonte e cor
        Font fonte = new Font("Comic Sans MS", Font.BOLD, 100);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);

        //Calculando espaçamento para centralizar o texto
        FontMetrics fontMetrics = graphics.getFontMetrics();
        Rectangle2D rectangle = fontMetrics.getStringBounds(texto, graphics);
        double larguraTexto = rectangle.getWidth();
        double alturaTexto = rectangle.getHeight();
        int espacamentoEsquerdo = ((largura-(int)larguraTexto-imagemWilliam.getWidth())/2)+imagemWilliam.getWidth();
        int espacamentoSuperior = novaAltura-((200-(int) alturaTexto));

        // Escrever uma frase na nova imagem
        graphics.drawString(texto, espacamentoEsquerdo, espacamentoSuperior);

        //Colocando contorno no texto
        FontRenderContext fontRenderContext = graphics.getFontRenderContext();
        TextLayout textLayout = new TextLayout(texto, fonte, fontRenderContext);
        Shape shape = textLayout.getOutline(null);
        AffineTransform affineTransform = graphics.getTransform();
        affineTransform.translate(espacamentoEsquerdo, espacamentoSuperior);
        graphics.setTransform(affineTransform);

        Stroke Stroke = new BasicStroke(3.0f);
        graphics.setStroke(Stroke);

        graphics.setColor(Color.BLUE);
        graphics.draw(shape);
        graphics.setClip(shape);

        //Verifica se o diretório de saída existe. Se não existir, cria o diretório.
        File diretorioSaida = new File("saida");
        if(!diretorioSaida.exists())
        {
            diretorioSaida.mkdir();
        }

        // Escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida/" + nomeArquivo));
    }
}
