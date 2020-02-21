/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.revisaojava;

import dao.Conta;

/**
 *
 * @author jdhein
 */
public class Exercicio3 {
    
    public static void main(String[] args){
        
        System.out.println("ANTES");
        Conta objConta1 = new Conta();    
        //Preenche os atributos da classe
        objConta1.agencia = 123;
        objConta1.conta = 444;
        objConta1.nome = "Juca Bala";
        objConta1.saldo = 200.99;
        objConta1.imprimir();
        
        Conta objConta2 = new Conta();    
        //Preenche os atributos da classe
        objConta2.agencia = 900;
        objConta2.conta = 658;
        objConta2.nome = "Pedro Rocha";
        objConta2.saldo = 980.65;
        objConta2.imprimir();
        
        /*Transferencia de valor entre contas
          Conta Origem para conta Destino 
          Qual o valor?
          A conta de origem fica sendo a conta do objeto em si
        */
        double valorTransf = 500.80;
        objConta1.transferirValor(objConta2, valorTransf);
        
        System.out.println("\nDEPOIS");
        objConta1.imprimir();
        objConta2.imprimir();
        
    
    }
    
}
