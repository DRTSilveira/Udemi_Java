package entities;

public class Lutador {

	private String nome,pais,categoria;
	private int idade,vitoria,derrota,empate;
	private double altura,peso;
	
	public Lutador(String nome,String pais,double altura,double peso,int idade){
		this.nome = nome;
		this.pais = pais;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		
	}
		
	
	public String getApresentar() {
		
		return nome
				+"-"
				+idade
				+"-"	
				+pais
				+"-"
				+altura;
		}
	
	//public setApresentar() {
		
	
	public String getStatus() {
		
		return this.vitoria
				+"-"
				+this.derrota
				+"-"
				+this.empate;
				
	}
	
	public void setStatus(int vitoria, int derrota, int empate) {
		
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
	}
	
	public int getGanhar() {
		
		return this.vitoria;
		
	}
	
	public void setGanhar() {
			
		this.vitoria = vitoria + 1;
	}
	
	public int getPerder()	{
		
		return this.derrota;
	}
	
	public void setPerder() {
		
		this.derrota = derrota + 1;
	}
	
	public int getEmpatar() {
		
		return this.empate = empate + 1;
		
	}
	
	public void setEmpatar() {
		
		this.empate = empate + 1;
	}
	
	public void setPeso(double peso) {
		
		this.peso = peso;
	}
	
	public double getPeso() {
		
		return this.peso;
	}
	
	public void setCategoria(double peso) {
		peso = this.peso;
		
		if(peso <= 70) {
			this.categoria = "Leve";
		}
		else if(peso > 70 && peso <=90){
			this.categoria = "Medio";	
		}
		
		else if(peso > 90 && peso <= 120) {
			this.categoria = "Pesado";
		}
		
		else {
			this.categoria = "Invalido";
		}
		
	}
	
	public String getCategoria() {
	
		return this.categoria;
	}
	
	
	
}


