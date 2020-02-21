package dao;

/**
 *
 * @author jdhein
 */
public class Conta {
    
    public int agencia;
    public int conta;
    public String nome;
    public double saldo;
    public double cheque_especial;//valor de limite a ser utilizado caso o saldo fique negativo
    
    public void imprimir(){
        System.out.println("Conta: " + conta + "\nSaldo: " + saldo + "\n----------");
    }
    
    //Transfere o valor de uma conta para outra
    public void transferirValor(Conta contaDestino, double valorTransferencia){
        //Além de testar o saldo,
        //precisa testar o cheque especial
        if(this.saldo >= valorTransferencia){
            //passar valorTransferencia da conta origem para a conta destino
            this.saldo = saldo - valorTransferencia; //tira o saldo da conta origem
            contaDestino.saldo += valorTransferencia; //incrementar o saldo da conta de destino
        }else{
            System.out.println("Ops, saldo insuficiente");
        }
        
    }
    
}
