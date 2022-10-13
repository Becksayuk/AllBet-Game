package com.betapplication.betapplication.controller;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Generatorcontroller {
	
	@Autowired
	Generatorservice generator;
	
	
	@GetMapping("/hello")
	public String randomvalue() {		
		return "Hello";
	}
	
	@PostMapping("/get-results")
	public Betinfos getResults(@RequestBody Betinfos betInfo) {
		return generator.computeBet(betInfo);
	}
}