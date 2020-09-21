package view;

import java.util.concurrent.Semaphore;

import controller.SentidoCarros;

public class PrincipalEx37 {

	public static void main(String[] args) {

		String sentido1 = "Subiu";
		String sentido2 = "Desceu";
		String sentido3 = "Esquerda";
		String sentido4 = "Direita";
		
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		Thread tem1 = new SentidoCarros(sentido1, semaforo);
		tem1.start();
		Thread tem2 = new SentidoCarros(sentido2, semaforo);
		tem2.start();
		Thread tem3 = new SentidoCarros(sentido3, semaforo);
		tem3.start();
		Thread tem4 = new SentidoCarros(sentido4, semaforo);
		tem4.start();

	}
}
