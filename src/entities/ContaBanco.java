package entities;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("---------------------------");
		System.out.println("conta " + this.getNumConta());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Dono " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.setStatus());
	}
	
	public void abrirConta(String t) {
		
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "CC") {
			this.setSaldo(50);
		}else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("conta aberta com saldo de "+this.getSaldo());
	}
	
	public void fecharConta() {
		
		if (this.getSaldo() > 0) {
			System.out.println("Conta com saldo");
		}else if (this.getSaldo() <0) {
			System.out.println("Conta com débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada");
		}
		
		
	}

	public void depositar(double v) {
		
		if (this.setStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta "+this.getNumConta());
		}else {
			System.out.println("Impossivel depositar, conta fechada");
		}
	
	}
	
	public void sacar(double u) {
		if (this.setStatus()) {
			if (this.getSaldo() >= u) {
				this.setSaldo(this.getSaldo() - u);
				System.out.println("Saque realizado da conta "+ this.getNumConta());
			}else {
				System.out.println("Sado insuficiente para saque");
			}
		}else {
			System.out.println("Impossivel sacar conta fechada");
		}
		
	}
	
	public void pagarMensal() {
		int z = 0;
		if (this.getTipo() == "CC") {
			z=12;
		}else if (this.getTipo() == "CP") {
			z=20;
		}
		
		if (this.setStatus()) {
			this.setSaldo(this.getSaldo() - z);
			System.out.println("Mensalidade paga por " + this.getDono());
		}else {
			System.out.println("Mensalidade nao cobrada de conta fechada");
		}
	}
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean setStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
