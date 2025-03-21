import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        Double precio;
        for (int x = 1; x < 6; x++) {
            System.out.println("ingrese nombre del producto : " + x);
            a = scanner.nextLine();
            System.out.println("Ingrese el precio del precio :" + x);
            precio = scanner.nextDouble();
            System.out.println(a + " " + precio);
            scanner.nextLine();
            scanner.nextDouble();
            // double imp1 = precio * 0.19;
            // double total = 0;
            // if (precio > 10000) {
            // double desc1 = precio * 0.10;
            // total = (precio + imp1) - desc1;
            // } else {
            // total = precio + imp1;
            // }
            // System.out.println("Producto: " + a + ", Precio final: " + total);
            // precio = 0;
        }
        // int j =0;
        // do {
        //     j=j+1;
            
        // } while (j < 6);
        scanner.close();
    }
}
