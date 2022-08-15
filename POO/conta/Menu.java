package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, "123", "CC", "João da Silva", 2000.50f);
		c1.visualizar();
		
		Conta c2 = new Conta(123457, "123", "CC", "Amanda", 200000.0f);
		c2.visualizar();
		
		c1.setSaldo(3000.0f);
		
		c1.visualizar();
		
		c2.setTitular("Amanda Giacometti");
		c2.visualizar();
		
		Conta c3 = new Conta();
		c3.visualizar();
		
		c3.setNumero(123458);
		c3.setTitular("Gabi");
		c3.setSaldo(500000.0f);
		
		c3.visualizar();
		
		if (c2.sacar(250000.0f) == true)
			c2.visualizar();	
	}
}