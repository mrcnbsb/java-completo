package com.marconeamaral.workshopmongo.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.marconeamaral.workshopmongo.services.exception.ObjectNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice //ControllerAdvice é uma anotação do Spring que indica que a classe é um manipulador global de exceções para os controladores REST. Ela permite que você defina métodos para tratar exceções específicas e personalizar as respostas de erro para os clientes.
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class) //ExceptionHandler é uma anotação do Spring que indica que o método deve ser chamado para tratar a exceção especificada (neste caso, ObjectNotFoundException). Quando essa exceção for lançada em qualquer parte do código, o método objectNotFound() será executado para lidar com ela.
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) { //objectNotFound() é um método que trata a exceção ObjectNotFoundException. Ele recebe a exceção como parâmetro e retorna um ResponseEntity contendo um objeto do tipo StandardError, que é uma classe personalizada para representar os detalhes do erro.
        HttpStatus status = HttpStatus.NOT_FOUND; //HttpStatus.NOT_FOUND é um enum do Spring que representa o status HTTP 404 (Not Found). Ele é usado para indicar que o recurso solicitado não foi encontrado no servidor.
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), ""); //StandardError é uma classe personalizada que representa os detalhes do erro. Ela possui um construtor que recebe os seguintes parâmetros: timestamp (data e hora do erro), status (código HTTP do erro), error (descrição do erro), message (mensagem de erro detalhada) e path (caminho da requisição que causou o erro). Neste caso, o status é definido como HttpStatus.NOT_FOUND.value(), que corresponde ao código HTTP 404, indicando que o recurso não foi encontrado.
        return ResponseEntity.status(status).body(err); //ResponseEntity.status(HttpStatus.NOT_FOUND) é um método estático que retorna um ResponseEntity com o status HTTP 404 (Not Found). body(err) é um método que define o corpo da resposta como o objeto StandardError criado anteriormente.
    }

}
