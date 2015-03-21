package practica;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String []arqs){
		Scanner s = new Scanner(System.in);	
		{
		  	int num1;	

			System.out.println("Ingrese numero");
			num1=s.nextInt();
			
		if (num1>0 && num1<10 ){
			
			for(int n=10;n>=1;n--){
				int m=num1*n;
				System.out.println(num1 +"x"+n+"="+m);
				}
			
		}else {
			System.out.println("no esta en el intervalo");
			System.exit(0);
		}
		
			
			
		}	
		
	}			
				
}
	
