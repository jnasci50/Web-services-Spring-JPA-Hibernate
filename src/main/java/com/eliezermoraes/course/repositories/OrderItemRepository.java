package com.eliezermoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezermoraes.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
