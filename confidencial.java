 package ejercicios;
 import java.util.*;
 public class confidencial 
{
	 public static void main(String args[])
	 {  
	        Scanner leer = new Scanner(System.in);
	        
	        System.out.println(" ingrese numero de casos,despues un numero para la longitud,despues la cadena  ");
	        int n,len;
	        String st,st1;
	        n=leer.nextInt();
	        while(n>0)
	        {
	            len=leer.nextInt();
	            st=leer.next();
	            st1=divide(len,st);
	            System.out.println(st1);
	            n--;
	        }
	 }    
	    static String divide(int len,String st)
	    {
	        String st1="";
	        if(st.length()==0)
	           {
	               return "";
	           }
	           if(st.length()==1)
	           {
	               return st;
	           }
	        if(len%2==0)
	        {
	            int a=(len/2)-1;
	            st1=st1+st.substring(a,a+1);
	          
	            st1=st1+divide(a, st.substring(0,a));
	            st1=st1+divide(len-a-1, st.substring(a+1));
	        }
	        else if(len%2!=0)
	        {
	            int a=(len/2);
	            st1=st1+st.substring(a,a+1);
	            st1=st1+divide(a, st.substring(0,a));
	            st1=st1+divide(len-a-1, st.substring(a+1));
	        }
	        return(st1);
	       }
}
