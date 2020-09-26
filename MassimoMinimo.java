package massimominimo;

import java.util.*;

public class MassimoMinimo {
	
	public static void main(String[] args){
		int i , max, min;
		int j = 2;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		i = reader.nextInt();
		max = i;
		min = i;
		
		while(i != 0){
			if(i >= max){
				max = i;
			}
			if(i <= min){
				min = i;
			}
			System.out.println("Inserisci il " + j + "° numero: ");
			i = reader.nextInt();
			j++;
		}
		
		System.out.println("Numero minimo: " + min);
		System.out.println("Numero massimo: " + max);
		
		
	}

}
