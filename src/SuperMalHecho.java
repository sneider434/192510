import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escriba el nombre del producto 1:");
        String a = s.nextLine();
        System.out.println("Ingrese el precio:");
        double p1 = s.nextDouble();
        s.nextLine();

        System.out.println("Escriba el nombre del producto 2:");
        String b = s.nextLine();
        System.out.println("Ingrese el precio:");
        float p2 = s.nextFloat();
        s.nextLine();

        System.out.println("Escriba el nombre del producto 3:");
        String c = s.nextLine();
        System.out.println("Ingrese el precio:");
        int p3 = s.nextInt();
        s.nextLine();

        System.out.println("Escriba el nombre del producto 4:");
        String d = s.nextLine();
        System.out.println("Ingrese el precio:");
        long p4 = s.nextLong();
        s.nextLine();

        System.out.println("Escriba el nombre del producto 5:");
        String e = s.nextLine();
        System.out.println("Ingrese el precio:");
        short p5 = s.nextShort();
        s.nextLine();

        double imp1 = (p1 * 0.19);
        double desc1 = (p1 > 10000) ? (p1 * 0.10) : 0;
        double total1 = p1 + imp1 - desc1;

        double imp2 = (p2 * 0.19);
        double desc2 = (p2 > 10000) ? (p2 * 0.10) : 0;
        double total2 = p2 + imp2 - desc2;

        double imp3 = (p3 * 0.19);
        double desc3 = (p3 > 10000) ? (p3 * 0.10) : 0;
        double total3 = p3 + imp3 - desc3;

        double imp4 = (p4 * 0.19);
        double desc4 = (p4 > 10000) ? (p4 * 0.10) : 0;
        double total4 = p4 + imp4 - desc4;

        double imp5 = (p5 * 0.19);
        double desc5 = (p5 > 10000) ? (p5 * 0.10) : 0;
        double total5 = p5 + imp5 - desc5;

        System.out.println("Producto: " + a + ", Precio final: " + total1);
        System.out.println("Producto: " + b + ", Precio final: " + total2);
        System.out.println("Producto: " + c + ", Precio final: " + total3);
        System.out.println("Producto: " + d + ", Precio final: " + total4);
        System.out.println("Producto: " + e + ", Precio final: " + total5);

        double suma = total1 + total2 + total3 + total4 + total5;
        System.out.println("El total de la compra es: " + suma);
    }
}

