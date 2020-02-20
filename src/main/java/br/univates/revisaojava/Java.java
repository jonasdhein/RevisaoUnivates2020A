package br.univates.revisaojava;

/**
 * LEMBRETE: - Nome de variável: sempre minúsculo
 * - Nome de classe: primeiro caracter maiúsculo
 * - Nome de variável: sempre minúsculo
 * - Nunca utilizar espaços
 * - Nunca utilizar caracteres especiais e acentuação na declaração
 * de variáveis, classes, etc.
 * 
 * 
 * @author jdhein
 */
public class Java {
    
    public static void main(String[] args){
        imprimir("Olá Mundo 1");
        imprimir("Olá Mundo 2");
        imprimir("Olá Mundo 3");
        
        //Declaração de variável
        //TIPO nome = atribuir um valor
        int x = 2;
        int y = 3;
        double z = somar(x, y, y);
        imprimir("Soma = " + z);
    }
    
    private static double somar(int x, int y, int z){
        return x + y + z;
    }
    
    private static void imprimir(String texto){
        System.out.println(texto);
    }
    
}
