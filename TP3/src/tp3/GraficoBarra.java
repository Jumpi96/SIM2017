package tp3;

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
    
    private final String[] etiquetas;
    private final int[] valores;

    public GraficoBarra(String[] etiquetas, int[] valores) {
        this.etiquetas = etiquetas;
        this.valores = valores;
    }
   
    public void graficar() throws Exception {

      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      
        for (int i = 0; i < valores.length; i++) {
            dataset.addValue(valores[i], "Cantidad de Apariciones", etiquetas[i]);
        }

      JFreeChart barChart = ChartFactory.createBarChart(
         "Distribución", 
         "", "Cantidad", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 1640; 
      int height = 480;  
      File BarChart = new File( "GraficoBarra.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
   }
}