/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraz;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class Calculadora {
    
    public double valor1;
    public double valor2;
    private double valorTotal;
    
    
    public void setValorTotal(double valorTotal){
        this.valorTotal= valorTotal;  
    } 
    public double getValorTotal(){
        return this.valorTotal;
    } 
    
    public void calcularTudo(double valor1, double valor2){
      
       double soma= valor1+valor2; 
       System.out.println(soma);
       
       double sub=valor1-valor2;
       System.out.println(sub);
       
       double multi= valor1*valor2;
       System.out.println(multi);
       
       double div= valor1/valor2;
       System.out.println(div);
       
       
    }
    
    
    
    
    

    }



