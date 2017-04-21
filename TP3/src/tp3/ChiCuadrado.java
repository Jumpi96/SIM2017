package tp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ChiCuadrado {
    
    private float[] tabla;
    private final String origen = "chiDatos.txt"; // nivel de confianza: 0.95

    public ChiCuadrado() throws FileNotFoundException {
        cargarDatos();
    }
    
    private void cargarDatos() throws FileNotFoundException{
        Scanner sc = new Scanner(new File(origen));
        
        int i = 0;
        while (sc.hasNextLine()){
            tabla[i]=sc.nextFloat();
            i++;       
        }       
    }
    
    public float getValorCritico(float[][] datos){
        return tabla[getGradosDeLibertad(datos.length)];
    }
    
    public int getGradosDeLibertad(int n){
        return n-1;
    }
    
    private float computarChiCuadrado(float[][] datos){
        float suma=0;
        for (int i = 0; i < datos.length; i++)
            suma+=(Math.pow(datos[i][0]-datos[i][1],2))/datos[i][1];
        return suma;
    }
    
    public boolean verificarChiCuadrado(float[][] datos){
        return computarChiCuadrado(datos)<getValorCritico(datos);
    }
}
