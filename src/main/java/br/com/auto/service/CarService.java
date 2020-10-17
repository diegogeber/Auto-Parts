package br.com.auto.service;

import org.springframework.stereotype.Service;

@Service
public class CarService implements CarServiceFacade{
	public String save(String a, String b, String c){
		return "ok";
	}
}
