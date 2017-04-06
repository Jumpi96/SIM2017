package tp1;

public class CongruencialMixto implements Congruencial{

    private long a, c, m;
    private int seed;
    
    public CongruencialMixto(int seed, int m, int a, int c) {
        this.seed = seed;
        this.m = m;
        this.a = a;
        this.c = c;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
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
    public CongruencialMixto() {
        this.seed = 12345;
        this.m = (long) Math.pow(2, 32);
        this.a = 1 + (416131 * 4);
        this.c = 999983;
        
        /*
        Hull-Dobell Theorem:
        
        m and the offset,c are relatively prime
        a-1 is divisible by all prime factors of m,
        a-1 is divisible by 4 if m is divisible by 4.
        */
    }
    
    //Retorna matriz con numeros en columna 0 y randoms en columna 1
    public Object[][] getNumeros(int cantidad) {
        Object[][] numeros = new Object[2][cantidad];

        double xi = this.seed;

        for (int i = 0; i < cantidad; i++) {
            xi = (a * xi + c) % m;
            numeros[0][i] = (long) xi;
            numeros[1][i] = xi / (m - 1);
        }
        return numeros;
    }
}


