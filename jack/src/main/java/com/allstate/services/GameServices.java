package com.allstate.services;

import com.allstate.repositories.IUserrepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GameServices {

    private IUserrepository repository;

    @Autowired
    public GameServices(IUserrepository repository){
        this.repository = repository;
    }

}
