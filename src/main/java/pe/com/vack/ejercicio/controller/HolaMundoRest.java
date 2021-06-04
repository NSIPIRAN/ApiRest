package pe.com.vack.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.vack.ejercicio.configuration.ApplicationConfig;

@RestController	
public class HolaMundoRest {
	
	
	@Autowired
	private ApplicationConfig appConfig;
	
	@GetMapping("/Holamundo")
	public String saludo() {
		
		System.out.println(appConfig.toString());
		return "hola mundo";
	}
}
