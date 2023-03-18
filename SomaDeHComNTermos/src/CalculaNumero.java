import java.util.Scanner;

public class CalculaNumero {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Informe um número inteiro positivo: ");
     double n = sc.nextDouble();

     for (int i = 1; i <= n; i++) {
     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
      h += 1d/i;
    }
     System.out.println(Math.round(h));
    }
}
