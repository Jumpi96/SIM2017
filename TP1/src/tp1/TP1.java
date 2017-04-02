package tp1;

public class TP1 {

    public static void main(String[] args) {
        //CongruencialMixto m = new CongruencialMixto(1001,1013,10000,0,0,9999);
        
        CongruencialMixto m = new CongruencialMixto(2123, 64, 12345);
        CongruencialMixto n = new CongruencialMixto();
        
        Object[][] array=m.getNumeros(100);
        /*
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0]+"/" + (double)array[i][1] * 100);
        }*/
        
        Object[][] arreglo = n.getNumeros(100);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((int)((double)arreglo[i][1] * 100));
        }
    }
}
