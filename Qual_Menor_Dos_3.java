package JorgeC;
import java.util.Scanner;
public class Qual_Menor_Dos_3 {
public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    
    int num1,num2,num3;
    int menor;
    
    System.out.println("Informe o primeiro numero");
    num1=scan.nextInt();
    
    System.out.println("Informe segundo numero");
    num2=scan.nextInt();
    
    System.out.println("Informe terceiro numero");
    num3=scan.nextInt();
    
    if(num1<num2 && num1<num3){
    menor=num1;
    }
    else{
        if(num2<num3){
            menor=num2;
        }
        else{
            menor=num3;
    }
   }
        System.out.println("O menor número é "+menor);

  }
}
