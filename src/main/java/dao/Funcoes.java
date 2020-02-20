package dao;

public class Funcoes {
    
    public void multiplicar(int[] array){
        float resultado = 1;
        for(int i : array){
            resultado = resultado * i;
        }
        System.out.println("Resultado da mult: " + resultado);
    }
    
    public void imprimir(String texto1, String texto2){
        System.out.println(texto1);
        System.out.println(texto2);
    }
    
}

