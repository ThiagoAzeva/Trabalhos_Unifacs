package Lucas_Terça;
import java.util.Scanner;
public class Exercicio_Fatorial_Variante {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num;

System.out.println("Inseira Um Numero Inteiro Positivo: ");
num = sc.nextInt();

long fatorial = 1;

for(int i = 1; i <= num; i++) {
	fatorial *= i;
	
}

System.out.println("O Fatorial De " +num+ " É " +fatorial);


	
	}

}
