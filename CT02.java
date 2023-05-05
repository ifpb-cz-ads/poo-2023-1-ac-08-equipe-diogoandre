import java.util.ArrayList;
import java.util.Scanner;

public class CT02 {
    static ArrayList<Conta> contas = new ArrayList<Conta>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            int choice = 0;
            
            System.out.println("1 para criar uma conta\n"+
            "2 para ver o saldo de uma conta\n"+
            "3 para sacar\n"+
            "4 para depositar\n"+
            "e outro número para finalizar");
            choice = input.nextInt();
            input.nextLine();

            if(choice < 1 || choice > 4) break;

            switch (choice) {
                case 1:
                    PromptConta();
                    
                break;
                case 2:
                    PromptSaldo();
                break;
                case 3:
                    PromptSacar();
                break;
                case 4:
                    PromptDepositar();
                break;
            }
        }
    }

    private static void PromptConta(){
        System.out.println("Digite o tipo de conta que voce deseja criar:\n"+
        "1 para Conta\n"+
        "2 para ContaEspecial\n"+
        "3 para ContaPoupanca");
        int type = input.nextInt();
        input.nextLine();
        String nome;
        double saldo;
        System.out.println("Digite o nome do titular: ");
        nome = input.nextLine();
        System.out.println("Digite o saldo inicial: ");
        saldo = input.nextDouble();
        input.nextLine();
        Conta c;
        switch (type) {
            case 2:
                System.out.println("Digite o limite da conta: ");
                double limite = input.nextDouble();
                input.nextLine();
                c = new ContaEspecial(contas.size(), nome, limite);
            break;
            case 3:
                c = new ContaPoupanca(contas.size(), nome);
            break;
            default:
                c = new Conta(contas.size(), nome);
                c.saldo = saldo;
        }
        contas.add(c);
        System.out.println("O numero da conta criada é "+ c.getNumero());
    }
    private static void PromptSaldo(){
        Conta c = PromtNumero();
        System.out.println("Saldo: " + c.getSaldo());
    }
    private static void PromptSacar(){
        Conta c = PromtNumero();
        System.out.println("Digite o valor a ser sacado: ");
        double valor = input.nextDouble();
        if(c.sacar(valor)){
            System.out.println("Sauque feito com sucesso!");
        }else{
            System.out.println("Houve um erro no saque.");
        }
    }
    private static void PromptDepositar(){
        Conta c = PromtNumero();
        System.out.println("Digite o valor a depositar: ");
        double valor = input.nextDouble();
        c.depositar(valor);
    }
    private static Conta PromtNumero(){
        System.out.println("Digite o numero da conta que voce quer usar: ");
        return contas.get(input.nextInt());
    }
}
