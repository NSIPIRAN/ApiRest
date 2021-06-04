package pe.com.vack.ejercicio.model;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import pe.com.vack.ejercicio.validators.CIF;



@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDTO {
	
	@NonNull
	private Integer id;
	
	@NonNull
	private String name;
	
	@NotNull
	@Size(min = 6, max = 20)
	private String lastname;
	
	
	@Positive(message= "{app.field.edad.error}")
	@Min(18)
	@Max(90)
	@ToString.Exclude
	private int edad;
	
	@Past(message= "{app.field.birth_day.error}")
	@ApiModelProperty(example="2000-02-15")
	private LocalDate birthDay;
	
	@CIF
	private String cif;
	
	
}
//@Getter
//@Setter
