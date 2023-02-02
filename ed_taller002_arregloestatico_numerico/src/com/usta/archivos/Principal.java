package com.usta.archivos;

import com.usta.utilidades.Aleatorio;
import java.util.Scanner;

public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static int[] arregloenteros;
    
    public static void main(String[] args) {
        int opcion = -1;
        while(opcion != 0){
            menu();
            
            System.out.println("ingrese una opcion");
            
            opcion = teclado.nextInt();
            
            switch (opcion) { 
                case 1:
                    agregar();
                break;
                case 2:
                    imprimir();
                break;
                case 3:
                    editar();
                break;
                case 4:
                    limpiar();
                break;
                default:
                    System.out.println("opcion no valida");
            }
        }
    }
    
    public static void menu(){
        System.out.println("----- arreglo estatico -----");
        System.out.println("--- opciones de seleccion ---");
        System.out.println("1. Agregar");
        System.out.println("2. Imprimir");
        System.out.println("3. Editar");
        System.out.println("4. Limpiar");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");
    }
    
    public static void agregar(){
        int tamanio;
        System.out.println("ingrese la cantidad de eleentos");
        tamanio = teclado.nextInt();
        arregloenteros = new int[tamanio];
        for(int i = 0; i < tamanio; i++){
            arregloenteros[i] = Aleatorio.Numero(1,20);
        }
        System.out.println("Arreglo lleno \n");
    }
    
    public static void imprimir(){
        for( int i = 0; i < arregloenteros.length; i++){
            System.out.println("Arreglo [" + i + "] = " + arregloenteros[i]);
        }
    }
    
    public static void editar(){
        System.out.println("Ingrese la posición a editar");
        int pos = teclado.nextInt();
        System.out.println("El valor actual en la posición " + pos + " es: " + arregloenteros[pos]);
        System.out.println("Ingrese el nuevo valor que va a reemplazar " + arregloenteros[pos]);
        int nuevoValor = teclado.nextInt();
        arregloenteros[pos] = nuevoValor;
    }

    
    public static void limpiar() {
        int pos = 0;
        arregloenteros[pos] = 0;
    }

}
