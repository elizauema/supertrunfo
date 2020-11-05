package br.com.eliza.supertrunfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jogo {
	
	private List<Carta> minhasCartas = new ArrayList<>();
	private List<Carta> cartasDaMaquina = new ArrayList<>();
	Carta[] todasCartas = new Carta[20];
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.iniciar();
	}

	public void iniciar() {
		System.out.println("iniciando jogo");
		inicializarCartas();
		distribuirCartas();
		System.out.println(Arrays.deepToString(todasCartas));
		System.out.println(minhasCartas);
		System.out.println(cartasDaMaquina);
		
		Carta minhaCarta = sortearCarta(minhasCartas);
		Carta maquinaCarta = sortearCarta(cartasDaMaquina);
		System.out.println(minhaCarta);
		System.out.println(maquinaCarta);
	}
	
	public void inicializarCartas() {
		Carta carta = new Carta("Pinguim", 5, 50, 3, 5, 10 );
		todasCartas[0] = carta;
		todasCartas[1]=new Carta("Era Venenosa", 5, 60, 4, 15,5);
		todasCartas[2]=new Carta("Espantalho", 10, 50, 5, 5, 10);
		todasCartas[3]=new Carta("Charada", 10, 60, 5, 5, 10);
		todasCartas[4]=new Carta("Flash", 20, 100, 20, 40, 80);
		todasCartas[5]=new Carta("Cyborg", 25, 70, 10, 35, 65);
		todasCartas[6]=new Carta("Super Homem", 50, 95, 20, 45, 80);
		todasCartas[7]=new Carta("Mulher Maravilha", 45, 90, 18, 45, 80);
		todasCartas[8]=new Carta("Mulher Gato", 10, 85, 7, 5, 15);
		todasCartas[9]=new Carta("Gavião Negro", 20, 70, 17, 30, 65);
		todasCartas[10]=new Carta("Arqueiro Verde", 10, 80, 8, 10, 30);
		todasCartas[11]=new Carta("Capitão Átomo", 25, 65, 14, 25, 30);
		todasCartas[12]=new Carta("Sinestro", 35, 70, 17, 35, 50);
		todasCartas[13]=new Carta("Apocalypse", 50, 55, 17, 45, 75);
		todasCartas[14]=new Carta("Shazam", 45, 70, 19, 40, 75);
		todasCartas[15]=new Carta("Katana", 10, 80, 7, 10, 25);
		todasCartas[16]=new Carta("Crocodilo", 20, 60, 3, 25, 60);
		todasCartas[17]=new Carta("General Zod", 45, 90, 18, 45, 80);
		todasCartas[18]=new Carta("Aquaman", 35, 90, 17, 40, 65);
		todasCartas[19]=new Carta("Exterminador", 20, 85, 8, 10, 35);		
	}

	public void distribuirCartas() {
		for(int i=0; i< todasCartas.length;i++) {
			if(i%2 == 0) {
				minhasCartas.add(todasCartas[i]);
			} else {
				cartasDaMaquina.add(todasCartas[i]);
			}
		}
	}

	public Carta sortearCarta(List<Carta> listaDeCartas) {
		int max = 10;
		int min = 0;
		int  posicao = ( int ) (Math.random () * (max-min + 1 ) + min); 
		return listaDeCartas.get(posicao);
	}
	
}
