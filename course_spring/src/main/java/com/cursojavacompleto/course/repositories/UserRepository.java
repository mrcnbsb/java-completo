package com.cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavacompleto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
