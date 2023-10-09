package Org.CristaldoCristian.POOSobrecarga;

public class Calculadora {

/*Forzando a que no se instancie la clase Calculadora - Constructor private*/

    private Calculadora() {
    }

    /*
 __________________________________________________________
|                                                          |
La "sobrecarga" en Java se refiere a la capacidad de       |
| una clase de tener múltiples métodos con el mismo nombre,|
| pero con diferentes parámetros, lo que permite llamar    |
| al método adecuado según los argumentos pasados durante  |
| la llamada.                                              |
|__________________________________________________________|
*/

//====================SOBRECARGA-SUMA====================//

    /*------------2 PARÁMETROS------------*/
    public static int sumar(int a, int b){
        return a + b;
    }
    public static float sumar(float a, float b){
        return a + b;
    }
    public static float sumar(int a, float b){
        return a + b;
    }
    public static float sumar(float a, int b){
        return a + b;
    }
    public static double sumar(double a, double b){
        return a + b;
    }
    public static int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
    public static long sumar(long a, long b){
        return a + b;
    }
    /*------------2 PARÁMETROS------------*/

    /*------------3 PARÁMETROS------------*/
    public static int sumar (int a, int b, int c){
        return a + b + c;
    }
    /*------------3 PARÁMETROS------------*/

    /*------------N PARÁMETROS------------*/
    public static int sumar(int... n){
        int total = 0;
        for (int i: n) {
            total += i;
        }
        return total;
    }
    public static float sumar(float... n){
        float total = 0;
        for (float i: n) {
            total += i;
        }
        return total;
    }
    public static float sumar(float a, int...n){
        float total = 0;
        for (int i: n) {
            total += i;
        }
        return total;
    }
    public static double sumar(double...n){
        double total = 0D;
        for (double i: n) {
            total += i;
        }
        return total;
    }
    /*------------N PARÁMETROS------------*/

//====================SOBRECARGA-SUMA====================//
}
