 package ejercicios;
 import java.util.*;
 public class batman 
{ 
	public static void main(String args[])  
   {
		// TODO Auto-generated method stub
		
	 Scanner leer = new Scanner(System.in);
	 
	 System.out.println(" ingrese numero de casos y t veces de la cadena ");
	 int test = leer.nextInt();
	 while(test> 0)
	 {
	   String str[] = new String[4];
	   boolean bandera = false;
	   for(int i = 0;i < str.length;i++)
	   {
	     str[i]=leer.next();
	   }
	      for(int i = 0;i < str.length;i++)
	     {
	        if(str[i].contains("xx.")||str[i].contains("x.x")||str[i].contains(".xx"))
	       {
	         bandera = true;
	         break;
	       }
	     }
	   for(int i = 1; i<3 ; i++)
	  {
	      for(int j = 1; j<3 ; j++)
	     {
	          if(str[i].charAt(j) == '.')
	         {
	             if(((str[i-1].charAt(j-1) == 'x')&&(str[i+1].charAt(j+1)=='x'))||((str[i+1].charAt(j-1) == 'x')&&(str[i-1].charAt(j+1)=='x')))
	            {
	               bandera = true;
	               break; 
	            }
	         }
	      }
	   }
	    for(int i =1; i<3;i++)
	   {
	        for(int j=0;j<4;j++)
	       {
	           if(str[i].charAt(j)=='.'&&str[i-1].charAt(j)=='x'&&str[i+1].charAt(j)=='x')
	          {
	            bandera = true;
	            break;
	          }
	       }
	    }
	     for(int i = 0, k= 3;i<2;i++, k--)
	    {
	        for(int j =0;j<4;j++)
	       {
	           if((str[i].charAt(j)=='.'&&str[i+1].charAt(j)=='x'&&str[i+2].charAt(j)=='x')||(str[k].charAt(j)=='.'&&str[k-1].charAt(j)=='x'&&str[k-2].charAt(j)=='x'))
	          {
	            bandera = true;
	            break;
	          }
	       }
	    }
	     for(int i =2,m = 3, k = 0;i<4;i++,k++, m--)
	    {
	        for(int j =2,n = 3, l =0;j<4;j++, l++, n--)
	       {
	           if((str[i].charAt(j)=='.'&&str[i-1].charAt(j-1)=='x'&&str[i-2].charAt(j-2)=='x')||(str[k].charAt(l)=='.'&&str[k+1].charAt(l+1)=='x'&&str[k+2].charAt(l+2)=='x')||(str[m].charAt(l)=='.'&&str[m-1].charAt(l+1)=='x'&&str[m-2].charAt(l+2)=='x')||(str[k].charAt(n)=='.'&&str[k+1].charAt(n-1)=='x'&&str[k+2].charAt(n-2)=='x'))
	          {
	           bandera = true;
	           break;
	          }
	       }
	     }
	      if(bandera)
	     {
	       System.out.println("YES");
	     } 
	      else 
	     {
	       System.out.println("NO");
	     }
	       test--;
	   }
	}
}
