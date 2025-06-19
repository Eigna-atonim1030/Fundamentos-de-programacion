import java.util.Scanner;
class Ejercicio15
{
 public static void main(String h[])
  {
  Scanner lea=new Scanner(System.in);
  int multiplicacion,horas_trabajo,multiplicacion2,paga_extra,total2,horas_trabajo2,HorasExtra;
  
  int paga_hora1=20000;
  int paga_hora2=19000;
  
  System.out.println("horas de trabajo");
  horas_trabajo=lea.nextInt();
  
  
  
  multiplicacion=horas_trabajo*20000 ;
  
  
  
  
  if(horas_trabajo<=40)
  {
   System.out.println("usted trabajo "+multiplicacion);
  
  }
  
  
  
  HorasExtra=horas_trabajo-40;
  paga_extra=HorasExtra*25000;
  
  
  
  
  if(horas_trabajo>=41)
  {
  horas_trabajo2=horas_trabajo-HorasExtra;
  multiplicacion2=horas_trabajo2*19000;
  total2=paga_extra+multiplicacion2;
  
  System.out.println("USTED TRABAJA MUCHO  "+total2);
  
  }
  
  
  

  }
}  
