package com.igormsantos.todosimples.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igormsantos.todosimples.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    
    }
