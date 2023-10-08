package Org.CristaldoCristian.POOSobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("SUMAR parámetros int = " + calculadora.sumar(10,20));
        System.out.println("SUMAR parámetros float = " + calculadora.sumar(10F,20F));
        System.out.println("SUMAR parámetros float + int = " + calculadora.sumar(10F,5));
        System.out.println("SUMAR parámetros int + float = " + calculadora.sumar(10,5.6F));
        System.out.println("SUMAR parámetros double = " + calculadora.sumar(10D,5D));
        System.out.println("SUMAR parámetros String = " + calculadora.sumar("10","5"));
        System.out.println("SUMAR parámetros int + int + int = " + calculadora.sumar(10,15,20));

        System.out.println("SUMAR parámetros long = " + calculadora.sumar(10L,20L));
        /*NO EXISTE el método sumar long, pero busca el que contenga los parámetros más cercanos a un long
         y los suma, en este caso float + float.

        int: 32 bits, puede representar números enteros en el rango de -2,147,483,648 a 2,147,483,647.

        double: 64 bits, puede representar números de punto flotante de precisión doble,
        lo que le permite representar una amplia gama de valores con decimales.

        float: 32 bits, puede representar números de punto flotante de precisión simple.
        Puede representar una amplia gama de valores con decimales, pero con menor precisión que double.

        long: 64 bits, puede representar números enteros en un rango mucho más amplio que int, que va desde
        -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
        */

    }
}
