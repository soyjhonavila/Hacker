 package ejercicios;
 import java.util.*;
 public class capicua 
{
	public static void main(String args[]) 
	{
		Scanner leer=new Scanner(System.in);
		
		System.out.println(" ingrese t casos y n de cada uno SIN CEROS a la izquierda ");
		     int T=leer.nextInt();
		     while(T>0)
		     {
		         String str=leer.next();
		         String new_str=new StringBuffer(str).reverse().toString();
		         int t=str.compareTo(new_str);
		         if(t==0)
		         {
		             System.out.println("si");
		         }
		         else
		           System.out.println("NO");
		         T--;
		     }
		    }
		}
	

