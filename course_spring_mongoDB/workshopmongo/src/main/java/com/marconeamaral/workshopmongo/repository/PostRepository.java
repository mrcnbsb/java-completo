package com.marconeamaral.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marconeamaral.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    //MongoRepository é uma interface do Spring Data MongoDB que fornece métodos para realizar operações de CRUD (Create, Read, Update, Delete) em documentos do MongoDB. Ela é parametrizada com o tipo da entidade (User) e o tipo do ID (String).

    List<Post> findByTitleContainingIgnoreCase(String text); //findByTitleContainingIgnoreCase() é um método de consulta personalizada que o Spring Data MongoDB interpreta e implementa automaticamente. Ele busca por documentos na coleção "post" onde o campo "title" contém a string fornecida como argumento (text), ignorando diferenças entre maiúsculas e minúsculas. O resultado é uma lista de objetos Post que correspondem à condição de busca.
}
