package com.marconeamaral.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marconeamaral.workshopmongo.domain.User;
import com.marconeamaral.workshopmongo.dto.UserDTO;
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

    public User insert(User obj) {
        return repo.insert(obj); //insert() é um método do MongoRepository que insere um novo documento no MongoDB. Ele é usado para criar um novo registro na coleção correspondente à entidade User. O objeto User passado como argumento será salvo no banco de dados e o método retornará o objeto inserido, incluindo o ID gerado pelo MongoDB.
    }
        
    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail()); //fromDTO() é um método que converte um objeto do tipo UserDTO em um objeto do tipo User. Ele recebe um UserDTO como argumento e retorna um novo objeto User, usando os dados do UserDTO para preencher os campos correspondentes do User.
    }

    public void delete(String id){
        findById(id); //findById() é chamado para verificar se o usuário com o ID fornecido existe. Se ele não existir, uma exceção ObjectNotFoundException será lançada, interrompendo a execução do método e evitando que o código continue tentando excluir um usuário que não existe.
        repo.deleteById(id); //deleteById() é um método do MongoRepository que remove o documento correspondente ao ID fornecido da coleção correspondente à entidade User. Ele é usado para excluir um registro do banco de dados com base no ID.
    }

}
