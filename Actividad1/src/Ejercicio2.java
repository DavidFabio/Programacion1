import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduce tres longitudes: ");
        Scanner longitud = new Scanner(System.in);
        int l1 = longitud.nextInt();
        int l2 = longitud.nextInt();
        int l3 = longitud.nextInt();
        if (l1>=l2 & l2>=l3){
            if(l1<(l2+l3)){
                System.out.println("Las tres longitudes forman un triángulo");
                if (l1==l2 & l2==l3){
                    System.out.println("Es un triángulo equilátero");
                }
                else if (l1!=l2 & l2!=l3){
                    System.out.println("Es un triángulo escaleno");
                }
                else{
                    System.out.println("Es un triángulo isósceles");
                }
            }
            else{
                System.out.println("Las tres longitudes no forman un triángulo");
            }
        }
        else if (l2>=l1 & l1>=l3){
            if(l2<(l1+l3)){
                System.out.println("Las tres longitudes forman un triángulo");
                if (l1==l2 & l2==l3){
                    System.out.println("Es un triángulo equilátero");
                }
                else if (l1!=l2 & l2!=l3){
                    System.out.println("Es un triángulo escaleno");
                }
                else{
                    System.out.println("Es un triángulo isósceles");
                }
            }
            else{
                System.out.println("Las tres longitudes no forman un triángulo");
            }
        }
        else if (l3>=l2 & l2>=l1){
            if(l3<(l1+l2)){
                System.out.println("Las tres longitudes forman un triángulo");
                if (l1==l2 & l2==l3){
                    System.out.println("Es un triángulo equilátero");
                }
                else if (l1!=l2 & l2!=l3){
                    System.out.println("Es un triángulo escaleno");
                }
                else{
                    System.out.println("Es un triángulo isósceles");
                }
            }
            
            else{
                System.out.println("Las tres longitudes no forman un triángulo");
            }
        }
        longitud.close();
    }
}
