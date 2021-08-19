package com.devsuperior.bds03.controllers.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // permiti que a classe intercepte exceções
public class ResourceExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException e, HttpServletRequest req) {
		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY; // 422 ele diz que alguma entidade nao foi processada
																// (@valid)
		ValidationError err = new ValidationError();
		err.setTimestamp(Instant.now()); // pega o instante atual
		err.setStatus(status.value()); // Erro de requisição
		err.setError("Validation exceção");
		err.setMessage(e.getMessage());// pega a mensagem do erro
		err.setPath(req.getRequestURI());// pega o caminho requisitado

		for (FieldError f : e.getBindingResult().getFieldErrors()) {
			err.addErrors(f.getField(), f.getDefaultMessage());
		}

		// customiza o que vamos retornar
		return ResponseEntity.status(status).body(err);
	}

}
