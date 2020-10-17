package br.com.auto.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;

import br.com.auto.service.CarServiceFacade;

@Scope("request")
public class CarAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String ano;
	private String cambio;
	
	@Autowired
	private CarServiceFacade carService;
	
	public String salvarCarro() {
		try {
			System.out.println("Passei pelo CarroAction");
			return carService.save(nome, ano, cambio);
		}catch(Exception e) {
			System.out.println(e);
			return ERROR;
		}
	
	}
	
	public String teste() {
		System.out.println("Bem vindo "+nome);
		
		return SUCCESS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public CarServiceFacade getCarService() {
		return carService;
	}

	public void setCarService(CarServiceFacade carService) {
		this.carService = carService;
	}
	
	
}
