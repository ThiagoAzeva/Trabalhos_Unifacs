package JorgeC;
import java.util.Scanner;
public class Dia_Da_Pascoa {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);		

	int a, b, c, d, e, f, g, h, i, j, k, l;
	int mes, dia, ano ;
	System.out.println("Insira Um Ano:");
	ano = sc.nextInt();

	a = ano%19;

	b = ano/100;

	c = ano%100;

	d = b/4;

	e = b%4;

	f = (b+8)/25;

	g = (b-f+1)/3;

	h = (19*a+b-d-g+15)%30;

	i = c/4;

	j = c%4;

	k = (32+2*e+2*i-h-j)%7;

	l = (a+11*h+22*k)/451;

	mes = (h+k-7*l+114)/31;

	dia = (h+k-7*l+114)%31+1;


	System.out.println("A Páscoa É " +dia+"/" +mes+"/"  +ano  );

	sc.close();
	


	}
	
}
