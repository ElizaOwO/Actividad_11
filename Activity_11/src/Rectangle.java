public class Rectangle implements Shape{
    private double base, altura;

    public Rectangle (double base, double altura){
        this.base= base;
        this.altura= altura;
    }

    @Override
    public double getArea(){
        return base*altura;
    }

    @Override
    public double getPerimeter(){
        return 2*(base+altura);
    }
}
