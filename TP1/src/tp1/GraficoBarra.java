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
import java.io.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtilities;

/*
Recibe datos en matriz de dos columnas (0: etiquetas; 1: cantidad) y guarda
con método Graficar() un .jpg.
*/
public class GraficoBarra {
    
    private final Object[][] datos;

    public GraficoBarra(Object[][] datos) {
        this.datos = datos;
    }
   
    public void graficar() throws Exception {

      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      
        for (Object[] dato : datos) {
            dataset.addValue((Integer) dato[1], "", (String) dato[0]);
        }

      JFreeChart barChart = ChartFactory.createBarChart(
         "Distribución", 
         "", "Cantidad", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640; 
      int height = 480;  
      File BarChart = new File( "GraficoBarra.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
   }
}