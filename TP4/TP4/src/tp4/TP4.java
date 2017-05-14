/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author juampilorenzo
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulacion s = new Simulacion(7);
        Resultados r = s.simular();
        System.out.println("Vendidas: "+r.getPromVendidas());
        System.out.println("Tiradas: "+r.getPromTiradas());
        System.out.println("Utilidad: "+r.getPromUtilidad());
        System.out.println("Dif: "+r.getDifConPermiso());
    }
    
}
