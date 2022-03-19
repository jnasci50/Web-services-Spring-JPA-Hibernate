package com.eliezermoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezermoraes.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}