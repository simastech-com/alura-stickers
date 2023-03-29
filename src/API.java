public enum API 
{
    IMDB_TOP_MOVIES("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json", new ExtratorDeConteudoDoIMDB()),
    NASA("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14", new ExtratorDeConteudoDaNasa());

    private String url;
    private ExtratorDeConteudo extratorDeConteudo;

    API(String url, ExtratorDeConteudo extratorDeConteudo)
    {
        this.url = url;
        this.extratorDeConteudo = extratorDeConteudo;
    }

    public String getUrl()
    {
        return url;
    }

    public ExtratorDeConteudo getExtrator()
    {
        return extratorDeConteudo;
    }
}
