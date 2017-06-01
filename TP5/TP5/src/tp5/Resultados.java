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
    private double demora;
    private double cantClientes;
    private double promDemora;

    public Resultados(double demora, double cantClientes) {
        this.demora = demora;
        this.cantClientes = cantClientes;
        this.promDemora = demora/cantClientes;
    }

    public double getDemora() {
        return demora;
    }

    public void setDemora(double demora) {
        this.demora = demora;
    }

    public double getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(double cantClientes) {
        this.cantClientes = cantClientes;
    }

    public double getPromDemora() {
        return promDemora;
    }

    public void setPromDemora(double promDemora) {
        this.promDemora = promDemora;
    }

    
    
    
}
