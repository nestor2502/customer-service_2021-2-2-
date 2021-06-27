package com.dws.customerservice3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	@GetMapping("/holamundo")
	public ResponseEntity<Object> holaMundo(){
		return new ResponseEntity<>("Hola Mundo ahora si se va a poder", HttpStatus.OK);
	}
}
