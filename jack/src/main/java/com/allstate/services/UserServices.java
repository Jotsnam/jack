package com.allstate.services;


import com.allstate.entities.User;
import com.allstate.repositories.IUserrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private IUserrepository repository;

    @Autowired
    public UserServices(IUserrepository repository){
        this.repository = repository;
    }

    public User create(User u){
        return this.repository.save(u);
    }

    public List<User> findall(){
        return (List<User>) this.repository.findAll();
    }

    public User findById(int id) {
        return this.repository.findOne(id);
    }
}
