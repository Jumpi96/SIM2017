package tp5;

import java.util.ArrayList;

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
    private ArrayList<Object[]> colaCarniceria;
    private ArrayList<Object[]> colaFiambreria;
    private Object[][] tabla;
    private int dias;
    private int horas;
    private int mostrarDesde;
    private int mostrarHasta;
    private double acumuladorEspera=0.0;

    public Simulacion(int dias,int horas,int diasDesde, int diasHasta) {
        this.dias=dias;
        this.horas=horas;
        inicializarTabla();
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
        Object[] temp;
        for (int i = 0; i < dias; i++) {
            while((!tabla[1][0].equals("Fin del dia"))){
                row = new Object[24];
                row[0] = getEstado();
                row[1] = getProximo();
                if(esLlegada((float)row[1])){
                    row[2] = (float)Math.random();
                    row[3] = getTiempoLlegada(0.5F, (float)row[2]);
                    row[4] = (float)row[1] + (float)row[3];
                    row[5] = (float) Math.random();
                    row[6] = addCliente((double)row[5],(double)row[1]);
                    
                    if(row[6].equals("Carniceria")&&
                            (!tabla[1][18].equals("Atendiendo"))){
                        row[7] = (float) Math.random();
                        row[8] = getDemoraCarniceria((float)row[7]);
                        row[9]= (float) Math.random();
                        row[10]= getDemoraTotalCarniceria((float)row[8], (float)row[9]);
                        row[11]= tabla[1][11];
                        row[12] = "-";
                        row[13] = "-";
                        row[14] = "-";
                        row[15] = "-";
                        row[16] = tabla[1][16];
                        row[17] = "-";
                        row[18] = getCliente1(row);
                        row[19] = getFinAtencionCliente1(row);
                        row[20]=tabla[1][20];
                        row[21] = "-";
                        row[22] = (Integer)tabla[1][22]+1;
                        acumuladorEspera+=(double)row[19]-(double)row[1];
                        row[23] = acumuladorEspera; 
                        colaCarniceria.remove(0);
                    }
                    else if(row[6].equals("Fiambreria") &&
                            (!tabla[1][20].equals("Atendiendo"))){
                        row[7]="-";
                        row[8]="-";
                        row[9]="-";
                        row[10]="-";
                        row[11]=tabla[1][11];
                        row[12] = (float)Math.random();
                        row[13] = getDemoraFiambreria((float)row[12]);
                        row[14] = (float)Math.random();
                        row[15] = getDemoraTotalFiambreria((float)row[13], (float)row[14]);
                        row[16] = tabla[1][16];
                        row[17] = "-";
                        row[18]=tabla[1][18];
                        row[19]="-";
                        row[20]=getCliente2(row);
                        row[21]=getFinAtencionCliente2(row);
                        row[22]=(Integer)tabla[1][22]+1;
                        acumuladorEspera+=(double)row[21]-(double)row[1];
                        row[23]=acumuladorEspera;
                        colaFiambreria.remove(0);
                    }
                    else if(row[6].equals("Verduleria") && 
                            (!tabla[1][20].equals("Atendiendo")
                             || !tabla[1][18].equals("Atendiendo"))){
                        if(!tabla[1][18].equals("Atendiendo")){
                            row[7]="-";
                            row[8]="-";
                            row[9]="-";
                            row[10]="-";
                            row[11]=tabla[1][11];
                            row[12]="-";
                            row[13]="-";
                            row[14]="-";
                            row[15]="-";
                            row[16]=tabla[1][16];
                            row[17]=0.2/60;
                            row[18]=getCliente1(row);
                            row[19]=getFinAtencionCliente1(row);
                            row[20]=tabla[1][20];
                            row[21]=tabla[1][21];
                            row[22]=(Integer)tabla[1][22]+1;
                            acumuladorEspera+=(double)row[19]-(double)row[1];
                            row[23]=acumuladorEspera;
                            
                            row[6]="Verduleria (C)";
                            colaCarniceria.remove(0);
                        }
                        else{
                            row[7]="-";
                            row[8]="-";
                            row[9]="-";
                            row[10]="-";
                            row[11]=tabla[1][11];
                            row[12]="-";
                            row[13]="-";
                            row[14]="-";
                            row[15]="-";
                            row[16]=tabla[1][16];
                            row[17]=0.2/60;
                            row[18]=tabla[1][20];
                            row[19]=tabla[1][21];
                            row[20]=getCliente2(row);
                            row[21]=getFinAtencionCliente2(row);
                            row[22]=(Integer)tabla[1][22]+1;
                            acumuladorEspera+=(double)row[21]-(double)row[1];
                            row[23]=acumuladorEspera;
                            
                            row[6]="Verduleria (F)";
                            colaFiambreria.remove(0);
                        }
                    }
                    else{
                        row[7] = "-";
                        row[8] = "-";
                        row[9] = "-";
                        row[10] = "-";
                        row[11] = getColaCarniceria(null);
                        row[12] = "-";
                        row[13] = "-";
                        row[14] = "-";
                        row[15] = "-";
                        row[16] = getColaFiambreria(null);
                        row[17] = "-";
                        row[18]=tabla[1][18];
                        row[19]=tabla[1][19];
                        row[20]=tabla[1][20];
                        row[21]=tabla[1][21];
                        row[22] = (Integer)tabla[1][22]+1;
                        row[23] = acumuladorEspera;  
                    }
                }
                else if(row[1].equals("Fin del dia")){
                    row[2] = "-";
                    row[3] = "-";
                    row[4] = "-";
                    row[5] = "-";
                    row[6] = "-";
                    row[7] = "-";
                    row[8] = "-";
                    row[9] = "-";
                    row[10] = "-";
                    row[11] = "-";
                    row[12] = "-";
                    row[13] = "-";
                    row[14] = "-";
                    row[15] = "-";
                    row[16] = "-";
                    row[17] = "-";
                    row[18] = "Libre";
                    row[19] = "-";
                    row[20] = "Libre";
                    row[21] = "-";
                    row[22] = (Integer)tabla[1][22];
                    row[23] = acumuladorEspera;  
                }
                else{
                    row[2]="-";
                    row[3]="-";
                    row[4]=tabla[1][4];
                    row[5]="-";
                    temp=getProxCliente((double)row[1]);
                    row[6] = temp[0];
                    if (row[6].equals("Carniceria")){
                        row[7] = (float) Math.random();
                        row[8] = getDemoraCarniceria((float)row[7]);
                        row[9]= (float) Math.random();
                        row[10]= getDemoraTotalCarniceria((float)row[8], (float)row[9]);
                        row[11]=getColaCarniceria(row);
                        row[12]="-";
                        row[13]="-";
                        row[14]="-";
                        row[15]="-";
                        row[16]=tabla[1][16];
                        row[17]="-";
                        row[18]=getCliente1(row);
                        row[19]=getFinAtencionCliente1(row);
                        row[20]=tabla[1][20];
                        row[21]="-";
                        row[22]=(Integer)tabla[1][22];
                        acumuladorEspera+=(double)row[19]-(double)temp[1];
                        row[23]=acumuladorEspera;
                        colaCarniceria.remove(0);
                    }
                    else if(row[6].equals("Fiambreria")){
                        row[7]="-";
                        row[8]="-";
                        row[9]="-";
                        row[10]="-";
                        row[11]=tabla[1][11];
                        row[12] = (float)Math.random();
                        row[13] = getDemoraFiambreria((float)row[12]);
                        row[14] = (float)Math.random();
                        row[15] = getDemoraTotalFiambreria((float)row[13], (float)row[14]);
                        row[16]=getColaFiambreria(row);
                        row[17]="-";
                        row[18]=tabla[1][18];
                        row[19]="-";
                        row[20]=getCliente2(row);
                        row[21]=getFinAtencionCliente2(row);
                        row[22]=(Integer)tabla[1][22];
                        acumuladorEspera+=(double)row[21]-(double)temp[1];
                        row[23]=acumuladorEspera;
                        colaFiambreria.remove(0);
                    }
                    else{
                        if (row[6].equals("Verduleria (C)")){
                            row[7]="-";
                            row[8]="-";
                            row[9]="-";
                            row[10]="-";
                            row[11]=getColaCarniceria(row);
                            row[12]="-";
                            row[13]="-";
                            row[14]="-";
                            row[15]="-";
                            row[16]=tabla[1][16];
                            row[17]=0.2/60;
                            row[18]=getCliente1(row);
                            row[19]="-";
                            row[20]=tabla[1][20];
                            row[21]="-";
                            row[22]=(Integer)tabla[1][22];
                            acumuladorEspera+=(double)row[19]-(double)temp[1];
                            row[23]=acumuladorEspera;
                        }
                        else{
                            row[7]="-";
                            row[8]="-";
                            row[9]="-";
                            row[10]="-";
                            row[11]=tabla[1][11];
                            row[12]="-";
                            row[13]="-";
                            row[14]="-";
                            row[15]="-";
                            row[16]=getColaFiambreria(row);
                            row[17]=0.2/60;
                            row[18]=tabla[1][18];
                            row[19]="-";
                            row[20]=getCliente2(row);
                            row[21]="-";
                            row[22]=(Integer)tabla[1][22];
                            acumuladorEspera+=(double)row[21]-(double)temp[1];
                            row[23]=acumuladorEspera;
                        }
                    }
                }

                tablaMostrar.add(row);

                tabla[1][1]=row[1];
                tabla[1][4]=row[4];
                tabla[1][11]=row[11];
                tabla[1][16]=row[16];
                tabla[1][18]=row[18];
                if(row[19].equals("-"))
                    tabla[1][19]=row[19];
                tabla[1][20]=row[20];
                if(row[21].equals("-"))
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
    private String getColaCarniceria(Object[] obj){
        String cadena="";
        Object[] actual;
        boolean primero=true;
        for (int i = 0; i < colaCarniceria.size(); i++) {
            if (primero && obj!=null){
                primero=false;
                continue;
            }
            actual=colaCarniceria.get(0);
            if (actual[0].equals("Carnicería"))
                cadena+="C ";
            else
                cadena+="V ";
        }
        return cadena;
    }
    private String getColaFiambreria(Object[] obj){
        String cadena="";
        Object[] actual;
        boolean primero=true;
        for (int i = 0; i < colaCarniceria.size(); i++) {
            if (primero && obj!=null){
                primero=false;
                continue;
            }
            actual=colaCarniceria.get(0);
            if (actual[0].equals("Fiambrería"))
                cadena+="F ";
            else
                cadena+="V ";
        }
        return cadena;
    }
    private double getFinAtencionCliente1 (Object[] row){
        return (double)row[1]+(double)row[10];
    }
    private double getFinAtencionCliente2 (Object[] row){
        return (double)row[1]+(double)row[15];
    }
    private String getCliente1(Object[] row){
        if(row[0].equals("Inicio del dia"))
            return "Libre";
        else if(!row[10].equals("-")
                || !row[17].equals("-"))
            return "Atendiendo";
        else
            return "Libre";
    }
    private String getCliente2(Object[] row){
        if(row[0].equals("Inicio del dia"))
            return "Libre";
        else if(!row[15].equals("-")
                || !row[17].equals("-"))
            return "Atendiendo";
        else
            return "Libre";
    }
    private String getEstado(){
        double proxLlegada=(double)tabla[1][4];
        double finCarniceria=(double)tabla[1][19];
        double finFiambreria=(double)tabla[1][21];
        boolean finHora = (double)tabla[1][1]>horas;
        if(tabla[0][0].equals(""))
            return "Inicio del dia";
        else{
            if (!finHora){
                if(proxLlegada<finCarniceria && proxLlegada<finFiambreria)
                    return("Llegada cliente");
                else if(finCarniceria<proxLlegada && finCarniceria<finFiambreria)
                    return("Fin Atencion C");
                else
                    return("Fin Atencion F");
            }
            else{
                if(finCarniceria<finFiambreria)
                    if(colaCarniceria.isEmpty() && tabla[1][18].equals("Libre"))
                        if(tabla[1][20].equals("Atendiendo"))
                            return "Fin Atencion F";
                        else
                            return "Fin del dia";
                    else
                        return "Fin Atencion C";
                else
                    if(colaFiambreria.isEmpty() && tabla[1][20].equals("Libre"))
                        if(tabla[1][18].equals("Atendiendo"))
                            return "Fin Atencion C";
                        else
                            return "Fin del dia";
                    else
                        return "Fin Atencion F";
            }     
        }
    }
    
    private String addCliente(double rnd,double reloj){
        String tipo=getTipoCliente(rnd);
        Object[] row= {tipo,reloj};
        if(tipo.equals("Carniceria"))
            colaCarniceria.add(row);
        else if(tipo.equals("Fiambreria"))
            colaFiambreria.add(row);
        else
            if(colaCarniceria.size()<=colaFiambreria.size())
                colaCarniceria.add(row);
            else
                colaFiambreria.add(row);
        
        return tipo;
    }
    private String getTipoCliente(double rnd){
        if (rnd<0.30)
            return "Verdulería";
        else if(rnd<0.56)
            return "Carnicería";
        else
            return "Fiambrería";
    }
    //Tengo que ver en la tabla cual de los 3 eventos se produce antes (llagada o fin de atención 1 o 2)
    private float getProximo(){
        
        float proximaLlegada = proximaLlegada = (float)tabla[1][4];
        float finAtencionCliente1 = 0.0f;
        float finAtencionCliente2 = 0.0f;
        
        float retorno = proximaLlegada;
        
        if (tabla[1][19].toString().compareTo("-")  != 0)
            finAtencionCliente1 = (float)tabla[1][19];
        if (tabla[1][21].toString().compareTo("-")  != 0)
            finAtencionCliente2 = (float)tabla[1][21];
        
        if(finAtencionCliente1 == 0 && finAtencionCliente2 == 0){   
        
        }else if(finAtencionCliente1 == 0){
            retorno = min (proximaLlegada, finAtencionCliente2);
        }else if(finAtencionCliente2 == 0){
            retorno = min (proximaLlegada, finAtencionCliente1);
        }else{
            retorno = min (proximaLlegada, finAtencionCliente1, finAtencionCliente2);
        }
            
        return retorno;
    }
    
    private float min (float a, float b, float c){
        
        float retorno = c;
        if(a <= b && a <= c) retorno = a;
        else if (b <= a && b <= c) retorno = b;
        
        return retorno;
    }
    
    private float min (float a, float b){
        float retorno = b;
        if(a < b) retorno = a;
        
        return retorno;
    }
    
    //Si el reloj es igual a la hora de proxima llegada entonces el evento que se produce es de llegada
    private boolean esLlegada (float reloj){
        boolean retorno = false;
        
        if (reloj ==  (float)tabla[1][4]) retorno = true;
        
        return retorno;
    }
    
    private float getTiempoLlegada(float u, float rnd){
       
        return (float)((-1) * u * Math.log(1 - rnd));
    }
    
    private float getDemoraCarniceria(float rnd){
        return 1.5F + rnd * 2;
    }
    
    private float getDemoraFiambreria(float rnd){
        return 1 + rnd * 2;
    }
    
    private float getDemoraTotalCarniceria(float demoraCarniceria, float rnd){
        float retorno = demoraCarniceria;
        if(rnd < 25) retorno += 0.2F;
        
        return retorno;
    }
    
            
    private float getDemoraTotalFiambreria(float demoraFiambreria, float rnd){
        float retorno = demoraFiambreria;
        if(rnd < 50) retorno += 0.2F;
        
        return retorno;
    }
    
    public Resultados getResultados(){
        Resultados r = new Resultados((double)tabla[1][23],
                (double)tabla[1][22]);
        return r;
    }
    
    private void inicializarTabla(){
        this.tabla=new Object[2][24];  
        
        this.tabla[0][1] = "";
        this.tabla[1][1] = 0.0F;
        this.tabla[1][2] = (float)Math.random();
        this.tabla[1][3] = getTiempoLlegada(0.5F, (float)this.tabla[1][2]);
        this.tabla[1][4] = this.tabla[1][3];
        this.tabla[1][5] = "-";
        this.tabla[1][6] = "-";
        this.tabla[1][7] = "-";
        this.tabla[1][8] = "-";
        this.tabla[1][9] = "-";
        this.tabla[1][10] = "-";
        this.tabla[1][11] = 0;
        this.tabla[1][12] = "-";
        this.tabla[1][13] = "-";
        this.tabla[1][14] = "-";
        this.tabla[1][15] = "-";
        this.tabla[1][16] = 0;
        this.tabla[1][17] = "-";
        this.tabla[1][18] = "-";
        this.tabla[1][19] = "-";
        this.tabla[1][20] = "-";
        this.tabla[1][21] = 0;
        this.tabla[1][22] = 0;
    }
    private Object[] getProxCliente(double reloj){
        Object[] r;
        if(reloj==(double)tabla[1][19]){
            r=colaCarniceria.get(0);
            if (r[0].equals("Verduleria")){
                colaCarniceria.remove(0);
                return new Object[]{"Verduleria (C)",r[1]};
            }
        }
        else{
            r=colaFiambreria.get(0);
            if (r[0].equals("Verduleria")){
                colaFiambreria.remove(0);
                return new Object[]{"Verduleria (F)",r[1]};
            }
                
        }        
        return r;
    }
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
    
    
}
