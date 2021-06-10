import java.util.*;

public class Practica8 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    String salida="t";
    int i=0;
    while (!"S".equals(salida)){
         i=i+1;
        int multi=i*5;
        System.out.println(multi);
        System.out.println("Si desea salir introduzca S");
        salida=scanner.nextLine();
    }
}
}