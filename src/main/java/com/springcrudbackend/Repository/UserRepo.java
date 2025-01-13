package com.springcrudbackend.Repository;

import com.springcrudbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
