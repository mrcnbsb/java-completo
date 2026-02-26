package com.cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursojavacompleto.course.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
