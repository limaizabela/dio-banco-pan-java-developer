import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Informe a frase: ");
     String str = sc.nextLine();
     String[] strSplit = str.split(" ");
     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
    
    for (String item : strSplit) {

   //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
   //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
    for (char letra : item.toCharArray()) {
      if (Character.toLowerCase(letra) == 'a' || 
        Character.toLowerCase(letra) == 'e' || 
        Character.toLowerCase(letra) == 'i' || 
        Character.toLowerCase(letra) == 'o' || 
        Character.toLowerCase(letra) == 'u') { quantVogais++;
        }
      }    
    }
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
}
}