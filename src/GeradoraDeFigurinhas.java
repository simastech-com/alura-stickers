import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas
{
    public void cria(InputStream inputStream, String nomeArquivo, String texto, int fontSize) throws Exception
    {
        String[] partes = texto.split(":");
        if(partes.length == 1)
        {
            partes = texto.split(",");
        }

        int espacoLegenda = 150;
        if(partes.length>1)
        {
            espacoLegenda = partes.length * 130;
        }
        
        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + espacoLegenda;

        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
        
        //copiar a imagem original para nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // Configurar a fonte e cor
        Font fonte = new Font("Comic Sans MS", Font.BOLD, fontSize);
        graphics.setColor(Color.BLUE);
        graphics.setFont(fonte);

        int[] espacamentosSuperiores = new int[partes.length];
        int[] espacamentosLaterais = new int[partes.length];

        //Calculando espaçamento para centralizar o texto
        for (int i=0; i<partes.length;i++) 
        { 
            FontMetrics fontMetrics = graphics.getFontMetrics();
            Rectangle2D rectangle = fontMetrics.getStringBounds(partes[i], graphics);
            double larguraTexto = rectangle.getWidth();
            double alturaTexto = rectangle.getHeight();
            int espacamentoEsquerdo = ((largura-(int)larguraTexto)/2);
            int espacamentoSuperior = novaAltura- (int)alturaTexto * (partes.length-i);

            espacamentosSuperiores[i] = espacamentoSuperior;
            espacamentosLaterais[i] = espacamentoEsquerdo; 
        }

        // Escrever uma frase na nova imagem
        for (int i=0; i<partes.length;i++) 
        {
            graphics.drawString(partes[i], espacamentosLaterais[i], espacamentosSuperiores[i]);
        }

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
