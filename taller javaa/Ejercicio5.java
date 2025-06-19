import java.util.Scanner;
class Ejercicio5
{
 public static void main(String h[])
  {
  Scanner lea=new Scanner (System.in);
  int n1,n2,n3;
  System.out.println("DIGITE SU NUMERO ");
  n1=lea.nextInt();    //3
   n2=lea.nextInt();   //2
    n3=lea.nextInt();   //1
    
    //para el mayor n1
    
    if ((n1>n2) && (n1>n3)) 
    {   
    System.out.println("may "+n1);           
    {   
    if (n2>n3)
    {
    System.out.println("med"+n2);
    System.out.println("menor"+n3);
    }
    else
    {
    System.out.println("medio"+n3);
    System.out.println("menor"+n2);
    }
    }
    }
    
    //mayor n2
    
    if ((n2>n1 ) && (n2>n3))
    {
    System.out.println("mayor"+n2);
    {
    if (n1>n3)
    {
    System.out.println("medi"+n1);
    System.out.println("menor"+n3);
    }
    else
    {
    System.out.println("medi"+n3);
    System.out.println("menor"+n1);
    }
    }
    }
    
    //Mayor n3
    //1
    //2
    //3
    if ((n3>n2 ) && ( n3>n1))
    {
    System.out.println("may"+n3);
    {
    if (n2>n1)
    {
    System.out.println("medio"+n2);
    System.out.println("menor"+n1);
    }
    else
    {
    System.out.println("medio"+n1);
    System.out.println("menor"+n2);
    }
    }
    }

    
    
    
    
    
    
    }
    
   } 