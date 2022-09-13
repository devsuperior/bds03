package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private String message;
		private String fieldName;
		
		public FieldMessage () {
			
		}
		
		public FieldMessage(String message, String fieldName) {
			this.message = message;
			this.fieldName = fieldName;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getFieldName() {
			return fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		
		
		
		

}
