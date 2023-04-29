package com.example.ParametersDMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ParametersDMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
