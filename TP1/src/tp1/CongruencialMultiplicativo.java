package tp1;

public class CongruencialMultiplicativo implements Congruencial{
    private long a, m;
    private int seed;
    
    public CongruencialMultiplicativo(int seed, int m, int a, int c) {
        this.seed = seed;
        this.m = m;
        this.a = a;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public void setC(long c) {
        
    }

    public long getM() {
        return m;
    }

    public void setM(long m) {
        this.m = m;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }
    
    
    
    
        
    //Configuracion Optima
    public CongruencialMultiplicativo() {
        this.seed = 127;
        this.m = (long) Math.pow(2, 32);
        this.a = 1 + (416131 * 8);
    }
    
    //Retorna matriz con numeros en columna 0 y randoms en columna 1
    public Object[][] getNumeros(int cantidad) {
        Object[][] numeros = new Object[2][cantidad];

        double xi = this.seed;

        for (int i = 0; i < cantidad; i++) {
            xi = (a * xi) % m;
            numeros[0][i] = (long) xi;
            numeros[1][i] = xi / (m - 1);
        }
        return numeros;
    }
}
    

