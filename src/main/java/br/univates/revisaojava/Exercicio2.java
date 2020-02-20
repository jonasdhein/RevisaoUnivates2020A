package br.univates.revisaojava;

import dao.Funcoes;

/** - Crie um método que imprima 2 textos recebidos como argumentos 
 * do método
 *  - Crie um método que faça a multiplicação de um array de números
 */
public class Exercicio2 {
    
    public static void main(String[] args){
        String t1 = "Valor de Exemplo 1"; //Instanciar uma variável com atribuição de valor
        String t2 = "Texto na segunda linha";
        String t3 = new String("Valor 3");
        /*Instanciar um objeto da classe Funcoes para poder
            utilizar os métodos inerentes a ela
        */
        Funcoes objFunc = new Funcoes();
        objFunc.imprimir(t1, t2);
        
        int[] numeros = {1,2,3,4};
        objFunc.multiplicar(numeros);
        
    }
    
    
    
}
