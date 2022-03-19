package com.eliezermoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezermoraes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
