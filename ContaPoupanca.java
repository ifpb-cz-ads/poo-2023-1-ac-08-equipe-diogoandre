public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int numero, String nome_titular){
        super(numero, nome_titular);
    }
    
    public void rejustar(double percentual){
        saldo = saldo + saldo * percentual;
    }
}