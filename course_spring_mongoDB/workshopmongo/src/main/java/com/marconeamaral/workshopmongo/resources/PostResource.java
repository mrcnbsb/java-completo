package com.marconeamaral.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marconeamaral.workshopmongo.domain.Post;
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

}
