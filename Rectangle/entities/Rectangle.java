package Rectangle.entities;

public class Rectangle { // OBJETIVO: CALCULAR A ÁREA, PERIMETRO E DIAGONAL DE UM RETÂNGULO.
    public double width;   // CLASSES USADAS, ALTURA E LARGURA
    public double height;
    public double area () {
        return width * height;
    }
    public double perimeter () {
        return 2 * (width + height);
    }
    public double diagonal () {
        return Math.sqrt(width * width + height * height);
    }
}




