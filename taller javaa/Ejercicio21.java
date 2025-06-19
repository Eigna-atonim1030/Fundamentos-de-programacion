import java.util.Scanner;

class  Ejercicio21
{
   public static void main(String e[])
     {
      Scanner lea = new Scanner(System.in);
      int mes,precio;
      
      System.out.println("DIGITE EL MES");
      mes = lea.nextInt();
      System.out.println("DIGITE VALOR A PAGAR");
      precio = lea.nextInt();
      
      if (mes == 10)
      {
      System.out.println ("EL VALOR TATAL A PAGAR ES: " +(precio - (precio * 0.15)));
      }
      else
      {
      System.out.println ("EL VALOR TOTAL A PAGAR ES: "+precio);
      }
   }
}