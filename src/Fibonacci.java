import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben sie die Zahl n ein zum berechnen der Fibonacci Zahl: ");
		int zahl = sc.nextInt();
		sc.close();
		System.out.println("Fibonaccifolge von "+zahl+" = "+fibonacciZahlen(zahl));
	}
	static int fibonacciZahlen(int zahl)
	{
		if(zahl==0)
		{
			return 0;
		}else if(zahl==1)
		{
			return 1;
		}else 
		{
			return fibonacciZahlen(zahl-1)+fibonacciZahlen(zahl-2);
		}
	}
}
