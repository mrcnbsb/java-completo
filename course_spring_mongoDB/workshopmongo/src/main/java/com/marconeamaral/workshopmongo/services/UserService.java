package com.marconeamaral.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marconeamaral.workshopmongo.domain.User;
import com.marconeamaral.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired //pra informar que o Spring deve fazer a injeção de dependência do UserRepository, ou seja, criar uma instância do UserRepository e atribuí-la à variável repo.
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll(); //findAll() é um método do MongoRepository que retorna uma lista de todos os documentos da coleção correspondente à entidade User.   
    }
        

}
