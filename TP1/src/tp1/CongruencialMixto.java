package tp1;

public class CongruencialMixto {

    private long a, c, m;
    //private int k, g;
    private int seed;

    //Configuracion por usuario
    /*public CongruencialMixto(int a, int c, int m, int k, int g, int seed) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.k = k;
        this.g = g;
        this.seed = seed;
    }*/

    //Configuracion por usuario optima
    public CongruencialMixto(int seed, int g, int k) {
        this.seed = seed;
        this.m = (long) Math.pow(2, g);
        this.a = 1 + (4 * k);
        this.c = 999983; //Numero primo para asegurar que sea relativamente primo a m
        
        /*
        Hull-Dobell Theorem:
        
        m and the offset,c are relatively prime
        a-1 is divisible by all prime factors of m,
        a-1 is divisible by 4 if m is divisible by 4.
        */
    }
    
    //Configuracion Optima
    public CongruencialMixto() {
        this.seed = 12345;
        this.m = (long) Math.pow(2, 32);
        this.a = 1 + (416131 * 4);
        this.c = 999983;
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


