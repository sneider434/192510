import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double acumulasueldos=0;
        System.out.println("ingrese primer rango(numero mas pequeño) y segundo rango(numero mas grande) para el corte");
            int corte1 = scanner.nextInt();
            int corte2 = scanner.nextInt();
        for (int x = 1;x<11;x++){
            System.out.println("ingrese sueldo :  "+ x);
            int sueldo = scanner.nextInt();
            if (sueldo<0){
                System.out.println("error ------------ debe ser un sueldo positivo");
                x=x-1;
            }
            if (sueldo>= corte1 & sueldo<= corte2){
                acumulasueldos=acumulasueldos+1;
            }
        }
        scanner.close();
        System.out.println("el numero de sueldos dentro de ese rango es de :" + acumulasueldos );
    }
}
