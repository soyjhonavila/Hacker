 package ejercicios;
 import java.util.Arrays;
 import java.util.Scanner;
 public class farra_cumpleaños 
{
	public static void main(String[] args) 
   {
	  Scanner leer = new Scanner(System.in);
	  
	  System.out.println(" Ingrese numero de casos y por cada caso 2 numeros ");
	  int m = 0, n = 0;
	  int t = leer.nextInt();
	  int[][] array = new int[t][2];
	  if (t >= 1 && t <= 20) 
	 {
	    for (int i = 0; i < t; i++) 
	   {
           for (int j = 0; j < 2; j++) 
          {
	        array[i][j] = leer.nextInt();
	      }
	   }
	    for (int i = 0; i < t; i++) 
	   {
	       if (array[i][1] >= 1 && array[i][1] <= Math.pow(10, 5)
	              && array[i][0] >= 1 && array[i][0] <= 100) 
	      {
	           if (array[i][1] % array[i][0] == 0) 
	          {
	              System.out.println("si");
	          } 
	           else
	              System.out.println("No");
	      }
	    }
	 }
   }
}

