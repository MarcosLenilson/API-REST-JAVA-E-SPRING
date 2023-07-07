package com.estudouserdept.userdepart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user") // Aqui se define o nome do banco de dados
public class User {

	@Id // Essa Notation diz que esse id será a chave primária no banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Aqui se define que o id será AUTO-ENCREMENTADO
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne // Aqui se define a relação entre as entidades, no caso MUITOS PARA UM
	@JoinColumn(name = "department_id") // Aqui se define o nome da chave estrangeira do banco de dados
	private Department department;
	
	
	public User() {
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


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	
	
}
