package com.marconeamaral.workshopmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.marconeamaral.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    //MongoRepository é uma interface do Spring Data MongoDB que fornece métodos para realizar operações de CRUD (Create, Read, Update, Delete) em documentos do MongoDB. Ela é parametrizada com o tipo da entidade (User) e o tipo do ID (String).
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }") //@Query é uma anotação do Spring Data MongoDB que permite definir uma consulta personalizada usando a sintaxe de consulta do MongoDB. Neste caso, a consulta busca por documentos na coleção "post" onde o campo "title" corresponde a uma expressão regular (regex) fornecida como argumento (?0) e ignora diferenças entre maiúsculas e minúsculas ($options: 'i').
    List<Post> searchTitle(String text); //searchTitle() é um método de consulta personalizada que o Spring Data MongoDB interpreta e implementa automaticamente. Ele busca por documentos na coleção "post" onde o campo "title" contém a string fornecida como argumento (text). O resultado é uma lista de objetos Post que correspondem à condição de busca.    

    List<Post> findByTitleContainingIgnoreCase(String text); //findByTitleContainingIgnoreCase() é um método de consulta personalizada que o Spring Data MongoDB interpreta e implementa automaticamente. Ele busca por documentos na coleção "post" onde o campo "title" contém a string fornecida como argumento (text), ignorando diferenças entre maiúsculas e minúsculas. O resultado é uma lista de objetos Post que correspondem à condição de busca.

    @Query("{ $and: [ {date: {$gte: ?1} }, {date: { $lte: ?2} }, { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
    List<Post> fullSearch(String text, Date minDate, Date maxDate); //fullSearch() é um método de consulta personalizada que o Spring Data MongoDB interpreta e implementa automaticamente. Ele busca por documentos na coleção "post" onde o campo "title" contém a string fornecida como argumento (text) e o campo "date" está entre as datas fornecidas como argumentos (minDate e maxDate). O resultado é uma lista de objetos Post que correspondem à condição de busca.
}
