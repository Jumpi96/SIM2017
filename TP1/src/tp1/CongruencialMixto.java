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
public class CongruencialMixto {
    private int a,c,m;
    private int k,g;
    private int seed;

    public CongruencialMixto(int a, int c, int m, int k, int g, int seed) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.k = k;
        this.g = g;
        this.seed = seed;
    }          
    
    //Retorna matriz con numeros en columna 0 y randoms en columna 1
    public Object[][] getNumeros(int cantidad){
        Object[][] numeros= new Object[cantidad][2];
        double xi=seed;
        for (int i = 0; i < cantidad; i++) {
            xi=(a*xi+c)%m;
            numeros[i][0]=(int) xi;
            numeros[i][1]=xi/(m-1);
        }
        return numeros;
    }
}
