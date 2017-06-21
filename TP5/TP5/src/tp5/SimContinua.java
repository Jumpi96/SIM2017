/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.util.ArrayList;

/**
 *
 * @author juampilorenzo
 */
public class SimContinua {
    private ArrayList<Double[]> tabla;
    private double alpha;

    public ArrayList<Double[]> getTabla() {
        return tabla;
    }

    public void setTabla(ArrayList<Double[]> tabla) {
        this.tabla = tabla;
    }

    public SimContinua(double alpha) {
        tabla=new ArrayList<Double[]>();
        this.alpha=alpha;
        simular();
    }
    
    private void simular(){
        double tiempoActual=0;
        double porcActual=5;
        double derivActual=getDerivada(porcActual);
        double h=0.1;
        
        tabla.add(new Double[]{0.0,0.0,derivActual});
        while(porcActual<100){
            tiempoActual=tiempoActual+h;
            porcActual=getEuler(h,porcActual,derivActual);
            derivActual=getDerivada(porcActual);
            tabla.add(new Double[]{tiempoActual,porcActual,derivActual});
        }
    }
    
    private double getDerivada(double C){
        return C*alpha;
    }
    
    private double getEuler(double h, double C, double dC){
        return C+h*dC;
    }
    
    public double getTiempoPurga(double C){
        Double[] d;
        for (int i = 0; i < tabla.size(); i++) {
            d=tabla.get(i);
            if(d[1]>C*100)
                return d[0];
        }
        return 0.0;
    }
    
}
