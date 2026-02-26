package com.cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursojavacompleto.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
