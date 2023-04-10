import java.util.ArrayList;
import java.util.Scanner;

import Banco.Banco;
import Banco.Conta;
import Banco.Poupanca;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Conta> contas;
    static ArrayList<Poupanca> poupancas;

    public static void main(String[] args) {

        contas = new ArrayList<Conta>();
        poupancas = new ArrayList<Poupanca>();
        menu();

    }

    public static void menu() {
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("--------------------Banco P3 -----------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("---------------Selecione a opcao desejada ----------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("1 ------ Criar conta");
        System.out.println("2 ------ Depositar");
        System.out.println("3 ------ Sacar");
        System.out.println("4 ------ Tranferencia entre CC e Poupanca");
        System.out.println("5 ------ Listar");
        System.out.println("6 ------ sair");
        System.out.println();
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                tranferencia();
                break;
            case 5:
                listarContas();
                break;
            case 6:
                System.out.println();
                System.exit(0);

            default:
                System.out.println("opcao nao existe");
                menu();
                break;

        }

    }

    public static void criarConta() {
        System.out.println();
        System.out.println("Digite 1 - para conta sem poupança");
        System.out.println("Digite 2 - para conta com poupança");

        int seletor = sc.nextInt();

        if (seletor == 1) {
            System.out.println("Nome : ");

            String nome;
            sc.nextLine();
            nome = sc.nextLine();
            System.out.println("Numero da conta : ");
            int numeroConta = sc.nextInt();
            System.out.println("Saldo inicial : ");

            double saldo;
            saldo = sc.nextDouble();
            Conta conta = new Conta(numeroConta, nome, saldo);
            contas.add(conta);

        }
        if (seletor == 2) {
            System.out.println("Nome : ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Numero da conta : ");
            int numeroConta = sc.nextInt();
            System.out.println("Saldo inicial : ");
            double saldo = sc.nextDouble();
            System.out.println("Saldo inicial da poupanca : ");
            double saldoPoupanca = sc.nextDouble();
            Poupanca poupanca = new Poupanca(numeroConta, nome, saldo, saldoPoupanca);
            poupancas.add(poupanca);

        }
        menu();
    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;

        for (Conta a : contas) {
            if (a.getConta() == numeroConta) {
                conta = a;
            }
        }
        return conta;
    }

    private static Poupanca encontrarPoupanca(int numeroConta) {
        Poupanca poupanca = null;

        for (Poupanca a : poupancas) {
            if (a.getConta() == numeroConta) {
                poupanca = a;
            }
        }
        return poupanca;
    }

    public static void tranferencia() {
        System.out.println("Digite o numero da conta : ");
        int numeroConta = sc.nextInt();

        Poupanca poupanca = encontrarPoupanca(numeroConta);
        if (poupanca == null) {
            System.out.println("Essa conta nao existe ou é uma conta que nao possui poupanca ");
        } else {
            System.out.println("Digite 1 - Para tranferir de poupanca para CC ");
            System.out.println("Digite 2 - Para tranferir de CC para poupanca ");
            int escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Quanto deseja tranferir ");
                double tranferencia = sc.nextDouble();
                poupanca.PoupancaParaContaCorrente(tranferencia);

            }
            if (escolha == 2) {
                System.out.println("Quanto deseja tranferir ");
                double tranferencia = sc.nextDouble();
                poupanca.contaCorrentaParaPoupanca(tranferencia);
            }
        }
        menu();

    }

    public static void depositar() {
        System.out.println("Digite o numero da conta : ");
        int numeroConta = sc.nextInt();
        Conta conta = encontrarConta(numeroConta);
        Poupanca poupanca = encontrarPoupanca(numeroConta);
        if (conta != null) {
            System.out.println("Quanto deseja depositar ? ");
            double valorDeposito = sc.nextDouble();
            conta.deposito(valorDeposito);

        }
        if (poupanca != null) {
            System.out.println("Quanto deseja depositar ? ");
            double valorDeposito = sc.nextDouble();
            poupanca.deposito(valorDeposito);
        } else {
            System.out.println("Conta nao existe");
        }
        menu();

    }

    public static void sacar() {
        System.out.println("Digite o numero da conta : ");
        int numeroConta = sc.nextInt();
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println("Quanto deseja sacar ? ");
            double saque = sc.nextDouble();
            conta.saque(saque);

        } else {
            System.out.println("Conta nao existe");
        }
        menu();

    }

    public static void listarContas() {
        if (contas != null || poupancas != null) {
            for (Conta conta : contas) {
                System.out.println();
                System.out.println(conta);
                System.out.println();
            }
            for (Poupanca poupanca : poupancas) {
                System.out.println();
                System.out.println(poupanca);
                System.out.println();
            }
        } else {
            System.out.println("Nao existem contas");
        }
        menu();
    }

}
