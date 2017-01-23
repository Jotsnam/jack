package com.allstate.repositories;

import com.allstate.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by localadmin on 23/01/17.
 */
public interface IUserrepository extends CrudRepository<User, Integer > {


}
