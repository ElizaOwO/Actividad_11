public class Square implements Shape{
    private double lado;

    public Square (double lado){
        this.lado= lado;
    }

    @Override
    public double getArea(){
        return lado*lado;
    }

    @Override
    public double getPerimeter(){
        return lado*4;
    }
}

