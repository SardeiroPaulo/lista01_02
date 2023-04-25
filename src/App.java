import java.util.Scanner;

public class App {
    //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 

    public static void main(String[] args) throws Exception {
   //declarações
         int numero;
   
        // entradas: um número
     Scanner teclado = new Scanner(System.in);
     numero = teclado.nextInt();
    //processamento : Não tem
    // Saida: o número informado foi [número]
    System.out.println("o número informado foi: ["+ numero +"]");


        
    }
}