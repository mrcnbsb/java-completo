package com.marconeamaral.workshopmongo.resources;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marconeamaral.workshopmongo.domain.User;
import com.marconeamaral.workshopmongo.dto.UserDTO;
import com.marconeamaral.workshopmongo.services.UserService;

@RestController //pra informar que será um recurso rest
@RequestMapping(value = "/users") //pra informar qual o caminho de acesso a esse recurso:localhost:8080/users
public class UserResource { //controller

    // @RequestMapping(method = RequestMethod.GET) //pra informar que esse método responde a requisições do tipo GET
    // //@GetMapping //outra forma de informar que esse método responde a requisições do tipo GET
    // public List<User> findAll() {
    //     User maria = new User("1", "Maria Brown", "maria@gmail.com");
    //     User alex = new User("2", "Alex Green", "alex@gmail.com");
    //     List<User> list = new ArrayList<>();
    //     list.add(maria);
    //     list.add(alex);
    //     return list;
    // } não irá retornar mais uma lista, mas um ResponseEntity, que é um tipo específico do Spring para retornar respostas de requisições web. Ele encapsula o corpo da resposta, os status HTTP e os headers.

    @Autowired //pra informar que o Spring deve fazer a injeção de dependência do UserService, ou seja, criar uma instância do UserService e atribuí-la à variável service.
    private UserService service; //UserService é uma classe de serviço que contém a lógica de negócio para manipular os dados dos usuários. Ela é anotada com @Service, o que indica que é um componente de serviço do Spring.

    @RequestMapping(method = RequestMethod.GET) //pra informar que esse método responde a requisições do tipo GET
    //@GetMapping //outra forma de informar que esse método responde a requisições do tipo GET
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = service.findAll(); //findAll() é um método do UserService que retorna uma lista de usuários. Ele provavelmente chama o método findAll() do UserRepository para buscar os dados no MongoDB.        
        List<UserDTO> listDto = list.stream().map(user -> new UserDTO(user)).collect(Collectors.toList()); //list.stream() é um método que retorna um fluxo de elementos da lista. map(x -> new UserDTO(x)) é uma operação de mapeamento que transforma cada elemento do fluxo (do tipo User) em um novo objeto do tipo UserDTO, usando o construtor que recebe um User como argumento. toList() é um método que coleta os elementos do fluxo em uma nova lista do tipo List<UserDTO>.    
        return ResponseEntity.ok().body(listDto); //ok() é um método estático que retorna um ResponseEntity com status HTTP 200 (OK). body(list) é um método que define o corpo da resposta como a lista de usuários.
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET) //pra informar que esse método responde a requisições do tipo GET
    public ResponseEntity<UserDTO> findById(@PathVariable String id) { //@PathVariable é uma anotação do Spring que indica que o valor do parâmetro id deve ser extraído da URL da requisição. Por exemplo, se a URL for /users/123, o valor "123" será atribuído ao parâmetro id.
       User obj = service.findById(id); //findById() é um método do UserService que retorna um usuário com base no ID fornecido. Ele provavelmente chama o método findById() do UserRepository para buscar o dado no MongoDB. O resultado é armazenado na variável obj do tipo User.
       return ResponseEntity.ok().body(new UserDTO(obj)); //ok() é um método estático que retorna um ResponseEntity com status HTTP 200 (OK). body(new UserDTO(obj)) é um método que define o corpo da resposta como um novo objeto do tipo UserDTO, criado a partir do objeto User retornado pelo serviço.        
    }
        

}
