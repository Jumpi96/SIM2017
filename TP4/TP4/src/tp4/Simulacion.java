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
    [0]: Semana.
    [1]: Día (1: Lunes a 7: Domingo).
    [2]: RND.
    [3]: Demanda diaria.
    [4]: Tortas tiradas.
    [5]: RND.
    [6]: ¿Debe pagar multa?
    [7]: Utilidad.
    [8]: Acumulador Tortas Vendidas.
    [9]: Acumulador Tortas Tiradas.
    [10]: Acumulador Utilidad.
    [11]: Acumulador Multas.
    [12]: Utilidad con permiso.
    */
    private double[][] tablaMostrar;
    private double[][] tabla;
    private int semanas;
    private int diasSemana;
    private int mostrarDesde;
    private int mostrarHasta;

    public Simulacion(int semanas,int diasSemana,int semanasDesde, int semanasHasta) {
        this.semanas=semanas;
        this.diasSemana=diasSemana;
        this.tabla=new double[2][12];        
        this.mostrarDesde=semanasDesde;
        this.mostrarHasta=semanasHasta;
        this.tablaMostrar=new double[(mostrarHasta+1-mostrarDesde)*diasSemana][13];
    }
    /*
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
    }*/
    
    public double[][] simular(){
        int contador=0;
        for (int i = 0; i < semanas; i++) {
            if(i+1>=mostrarDesde && i+1<=mostrarHasta){
                for (int j = i*diasSemana; j < ((i+1)*diasSemana); j++) {    
                    tablaMostrar[contador][0]=i+1;
                    tablaMostrar[contador][1]=j-i*diasSemana+1;
                    tablaMostrar[contador][2]=Math.random();
                    tablaMostrar[contador][3]=getDemanda(tablaMostrar[contador][2]);
                    tablaMostrar[contador][4]=50-tablaMostrar[contador][3];
                    tablaMostrar[contador][5]=Math.random();
                    tablaMostrar[contador][6]=pagaMulta(tablaMostrar[contador][5]);
                    tablaMostrar[contador][7]=-50*10+tablaMostrar[contador][3]*30-tablaMostrar[contador][6]*300;
                    tablaMostrar[contador][8]=tablaMostrar[contador][3]+tabla[1][8];
                    tablaMostrar[contador][9]=tablaMostrar[contador][4]+tabla[1][9];
                    tablaMostrar[contador][10]=tablaMostrar[contador][7]+tabla[1][10];
                    tablaMostrar[contador][11]=tablaMostrar[contador][6]+tabla[1][11];
                    tablaMostrar[contador][12]=-50*10+tablaMostrar[contador][3]*30-200/diasSemana;

                    tabla[1][8]=tablaMostrar[contador][8];
                    tabla[1][9]=tablaMostrar[contador][9];
                    tabla[1][10]=tablaMostrar[contador][10];
                    tabla[1][11]=tablaMostrar[contador][11];
                    
                    contador++;
                }
            }
            else{
                for (int j = 0; j < diasSemana; j++) {    
                    tabla[0][0]=i+1;
                    tabla[0][1]=j+1;
                    tabla[0][2]=Math.random();
                    tabla[0][3]=getDemanda(tabla[0][2]);
                    tabla[0][4]=50-tabla[0][3];
                    tabla[0][5]=Math.random();
                    tabla[0][6]=pagaMulta(tabla[0][5]);
                    tabla[0][7]=-50*10+tabla[0][3]*30-tabla[0][6]*300;
                    tabla[0][8]=tabla[0][3]+tabla[1][8];
                    tabla[0][9]=tabla[0][4]+tabla[1][9];
                    tabla[0][10]=tabla[0][7]+tabla[1][10];
                    tabla[0][11]=tabla[0][6]+tabla[1][11];

                    tabla[1][8]=tabla[0][8];
                    tabla[1][9]=tabla[0][9];
                    tabla[1][10]=tabla[0][10];
                    tabla[1][11]=tabla[0][11];
                }
            }
        }
        return tablaMostrar;
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
    
    public Resultados getResultados(){
        double dias=semanas*diasSemana;
        double utilidadConPermiso=(-1*(50*10)*dias+tabla[1][8]*30-200*semanas)/dias;
        double utilidadPrueba=(-1*(50*10)*dias+tabla[1][8]*30-300*tabla[1][11])/dias;
        double diferencia=(tabla[1][10]/dias)-utilidadConPermiso;
        Resultados r=new Resultados(tabla[1][10]/dias,
                                    tabla[1][9]/dias,
                                    tabla[1][8]/dias,
                                    diferencia);
        return r;
    }
}
