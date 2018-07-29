package org.mukesh.controller;

import org.mukesh.dto.UserDetails;
import org.mukesh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getUserDetail(){
		
		System.out.println("Restful API");		
		return "Hello World!!!";		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public @ResponseBody String getUserDetails(){
	
		System.out.println("Restful API");
		
		return "Hello World!!!";
		
	}
	
	@RequestMapping(value="/userdetails", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity saveUserDetails(@RequestBody UserDetails userDetails ){
	
		UserDetails returnedUserDetails = usersService.saveUserDetails(userDetails);
		
		if(returnedUserDetails.getActorId() != null){
			
			return new ResponseEntity<String>("User Details created successfully",
					HttpStatus.CREATED);
		}
		
		return new ResponseEntity<String>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	

}
