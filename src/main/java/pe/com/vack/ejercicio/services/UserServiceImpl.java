package pe.com.vack.ejercicio.services;

import org.springframework.stereotype.Service;

import pe.com.vack.ejercicio.model.UserDTO;



@Service
public class UserServiceImpl implements UserService {

	public UserDTO getUserById(Integer id) {
		
		return new UserDTO(1,"Rafael");
		
	}
}
