package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{
	@Query("select c from Customer c where c.email=?1 and c.password=?2 ")
	public Customer CheckCustomerLogin(String email,String password);

}
