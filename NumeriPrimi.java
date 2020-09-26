package numeriprimi;

import java.util.*;
import java.lang.Math;

public class NumeriPrimi {
   
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Inserisci il primo estremo: ");
		int a = reader.nextInt();
		System.out.println("Inserisci il seconde estremo (maggiore o uguale al primo): ");
		int b = reader.nextInt();
		
		System.out.println("Ecco i numeri primi tra i due numeri immessi: ");
		for(int i = a ; i < b ; i++){
			if(NumeroPrimo(i)){
			System.out.print(i + " ");
			}
		}
		
	}
	
	public static boolean NumeroPrimo(int input){
		int i = 2;
		boolean b = true;
		while(i < Math.floorDiv(input, 2)){
			if(input % i == 0){
				b = false;
				break;
			}
			else{
				i++;
			}
		}
		return b;
	}
}
