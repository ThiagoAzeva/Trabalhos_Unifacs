package ArthurK;
import java.util.Scanner;
public class Exercicio2_Calculadora {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int continuar;
	 do {
	
	System.out.println("Digite Um Número");
	double n1 = sc.nextDouble();

	System.out.println("Digite Outro Número");
	double n2 = sc.nextDouble();
	
	System.out.println("Digite Uma Operação");
	char op = sc.next().charAt(0);
	
	double result;
	switch(op) {
	
	case '+':
	result= n1+n2;
	System.out.println("O Resultado É: " +result);
	break;
	
	case '-':
	result= n1-n2;
	System.out.println("O Resultado É: " +result);
	
	break;
	
	case '*':
	result= n1*n2;
	System.out.println("O Resultado É: " +result);
	
	break;
	
	case '/':
	if(n2 == 0) {
		System.out.println("Divisão Por Zero");
	}
	else {
	result= n1/n2;
	System.out.println("O Resultado É: " +result);
	break;
	}
	default: System.out.println("Operador Invalido");
}
	System.out.println("Continuar? (1)Sim (2)Não");
	 continuar=sc.nextInt();
	 }while(continuar ==1 );
	 
	 if(continuar == 2) {
		 System.out.println("Obrigado,Volte Sempre!");
	 }
	 
	}
	

}
