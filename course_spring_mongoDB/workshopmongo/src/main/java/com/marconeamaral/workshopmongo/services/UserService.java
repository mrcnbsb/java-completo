package com.marconeamaral.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marconeamaral.workshopmongo.domain.User;
import com.marconeamaral.workshopmongo.repository.UserRepository;
import com.marconeamaral.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired //pra informar que o Spring deve fazer a injeção de dependência do UserRepository, ou seja, criar uma instância do UserRepository e atribuí-la à variável repo.
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll(); //findAll() é um método do MongoRepository que retorna uma lista de todos os documentos da coleção correspondente à entidade User.   
    }

    public User findById(String id) {
       Optional<User> obj = repo.findById(id); //findById() é um método do MongoRepository que retorna um Optional contendo o documento correspondente ao ID fornecido. O Optional é uma classe que pode conter um valor ou estar vazio, e é usada para evitar problemas de null pointer.
       return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); //orElseThrow() é um método do Optional que retorna o valor contido no Optional se ele estiver
    }
        

}
