package entities;

public class Conta {

	private double numeroConta;
	private int digitoConta;
	private int tipoConta;
	private double saldoConta;
	private String donoConta;
	

	public Conta(){
	}


	public void setDepositoConta(double valorDeposito){

	this.saldoConta = this.saldoConta + valorDeposito;

	}

		
	public void setSaqueConta(double valorSaque){

	this.saldoConta = this.saldoConta - (valorSaque + 5);

	}

	

	public void setAbrirConta(double conta,int digito, int tipo,String nome, double depInicial){
	
	this.numeroConta = conta;
	this.digitoConta = digito;
	this.tipoConta = tipo;
	this.donoConta = nome;
	this.saldoConta = depInicial;

		if (this.saldoConta < 0){
		this.saldoConta = 0;
		}

	}

	public String getAbrirConta(){

	return this.donoConta
			+ "-"
			+this.numeroConta
			+ "/"
			+ this.digitoConta 
			+ "- "
			+ this.tipoConta
			+ "- R$"
			+ this.saldoConta;

	}

		
	}
	
