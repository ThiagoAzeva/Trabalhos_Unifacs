package JorgeC;
import java.util.Scanner;
public class Impar_Ou_Par {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
	     
	     System.out.println("Digite um Numero Inteiro");
	     int num;
	     num=sc.nextInt();
	     
	     if (num % 2 == 0){
	         System.out.println("O numero Informado É Par");
	     }
	     else{
	         System.out.println("O numero Informado É Impar");
	     }
	    }
}
