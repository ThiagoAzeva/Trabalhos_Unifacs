package ArthurK;
import java.util.Scanner;
public class Exercicio1Variavel {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Insira O Numero De Um Mês:");
		int mes = sc.nextInt();
		
		if (mes < 1 || mes > 12){
		System.out.println("Mês Inválido, Insira Um Numero Entre 1 e 12");
		sc.close();
		return;
		}
		
		String[] meses = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		System.out.println(meses[mes - 1]);

	}
}
	