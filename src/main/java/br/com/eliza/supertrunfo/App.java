package br.com.eliza.supertrunfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Carta carta = new Carta("Pinguim", 5, 50, 3, 5, 10 );
        System.out.println(carta.getNome());
        carta.setNome("T");
        System.out.println(carta.getNome());
    }
}

