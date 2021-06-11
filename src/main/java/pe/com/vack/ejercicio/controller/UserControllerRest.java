package pe.com.vack.ejercicio.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pe.com.vack.ejercicio.model.UserDTO;
import pe.com.vack.ejercicio.services.UserService;


@RestController
@RequestMapping("/users")
@Api(tags = "User API Rest")
public class UserControllerRest {
	
	@Autowired
	private UserService userService;
		
	@GetMapping("/{id}")
	@ApiOperation(notes= "Retrieve one user system by id",value="Get user by id")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
		
		System.out.println("Recovery by id");
		
		UserDTO userDTO = userService.getUserById(id);

		return ResponseEntity.ok(userDTO);
		//esto nos devuelve un json resultante, lo hace spring y con responseentity envuelve para codigos html
	}
	
	@GetMapping
	@ApiOperation(notes= "Retrieve all user system by id",value="Get users")
	public ResponseEntity<List<UserDTO>> listAllUsers(){
	
		List<UserDTO> list = List.of(new UserDTO(1,"rafael"), new UserDTO(2,"maria"), new UserDTO(3,"ben"));
		return ResponseEntity.ok(list);
	
	}
	
	@PostMapping
	@ApiOperation(notes= "Created one user",value="Create user")
	public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO){
		System.out.println("Creating user" + userDTO.getLastname());
		
		URI location = ServletUriComponentsBuilder.
				fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(userDTO.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public UserDTO updateUser(@RequestBody UserDTO userDTO) {
		System.out.println("Updating data");
		return userDTO;
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		System.out.println("delete user data");
		
	}
}
