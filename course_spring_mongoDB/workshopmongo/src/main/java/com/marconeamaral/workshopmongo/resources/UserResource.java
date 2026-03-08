package com.marconeamaral.workshopmongo.resources;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marconeamaral.workshopmongo.domain.User;
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
    public ResponseEntity<List<User>> findAll() {                
        List<User> list = service.findAll(); //findAll() é um método do UserService que retorna uma lista de usuários. Ele provavelmente chama o método findAll() do UserRepository para buscar os dados no MongoDB.        
        return ResponseEntity.ok().body(list); //ok() é um método estático que retorna um ResponseEntity com status HTTP 200 (OK). body(list) é um método que define o corpo da resposta como a lista de usuários.
    }
        

}
