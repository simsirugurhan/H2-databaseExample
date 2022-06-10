package com.blue.it.bluedemo.dataAccess.concretes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.Data;

@Data
public class UserCreateDTO {

	@NotNull(message = "{blue.constraints.firstname.NotNull.message}")
	@Size(min = 3, max = 32, message = "{blue.constraints.firstname.Size.message}")
	private String firstName;
	
	@NotNull(message = "{blue.constraints.lastname.NotNull.message}")
	@Size(min = 2, max = 16, message = "{blue.constraints.lastname.Size.message}")
	private String lastName;
	
	
}
