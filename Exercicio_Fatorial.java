package Lucas_Terça;
public class Exercicio_Fatorial {
public static void main(String[] args) {
int f = 1;
int c = 6;
String s = "";
while(c > 1) {
	f *= c;
	s += c + " X ";
	c --;
}
s += c;
System.out.println("Fatorial: "+s);
System.out.println("Fatorial total: " +f);
	}

}
