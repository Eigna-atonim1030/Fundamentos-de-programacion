import java.util.Scanner;
class Ejercicio19
{
 public static void main(String h[])
 {
 Scanner lea=new Scanner(System.in);
  System.out.println("DIGITE UN NUMERO");
 int number=lea.nextInt();
 int cuadrado;
 double raiz;
 
 

 
 if (number<=0)
 {
 System.out.println("Error");
 }
 else
 {
 cuadrado=number*number;
 raiz=Math.sqrt(number);//sqrt para raiz
 System.out.println("la raiz es "+raiz);
 System.out.println("EL CUADRADO ES "+cuadrado);
 }
 
 
 
 }
 
 }
 //pow para elevado