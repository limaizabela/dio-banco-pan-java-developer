import java.util.*;

public class Quitanda {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de quilos de Morango: ");
        int morangos = input.nextInt();
        System.out.println("Informe a quantidade de quilos de Maçã: ");
        int macas = input.nextInt();

        double precoMorango = morangos <= 5 ? 2.5 : 2.2;
        double precoMaca = macas <= 5 ? 1.8 : 1.5;
        
        double total = morangos * precoMorango + macas * precoMaca;
        double desconto = (total > 25 || (morangos + macas) > 8) ? total * 0.1 : 0;
        
        System.out.println(total - desconto);


    }
}