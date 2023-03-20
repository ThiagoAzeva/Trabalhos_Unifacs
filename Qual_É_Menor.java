package JorgeC;
import java.util.Scanner;
public class Qual_É_Menor {
public static void main(String[]args){
	Scanner scan=new Scanner(System.in);

	int num1,num2;
	int menor;

	System.out.println("Informe numero");
	num1=scan.nextInt();

	System.out.println("Informe numero");
	num2=scan.nextInt();

	if(num1<num2)
		menor=num1;

	else
		menor=num2;
	System.out.println("O menor número é "+menor);

	    }
}
