package vetor;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.println("informe um valor " + i+"..:");
			a[i]= ler.nextInt();
			
		}
	    for (int i =0; i<5; i++) {
	     System.out.println(a[i]);	
	    }
       ler.close();
}
}