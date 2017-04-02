package tp1;

public class TP1 {

    public static void main(String[] args) {
        CongruencialMixto m = new CongruencialMixto(1001,1013,10000,0,0,9999);
        Object[][] array=m.getNumeros(20);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0]+"/"+array[i][1]);
        }
    }
    
}
