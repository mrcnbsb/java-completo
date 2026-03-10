package com.marconeamaral.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.marconeamaral.workshopmongo.domain.Post;
import com.marconeamaral.workshopmongo.domain.User;
import com.marconeamaral.workshopmongo.dto.AuthorDTO;
import com.marconeamaral.workshopmongo.repository.PostRepository;
import com.marconeamaral.workshopmongo.repository.UserRepository;

@Configuration //pra informar que essa classe é uma classe de configuração do Spring. Ela é responsável por configurar e inicializar os componentes da aplicação, como beans, serviços, repositórios, etc. Ao usar @Configuration, o Spring reconhece essa classe como uma fonte de definições de beans e a processa durante a inicialização da aplicação.
public class Instantiantion implements CommandLineRunner { //CommandLineRunner é uma interface do Spring Boot que permite executar um código específico assim que a aplicação for iniciada. Ela tem um método run() que é chamado automaticamente pelo Spring Boot após a inicialização da aplicação. Isso é útil para realizar tarefas de configuração, inicialização de dados ou qualquer outra lógica que precise ser executada no início da aplicação.  

    @Autowired
    private UserRepository userRepository; //UserRepository é uma interface que estende MongoRepository e fornece métodos para realizar operações de CRUD (Create, Read, Update, Delete) em documentos do MongoDB. Ela é anotada com @Repository, o que indica que é um componente de repositório do Spring.    

    @Autowired
    private PostRepository postRepository; //PostRepository é uma interface que estende MongoRepository e fornece métodos para realizar operações de CRUD (Create, Read, Update, Delete) em documentos do MongoDB. Ela é anotada com @Repository, o que indica que é um componente de repositório do Spring.    

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //SimpleDateFormat é uma classe do Java que permite formatar e analisar datas de acordo com um padrão específico. Neste caso, o padrão "dd/MM/yyyy" indica que as datas serão formatadas no formato dia/mês/ano.
        sdf.setTimeZone(TimeZone.getTimeZone("GMT")); //setTimeZone() é um método do SimpleDateFormat que define o fuso horário a ser usado para formatar e analisar as datas. Neste caso, o fuso horário é definido como GMT (Greenwich Mean Time), o que significa que as datas serão tratadas como se estivessem no horário de Greenwich.

        userRepository.deleteAll(); //deleteAll() é um método do MongoRepository que remove todos os documentos da coleção correspondente à entidade User. Isso é útil para limpar a coleção antes de inserir novos dados, garantindo que não haja dados duplicados ou inconsistentes.
        postRepository.deleteAll(); //deleteAll() é um método do MongoRepository que remove todos os documentos da coleção correspondente à entidade Post. Isso é útil para limpar a coleção antes de inserir novos dados, garantindo que não haja dados duplicados ou inconsistentes.  

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        // userRepository.save(maria); //save() é um método do MongoRepository que salva um documento no MongoDB. Ele pode ser usado tanto para inserir um novo documento quanto para atualizar um documento existente. Se o ID do documento for null, ele será inserido como um novo documento. Caso contrário, ele será atualizado com base no ID fornecido.
        // userRepository.save(alex);
        // userRepository.save(bob);

        userRepository.saveAll(Arrays.asList(maria, alex, bob)); //saveAll() é um método do MongoRepository que salva uma lista de documentos no MongoDB. Ele é uma forma mais eficiente de salvar múltiplos documentos de uma só vez, em vez de chamar save() para cada documento individualmente. Ele aceita uma coleção de documentos e os salva todos em uma única operação.    

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!",new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO(maria));

        postRepository.saveAll(Arrays.asList(post1, post2)); //saveAll() é um método do MongoRepository que salva uma lista de documentos no MongoDB. Ele é uma forma mais eficiente de salvar múltiplos documentos de uma só vez, em vez de chamar save() para cada documento individualmente. Ele aceita uma coleção de documentos e os salva todos em uma única operação.    
    }

}
