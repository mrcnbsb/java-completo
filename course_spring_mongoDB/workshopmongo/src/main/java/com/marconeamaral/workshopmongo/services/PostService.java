package com.marconeamaral.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marconeamaral.workshopmongo.domain.Post;
import com.marconeamaral.workshopmongo.repository.PostRepository;
import com.marconeamaral.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired //pra informar que o Spring deve fazer a injeção de dependência do UserRepository, ou seja, criar uma instância do UserRepository e atribuí-la à variável repo.
    private PostRepository repo;
    
    public Post findById(String id) {
       Optional<Post> obj = repo.findById(id); //findById() é um método do MongoRepository que retorna um Optional contendo o documento correspondente ao ID fornecido. O Optional é uma classe que pode conter um valor ou estar vazio, e é usada para evitar problemas de null pointer.
       return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); //orElseThrow() é um método do Optional que retorna o valor contido no Optional se ele estiver
    }

    public List<Post> findByTitle(String text) {
        //return repo.findByTitleContainingIgnoreCase(text); //findByTitleContaining() é um método de consulta personalizada que o Spring Data MongoDB interpreta e implementa automaticamente. Ele busca por documentos na coleção "post" onde o campo "title" contém a string fornecida como argumento (text). O resultado é uma lista de objetos Post que correspondem à condição de busca.
        return repo.searchTitle(text); //searchTitle() é um método de consulta personalizada que o Spring Data MongoDB interpreta e implementa automaticamente. Ele busca por documentos na coleção "post" onde o campo "title" corresponde a uma expressão regular (regex) fornecida como argumento (text) e ignora diferenças entre maiúsculas e minúsculas. O resultado é uma lista de objetos Post que correspondem à condição de busca.
    }


}
