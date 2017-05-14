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
public class Simulacion {
    /*
    [0]: Día (1: Lunes a 7: Domingo).
    [1]: RND.
    [2]: Demanda diaria.
    [3]: RND.
    [4]: ¿Debe pagar multa?
    [5]: Acumulador Tortas Vendidas.
    [6]: Acumulador Tortas Tiradas.
    [7]: Acumulador Utilidad.
    [8]: Acumulador Multas.
    */
    private double[][] tabla;
    private int dia;

    public Simulacion(int dia) {
        this.dia = dia;
        this.tabla=new double[2][9];
    }
    
    public Resultados simular(){
        for (int i = 0; i < dia; i++) {
            tabla[0][0]=i+1;
            tabla[0][1]=Math.random();
            tabla[0][2]=getDemanda(tabla[0][1]);
            tabla[0][3]=Math.random();
            tabla[0][4]=pagaMulta(tabla[0][3]);
            tabla[0][5]=tabla[0][2]+tabla[1][5];
            tabla[0][6]=50-tabla[0][2]+tabla[1][6];
            tabla[0][7]=-50*10+tabla[0][2]*30-tabla[0][4]*300+tabla[1][7];
            tabla[0][8]=tabla[0][4]+tabla[1][8];
            
            tabla[1][5]=tabla[0][5];
            tabla[1][6]=tabla[0][6];
            tabla[1][7]=tabla[0][7];
            tabla[1][8]=tabla[0][8];
        }
        return getResultados();
    }
    
    private int getDemanda(double rnd){
        if (rnd<0.1)
            return 10;
        else if (rnd<0.30)
            return 20;
        else if (rnd<0.7)
            return 25;
        else if (rnd<0.8)
            return 30;
        else
            return 50;
    }
    
    private int pagaMulta(double rnd){
        if (rnd<0.25)
            return 1;
        else
            return 0;
    }
    
    private Resultados getResultados(){
        double utilidadConPermiso=(-(50*10)*dia+tabla[1][5]*30-200)/dia;
        double utilidadPrueba=(-(50*10)*dia+tabla[1][5]*30-300*tabla[1][8])/dia;
        double diferencia=(tabla[1][7]/dia)-utilidadConPermiso;
        Resultados r=new Resultados(tabla[1][7]/dia,
                                    tabla[1][6]/dia,
                                    tabla[1][5]/dia,
                                    diferencia);
        return r;
    }
}
