package com.estudouserdept.userdepart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_department") // Aqui se define o nome do banco de dados
public class Department {
	
	@Id // Essa Notation diz que esse id será a chave primária no banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Aqui se define que o id será AUTO-ENCREMENTADO
	private Long id;
	private String name;
	
	public Department() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
