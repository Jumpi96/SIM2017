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
public class Simulacion {
    /*
    [0]: Estado.
    [1]: Reloj.
    [2]: RND Llegada.
    [3]: Tiempo llegada.
    [4]: Próxima llegada.
    [5]: RND Tipo cliente.
    [6]: Tipo cliente.
    [7]: RND Demora carnicería.
    [8]: Demora carnicería.
    [9]: RND Carnicería+Verdulería.
    [10]: Demora total carnicería.
    [11]: Cola carnicería.
    [12]: RND Demora fiambrería.
    [13]: Demora fiambrería.
    [14]: RND Fiambrería+Verdulería.
    [15]: Demora total fiambrería.
    [16]: Cola fiambrería.
    [17]: Demora verdulería.
    [18]: Estado Cliente 1.
    [19]: Fin atención Cliente 1.
    [20]: Cliente 2.
    [21]: Fin atención Cliente 2.
    [22]: Contador Clientes.
    [23]: Acumulador tiempos de espera.
    */
    private ArrayList<Object[]> tablaMostrar;
    private Object[][] tabla;
    private int dias;
    private int horas;
    private int mostrarDesde;
    private int mostrarHasta;

    public Simulacion(int dias,int horas,int diasDesde, int diasHasta) {
        this.dias=dias;
        this.horas=horas;
        this.tabla=new Object[2][24];        
        this.mostrarDesde=diasDesde;
        this.mostrarHasta=diasHasta;
        int corrector;
        if (mostrarDesde==0)
            corrector=0;
        else
            corrector=1;
        if (mostrarDesde !=mostrarHasta)
            this.tablaMostrar=new ArrayList<Object[]>();
    }
    
    public ArrayList<Object[]> simular(){
        Object[] row;
        for (int i = 0; i < dias; i++) {
            while((Double)tabla[1][1]<horas){
                row = new Object[24];
                row[0]=getEstado();
                row[1]=tabla[1][1]+getProximo();
                if(esLlegada()){
                    row[2]=Math.random();
                    row[3]=getTiempoLlegada(row[2]);
                    row[4]=(double)row[1]+(double)row[3];
                    row[5]=Math.random();
                    row[6]=addCliente(row[5]); // agregas el cliente a la otra tabla
                    row[7]="-";
                    row[8]="-";
                    row[9]="-";
                    row[10]="-";
                    row[11]=getColaCarniceria(row);
                    row[12]="-";
                    row[13]="-";
                    row[14]="-";
                    row[15]="-";
                    row[16]=getColaFiambreria(row);
                    row[17]="-";
                    row[18]=tabla[1][18];
                    row[19]="-";
                    row[20]=tabla[1][20];
                    row[21]="-";
                    row[22]=(Integer)tabla[1][22]+1;
                    row[23]=tabla[1][23];  
                }
                else{
                    row[2]="-";
                    row[3]="-";
                    row[4]=tabla[1][4];
                    row[5]="-";
                    row[6]=getProxCliente(row[1]); // le pasas el reloj para que lo busque
                    if (row[6].equals("Carnicería")){
                        row[7]=Math.random();
                        row[8]=getDemoraCarniceria(row[7]);
                        row[9]=Math.random();
                        row[10]=getDemoraTotalCarniceria(row);
                        row[11]=getColaCarniceria(row);
                        row[12]="-";
                        row[13]="-";
                        row[14]="-";
                        row[15]="-";
                        row[16]="-";
                        row[17]="-";
                        row[18]=getCliente1(row);
                        row[19]=getFinAtencionCliente1(row);
                        row[20]=tabla[1][20];
                        row[21]="-";
                        row[22]=(Integer)tabla[1][22];
                        row[23]=getTiempoEspera(row);
                    }
                    else if(row[6].equals("Fiambrería")){
                        row[7]="-";
                        row[8]="-";
                        row[9]="-";
                        row[10]="-";
                        row[11]=tabla[1][11];
                        row[12]=Math.random();
                        row[13]=getDemoraFiambreria(row[12]);
                        row[14]=Math.random();
                        row[15]=getDemoraTotalFiambreria(row);
                        row[16]=getColaFiambreria(row);
                        row[17]="-";
                        row[18]=tabla[1][18];
                        row[19]="-";
                        row[20]=getCliente2(row);
                        row[21]=getFinAtencionCliente2(row);
                        row[22]=(Integer)tabla[1][22];
                        row[23]=getTiempoEspera(row);
                    }
                    else{
                        row[7]="-";
                        row[8]="-";
                        row[9]="-";
                        row[10]="-";
                        row[11]=getColaCarniceria(row);
                        row[12]="-";
                        row[13]="-";
                        row[14]="-";
                        row[15]="-";
                        row[16]=getColaFiambreria(row);
                        row[17]=0.2/60;
                        row[18]=tabla[1][18];
                        row[19]="-";
                        row[20]=tabla[1][20];
                        row[21]="-";
                        row[22]=(Integer)tabla[1][22];
                        row[23]=getTiempoEspera(row);
                    }
                }

                tablaMostrar.add(row);

                tabla[1][1]=row[1];
                tabla[1][4]=row[4];
                tabla[1][11]=row[11];
                tabla[1][16]=row[16];
                tabla[1][18]=row[18];
                if(!row[19].equals("-"))
                    tabla[1][19]=row[19];
                tabla[1][20]=row[20];
                if(!row[21].equals("-"))
                    tabla[1][21]=row[21];
                tabla[1][22]=row[22];
                tabla[1][23]=row[23];
                if(i+1>=mostrarDesde && i+1<=mostrarHasta && mostrarDesde!=mostrarHasta)
                    tablaMostrar.add(row);
                else
                    tabla[0]=row;
            }
        }
        return tablaMostrar;
    }
    
    public Resultados getResultados(){
        Resultados r = new Resultados((double)tabla[1][23],
                (double)tabla[1][22]);
        return r;
    }
}
