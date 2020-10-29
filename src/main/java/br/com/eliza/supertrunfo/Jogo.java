package br.com.eliza.supertrunfo;

import java.util.Arrays;

public class Jogo {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.iniciar();
	}

	public void iniciar() {
		System.out.println("iniciando jogo");
		Carta[] todasCartas = new Carta[20];
		Carta carta = new Carta("Pinguim", 5, 50, 3, 5, 10 );
		todasCartas[0] = carta;
		todasCartas[1]=new Carta("Era Venenosa", 5, 60, 4, 15,5);
		System.out.println(Arrays.deepToString(todasCartas));
		// preencher as cartas
	}
	

}
