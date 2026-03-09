package com.marconeamaral.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException { //RuntimeException é uma classe de exceção que indica que ocorreu um erro em tempo de execução. Ao estender RuntimeException, a classe ObjectNotFoundException se torna uma exceção personalizada que pode ser lançada quando um objeto não for encontrado.

    private static final long serialVersionUID = 1L; //serialVersionUID é um identificador único para a classe, usado durante o processo de serialização e desserialização. Ele é necessário para garantir que a versão da classe seja compatível durante a serialização e desserialização de objetos.

    public ObjectNotFoundException(String msg) { //construtor que recebe uma mensagem de erro como argumento. Ele chama o construtor da classe pai (RuntimeException) passando a mensagem para que ela possa ser acessada posteriormente quando a exceção for tratada.
        super(msg);
    }

}
