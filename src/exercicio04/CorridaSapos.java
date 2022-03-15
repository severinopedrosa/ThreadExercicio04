package exercicio04;

import java.util.Random;

public class CorridaSapos extends Thread{
	
	private int sapo;
	private int distanciaMax;
	private int puloMax;
	static int posicao;
	
	public CorridaSapos (int sapo, int distanciaMax, int puloMax) {
		this.sapo = sapo;
		this.distanciaMax = distanciaMax;
		this.puloMax = puloMax;
	}
	@Override
	public void run() {
		Random random = new Random();
		int distancia = 0;
		int pulo = 0;
		String result = "";
		while (distancia < distanciaMax) {
		    pulo = random.nextInt(puloMax);
		    distancia = distancia + pulo;
		    System.out.println("O sapo " + sapo+ " pulou " + pulo + " metros, e agora percorreu "+ distancia +" metros");
	}
	posicao++;
	result += ("\nO sapo "+sapo+" chegou em "+ posicao+ "º lugar");
	try {
		sleep (sapo * 100);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(result);
	
}
}