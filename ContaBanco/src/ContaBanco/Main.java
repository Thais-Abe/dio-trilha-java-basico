package ContaBanco;

import ContaBanco.ContaTerminal;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scam.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scam.nextLine();
        System.out.println("Entre com o número da sua conta: ");
        int numeroConta = scam.nextInt();
        System.out.println("Deseja realizar algum depósito? ");
        char resposta = scam.next().charAt(0);
        scam.nextLine();
        double deposito;
        if (resposta == 's'){
            System.out.println("Qual a quantia que deseja depositar?");
            deposito = scam.nextDouble();
        }else {
            deposito = 0.00;
        }
        ContaTerminal conta = new ContaTerminal(nome, agencia,numeroConta,deposito);
        System.out.println(conta.toString());


        scam.close();
    }
}