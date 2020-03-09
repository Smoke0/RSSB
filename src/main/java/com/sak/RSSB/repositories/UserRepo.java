package com.sak.RSSB.repositories;

import org.springframework.data.repository.CrudRepository;
import com.sak.RSSB.entities.User;

public interface UserRepo extends CrudRepository<User,String> {

}
