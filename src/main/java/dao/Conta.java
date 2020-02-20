package dao;

/**
 *
 * @author jdhein
 */
public class Conta {
    
    public int agencia;
    public int conta;
    public String nome;
    public float saldo;
    
    public void imprimir(){
        System.out.println("Conta: " + conta + "\nSaldo: " + saldo + "\n----------");
    }
    
    public void transferirValor(){
        
    }
    
}
