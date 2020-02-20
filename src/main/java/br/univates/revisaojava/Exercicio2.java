package br.univates.revisaojava;

/** - Crie um método que imprima 2 textos recebidos como argumentos 
 * do método
 *  - Crie um método que faça a multiplicação de um array de números
 */
public class Exercicio2 {
    
    public static void main(String[] args){
        String t1 = "Valor de Exemplo 1";
        String t2 = "Texto na segunda linha";
        imprimir(t1, t2);
    }
    
    private static void imprimir(String texto1, String texto2){
        System.out.println(texto1);
        System.out.println(texto2);
    }
    
}
