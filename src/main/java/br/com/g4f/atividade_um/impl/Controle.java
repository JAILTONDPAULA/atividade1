package br.com.g4f.atividade_um.impl;

import br.com.g4f.atividade_um.base.Eletronico;

public class Controle {
	
	public void power(Eletronico eletronico) {
		eletronico.clickPower();
	}
	
	public boolean aumentar(Eletronico eletronico) {
		return eletronico.aumentar();
	}
	
	public boolean diminuir(Eletronico eletronico) {
		return eletronico.diminuir();
	}
	
	public void funcAumentar(Eletronico eletronico) {
		eletronico.nextFunc();
	}
	
	public void funcDiminuir(Eletronico eletronico) {
		eletronico.backFunc();
	}
}
