package br.com.g4f.atividade_um.impl;

import java.util.ArrayList;

import br.com.g4f.atividade_um.base.Eletronico;

public class Tv extends Eletronico{

	public Tv() {
		
		super("Tv","Volume",1,100,"CANAL", getListFunc());
		
	}
	
	public static String[] getListFunc() {
		ArrayList<String> canal = new ArrayList<>();
		for(Integer i = 1; i<60; i++) {
			canal.add("C"+i);
		}
		return (String[]) canal.toArray(new String[0]);
	}
	
}
