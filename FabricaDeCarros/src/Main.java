import java.util.*;

public class Main{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
        System.out.println("Informe o custo de fábrica do veículo: ");
        int custoFabrica = scan.nextInt();
        System.out.println("Informe a porcentagem do Distribuidor: ");
	    int porcentagemDistribuidor = scan.nextInt();
        System.out.println("Informe o percentual de Impostos: ");
	    int percentualImpostos = scan.nextInt();

            int custoConsumidor;
     
            int Distribuidor;
            int ValorImpostos;
 
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
 
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * percentualImpostos) / 100;
 
        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;

        System.out.println(custoConsumidor);
	}
}