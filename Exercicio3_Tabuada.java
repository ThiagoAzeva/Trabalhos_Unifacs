package ArthurK;
import java.util.Scanner;
public class Exercicio3_Tabuada {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,cont,r,continuar;
		do {
			cont=0;
			
		
		System.out.println("Digite Um Numero Para Ver A Tabuada:");
		n =sc.nextInt();
		while (cont <= 10) {
			r = n * cont;
			System.out.println(n + "x" +cont+ "="+r);
			cont++;
			
		}
		System.out.println("Quer Continuar? (1)Sim (2)Não");
		continuar = sc.nextInt();
		}while (continuar==1);
		
		if(continuar == 2) {
			System.out.println("Obrigado, Volte Sempre!");
		}
	
	}
	

}
