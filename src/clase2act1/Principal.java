
package clase2act1;

import java.util.Scanner;


public class Principal {
    private int num1;
    private int num2;

    public Principal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
       
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = scanner.nextInt();
        System.out.println("Los números ingresados son: " + num1 + " y " + num2);
        System.out.println("Seleccione la operación que desea realizar entre los números ingresados: 1-Suma, 2-Resta, 3-Producto, 4-Cociente");
        int operacion = scanner.nextInt();       
        scanner.close();     
        
        switch (operacion) {
            case 1:
                System.out.println("La suma de los números es" + sumar(num1,num2));
                break;
            case 2:
                System.out.println("La diferencia entre los números es" + restar(num1,num2));
                break;
            case 3:
                multiplicar(num1, num2);
                break;
            case 4:
                dividir(num1, num2);
                break;    
            default:
                System.out.println("Error! " + operacion + " no es una opción valida");
        }
       
    }
    
    public static int sumar(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;  
    }
    
    public static int restar(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;  
    }
    
    public static int multiplicar(int num1, int num2){
        int resultado = num1 * num2;
         if ((num1 == 0)||(num2 == 0)) {
            resultado = num1 * num2;
            System.out.println(" Ingrese un número distinto de cero para que el producto de los números sea distinto a: " );                        
        } 
        else {
        System.out.println("El producto de los números ingresados es: " + resultado);
        }
        return resultado;        
    }
    
    public static double dividir(double num1, int num2){
        double resultado = num1 / num2;
        if (num2 == 0) {
            System.out.println("Error! Ud ingresó como divisor el nro " + num2 + " y no es posible dividir por cero");
        } else {
            System.out.println("El cociente entre los números ingresados es: " + resultado);
            // System.out.printf("%nEl cociente de los números ingresados es: %.2f" + resultado);
            return resultado;
        }
        return 0;
               
    }
    
    
}
