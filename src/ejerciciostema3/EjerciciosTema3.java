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
public class EjerciciosTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = suma(1,2,3);
        Coche miCoshe = new Coche(1);
        miCoshe.aumentarPuertas();
        System.out.println(miCoshe.getNumpuertas());
    }
    
    
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
    
}
