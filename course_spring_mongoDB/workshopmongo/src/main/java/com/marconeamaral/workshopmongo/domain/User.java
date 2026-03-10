package com.marconeamaral.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user") //pra informar que essa classe é um documento do MongoDB e que a coleção correspondente a essa entidade se chama "user". Se não fosse especificado, o nome da coleção seria o mesmo da classe, ou seja, "User".
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id //pra informar que esse atributo é o identificador do documento no MongoDB. Ele será mapeado para o campo "_id" do documento.
    private String id;
    private String name;
    private String email;

    @DBRef(lazy = true) //DBRef é uma anotação do Spring Data MongoDB que indica que o campo posts é uma referência a outra coleção no MongoDB. O atributo lazy = true indica que as postagens associadas a um usuário serão carregadas de forma preguiçosa, ou seja, somente quando forem acessadas pela primeira vez.
    private List<Post> posts = new ArrayList<>(); //pra representar a relação entre usuário e postagens. Cada usuário pode ter várias postagens, e essa lista armazena as postagens associadas a um usuário específico.

    public User() {
    }

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
