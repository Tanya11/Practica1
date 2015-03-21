package practica;

public class ejer1{
	public static void main(String[] args){
		//int lineamaxima;
		int saltosdelinea =5;
		int saltosdelinea2 =5;
		for (int i=1;i<=saltosdelinea;i++){
		  //
	    	for (int j=(saltosdelinea - i);j>0;j--)
		    System.out.print(" ");
	    	System.out.print("*");
		    for (int k=1;k<i;k++)
				    System.out.print("*");
		    for (int k=1;k<i;k++)
			    System.out.print("*");
				    System.out.println("");
		}   
	for ( int i=1; i<=saltosdelinea2; i++){
		for (int j=1; j<=i; j++)
		System.out.print(" ");
		for (int k=saltosdelinea2-1; k>=i; k--)
			System.out.print("*");
		//Parte inferior derecha 
		for (int k=saltosdelinea2-2; k>=i; k--)
			System.out.print("*");
		    System.out.println(" ");
			
		
	}  
	}
}
