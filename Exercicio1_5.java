package ArthurK;

import java.util.Scanner;

public class Exercicio1_5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escreva A Inicial De Um Dos Primeiros Meses");
	char mes = sc.next().charAt(0);
	
	
	
	switch (mes) {
	
	case 'j':
		System.out.println("janeiro");
		break;
	
	case 'f':
		System.out.println("fevereiro");
		break;
		
	case 'm':
		System.out.println("março");
		break;
		
	}
	
		
	}

}
