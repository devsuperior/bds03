package com.devsuperior.bds03.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
<<<<<<< HEAD
public class Role implements Serializable{
	
	/**
	 * 
	 */
=======
public class Role implements Serializable {
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
<<<<<<< HEAD
	
	private String authority;
	
	public Role() {

	}

	public Role(Long id, String authority) {
=======
	private String authority;
	
	public Role() {
	}

	public Role(Long id, String authority) {
		super();
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
		this.id = id;
		this.authority = authority;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

<<<<<<< HEAD
=======
	public void setAuthority(String authority) {
		this.authority = authority;
	}

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
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
		Role other = (Role) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
<<<<<<< HEAD

	
	
=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
}
