import java.io.IOException;
import java.util.Scanner;

public class Triangulo{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor: ");
		double A = leitor.nextDouble();
		System.out.println("Informe o valor: ");
		double B = leitor.nextDouble();
		System.out.println("Informe o valor: ");
		double C = leitor.nextDouble();
		double area;
		double soma;
		boolean triangulo;
		
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
		if((A < B + C) && (B < A + C) && (C < A + B)){
			soma = A + B + C;
			System.out.println("Perimetro = " + soma);
		}else{
			area = ((A + B) * C) / 2;
			System.out.println("Area = " + area);
		}
		
	}
	
}