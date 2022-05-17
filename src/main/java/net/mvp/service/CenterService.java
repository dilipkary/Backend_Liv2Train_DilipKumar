package net.mvp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mvp.model.Center;
import net.mvp.repository.CenterRepository;

@Service
public class CenterService {
	
	@Autowired
	private CenterRepository userRepository;
	
	public Center createUser(Center user) {
		return userRepository.save(user);
	}	
	 
	public List<Center> getCenters() {
         return userRepository.findAll();
     }

}
