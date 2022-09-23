import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Inventario {

    public static void main(String[] args) {
        File arch= new File("");
        //codigo de practica
        // Scanner para leer un flujo
        try { //try en ingles es probar
            Scanner s=new Scanner(arch);
        } catch (FileNotFoundException e) { //catch en ingles es capturar
            throw new RuntimeException(e);
        }
        System.out.println("introduce la palabra a evaluar");
        Scanner s=new Scanner(System.in);

        

    }


}
