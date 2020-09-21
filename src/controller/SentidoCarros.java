package controller;

import java.util.concurrent.Semaphore;

public class SentidoCarros extends Thread {

//	private int idCarro;
	private String sentido;
	private Semaphore semaforo;
	private static int posPassou;


	public SentidoCarros(String sentido, Semaphore permissoes) {
		this.semaforo= permissoes;
		this.sentido = sentido;
	}	
	
	@Override
	public void run() {
		try {
			semaforo.acquire();
			carroPassando();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {	
			semaforo.release();		
		}
	}

	private void carroPassando() {		
		System.out.println("#"+ " carro "+ posPassou +"o. "+ sentido);	
		posPassou++;
	}	

}
