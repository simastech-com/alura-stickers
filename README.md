## Alura-Stickers

Projeto desenvolvido na imersão Java da Alura, realizada entre os dias 27/03/2023 e 31/03/2023.

<ul>
    <li>
        <h3>Aula 01 | 27/03/2023 | Consumindo uma API de filmes com o Java.</h3>
        <ul>
            <li>
                <b>Objetivo:</b> Obter o título, poster e rating dos 250 melhores filmes do IMDB. Uma vez que a API do IMDB estava apresentando instabilidades, não foi possível utilizar a API oficial. Em vez disso, foram utilizados links alternativos oferecidos pelos instrutores da imersão.
            </li>
            <li>
            <b>Desafios:</b>
                <ul>
                    <li>
                        <b>Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares:</b> Esta etapa foi realizada, mas como o link foi exportado para um arquivo separado, então optou-se por colocar todos os links solicitados e fazer o teste em uma única execução, exibindo o resultado dos 4 links.
                    </li>
                    <li>
                        <b>Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais:</b> Desafio realizado, mas notou-se que a estrela é exibida de forma diferente no cmd do windows. Além das cores e do emoji de estrela para exibir o rating do filme, também foi inserido um símbolo de like se o rating do filme for maior ou igual a 5 e um emoji de deslike se o rating for inferior a 5.
                    </li>
                    <li>
                        <b>Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente:</b> Não foi possível obter a chave devido à instabilidade da API do IMDB. Deste modo, foram colocados os links em um arquivo de configuração somente para concluir o desafio. Os links ficaram no arquivo Link.txt.
                    </li>
                </ul>
            </li>
            <li>
                <b>Resultados:</b>
                <table>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2001/TopMovies.png" width="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2001/MostPopularMovies_TopTvs.png" width="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2001/TopTvs_MostPopularTvs.png" width="200">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Top Movies
                        </td>
                        <td>
                            Most Popular Movies & Top Tvs
                        </td>
                        <td>
                            Top Tvs & Most Popular Tvs
                        </td>
                    </tr>
                </table>
            </li>
        </ul>
    </li>
    <li>
        <h3>Aula 02 | 28/03/2023 | Gerando figurinhas para WhatsApp.</h3>
        <ul>
            <li>
                <b>Objetivo:</b> Gerar figurinhas para WhatsApp a partir das imagens fornecidas pela API da IMDB. Mais uma vez, devido à instabilidade do IMDB, foram utilizados os links alternativos oferecidos pelos instrutores. Foi percebido que as figurinhas de alguns filmes não eram geradas devido a presença de dois pontos (:) no nome do arquivo. Para resolver este problema os dois pontos (:) foram substituídos por traço (-).
            </li>
            <li>
            <b>Desafios:</b>
                <ul>
                    <li>
                        <b>Criar diretório de saída das imagens, se ainda não existir: </b> Desafio realizado.
                    </li>
                    <li>
                        <b>Centralizar o texto na figurinha:</b> Desafio realizado.
                    </li>
                    <li>
                        <b>Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes: </b> Desafio Realizado. Foi colocado a Comic Sans.
                    </li>
                    <li>
                        <b>Colocar contorno (outline) no texto da imagem: </b> Desafio Realizado.
                    </li>
                    <li>
                        <b>Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha e fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB: </b> Desafio Realizado. Entretanto, nos links fornecidos só há filmes com rating superior a 5 e por isso apenas a mensagem <i><b>Recomendo</b></i> e sua respectiva imagem foram exibidos.
                    </li>
                </ul>
            </li>
            <li>
                <b>Resultados:</b>
                <table>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/12%20Angry%20Men.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Breaking%20Bad.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Elvis.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Planet%20Earth%20II.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Planet%20Earth.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Pulp%20Fiction.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Schindler's%20List.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Stranger%20Things.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Boys.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Dark%20Knight.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Godfather%20-%20Part%20II.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Godfather.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Good%2C%20the%20Bad%20and%20the%20Ugly.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Lord%20of%20the%20Rings%20-%20The%20Fellowship%20of%20the%20Ring.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Lord%20of%20the%20Rings%20-%20The%20Return%20of%20the%20King.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Shawshank%20Redemption.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Terminal%20List.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Thor%20-%20Love%20and%20Thunder.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Top%20Gun%20-%20Maverick.png" height="200">
                        </td>
                    </tr>
                </table>
            </li>
        </ul>
    </li>
    <li>
        <h3>Aula 03 | 29/03/2023 | Ligando as pontas: Refatoração e orientação a objetos.</h3>
        <ul>
            <li>
                <b>Objetivo:</b> Obter imagens da API da Nasa e refatorar o código utilizando orientação à objetos. Obs: Para manter a compatibilidade e utilizar tanto a API do IMDB como a API da Nasa, foram removidos os emojis do terminal e os links foram colocados no código. Foi necessário refazer a classe JSonParser, pois não estava obtendo os dados corretamente, sendo que para isso foi utilizado Google GSON e a classe JsonParser foi modificada para MyJSonParser a fim de evitar conflitos.
            </li>
            <li>
            <b>Desafios:</b>
                <ul>
                    <li>
                        <b>Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16: </b> Desafio realizado.
                    </li>
                    <li>
                        <b>Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP:</b> Desafio realizado.
                    </li>
                    <li>
                        <b>Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra: </b> Desafio Realizado.
                    </li>
                    <li>
                        <b>Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado: </b> Desafio Realizado.
                    </li>
                </ul>
            </li>
            <li>
                <b>Resultados:</b>
                <table>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/12%20Angry%20Men.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/Find%20the%20Man%20in%20the%20Moon.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/M51%20-%20The%20Whirlpool%20Galaxy%20from%20Hubble.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/Pulp%20Fiction.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/Satellites%20Behind%20Pinnacles.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/Schindler's%20List.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/The%20Dark%20Knight.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/The%20Godfather%20-%20Part%20II.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/The%20Godfather.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/The%20Good%2C%20the%20Bad%20and%20the%20Ugly.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/The%20Lord%20of%20the%20Rings%20-%20The%20Fellowship%20of%20the%20Ring.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/The%20Lord%20of%20the%20Rings%20-%20The%20Return%20of%20the%20King.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2003/The%20Shawshank%20Redemption.png" height="200">
                        </td>
                    </tr>
                </table>
            </li>
        </ul>
    </li>
    <li>
        <h3>Aula 04 | 30/03/2023 | Criando nossa própria API com Spring.</h3>
        <ul>
            <li>
                <b>Objetivo:</b> Obter figurinhas a partir de uma API própria.
            </li>
            <li>
                <b>Resultados:</b>
                <table>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/12%20Angry%20Men.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Breaking%20Bad.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Elvis.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Planet%20Earth%20II.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Planet%20Earth.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Pulp%20Fiction.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Schindler's%20List.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Stranger%20Things.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Boys.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Dark%20Knight.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Godfather%20-%20Part%20II.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Godfather.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Good%2C%20the%20Bad%20and%20the%20Ugly.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Lord%20of%20the%20Rings%20-%20The%20Fellowship%20of%20the%20Ring.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Lord%20of%20the%20Rings%20-%20The%20Return%20of%20the%20King.png" height="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Shawshank%20Redemption.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/The%20Terminal%20List.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Thor%20-%20Love%20and%20Thunder.png" height="200">
                        </td>
                        <td align="center">
                            <img src="https://github.com/simastech-com/alura-stickers/blob/main/img/Aula%2002/Top%20Gun%20-%20Maverick.png" height="200">
                        </td>
                    </tr>
                </table>
            </li>
        </ul>
    </li>
    <li>
        <h3>Aula 05 | 31/03/2023 | Publicando nossa API no Cloud.</h3>
    </li>
</ul>