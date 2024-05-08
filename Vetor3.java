package vetor;

import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int soma=0;
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.println("informe um valor " + i+"..:");
			a[i]= ler.nextInt();
			
		}
		for (int i =0; i<5; i++) {
		     soma=soma +(a[i]);	
		     System.out.println(soma);
		}
		     if(soma>=15) {
		    	 System.out.println("a soma é: "+soma);
		     }
		     else {
		    	 System.out.println("a soma é menor que 15: "+soma);
		     
		}
		
		ler.close();
	    
	    }

	}

