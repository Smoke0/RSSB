package com.sak.RSSB.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sak.RSSB.entities.Sow;
import com.sak.RSSB.repositories.SowRepo;

@RestController
public class SowResource {
	@Autowired
	SowRepo repo;
	
	@RequestMapping(value="show",method=RequestMethod.GET)
	public List<Sow> getShow(){
		return (List<Sow>)repo.findAll();
	}
	
	@RequestMapping(value="show",method=RequestMethod.POST)
	public Sow addShow(@RequestBody Sow s){
		return repo.save(s);
	}
}
