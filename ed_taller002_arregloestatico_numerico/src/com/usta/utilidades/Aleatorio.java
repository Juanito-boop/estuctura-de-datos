/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usta.utilidades;

import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class Aleatorio {
    public static Random miAleatorio = new Random();
    public static int Numero(int inicio, int fin){
        int  valor = miAleatorio.nextInt(fin - inicio + 1) + inicio;
        return valor;
    }
}
