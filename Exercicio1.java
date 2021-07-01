package br.com.generation.aula01.exemplovariavel;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		  
		Scanner ler = new Scanner(System.in);
		
		int idadeD;
		int idadeM;
		int idadeA;
		int resultado;
		
		System.out.println("Digite seus anos de vida: ");
        idadeA = ler.nextInt();

        System.out.println("Digite seus meses de vida: ");
        idadeM = ler.nextInt();
        
        System.out.println("Digite seus dias de vida: ");
        idadeD = ler.nextInt();
        
        resultado = ((idadeA*365) + (idadeM*30) + idadeD);
        
        System.out.println("Sua idade em dias é: " + resultado);
        System.out.println();

       

	}

}
