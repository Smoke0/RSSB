package com.sak.RSSB.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sak.RSSB.entities.BookedShow;
import com.sak.RSSB.repositories.BookedShowRepo;

@RestController
public class BookedShowResource {
	@Autowired
	BookedShowRepo repo;
	
	@RequestMapping(value="bookedshow",method=RequestMethod.GET)
	public List<BookedShow> getBookedShow(){
		return (List<BookedShow>)repo.findAll();
	}
	
	@RequestMapping(value="bookedshow",method=RequestMethod.POST)
	public BookedShow addBookedShow(@RequestBody BookedShow bookedShow){
		return repo.save(bookedShow);
	}
}
