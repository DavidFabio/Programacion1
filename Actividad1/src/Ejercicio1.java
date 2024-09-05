import java.util.*;

public class Ejercicio1{
    public static void main(String[] args) {
        System.out.println("Introduce dos números: ");
        Scanner numero = new Scanner(System.in);
        int n1 = numero.nextInt();
        int n2 = numero.nextInt();
        System.out.println("Suma: " + (n1+n2));
        System.out.println("Producto: " + (n1*n2));
        if(n1>n2){
            System.out.println(n1 + " es mayor que " + n2);
            System.out.println(n1 + " no es igual a " + n2);

        }
        else if (n2>n1){
            System.out.println(n1 + " es menor que " + n2);
            System.out.println(n1 + " no es igual a " + n2);

        }
        else{
            System.out.println(n1 + " es igual a " + n2);
        }
        if(n1%2==0){
            System.out.println(n1 + " es par");
        }
        else{
            System.out.println(n1 + " es impar");
        }
        if(n2%2==0){
            System.out.println(n2 + " es par");
        }
        else{
            System.out.println(n2 + " es impar");
        }
        if(n1%n2==0){
            System.out.println(n1 + " es divisible entre " + n2);
        }
        else{
            System.out.println(n1 + " no es divisble entre " + n2);
        }
        if (n2%n1==0){
            System.out.println(n2 + " es divisible entre " + n1);
        }
        else{
            System.out.println(n2 + " no es divisible entre " + n1);
        }
        if (1>=n1 & n1<=10){
            System.out.println(n1 + " esta comprendido entre 1 y 10");
        }
        else{
            System.out.println(n1 + " no esta comprendido entre 1 y 10");
        }
        System.out.println("El resultado de incrementar " + n1 + " con " + n2 + " es " + (n1+n2));

        numero.close();
    }
}