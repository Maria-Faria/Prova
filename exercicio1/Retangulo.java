package exercicio1;

public class Retangulo extends Forma{
    protected double h;
    protected double base;
    
    public Retangulo(double h, double base) {
        this.h = h;
        this.base = base;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (this.h + this.base);
    }

    @Override
    double calcularArea() {
        return this.base * this.h;
    }
}
