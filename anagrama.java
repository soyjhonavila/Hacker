 package ejercicios;
 import java.util.*;
 public class anagrama 
{
	public static void main(String[] args) 
   {
		// TODO Auto-generated method stub
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Ingrese numero de casos de prueba y dos cadenas a y b, para cada caso de prueba ");
		String dato_1 = leer.nextLine();
		String dato_2 = leer.nextLine();

		int dato_1len = dato_1.length();
		int dato_2len = dato_2.length();

		char[] c = new char[dato_1len];
		char[] cc = new char[dato_2len];
		c = dato_1.toCharArray();
		cc = dato_2.toCharArray();

		Arrays.sort(c);
		Arrays.sort(cc);

		int cont = 0;

		for(int i=0; i<dato_1len; i++)
	   {
		   for(int j=0; j<dato_2len; j++)
		  {
		     if(c[i]==cc[j])
		    {
		      cont++;
		    }
		  }
	   }
	    for(int i=0;i<dato_1len-1; i++)
	   {
		   if(c[i]==c[i+1])
		  {
		    cont--;
		  }
	   }
		for(int i=0;i<dato_2len-1; i++)
	   {
		   if(cc[i]==cc[i+1])
		  {
		    cont--;
		  }
	   }
	    int lenn = (dato_1len-cont) + (dato_2len-cont) ;
		System.out.println(lenn);
   }
}


