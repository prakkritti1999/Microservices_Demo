package com.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.dao.User;

public interface UsersRepository extends JpaRepository<User, String>{

}
