package com.edu.Bike.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.Bike.models.Bike;

@RestController
@RequestMapping("/api/bikes")  //http://localhost:8080/api/bikes
public class BikeController {

	@GetMapping
	public List<Bike> list() {
		List<Bike> bikes = new ArrayList<Bike>();
		// access database
		for (int i = 0; i < 10; i++) {
			bikes.add(new Bike("name " + i, "phone " + i));
		}

		return bikes;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {

	}

	@GetMapping("{id}")
	public Bike getById(@PathVariable("id") long id) {
		Bike bike = new Bike();
		bike.setName("get in database something");

		return bike;
	}

}
