package Rectangle.application;

import Rectangle.entities.Rectangle;

import java.util.Locale; // PARA FORMATAR OS VALORES
import java.util.Scanner; // IMPORT SCANNER PARA PEDIR LARGURA E ALTURA AO USUARIO

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x = new Rectangle();

        System.out.println("Enter  rectangle width and heigth: ");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        System.out.printf("ÁREA: = %.2f\n", x.area());
        System.out.printf("PERIMETER = %.2f\n", x.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", x.diagonal());





    }
}
