package com.bshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bshop.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
