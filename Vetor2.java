package vetor;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		String a[]= new String [5];
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.println("informe um nome " +i + " nome ..:");
			a[i]= ler.next();
			
		}
	    for (int i =0; i<5; i++) {
	     System.out.println(a[i]);	
	    }
       ler.close();

	}

}
