package net.mvp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.mvp.model.Center;
import net.mvp.service.CenterService;

@RestController
@RequestMapping("/api/")
public class CenterController {
	
	@Autowired
	private CenterService userService;
	
	@PostMapping("users")
	public ResponseEntity<Center> createUser(@Valid @RequestBody Center user){
		Center savedUser = userService.createUser(user);
		return new ResponseEntity<Center>(savedUser, HttpStatus.CREATED);
	}
	
	 @RequestMapping(value="/Centers", method=RequestMethod.GET)
     public List<Center> readCenters() {
         return userService.getCenters();
     }

}
