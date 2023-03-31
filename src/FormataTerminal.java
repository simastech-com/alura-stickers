public class FormataTerminal 
{
    public static final String NEGRITO = "\u001b[1m";
    public static final String ITALICO = "\u001b[3m";
    public static final String SUBLINHADO = "\u001b[4m";
    public static final String PISCANDO = "\u001b[5m";
    public static final String INVERTIDO = "\u001b[7m";
    public static final String RISCADO = "\u001b[9m";

    public static final String TEXTO_PRETO = "\u001b[30m";
    public static final String TEXTO_VERMELHO = "\u001b[31m";
    public static final String TEXTO_VERDE = "\u001b[32m";
    public static final String TEXTO_AMARELO = "\u001b[33m";
    public static final String TEXTO_AZUL = "\u001b[34m";
    public static final String TEXTO_MAGENTA = "\u001b[35m";
    public static final String TEXTO_CIANO = "\u001b[36m";
    public static final String TEXTO_BRANCO = "\u001b[37m";

    public static final String FUNDO_PRETO = "\u001b[40m";
    public static final String FUNDO_VERMELHO = "\u001b[41m";
    public static final String FUNDO_VERDE = "\u001b[42m";
    public static final String FUNDO_AMARELO = "\u001b[43m";
    public static final String FUNDO_AZUL = "\u001b[44m";
    public static final String FUNDO_MAGENTA = "\u001b[45m";
    public static final String FUNDO_CIANO = "\u001b[46m";
    public static final String FUNDO_BRANCO = "\u001b[47m";

    public static String formatar(String texto, String[] formatos)
    {
        String retorno = "";
        for (String formato : formatos) 
        {
            retorno += formato;
        }
        retorno+=texto;
        retorno+="\u001b[m";

        return retorno;
    }
}
