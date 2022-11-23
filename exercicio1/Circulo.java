package exercicio1;

public class Circulo extends Forma{
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }

    @Override
    double calcularArea() {
        return 3.14 * (this.raio * this.raio);
    }
}
