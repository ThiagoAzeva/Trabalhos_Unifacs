package JorgeC;
import java.util.Scanner;
public class Ponto_Dentro_Do_Circulo {
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
double xc,yc,xp,yp,disA,DisB;
double r;
double area,perimetro,distancia;
    
    System.out.println("Cordenada X do Circulo");
    xc=scan.nextDouble();
    
    System.out.println("Cordenada Y do Circulo");
    yc=scan.nextDouble();
    
    System.out.println("Raio do Circulo");
    r=scan.nextDouble();
    
    area=Math.PI*r*r;
    perimetro=2*Math.PI*r;
    
    System.out.println("Área Do Círculo="+area);
    System.out.println("Perimetro Do Círculo="+perimetro);
    
    System.out.println("Cordenada X do Ponto");
    xp=scan.nextDouble();
    
    System.out.println("Cordenada Y do Ponto");
    yp=scan.nextDouble();
    
    
    distancia=Math.sqrt(Math.pow(xp-xc,2)+Math.pow(yp-yc,2));
    
    if(distancia<=r){
        System.out.println("O ponto está dentro do Círculo");
    }
    
    else{
        System.out.println("O ponto Está Fora do Círculo");
    }
    
    }    
}
