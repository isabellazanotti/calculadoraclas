/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraz;

import java.util.Scanner;

public class Calculos {
 
    public static void main(String[] args) {

       Scanner num = new Scanner(System.in);
       System.out.println("Digite o primeiro número: ");
       double valor1 = num.nextDouble();
       
       System.out.println("Digite o segundo número: ");
       double valor2 = num.nextDouble();
       
       Calculadora calc = new Calculadora();
       
       calc.calcularTudo(valor1, valor2);
       
       
    }
}