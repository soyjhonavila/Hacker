package ejercicios;
import java.util. *;
 public class numero_primo 
{
  public static void main (String args []) 
 { 
	// TODO Auto-generated method stub
	  
	  Scanner leer = new Scanner (System.in); 
	  
	  System.out.println(" Ingrese un numero mayor a UNO y menor a MIL ");
	  int n = leer.nextInt (); 
	  int cont ; 
	  String primo = "";  
	 for (int i = 2; i <= n; i ++) 
	{ 
	  cont = 0; 
	  for (int j = 2; j <i; j ++) 
	 { 
	      if (i == 2) 
	     { 
	      primo += i + ""; 
	     } 
	         if (i% j == 0) 
	        { 
	         cont ++; 
	        } 
	  }
	           if (cont == 0) 
	          { 
	           primo += i + " "; 
	          } 
	 }
	   System.out.println (primo+ " " ); 
  } 
}
