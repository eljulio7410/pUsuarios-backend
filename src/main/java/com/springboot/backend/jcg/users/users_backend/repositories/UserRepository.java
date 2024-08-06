package com.springboot.backend.jcg.users.users_backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.jcg.users.users_backend.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

    Page<User> findAll(Pageable pageable);

}
