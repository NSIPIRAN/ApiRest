package pe.com.vack.ejercicio.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Configuration
@Data
@ToString
@ConfigurationProperties(prefix = "app")
public class ApplicationConfig {
	
	// el nombre de la propiedad es igual al proto en config properties
	private String name;
	

	private Integer year;
	

	private String edition;
	
	
	private String[] countries;
	
	
}
