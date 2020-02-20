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
        objConta1.saldo = 500;
        objConta1.imprimir();
        
        Conta objConta2 = new Conta();    
        //Preenche os atributos da classe
        objConta2.agencia = 900;
        objConta2.conta = 658;
        objConta2.nome = "Pedro Rocha";
        objConta2.saldo = 500000;
        objConta2.imprimir();
        
        objConta1.transferirValor();
        
        objConta1.imprimir();
        System.out.println("DEPOIS");
        objConta2.imprimir();
        
    
    }
    
}
