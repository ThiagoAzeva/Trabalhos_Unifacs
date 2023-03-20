package JorgeC;
import java.util.Scanner;
public class Nota_Valida_Ou_Nao {
	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      float nota;
      
      System.out.println("Insira a Nota:");
      nota=sc.nextFloat();
      
      if(nota>=0 && nota<=10){
          System.out.println("Nota válida");
      }
      else{
          System.out.println("Nota Inválida");
      }
        
    }  
}
