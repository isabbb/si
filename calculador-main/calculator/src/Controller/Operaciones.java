/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author sistemas
 */
public class Operaciones {
    public String Suma(float n1, float n2){
        float resul=n1+n2;
        return String.valueOf(resul);
        //return resul+"";
                
    }
    
    public String resta (float n1, float n2){
        float resul = n1 - n2;
        return String.valueOf(resul);
        
    }
    
    public String multiplicacion(float n1, float n2){
        float resul = n1 * n2;
        return String.valueOf(resul);
        
    }
    public String division (float n1, float n2){
        float resul = n1 / n2;
        return String.valueOf(resul);   
    }
}
