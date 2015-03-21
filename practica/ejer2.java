package practica;

import java.util.Scanner;

public class ejer2 {
	public static void main(String []arqs){
		Scanner s = new Scanner(System.in);	
		int nota1=0, nota2=0, nota3=0, nota4=0, nota5=0, nota6=0;
		int promedio=0;
		System.out.println("Ingrese las nota 1 del curso");
		nota1=s.nextInt();
		if ((nota1<=100)&&(nota1>=0)){
			System.out.println("Ingrese las nota 2 del curso");
			nota2=s.nextInt();
		}else {
			System.out.println("nota incorrecta");
			System.exit(0);
		}
			if (nota2<=100 && nota2>=0){
			System.out.println("Ingrese la nota 3 del curso");
			nota3=s.nextInt();
		}else {
			System.out.println("nota incorrecta");
			System.exit(0);
		}
		if ((nota3<=100)&&(nota3>=0)){
			System.out.println("Ingrese la nota 4 del curso");
			nota4=s.nextInt();
		}else {
			System.out.println("nota incorrecta");
			System.exit(0);
		}
		if ((nota4<=100)&&(nota4>=0)){
			System.out.println("Ingrese la nota 5 del curso");
			nota5=s.nextInt();
		}else {
			System.out.println("nota incorrecta");
			System.exit(0);
		}
		if ((nota5<=100)&&(nota5>=0)){
			System.out.println("Ingrese la nota 6 del curso");
			nota6=s.nextInt();
		}else {
			System.out.println("nota incorrecta");
			System.exit(0);
		}
		if ((nota6<=100)&&(nota6>=0)){
			
		}else {
			System.out.println("nota incorrecta");
			System.exit(0);
		}
		{		
		promedio= ((nota1 + nota2 + nota3 + nota4 + nota5 + nota6)/6);	
		System.out.println("El promedio es: " + promedio);
		}
		//TABLA DE PUNTUACIONES
		int a, b, c, d, e;
		if ((promedio>=90)&&(promedio<=100)){
		System.out.println("A");
		}else if ((nota1>=80)&&(nota1<90)){
		System.out.println("B");
		}else if ((nota1>=70)&&(nota1<80)){
			System.out.println("C");		
		}else if ((nota1>=60)&&(nota1<70)){
			System.out.println("D");
		}else if ((nota1>=50)&&(nota1<60)){
			System.out.println("E");
		}		}
	
	}




















