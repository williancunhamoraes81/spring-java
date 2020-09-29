package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping()
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Willian", "willian.cunha@totvs.com.br", "+55 11985470720", "teste");
		return ResponseEntity.ok().body(u);
	}
}
