import java.util.Scanner;
class Ejercicio13
{
  public static void main(String h[])
  {
  Scanner lea=new Scanner(System.in);
  double compra,ab,c,d=20,abf;
  
  System.out.println("VALOR DE SU COMPRA");
  compra=lea.nextDouble();
  
  ab=compra*d/100;
  abf=compra-ab;
  
  
  if(compra>=300)
  {

  System.out.println("el descuento que se le va hacer "+ab);
   System.out.println("SU COMPRA CON DESCUENTO "+abf);
  
  

  
  


  
  }
  
  
  
  }
  
  
  
}