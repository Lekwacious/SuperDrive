package com.lekwacious.cloudstorage.data.repository;

import com.lekwacious.cloudstorage.data.models.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository  extends JpaRepository<User, Integer> {

}
