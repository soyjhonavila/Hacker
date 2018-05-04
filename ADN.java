 package ejercicios;
 import java.util.*;
 public class ADN 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("ingrese t casos ,luego n y despues la secuencia");
		int T=s.nextInt();
		for(int t=0;t<T;t++)
		{
			boolean f=false;
			int n=s.nextInt();
			String str=s.next();
			StringBuilder ans=new StringBuilder("");
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				if(c=='A')
					ans.append('T');
				else if(c=='T')
					ans.append('A');
				else if(c=='G')
					ans.append('C');
				else if(c=='C')
					ans.append('G');
				else 
				{
						f=true;
						break;		    
				}
			}
			if(f)
			{
				System.out.println("Error RNA nucleobases found!");
			}
			else System.out.println(ans);
		}
	}
}
