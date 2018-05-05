public class Potenz{
		//Potenz interativ berechnen
	public static double potenzIterativ(double a,int n){
		if(a < 0 || n < 0)
			return -1;
		double inter = 1;
		for(int i = 0;i < n;i++)
			inter *= a;
		return inter;
	}

	//Potenz rekursiv berechnen
	public double potenzRekursiv(double a,int n){
		if(a < 0 || n < 0)
			return -1;
		if(n == 0)
			return 1;
		return a*potenzRekursiv(a,n-1);
	}
}
