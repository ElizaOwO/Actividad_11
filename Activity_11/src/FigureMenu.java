import java.util.Scanner;

public class FigureMenu {

    //Declarar de variables
    static final String CIRCLE = "Circulo ",
                        TRIANGLE = "Triangulo ",
                        SQUARE = "Cuadrado ",
                        RECTANGLE = "Rectangulo",
                        AREA = "Area",
                        PERIMETER = "Perimetro";
    static int response;
    static boolean b =true;
    static double x,y,z;
    static Scanner sc= new Scanner(System.in);

    public static void main(String [] args){

        output("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        output("       CÁLCULO DE ÁREA Y PERÍMETRO DE FIGURAS      ");
        output("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Ciclo para desplegar menú
        while(b){

            //Menú
            output("Elige una opción");
            output("1.- \uD83D\uDFE3 Círculo");
            output("2.- \uD83D\uDD3A Triángulo");
            output("3.- \uD83D\uDFE9 Cuadrado");
            output("4.- ▀▀ Rectángulo");
            output("5.- Salir");

            response= sc.nextInt();

            //Llamar métodos para calcular área o perímetro
            switch(response){
                case 1: calculate(areaOrPerimeter(CIRCLE), CIRCLE); break;
                case 2: calculate(areaOrPerimeter(TRIANGLE), TRIANGLE); break;
                case 3: calculate(areaOrPerimeter(SQUARE), SQUARE); break;
                case 4: calculate(areaOrPerimeter(RECTANGLE), RECTANGLE); break;
                case 5: System.exit(0); break;
                default: output("Ingresa opción válida"); break;
            }
        }
    }


    /*Método que devuelve int de la respuesta,
    siendo 1= área y 2= perímetro*/
    private static int areaOrPerimeter(String figure) {
        output(figure);
        output("1.- " + AREA);
        output("2.- " + PERIMETER);

        return response= sc.nextInt();
    }

    /*Método que calcula el área y perímetro,
    generando objectos de las figuras
    pasandole argumentos de los inputs
    e imprimir el resultado en pantalla*/
    private static void calculate(int response, String figure){

        //Calcular área
        if(response == 1){
            switch(figure){
                case CIRCLE:
                    output("Ingresa el radio: ");
                    Circle c= new Circle(sc.nextDouble());
                    output(AREA + "= " + c.getArea()); break;

                case TRIANGLE:
                    output("Ingresa la base");
                    x= sc.nextDouble();
                    output("Ingresa la altura");
                    y= sc.nextDouble();
                    Triangle t= new Triangle(x,y);
                    output(AREA + "= " + t.getArea());break;

                case SQUARE:
                    output("Ingresa el lado");
                    Square s = new Square(sc.nextDouble());
                    output(AREA + "= " + s.getArea()); break;

                case RECTANGLE:
                    output("Ingresa la base");
                    x= sc.nextDouble();
                    output("Ingresa la altura");
                    y= sc.nextDouble();
                    Rectangle r = new Rectangle(x,y);
                    output(AREA + "= " + r.getArea()); break;
            }
            //Calcular perímetro
        }else{
            switch(figure) {
                case CIRCLE:
                    output("Ingresa el radio: ");
                    Circle c = new Circle(sc.nextDouble());
                    output(PERIMETER + "= " + c.getPerimeter());
                    break;

                case TRIANGLE:
                    output("Ingresa el lado 1: ");
                    x= sc.nextDouble();
                    output("Ingresa el lado 2: ");
                    y= sc.nextDouble();
                    output("Ingresa el lado 3: ");
                    z= sc.nextDouble();
                    Triangle t = new Triangle(x, y,z);
                    output(PERIMETER + "= " + t.getPerimeter());
                    break;

                case SQUARE:
                    output("Ingresa el lado");
                    Square s = new Square(sc.nextDouble());
                    output(PERIMETER + "= " + s.getPerimeter());
                    break;

                case RECTANGLE:
                    output("Ingresa la base");
                    x = sc.nextDouble();
                    output("Ingresa la altura");
                    y = sc.nextDouble();
                    Rectangle r = new Rectangle(x, y);
                    output(PERIMETER + "= " + r.getPerimeter());
                    break;
            }
        }
    }

    /*Método que imprime el
    parámetro de tipo String*/
    private static void output(String st){
        System.out.println(st);
    }
}
