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
    
    public Object[] getNumerosNomales(int cantidad, float media, float varianza) {
        Object[] numeros;
        if (cantidad % 2 == 0){
            numeros = new Object[cantidad];
        }
        else {
            numeros = new Object[cantidad+1];
        }
        
        double xi = this.seed;
        double rnd1;
        double rnd2;
        
        //podria haberle metido un poquito mas de ganas pero ya fue
        for (int i = 0; i < cantidad; i = i+2) {
            xi = (a * xi + c) % m;
            rnd1 = xi / (m - 1);
            
            xi = (a * xi + c) % m;
            rnd2 = xi / (m - 1);
            
            numeros[i] = Math.sqrt((-2)*Math.log(rnd1)) * Math.cos(2*Math.PI*rnd2)*varianza + media;
            numeros[i+1] = Math.sqrt((-2)*Math.log(rnd1)) * Math.sin(2*Math.PI*rnd2)*varianza + media;
        }
        
        return numeros;
    }      
}


