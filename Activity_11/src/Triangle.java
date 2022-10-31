public class Triangle implements Shape{
    private double ladoA, ladoB, ladoC, base, altura;

    public Triangle (double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangle (double base, double altura){
        this.base= base;
        this.altura= altura;
    }

    @Override
    public double getArea(){
        return (base*altura)/2;
    }

    @Override
    public double getPerimeter(){
        return ladoA+ladoB+ladoC;
    }
}
