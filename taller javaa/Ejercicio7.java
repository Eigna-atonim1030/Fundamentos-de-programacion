import java.util.Scanner;
class Ejercicio7 
{
   public static void main(String h[])
   {
   Scanner lea=new Scanner(System.in);
   int peso;
   float altura,imc;
   System.out.println("DE SU PESO");
   peso=lea.nextInt();
   System.out.println("DE su altura");
   altura=lea.nextFloat();
   
   imc=peso/(altura*altura);
   
   if (imc <18.5)
   
   {
   System.out.println("BAJO PESO "+imc); 
   }
   
   if ((imc>=18.6) && (imc<=24.96))
   
    {
   System.out.println("PESO IDEAL "+imc); 
   }
   
   if((imc >=25) && (imc<=29.9))
    {
   System.out.println("SOBRE PESO"+imc); 
   }
   
   if((imc >=30) && (imc <=34.9))
    {
   System.out.println("OBESIDAD "+imc); 
   }
   
   if((imc >=35) && (imc<=39.9))
    {
   System.out.println("OBESIDAD SEVERA "+imc); 
   }
   if(imc>=40)
    {
   System.out.println("OBESIDAD MORVIDA "+imc); 
   }

   
   
   
   
   
   }
   
}   
   
   