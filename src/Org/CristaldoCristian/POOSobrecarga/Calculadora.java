package Org.CristaldoCristian.POOSobrecarga;

public class Calculadora {

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
    public int sumar(int a, int b){
        return a + b;
    }
    public float sumar(float a, float b){
        return a + b;
    }
    public float sumar(int a, float b){
        return a + b;
    }
    public float sumar(float a, int b){
        return a + b;
    }
    public double sumar(double a, double b){
        return a + b;
    }
    public int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
    /*------------2 PARÁMETROS------------*/

    /*------------3 PARÁMETROS------------*/
    public int sumar (int a, int b, int c){
        return a + b + c;
    }
    /*------------3 PARÁMETROS------------*/



//====================SOBRECARGA-SUMA====================//
}
