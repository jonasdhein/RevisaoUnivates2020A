package br.univates.revisaojava;

/**
 *
 * @author jdhein
 */
public class Java {
    
    public static void main(String[] args){
        imprimir("Olá Mundo 1");
        imprimir("Olá Mundo 2");
        imprimir("Olá Mundo 3");
        
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
