package com.marconeamaral.workshopmongo.dto;

import java.io.Serializable;

import com.marconeamaral.workshopmongo.domain.User;

public class AuthorDTO implements Serializable { //DTO é uma sigla para Data Transfer Object, ou seja, um objeto de transferência de dados. Ele é usado para transportar dados entre processos, como por exemplo, entre a camada de serviço e a camada de apresentação (controller) em uma aplicação. O AuthorDTO é uma classe que representa um autor de um post, contendo apenas os campos id e name, que são os dados necessários para identificar o autor do post. Ele é usado para evitar expor toda a estrutura da classe User, que pode conter outros campos desnecessários para a representação do autor do post.

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    
    public AuthorDTO() { 
    }

    public AuthorDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
