package com.estudouserdept.userdepart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudouserdept.userdepart.entities.User;
import com.estudouserdept.userdepart.repositories.UserRepositoty;

@RestController // Aqui se configura a class para ser um controlador Rest, na qual responde por requisições 
@RequestMapping(value = "/users") // Aqui se define o caminho que tera na URL do localhost
public class UserController {
	
	
	@Autowired // Aqui se utiliza para marcar os pontos de injeção dentro da sua classe
	private UserRepositoty repository; // Composição de componentes
	
	@GetMapping // Aqui se define o tipo(verbo HTTP) da requisição WEB que pode ser (get, post, delete, put etc)
	public List<User> findAll(){   // O método findAll() é responsável de ir ao banco de dados buscar TODOS os usuários
		// Aqui vai o mecanismo de injeção de dependencia
		List<User> result = repository.findAll();
		return result;
		// Implementação de um ENDPOINT, ou seja, um caminho que voce pode acessar pra buscar do banco de dados todos os usuários
	}
	
}
