package com.tonikolaba.springvuejsXstarter.repository;

import com.tonikolaba.springvuejsXstarter.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by NdueKolaba on 13-Jan-19.
 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByAge(int age);
}

