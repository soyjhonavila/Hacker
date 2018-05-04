package ejercicios;
import java.util. *;
public class palindrome 
{
	public static void main (String args []) 
   {  	
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);

		System.out.println(" Ingrese una palabra PALINDROMA ");
		String palabra = leer.next();
		String al_reves="";
		for(int i=palabra.length()-1;i>=0;i--)
	   {
		al_reves=al_reves+palabra.charAt(i); 
	   }
		  if(palabra.equals(al_reves))
		 {
		   System.out.println("SI  es una palabra PALINDROMA ");
		 }
		  else
		 {
		   System.out.println("NO  es una palabra PALINDROMA Ingrese nuevamente la palabra ");
		 } 
    }
}
