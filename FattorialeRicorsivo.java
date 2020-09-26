package fattorialericorsivo;

import java.util.*;

public class FattorialeRicorsivo {
	
	public static void main(String[] args){
		
		int n;
		int f;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero non negativo: ");
		n = reader.nextInt();
		
		f = fattoriale(n);
		
		System.out.println("n! = " + f);
	}
	
	public static int fattoriale(int n){
		if(n == 0){
			return 1;
		}
		else{
		  int f;
		  f = n * fattoriale(n-1);
		  return f;
		}
		
	}

}
