import java.util.Scanner;

public class App {
    //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 

    public static void main(String[] args) throws Exception {
   
     // entradas: um número
     Scanner teclado = new Scanner(System.in);
     System.out.print("Digite um número: ");
     int numero = teclado.nextInt();
     teclado.close();
    //processamento : Não tem
    // Saida: o número informado foi [número]
    System.out.printf("o número informado foi: [%d]", numero);


        
    }
}