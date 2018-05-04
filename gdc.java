 package ejercicios;
 import java.io.*;
 import java.util.*;
 public class gdc 
{
	 static int T;
		static int MOD = 1_000_000_007;
			
		public static void main(String[] args) throws Exception 
		{
			// TODO Auto-generated method stub
			
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(" Ingrese casos de prueba y dos enteros x,y ");
			StringTokenizer st;
			
			T = Integer.parseInt(leer.readLine());
			for(int t = 1; t <= T; t++)
			{
				st = new StringTokenizer(leer.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				long[] responde = resolver(x, y);
			
				System.out.println(responde[0]);
			}
		}
		public static long[] resolver(long x, long y)
		{
			if(x%y == 0)
			{
				return new long[]{powMod(2,x-1,MOD),powMod(2,y-1,MOD)};
			}
			else 
			{			
				long n = x / y;
				long r = x % y;
				long responde[] = resolver(y, r);
				long x1 = (powMod(2,n*y,MOD)-1) * powMod(powMod(2,y,MOD)-1,MOD-2,MOD) %MOD;
				x1 = (x1 * powMod(2,r,MOD))%MOD; 
				x1 = (x1 * responde[0]) % MOD;
				x1 = (x1 + responde[1]) % MOD;
				return new long[]{x1, responde[0]};
			}
		}
		private static long powMod(long x, long y, long m)
		{
			long r = 1;
			x = x % m;
			while(y > 0)
			{
				if(y%2 == 1) 
				{
					r = (r*x) % m;
				}
				x = (x*x) %m;
				y >>=1;
			}
			return r;
		}
 }
