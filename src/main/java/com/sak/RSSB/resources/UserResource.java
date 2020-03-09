package com.sak.RSSB.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sak.RSSB.repositories.UserRepo;
import com.sak.RSSB.entities.*;

@RestController
public class UserResource {
	@Autowired
	UserRepo repo;
	
	@RequestMapping(value="user",method=RequestMethod.GET)
	public List<User> getUsers(){
		return (List<User>)repo.findAll();
	}
	
	@RequestMapping(value="user",method=RequestMethod.POST)
	public User addUser(@RequestBody User s){
		return repo.save(s);
	}
}
