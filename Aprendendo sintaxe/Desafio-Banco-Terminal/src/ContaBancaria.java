import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numContaBancaria;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("Bem vindo ao cadastro de usuario do banco!!");
        System.out.println(" ");
        System.out.println("Digite seu nome: ");
        nomeCliente =  sc.nextLine();

        System.out.println("Digite o numero da sua conta bancaria: ");
        numContaBancaria= sc.nextInt();

        sc = new Scanner(System.in);

        System.out.println("Digite o numero da sua agencia: ");
        agencia = sc.nextLine();

        sc.reset();

        System.out.println("Digite a quantidade de saldo que deseja para saque: ");
        saldo = sc.nextDouble();


        System.out.println("Olá: " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agencia:  " +
                agencia + " ,  conta: " + numContaBancaria +" e seu saldo: " + saldo + " já esta disponivel para saque"
        );

    }
}