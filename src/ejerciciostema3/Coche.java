/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostema3;

/**
 *
 * @author USER
 */
public class Coche {
 
    private int numpuertas;
 
    
   

    public Coche(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }
    
     public void aumentarPuertas(){
       this.numpuertas++;
    }
}



