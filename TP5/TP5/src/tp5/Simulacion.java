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
    [20]: Estado Cliente 2.
    [21]: Fin atención Cliente 2.
    [22]: Contador Clientes.
    [23]: Acumulador tiempos de espera.
    [24]: Día.
    [25]: RND.
    [26]: Tiempo a purgar.
    [27]: Tiempo purga.
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
    private int acumuladorClientes = 0;
    private boolean purgando=false;
    private boolean estabaAtendiendo=false;
    private SimContinua simContinua=new SimContinua(0.1498);

    public Simulacion(int dias,int horas,int diasDesde, int diasHasta) {
        this.dias=dias;
        this.horas=horas;
        this.mostrarDesde=diasDesde;
        this.mostrarHasta=diasHasta;
        int corrector;
        colaCarniceria=new ArrayList<Object[]>();
        colaFiambreria=new ArrayList<Object[]>();
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
            inicializarTabla(i);
            while((!((String)tabla[1][0]).equals("Fin del dia"))){
                row = new Object[28];
                row[0] = getEstado();
                row[1] = getProximo(row);
                gestionarPurga(row);
                if(((String)row[0]).equals("Llegada cliente")){
                    row[2] = Math.random();
                    row[3] = getTiempoLlegada(0.5F, Float.parseFloat(row[2].toString()));
                    row[4] = (double)row[1] + (double)row[3];
                    row[5] = (double) Math.random();
                    row[6] = addCliente((double)row[5],(double)row[1]);
                    if(((String)row[6]).equals("Carniceria")&&
                            (((String)tabla[1][18]).equals("Libre"))){
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
                        acumuladorClientes ++;
                        acumuladorEspera+=(double)row[19]-(double)row[1];
                        row[23] = acumuladorEspera; 
                        colaCarniceria.remove(0);
                    }
                    else if(((String)row[6]).equals("Fiambreria") &&
                            (!((String)tabla[1][20]).equals("Atendiendo"))){
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
                        acumuladorClientes ++;
                        acumuladorEspera+=(double)row[21]-(double)row[1];
                        row[23]=acumuladorEspera;
                        colaFiambreria.remove(0);
                    }
                    else if(((String)row[6]).equals("Verduleria") && 
                            (!((String)tabla[1][20]).equals("Atendiendo")
                             || ((String)tabla[1][18]).equals("Libre"))){
                        if(((String)tabla[1][18]).equals("Libre")){
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
                            row[17]=(double)0.2/1;
                            row[18]=getCliente1(row);
                            row[19]=getFinAtencionCliente1(row);
                            row[20]=tabla[1][20];
                            row[21]=tabla[1][21];
                            row[22]=(Integer)tabla[1][22]+1;
                            acumuladorClientes ++;
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
                            row[17]=(double)0.2/1;
                            row[18]=tabla[1][18];
                            row[19]=tabla[1][19];
                            row[20]=getCliente2(row);
                            row[21]=getFinAtencionCliente2(row);
                            row[22]=(Integer)tabla[1][22]+1;
                            acumuladorClientes ++;
                            acumuladorEspera+=(double)row[21]-(double)row[1];
                            row[23]=acumuladorEspera;
                            
                            row[6]="Verduleria (F)";
                            //control
                            if (colaFiambreria.isEmpty())
                                System.out.println("");
                                    
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
                        acumuladorClientes ++;
                        row[23] = acumuladorEspera;  
                    }
                }
                else if(((String)row[0]).equals("Fin del dia")){
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
                else if(((String)row[0]).equals("Purga")){
                    row[2] = "-";
                    row[3] = "-";
                    row[4] = tabla[1][4];
                    row[5] = "-";
                    row[6] = "-";
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
                    if (tabla[1][18].equals("Libre")){
                        row[18] = "Purgando";
                        row[19]=tabla[1][19];
                        row[20]=tabla[1][20];
                        row[21]=tabla[1][21];
                        row[22]=(Integer)tabla[1][22];
                        row[23]=acumuladorEspera;
                        tabla[1][27]=(double)tabla[1][27]+10;
                        estabaAtendiendo=false;
                    }
                    else{
                        row[18] = "Purgando";
                        row[19] = "-";
                        row[20] = tabla[1][20];
                        row[21]=tabla[1][21];
                        row[22] = (Integer)tabla[1][22];
                        row[23] = acumuladorEspera+10;
                        tabla[1][27]=(double)tabla[1][27]+10;
                        estabaAtendiendo=true;
                        penalizarPorPurga();
                        row[19]=tabla[1][19];
                    }
                }
                else if(((String)row[0]).equals("Fin de purga")){
                    row[2] = "-";
                    row[3] = "-";
                    row[4] = tabla[1][4];
                    row[5] = "-";
                    row[6] = "-";
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
                    row[19] = "-";
                    row[20] = tabla[1][20];
                    row[21] = "-";
                    row[22] = (Integer)tabla[1][22];
                    row[23] = acumuladorEspera;
                    if (estabaAtendiendo)
                        row[18]="Atendiendo";
                    else
                        if(colaCarniceria.isEmpty())
                            row[18]="Libre";
                        else{
                            temp=getProxCliente((double)-1);
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
                            row[18]="Atendiendo";//getCliente1(row);
                            row[19]=getFinAtencionCliente1(row);
                            row[20]=tabla[1][20];
                            row[21]="-";
                            row[22]=(Integer)tabla[1][22];
                            acumuladorEspera+=(double)row[19]-(double)temp[1];
                            row[23]=acumuladorEspera;
                            colaCarniceria.remove(0);
                            
                        }    
                }
                else
                {
                    row[2]="-";
                    row[3]="-";
                    row[4]=tabla[1][4];
                    row[5]="-";
                    temp=getProxCliente((double)row[1]);
                    if (temp!=null){
                        row[6] = temp[0];
                        if (((String)row[6]).equals("Carniceria")){
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
                        else if(((String)row[6]).equals("Fiambreria")){
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
                            if (((String)row[6]).equals("Verduleria (C)")){
                                row[7]="-";
                                row[8]="-";
                                row[9]="-";
                                row[10]="-";
                                row[11]=getColaCarniceria(null);
                                row[12]="-";
                                row[13]="-";
                                row[14]="-";
                                row[15]="-";
                                row[16]=tabla[1][16];
                                row[17]=(double)0.2/1;
                                row[18]=getCliente1(row);
                                row[19]=getFinAtencionCliente1(row);
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
                                row[16]=getColaFiambreria(null);
                                row[17]=(double)0.2/1;
                                row[18]=tabla[1][18];
                                row[19]="-";
                                row[20]=getCliente2(row);
                                row[21]=getFinAtencionCliente2(row);
                                row[22]=(Integer)tabla[1][22];
                                acumuladorEspera+=(double)row[21]-(double)temp[1];
                                row[23]=acumuladorEspera;
                            }
                        }
                    }
                    else{
                        row[6]="-";
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
                        row[17]="-";
                        if((double)row[1]==(double)tabla[1][19]){
                            row[18]="Libre";
                            row[19]=Double.valueOf("10000");
                            row[20]=tabla[1][20];
                            row[21]="-";
                        }
                        else{
                            row[18]=tabla[1][18];
                            row[19]="-";
                            row[20]="Libre";
                            row[21]=Double.valueOf("10000");
                        }
                        row[22]=(Integer)tabla[1][22];
                        row[23]=acumuladorEspera;
                    }
                }

                tabla[1][0]=row[0];
                tabla[1][1]=row[1];
                tabla[1][4]=row[4];
                tabla[1][11]=row[11];
                tabla[1][16]=row[16];
                tabla[1][18]=row[18];
                if(!(row[19].getClass()==String.class)) 
                    tabla[1][19]=row[19];
                tabla[1][20]=row[20];
                if(!(row[21].getClass()==String.class))
                    tabla[1][21]=row[21];
                tabla[1][22]=row[22];
                tabla[1][23]=row[23];
                //tabla[1][27]=row[27];
                
                
                row[24]=i+1;
                if(i+1>=mostrarDesde && i+1<=mostrarHasta && mostrarDesde!=mostrarHasta){
                    tablaMostrar.add(row);                    
                }
                else
                    tabla[0]=row;
            }
        }
        return tablaMostrar;
    }
    private void penalizarPorPurga(){
        if(!colaCarniceria.isEmpty()){
            tabla[1][19]=(double)tabla[1][19]+10;
            acumuladorEspera+=10;
            estabaAtendiendo=true;
        }
    }
    private String getColaCarniceria(Object[] obj){
        String cadena="";
        Object[] actual;
        boolean primero=true;
        int corrector=0;
        for (int i = 0; i < colaCarniceria.size(); i++) {
            if (primero && obj!=null){
                primero=false;
                corrector=1;
                continue;
            }
            actual=colaCarniceria.get(i);
            if (((String)actual[0]).equals("Carniceria"))
                cadena+="C ";
            else
                cadena+="V ";
        }
        if((colaCarniceria.size()-corrector)==0)
            return "-";
        else
            return "(" + (colaCarniceria.size()-corrector) + ") " + cadena;
    }
    private String getColaFiambreria(Object[] obj){
        String cadena="";
        Object[] actual;
        int corrector=0;
        boolean primero=true;
        for (int i = 0; i < colaFiambreria.size(); i++) {
            if (primero && obj!=null){
                primero=false;
                corrector=1;
                continue;
            }
            actual=colaFiambreria.get(i);
            if (((String)actual[0]).equals("Fiambreria"))
                cadena+="F ";
            else
                cadena+="V ";
        }
        if((colaFiambreria.size()-0)==0)
            return "-";
        else
            return "(" + (colaFiambreria.size()-corrector) + ") " + cadena;
    }
    private double getFinAtencionCliente1 (Object[] row){
        if(row[10].getClass()==String.class)
            return (double)row[1]+(double)row[17];
        else
            return (double)row[1]+(double)row[10];
    }
    private double getFinAtencionCliente2 (Object[] row){
        if(row[15].getClass()==String.class)
            return (double)row[1]+(double)row[17];
        else
            return (double)row[1]+(double)row[15];
    }
    private String getCliente1(Object[] row){
        if(((String)row[0]).equals("Inicio del dia"))
            return "Libre";
        else if(row[10].getClass()==Double.class
                || row[17].getClass()==Double.class)
            return "Atendiendo";
        else
            return "Libre";
    }
    private String getCliente2(Object[] row){
        if(((String)row[0]).equals("Inicio del dia"))
            return "Libre";
        else if(row[15].getClass()==Double.class
                || row[17].getClass()==Double.class)
            return "Atendiendo";
        else
            return "Libre";
    }
    private String getEstado(){
        double proxLlegada=Float.parseFloat(tabla[1][4].toString());
        double finCarniceria=(double)tabla[1][19];
        double finFiambreria=(double)tabla[1][21];
        String returnOriginal="";
        //finHora implica que, sacando finalizaciones no hay mas llegadaCliente
        boolean finHora=(double)tabla[1][4]>horas*60;
        
        if (!finHora){
            if(proxLlegada<finCarniceria && proxLlegada<finFiambreria)
                returnOriginal="Llegada cliente";
            else if(finCarniceria<proxLlegada && finCarniceria<finFiambreria)
                returnOriginal="Fin Atencion C";
            else
                returnOriginal="Fin Atencion F";
        }
        else{
            if (finCarniceria==finFiambreria)
                returnOriginal= "Fin del dia";
            else if(finCarniceria<finFiambreria)
                if(colaCarniceria.isEmpty() && ((String)tabla[1][18]).equals("Libre"))
                    if(((String)tabla[1][20]).equals("Atendiendo"))
                        returnOriginal="Fin Atencion F";
                    else
                        returnOriginal= "Fin del dia";
                else
                    returnOriginal= "Fin Atencion C";
            else
                if(colaFiambreria.isEmpty() && ((String)tabla[1][20]).equals("Libre"))
                    if(((String)tabla[1][18]).equals("Atendiendo"))
                        returnOriginal= "Fin Atencion C";
                    else
                        returnOriginal= "Fin del dia";
                else
                    returnOriginal= "Fin Atencion F";
        }
        switch (returnOriginal){
            case "Llegada cliente":
                if((double)tabla[1][4]>(double)tabla[1][27])
                    returnOriginal="Purga";
                break;
            case "Fin Atencion C":
                if((double)tabla[1][19]>(double)tabla[1][27])
                    returnOriginal="Purga";
                break;
            case "Fin Atencion F":
                if((double)tabla[1][21]>(double)tabla[1][27])
                    returnOriginal="Purga";
                break;
            case "Fin del dia":
                break;
        }
        if (returnOriginal.equals("Purga") && purgando)
            return "Fin de purga";
        return returnOriginal;
    }
    
    private String addCliente(double rnd,double reloj){
        String tipo=getTipoCliente(rnd);
        Object[] row= {tipo,reloj};
        if(tipo.equals("Carniceria"))
            colaCarniceria.add(row);
        else if(tipo.equals("Fiambreria"))
            colaFiambreria.add(row);
        else
            if(((String)tabla[1][18]).equals("Atendiendo")
                    && ((String)tabla[1][20]).equals("Atendiendo")){
                if(colaCarniceria.size()<=colaFiambreria.size())
                    colaCarniceria.add(row);
                else
                    colaFiambreria.add(row);
            }
            else if (((String)tabla[1][18]).equals("Atendiendo")){
                colaFiambreria.add(row);
            }
            else
                colaCarniceria.add(row);
        
        return tipo;
    }
    private String getTipoCliente(double rnd){
        if (rnd<0.30)
            return "Verduleria";
        else if(rnd<0.56)
            return "Carniceria";
        else
            return "Fiambreria";
    }
    
    ////Tengo que ver en la tabla cual de los 3 eventos se produce antes (llagada o fin de atención 1 o 2)
    private double getProximo(Object[] row){
        String estado=(String)row[0];
        if(estado.equals("Inicio del dia"))
            return 0;
        else if(estado.equals("Llegada cliente"))
            return (double)tabla[1][4];
        else if(estado.equals("Fin Atencion C"))
            return (double)tabla[1][19];
        else if(estado.equals("Fin Atencion F"))
            return (double)tabla[1][21];
        else if(estado.equals("Purga")){
            purgando=true;
            return (double)tabla[1][27];
        }
        else if(estado.equals("Fin de purga")){
            purgando=false;
            return (double)tabla[1][27];
        }
        else{
            double proxLlegada =(double)tabla[1][1];
            double finCliente1 = (double)tabla[1][19]==10000 ? 0 : (double)tabla[1][19];
            double finCliente2 = (double)tabla[1][21]==10000 ? 0 : (double)tabla[1][21];

            if (proxLlegada>finCliente1 && proxLlegada>finCliente2)
                return proxLlegada;
            else if (finCliente1>proxLlegada && finCliente1>finCliente2)
                return finCliente1;
            else
                return finCliente2;
        }
    }
    
    private double getTiempoLlegada(float u, float rnd){
       
        return (double)((-1) * u * Math.log(1 - rnd));
    }
    
    private float getDemoraCarniceria(float rnd){
        return 0.5F + rnd * 2;
    }
    
    private float getDemoraFiambreria(float rnd){
        return 1 + rnd * 2;
    }
    
    private double getDemoraTotalCarniceria(float demoraCarniceria, float rnd){
        double retorno = demoraCarniceria;
        if(rnd < 0.50) retorno += 0.2F;
        
        return retorno;
    }
    
            
    private double getDemoraTotalFiambreria(float demoraFiambreria, float rnd){
        double retorno = demoraFiambreria;
        if(rnd < 0.25) retorno += 0.2F;
        
        return retorno;
    }
    
    public Resultados getResultados(){
        Resultados r = new Resultados(acumuladorEspera,acumuladorClientes);
        return r;
    }
    
    private void inicializarTabla(int i){
        boolean mostrar=i+1>=mostrarDesde && i+1<=mostrarHasta && mostrarDesde!=mostrarHasta;
        this.tabla=new Object[2][28];  
        
        this.tabla[1][0] = "Inicio del dia";
        this.tabla[1][1] = Double.valueOf("0");
        this.tabla[1][2] = Math.random();
        this.tabla[1][3] = getTiempoLlegada(0.5F, Float.parseFloat(this.tabla[1][2].toString()));
        this.tabla[1][4] = (double)tabla[1][1] + (double)tabla[1][3];
        this.tabla[1][5] = "-";
        this.tabla[1][6] = "-";
        this.tabla[1][7] = "-";
        this.tabla[1][8] = "-";
        this.tabla[1][9] = "-";
        this.tabla[1][10] = "-";
        this.tabla[1][11] = "-";
        this.tabla[1][12] = "-";
        this.tabla[1][13] = "-";
        this.tabla[1][14] = "-";
        this.tabla[1][15] = "-";
        this.tabla[1][16] = "-";
        this.tabla[1][17] = "-";
        this.tabla[1][18] = "Libre";
        this.tabla[1][19] = Double.valueOf("10000"); // numero arbitrario grande
        this.tabla[1][20] = "Libre";
        this.tabla[1][21] = Double.valueOf("10000");
        this.tabla[1][22] = 0;
        this.tabla[1][23] = acumuladorEspera;
        this.tabla[1][24] = i+1;
        this.tabla[1][25] = Math.random();
        this.tabla[1][26] = simContinua.getTiempoPurga((double)this.tabla[1][25]);
        this.tabla[1][27]= (double)tabla[1][1] + (double)this.tabla[1][26];
        
        if (mostrar)
            tablaMostrar.add(new Object[]{
                this.tabla[1][0],
                this.tabla[1][1],
                this.tabla[1][2],
                this.tabla[1][3],
                this.tabla[1][4],
                this.tabla[1][5],
                this.tabla[1][6],
                this.tabla[1][7],
                this.tabla[1][8],
                this.tabla[1][9],
                this.tabla[1][10],
                this.tabla[1][11],
                this.tabla[1][12],
                this.tabla[1][13],
                this.tabla[1][14],
                this.tabla[1][15],
                this.tabla[1][16],
                this.tabla[1][17],
                this.tabla[1][18],
                this.tabla[1][19],
                this.tabla[1][20],
                this.tabla[1][21],
                this.tabla[1][22],
                this.tabla[1][23],
                this.tabla[1][24],
                this.tabla[1][25],
                this.tabla[1][26],
                this.tabla[1][27]
            });
    }
    private Object[] getProxCliente(double reloj){
        Object[] r=null;
        if(reloj==(double)tabla[1][19] || reloj==-1){
            if(colaCarniceria.size()!=0){
                r=colaCarniceria.get(0);
                if (((String)r[0]).equals("Verduleria")){
                    colaCarniceria.remove(0);
                    return new Object[]{"Verduleria (C)",r[1]};
                }
            }
        }
        else if (reloj==(double)tabla[1][21]){
            if(colaFiambreria.size()!=0){
                r=colaFiambreria.get(0);
                if (((String)r[0]).equals("Verduleria")){
                    colaFiambreria.remove(0);
                    return new Object[]{"Verduleria (F)",r[1]};
                }
            }
        }       
        
        return r;
    }
    
    
    private void gestionarPurga(Object[] row) {
        if(((String)row[0]).equals("Fin de purga")){
            row[25] = Math.random();
            row[26] = simContinua.getTiempoPurga((double)row[25]);
            row[27] = (double)row[1]+(double)row[26];
            tabla[1][27]=row[27];
        }
        else{
            row[25]="-";
            row[26]="-";
            row[27]="-";
        }
    }
    
    
}
