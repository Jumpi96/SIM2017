package tp1;

public class TP1 {

    public static void main(String[] args) {
        //CongruencialMixto m = new CongruencialMixto(1001,1013,10000,0,0,9999);
        
        CongruencialMixto m = new CongruencialMixto(2123, 64, 12345);
        CongruencialMixto n = new CongruencialMixto();
        
        Object[][] array=m.getNumeros(100);
        /*
        for (int i = 0; i < array[0].length; i++) {
            System.out.println(array[0][i]+"/" + array[1][i]);
        }*/
        
        Object[][] arreglo = n.getNumeros(100);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        /*
        for (int i = 0; i < array[0].length; i++) {
            System.out.println(arreglo[0][i]+"/" + arreglo[1][i]);
        }*/
        
        for (int i = 0; i < array[0].length; i++) {
            System.out.println((int)((double)arreglo[1][i]*100));
        }
        
        
    }
}
