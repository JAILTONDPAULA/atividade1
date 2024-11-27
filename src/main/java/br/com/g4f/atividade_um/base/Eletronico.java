package br.com.g4f.atividade_um.base;


public abstract class Eletronico {
	private boolean ligado = false;
	private Integer  status;
	private Integer  min;
	private Integer  max;
	private String   acao;
	private String   name;
	private String   funcName;
	private String[] func;
	private int      statusFunc = 0;
	
	public Eletronico(String name, String acao, Integer min, Integer max, String funcName, String[] func) {
		this.acao     = acao;
		this.name     = name;
		this.status	  = min;
		this.min      = min;
		this.max      = max;
		this.func     = func;
		this.funcName = funcName;
	}
	
	public void clickPower() {
		this.ligado = !this.ligado;
		System.out.println(this.name+" "+(this.ligado?"ON":"OFF"));
	}
	
	public boolean aumentar() {
		if(this.validar()) {
			if(this.max > this.status) {
				this.status++;
			}
			this.getStatus();
			return (this.max > this.status);
		}
		return false;
	}
	
	public boolean diminuir() {
		if(this.validar()) {
			if(this.min < this.status) {
				this.status--;
			}
			this.getStatus();
			return this.min < this.status;
		}
		return false;
	}
	
	public boolean validar() {
		if(this.ligado) { 
			return true;
		}
		System.out.println(this.name+" OFF");
		return false;
	}
	
	public void getStatus() {
		System.out.println(this.acao+": "+this.status);
	}
	
	public void nextFunc() {
		if(this.validar()) {
			this.statusFunc++;
			if(this.func.length<=this.statusFunc) {
				this.statusFunc = 0;
			}
			System.out.println(this.funcName+": "+this.func[this.statusFunc]);

		}
	}
	
	public void backFunc() {
		if(this.validar()) {
			this.statusFunc--;
			if(0>this.statusFunc) {
				this.statusFunc = this.func.length-1;
			}
			System.out.println(this.funcName+": "+this.func[this.statusFunc]);

		}
	}

}
