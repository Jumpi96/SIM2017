package tp3;

public class CongruencialMixto{

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
    public Object[][] getNumerosUniformes(int cantidad) {
        Object[][] numeros = new Object[2][cantidad];

        double xi = this.seed;

        for (int i = 0; i < cantidad; i++) {
            xi = (a * xi + c) % m;
            numeros[0][i] = (long) xi;
            numeros[1][i] = xi / (m - 1);
        }
        return numeros;
    }
    
    public Object[] getNumerosUniformes(int cantidad, int desde, int hasta) {
        Object[] numeros = new Object[cantidad];
        
        double xi = this.seed;
        double rnd;
        
        for (int i = 0; i < cantidad; i++) {
            xi = (a * xi + c) % m;
            rnd = xi / (m - 1);
            
            numeros[i] = desde + rnd * (hasta - desde);
        }
        
        return numeros;
    }
    
    public Object[] getNumerosExponenciales(int cantidad, float lambda) {
        Object[] numeros = new Object[cantidad];
        
        double xi = this.seed;
        double rnd;
        
        double u = (1)/lambda;
        
        for (int i = 0; i < cantidad; i++) {
            xi = (a * xi + c) % m;
            rnd = xi / (m - 1);
            
            numeros[i] = (-1) * u * Math.log(1-rnd);
        }
        
        return numeros;
    }
    
    
        
}


