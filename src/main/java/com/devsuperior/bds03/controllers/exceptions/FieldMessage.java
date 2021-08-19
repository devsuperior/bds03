package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
<<<<<<< HEAD

	private static final long serialVersionUID = 1L;
	
=======
	private static final long serialVersionUID = 1L;

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	private String fieldName;
	private String message;
	
	public FieldMessage() {
	}
<<<<<<< HEAD
	
	public FieldMessage(String fieldName, String message) {
=======

	public FieldMessage(String fieldName, String message) {
		super();
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
		this.fieldName = fieldName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
<<<<<<< HEAD

	
=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
}
