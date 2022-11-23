package exercicio2;

public class Conversor {
    private double celsius, f, kelvin;
    
    public double celsiusFahrenheit() {
        return (this.celsius/5) * 9 + 32;
    }

    public double celsiusKelvin() {
        return 5 * (this.celsius/5) + 273;
    }

    public double fahrenheitCelsius() {
        return 5/9f * (this.f - 32);
    }

    public double fahrenheitKelvin() {
        return 5 * ((this.f - 32)/9) + 273;
    }

    public double kelvinCelsius() {
        return ((this.kelvin - 273)/5) * 5;
    }

    public double kelvinFahrenheit() {
        return 9 * ((this.kelvin - 273)/5) + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setF(double f) {
        this.f = f;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getF() {
        return f;
    }

    public double getKelvin() {
        return kelvin;
    }
}
