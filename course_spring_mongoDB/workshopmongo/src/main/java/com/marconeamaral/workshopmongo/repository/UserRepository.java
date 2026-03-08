package com.marconeamaral.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marconeamaral.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    //MongoRepository é uma interface do Spring Data MongoDB que fornece métodos para realizar operações de CRUD (Create, Read, Update, Delete) em documentos do MongoDB. Ela é parametrizada com o tipo da entidade (User) e o tipo do ID (String).
}
