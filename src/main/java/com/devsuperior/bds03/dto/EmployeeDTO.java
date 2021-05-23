package com.devsuperior.bds03.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.devsuperior.bds03.entities.Employee;

public class EmployeeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotBlank(message = "Campo requerido")
	private String name;
	
	@Email(message = "Email inválido")
	private String email;
	
	@NotNull(message = "Campo requerido")
	private Long departmentId;
	
	public EmployeeDTO() {
	}

	public EmployeeDTO(Long id, String name, String email, Long departmentId) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.departmentId = departmentId;
	}

	public EmployeeDTO(Employee entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		departmentId = entity.getDepartment().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
}
