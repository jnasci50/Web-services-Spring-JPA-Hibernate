package com.eliezermoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezermoraes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
