package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastra {
	private String nome;
	private String conta;
	private double saldo;
	
	public Cadastra() {
		
	}
	
	public Cadastra(String nome,String conta,double saldo) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
		
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimirDados() {
        System.out.printf("**********************************************"
                        + "\nDados iniciais do cliente:"
                        + "\n Nome:\t\t %s"
                        + "\n Tipo de conta:\t %s"
                        + "\n Saldo inicial:\t R$%.2f"
                        + "\n**********************************************\n", 
                        getNome(), getConta(), getSaldo());
    }
	
	public static void cadastraCliente(ArrayList<Cadastra> cliente){

        Scanner get = new Scanner(System.in);

            Cadastra l = new Cadastra();

                System.out.print("Nome: ");
                l.setNome(get.nextLine());

                System.out.print("Conta: ");
                l.setConta(get.nextLine());

                System.out.print("Saldo: ");
                l.setSaldo(get.nextDouble());

                cliente.add(l);
                System.out.println("Cadastro realizado com sucesso!");
        }
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso. Saldo atual: R$%.2f\n", valor, this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public void depositarDeTranferencia(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso. Saldo atual: R$%.2f\n", valor, this.saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
    
    public void tranferir(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Transferência de R$%.2f realizado com sucesso. Saldo atual: R$%.2f\n", valor, this.saldo);
        } else {
            System.out.println("Valor da Transferência inválido ou saldo insuficiente.");
        }
    }



}
