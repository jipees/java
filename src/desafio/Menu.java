package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<Cadastra> cadastros) {
        Scanner ler = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Adicionar nova pessoa");
            System.out.println("2. Listar pessoas cadastradas");
            System.out.println("3. Acessar conta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    Cadastra.cadastraCliente(cadastros);
                    break;
                case 2:
                    listarPessoas(cadastros);
                    break;
                case 3:
                    acessarConta(cadastros, ler);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;  
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void listarPessoas(ArrayList<Cadastra> cadastros) {
        if (cadastros.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Cadastra cliente : cadastros) {
                cliente.imprimirDados();
            }
        }
    }

    private static void acessarConta(ArrayList<Cadastra> cadastros, Scanner ler) {
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = ler.next();

        Cadastra cliente = null;
        for (Cadastra c : cadastros) {
            if (c.getNome().equals(nomeCliente)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.printf("Conta de %s não encontrada.\n", nomeCliente);
        } else {
            int opcao;
            do {
                System.out.println("\n===== Acessar Conta =====");
                System.out.println("1. Ver saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Transferência");
                System.out.println("5. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                opcao = ler.nextInt();

                switch (opcao) {
                    case 1:
                        cliente.imprimirDados();
                        break;
                    case 2:
                        System.out.print("Digite o valor para depósito: ");
                        double valorDeposito = ler.nextDouble();
                        cliente.depositar(valorDeposito);
                        break;
                    case 3:
                        System.out.print("Digite o valor para saque: ");
                        double valorSaque = ler.nextDouble();
                        cliente.sacar(valorSaque);
                        break;
                    case 4:
                        System.out.print("Digite o valor para Transferência: ");
                        double valorTransferir = ler.nextDouble();
                        transferir(cadastros, valorTransferir, ler, cliente);
                        break;
                    case 5:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (opcao != 5);
        }
    }

    private static void transferir(ArrayList<Cadastra> cadastros, double valor, Scanner ler, Cadastra clienteOrigem) {
        System.out.print("Digite o nome do cliente que vai receber: ");
        String nomeClienteRec = ler.next();

        Cadastra clienteReceber = null;
        for (Cadastra c : cadastros) {
            if (c.getNome().equals(nomeClienteRec)) {
                clienteReceber = c;
                break;
            }
        }

        if (clienteReceber == null) {
            System.out.printf("Conta de %s não encontrada.\n", nomeClienteRec);
        } else if (clienteOrigem.getSaldo() >= valor) {
           // clienteOrigem.sacarTranferencia(valor);
            clienteReceber.depositarDeTranferencia(valor);
            System.out.printf("Transferência de R$%.2f para %s realizada com sucesso.\n", valor, clienteReceber.getNome());
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }
}
