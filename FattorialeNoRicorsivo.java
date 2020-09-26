package fattorialenoricorsivo;

import java.util.*;

public class FattorialeNoRicorsivo {

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
		int f = 1;
		if(n == 0){
			return f;
		}
		else{
			int i = 0;
			while(n-i >= 1){
				f = f * (n-i);
				i = i+1;
			}
		}
		return f;
	}
}
