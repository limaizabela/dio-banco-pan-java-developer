import java.io.IOException;
import java.util.Scanner;

public class Animal {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		System.out.println("Informe a característica: ");
		AN1 = sc.nextLine();
		System.out.println("Informe a característica: ");
		AN2 = sc.nextLine();
		System.out.println("Informe a característica: ");
		AN3 = sc.nextLine();

		//TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
               //Dica: Você pode utilizar o método equals para realizar comparações.
		if(AN1.equals("vertebrado")){
			if(AN2.equals("ave")){
				if(AN3.equals("carnivoro")){
					System.out.println("aguia");
				}else if (AN3.equals("onivoro")){
					System.out.println("pomba");
				}
			}else if(AN2.equals("mamifero")){
				if(AN3.equals("onivoro")){
					System.out.println("homem");
				}else if (AN3.equals("herbivoro")){
					System.out.println("vaca");
				}
			}
		}else if(AN1.equals("invertebrado")){
			if(AN2.equals("inseto")){
				if(AN3.equals("hematofago")){
					System.out.println("pulga");
				}else if (AN3.equals("herbivoro")){
					System.out.println("lagarta");
				}
			}else if(AN2.equals("anelideo")){
				if(AN3.equals("hematofago")){
					System.out.println("sanguessuga");
				}else if (AN3.equals("onivoro")){
					System.out.println("minhoca");
				}
		}

	}
	
	}
}