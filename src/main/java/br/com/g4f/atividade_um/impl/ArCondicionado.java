package br.com.g4f.atividade_um.impl;


import br.com.g4f.atividade_um.base.Eletronico;

public class ArCondicionado extends Eletronico{

	public ArCondicionado() {
		super("Ar Condicionado", "Temperatura", 16, 30, "MODO", getListFunc());
	}
	
	public static String[] getListFunc() {
		return new String[]{"COOL","HEAT","AUTO","FAN","DRY"};
	}

}
