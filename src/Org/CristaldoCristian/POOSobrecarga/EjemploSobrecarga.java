package Org.CristaldoCristian.POOSobrecarga;
import static Org.CristaldoCristian.POOSobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("SUMAR parámetros int = " + sumar(10,20));
        System.out.println("SUMAR parámetros float = " + sumar(10F,20F));
        System.out.println("SUMAR parámetros float + int = " + sumar(10F,5));
        System.out.println("SUMAR parámetros int + float = " + sumar(10,5.6F));
        System.out.println("SUMAR parámetros double = " + sumar(10D,5D));
        System.out.println("SUMAR parámetros String = " + sumar("10","5"));
        System.out.println("SUMAR parámetros int + int + int = " + sumar(10,15,20));
        System.out.println("SUMAR parámetros long = " + sumar(10L,20L));

        System.out.println("\nEl valor del carácter \"@\" en la tabla Unicode expresado como un número entero es 64.");
        System.out.println("SUMAR parámetros int + char (@) = " + sumar(10,'@'));
        System.out.println("SUMAR parámetros float + char (@) = " + sumar(10F,'@'));

        System.out.println("\nSUMAR n cantidad de parámetros int = " + sumar(1,2,3,4,5));
        System.out.println("SUMAR n cantidad de parámetros float = " + sumar(1F,2F,3F,4F,5F));
        System.out.println("SUMAR parámetro float + n cantidad de int = " + sumar(10F,2,3,5,4));
        System.out.println("SUMAR n cantidad de parámetros double = " + sumar(1D,2D,3D,4.5D));

    }
}
