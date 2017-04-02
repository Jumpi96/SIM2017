package tp1;

public class CongruencialMixto {

    private int a, c, m;
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
    public CongruencialMixto(int seed, int g, int a) {
        this.seed = seed;
        this.m = (int) Math.pow(2, g);
        this.a = a;
        this.c = (8 * this.a) + 3;
        
    }
    
    //Configuracion Optima
    public CongruencialMixto() {
        this.seed = 17;
        this.a = 127;
        this.c = (8 * this.a) + 3;
        this.m = (int) Math.pow(2, 15);
    }

    /*
     · a debe ser un número impar, no divisible ni por 3 ni por 5.
     · m debe ser el número entero más grande que la computadora acepte.
     De acuerdo con Hull y Dobell, los mejores resultados para un generador
     congruencial mixto en una computadora binaria son:
     · c = 8*a±3
     · a = cualquier entero
     · X0 = Cualquier entero impar.
     · M = 2^b donde b >2 y que m sea aceptado por la computadora.
     */
    
    
    //Retorna matriz con numeros en columna 0 y randoms en columna 1
    public Object[][] getNumeros(int cantidad) {
        Object[][] numeros = new Object[cantidad][2];

        double xi = this.seed;

        for (int i = 0; i < cantidad; i++) {
            xi = (a * xi + c) % m;
            numeros[i][0] = (int) xi;
            numeros[i][1] = xi / (m - 1);
        }
        return numeros;
    }
}
