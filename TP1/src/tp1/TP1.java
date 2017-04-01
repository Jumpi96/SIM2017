/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author juampilorenzo
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CongruencialMixto m = new CongruencialMixto(1001,1013,10000,0,0,9999);
        Object[][] array=m.getNumeros(20);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0]+"/"+array[i][1]);
        }
    }
    
}
