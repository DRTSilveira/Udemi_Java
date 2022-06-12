package application;
import entities.ContaBanco;

public class Aula05BYouTube {

	public static void main(String[] args) {
	
ContaBanco p1 = new ContaBanco();

p1.setNumConta(1111);
p1.setDono("Eu");
p1.abrirConta("CC");

ContaBanco p2 = new ContaBanco();

p2.setNumConta(222);
p2.setDono("voce");
p2.abrirConta("CP");

p1.depositar(300);
p2.depositar(500);

p1.estadoAtual();
p2.estadoAtual();

	}

}
