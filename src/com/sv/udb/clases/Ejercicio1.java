/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author JMagoSV
 */
public class Ejercicio1 {
    private int numeBase;
    private int numePote;

    public int getNumeBase() {
        return numeBase;
    }

    public void setNumeBase(int numeBase) {
        this.numeBase = numeBase;
    }

    public int getNumePote() {
        return numePote;
    }

    public void setNumePote(int numePote) {
        this.numePote = numePote;
    }
    
    public int getResultado()
    {
        int resp = 1;
        try
        {
            //Si la potencia es cero se sale
            if(numePote == 0)
            {
                return 1;
            }
            //Sino es cero continúa
            for(int i = 1; i <= numePote; i++)
            {
                resp = this.multiplicar(resp, numeBase); 
            }
        }
        catch (Exception e)
        {
            System.err.println("Error en Ejercicio 1: " + e.getMessage());
        }
        return resp;
    }
    
    private int multiplicar(int num1, int num2)
    {
       int resp = 0;
       for(int i = 0; i < num1; i++)
       {
           //resp = resp + num2;
           resp += num2;
       }
       return resp;
    }
}
