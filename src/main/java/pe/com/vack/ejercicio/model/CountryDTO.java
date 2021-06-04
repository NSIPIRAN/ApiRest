package pe.com.vack.ejercicio.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDTO {

	private String isoCode;
	
	private String name;
	
	private String flag;
	
}
