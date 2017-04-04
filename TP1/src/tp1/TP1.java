package tp1;
import java.util.Scanner;
public class TP1 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        //el usuario ingresa las constantes del generador
        System.out.print("Ingrese el Número semilla con el que desea comenzar:");
        int seed =  reader.nextInt();
        
        System.out.print("Ingrese el valor K para obtener a:");
        int k =  reader.nextInt();
        while(k < 0){
            System.out.println("Ingrese un número >0)");
            k =  reader.nextInt();
        }
        
        System.out.print("Ingrese el valor C:");
        int c =  reader.nextInt();
        
        System.out.print("Ingrese el Número M con el que desea comenzar:");
        int m =  reader.nextInt();
        while(m < 0 || seed>9999){
            System.out.println("Ingrese un número entre (0,9999)");
            seed =  reader.nextInt();
        }
        //CongruencialMixto m = new CongruencialMixto(1001,1013,10000,0,0,9999);
        CongruencialMixto g = new CongruencialMixto(seed, m, k);
        CongruencialMixto p = new CongruencialMixto(2123, 64, 12345);
        CongruencialMixto n = new CongruencialMixto();
        
        Object[][] array=p.getNumeros(100);
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
