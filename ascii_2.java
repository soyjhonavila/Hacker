 package ejercicios;
 import java.io.*;
 import java.lang.*;
 public class ascii_2 
{
   public static void main(String args[]) throws IOException
  {
	// TODO Auto-generated method stub
	   
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(" Ingrese un elemento de la tabla ascci ");
	String simbolo = leer.readLine();
	   for ( int i = 0; i < simbolo.length(); ++i )
	  {
	   char c = simbolo.charAt(i);
	   int j = (int) c;
	   
	   int ñ= 164;
		
	      if (j==241) 
	      {
		     System.out.println(" El numero ascii es : "+ñ);
	      }else 
	      {
	        System.out.println(" El numero ascii es: "+(int)j);
	      }
	  }
   }
}
