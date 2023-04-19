package ThiagoD;
import java.util.Scanner;
public class Exercicio_1_TestaCondicional_Variavel {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int idade, pessoas;

System.out.println("Quantos Anos Você Tem?");
idade = sc.nextInt();	

System.out.println("Quantas Pessoas São?");
pessoas = sc.nextInt();

if(idade >= 18) {
	System.out.println("Você Esta Liberado!");
}

else {
	System.out.println("Desculpa De Menor. Você Não Está Liberado!");
	
}
if(pessoas >= 2) {
	
	System.out.println("Você Está Acompanhado!");
	
}

else {
	System.out.println("LONLY!!!");
}

	}

}
