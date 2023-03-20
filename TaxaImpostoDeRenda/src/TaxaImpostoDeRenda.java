import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxaImpostoDeRenda {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe o salário: ");
    double renda = leitor.nextDouble();
    DecimalFormat saida = new DecimalFormat("0.00");
    double imposto = 0;
    double valorAcima;
 
      //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:

    
    /* if (renda <= 2000) {
      System.out.println("Isento");
    }else if(renda > 2000 && renda <= 3000 ){
      imposto = 1000 * 0.08;
      System.out.println("R$ "+ imposto);
    }else if(renda > 3000 && renda <= 4500){
      imposto = (1000 * 0.08) + (renda - 3000) * 0.18;
      System.out.println("R$ "+ saida.format(imposto));
    }else if(renda > 4500){
      novaRenda = 
      imposto = (1000 * 0.08) + (renda - 3000) * 0.18;
      valorAcima = renda - 4500;
      imposto = imposto + valorAcima * 0.28;
      System.out.println("R$ "+ saida.format(imposto));
    
    } */

    if(renda > 4500.00){
      imposto = 1000 * 0.08 + 1500 * 0.18;
      valorAcima = renda - 4500;
      imposto += valorAcima * 0.28;
     } else if (renda > 3000){
      imposto = 1000 * 0.08;
      valorAcima = renda - 3000;
      imposto += valorAcima * 0.18;
     } else if (renda > 2000){
      valorAcima = renda - 2000;
      imposto = valorAcima * 0.08;
     }
      
     if (imposto == 0) {
      System.out.println("Isento");
     } else {
      System.out.printf("R$ " + saida.format(imposto));
     }
	
}
}