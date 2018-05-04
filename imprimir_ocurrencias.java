 package ejercicios;
 import java.util.*;
 public class imprimir_ocurrencias 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println(" ingrese t casos y s cadenas ");
		int t = leer.nextInt();
		String[] strArr = new String[t];
		for (int i = 0; i < t; i++) 
		{
			strArr[i] = leer.next();
		}
		for (int i = 0; i < strArr.length; i++) 
		{
			System.out.println(primera_ocurrencia(strArr[i]));
		}
		leer.close();
	}
	static String primera_ocurrencia(String str)
	{
		String resultado = "";
		for(int i=0;i<str.length();i++)
		{
			if(!resultado.contains(String.valueOf(str.charAt(i))))
			{
				resultado = resultado + String.valueOf(str.charAt(i));
			}
		}
		return resultado;
	}
}
