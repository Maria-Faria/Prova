package exercicio1;

public class Triangulo extends Forma{
    protected double base;
    protected double h;
    protected double lado;

    public Triangulo(double base, double h, double lado) {
        this.base = base;
        this.h = h;
        this.lado = lado;
    }

    @Override
    double calcularPerimetro() {
        return this.base + this.h + this.lado;
    }

    @Override
    double calcularArea() {
        return (this.base * this.h)/2;
    }
    
}
