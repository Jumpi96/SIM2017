/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author juampilorenzo
 */
public class Resultados {
    private double promUtilidad;
    private double promTiradas;
    private double promVendidas;
    private double difConPermiso;

    public Resultados(double promUtilidad, double promTiradas, double promCompradas, double difConPermiso) {
        this.promUtilidad = promUtilidad;
        this.promTiradas = promTiradas;
        this.promVendidas = promCompradas;
        this.difConPermiso = difConPermiso;
    }

    public double getPromUtilidad() {
        return promUtilidad;
    }

    public double getPromTiradas() {
        return promTiradas;
    }

    public double getPromVendidas() {
        return promVendidas;
    }

    public double getDifConPermiso() {
        return difConPermiso;
    }
    
    
}
