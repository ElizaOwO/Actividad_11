
public class Circle implements Shape{
    //O public?? final int???<-
    private final double PI= 3.1416;
    private double radio;

    public Circle (double radio){
        this.radio= radio;
    }

    @Override
    public double getArea(){
        return PI*radio*radio;
    }

    @Override
    public double getPerimeter(){
        return 2*PI*radio;
    }
}

