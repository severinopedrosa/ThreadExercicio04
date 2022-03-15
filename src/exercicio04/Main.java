package exercicio04;

import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int distancia = random.nextInt((20) + 1)+ 30;
	
		int pulo = random.nextInt((5) + 1)+ 5;
		
		System.out.println("Cada sapo terá de percorrer " + distancia + " metros ");
		System.out.println("Cada sapo consegue dar um pulo de até " + pulo + " metros");
		
		for (int sapo = 0; sapo < 5; sapo++) {
			Thread corrida = new CorridaSapos (sapo +1, distancia, pulo);
			corrida.start();
		}
	}

}