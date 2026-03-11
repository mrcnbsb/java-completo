package com.marconeamaral.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marconeamaral.workshopmongo.domain.Post;
import com.marconeamaral.workshopmongo.resources.util.URL;
import com.marconeamaral.workshopmongo.services.PostService;

@RestController //pra informar que será um recurso rest
@RequestMapping(value = "/posts") //pra informar qual o caminho de acesso a esse recurso:localhost:8080/users
public class PostResource { //controller
    
    @Autowired //pra informar que o Spring deve fazer a injeção de dependência do UserService, ou seja, criar uma instância do UserService e atribuí-la à variável service.
    private PostService service; //UserService é uma classe de serviço que contém a lógica de negócio para manipular os dados dos usuários. Ela é anotada com @Service, o que indica que é um componente de serviço do Spring.

    @RequestMapping(value = "/{id}", method = RequestMethod.GET) //pra informar que esse método responde a requisições do tipo GET e que o caminho de acesso a esse recurso é /posts/{id}, onde {id} é um parâmetro que representa o ID do post a ser buscado.
    public ResponseEntity<Post> findById(@PathVariable String id) { //@PathVariable é uma anotação do Spring que indica que o valor do parâmetro id deve ser extraído da URL da requisição. Por exemplo, se a URL for /users/123, o valor "123" será atribuído ao parâmetro id.
       Post obj = service.findById(id); //findById() é um método do PostService que retorna um post com base no ID fornecido. Ele provavelmente chama o método findById() do PostRepository para buscar o dado no MongoDB. O resultado é armazenado na variável obj do tipo Post.
       return ResponseEntity.ok().body(obj); //ok() é um método estático que retorna um ResponseEntity com status HTTP 200 (OK). body(obj) é um método que define o corpo da resposta como o objeto Post retornado pelo serviço.
    }

    @RequestMapping(value = "/titlesearch", method = RequestMethod.GET) //pra informar que esse método responde a requisições do tipo GET e que o caminho de acesso a esse recurso é /posts/{id}, onde {id} é um parâmetro que representa o ID do post a ser buscado.
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) { //@RequestParam é uma anotação do Spring que indica que o valor do parâmetro text deve ser extraído dos parâmetros da requisição. Por exemplo, se a URL for /posts/123/titlesearch?text=java, o valor "java" será atribuído ao parâmetro text.
        text = URL.decodeParam(text); //URL.decodeParam() é um método que decodifica o valor do parâmetro text, que pode conter caracteres especiais codificados em formato URL. Ele provavelmente usa a classe URLDecoder do Java para realizar a decodificação, garantindo que o texto seja interpretado corretamente pelo serviço.
        List<Post> list = service.findByTitle(text); //findByTitle() é um método do PostService que retorna uma lista de posts cujo título contém a string fornecida como argumento (text). Ele provavelmente chama o método findByTitleContaining() do PostRepository para buscar os dados no MongoDB. O resultado é armazenado na variável list do tipo List<Post>.
        return ResponseEntity.ok().body(list); //ok() é um método estático que retorna um ResponseEntity com status HTTP 200 (OK). body(list) é um método que define o corpo da resposta como a lista de posts retornado pelo serviço.
    }

}
