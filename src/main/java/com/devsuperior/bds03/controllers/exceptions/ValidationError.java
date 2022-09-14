package com.devsuperior.bds03.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	//vai ter apenas uma list com as mensagens de erros (campoDeErro e mensagem)
	
	
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<FieldMessage>();

	public List<FieldMessage> getErrors() {
		return this.errors;
	}
	
	//para adicionar um erro a lista
	public void addError(String message, String fieldName) {
		FieldMessage fieldMessage = new FieldMessage(fieldName,message);
		errors.add(fieldMessage);
	}

	
}
