package ThiagoD;
import java.util.Scanner;
public class Exercicio_2_TestaCondicional {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int mes;

System.out.println("Digite O Numero De Um Mês:");
	mes = sc.nextInt();
	
	switch(mes) {
	
	case 1:
		System.out.println("O Mês É Janeiro.");
		break;
	
	case 2:
		System.out.println("O Mês É Fevereiro.");
		break;	
		
	case 3:
		System.out.println("O Mês É Março.");
		break;
		
	case 4:
		System.out.println("O Mês É Abril.");
		break;
		
	case 5:
		System.out.println("O Mês É Maio.");
		break;
		
	case 6:
		System.out.println("O Mês É Junho.");
		break;
		
	case 7:
		System.out.println("O Mês É Julho.");
		break;
		
	case 8:
		System.out.println("O Mês É Agosto.");
		break;
		
	case 9:
		System.out.println("O Mês É Setembro.");
		break;
		
	case 10:
		System.out.println("O Mês É Outubro.");
		break;
		
	case 11:
		System.out.println("O Mês É Novembro.");
		break;
		
	case 12:
		System.out.println("O Mês É Dezembro.");
		break;
		
		default: System.out.println("Mês invalido!");
		
	
	}
	


	}

}
