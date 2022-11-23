package exercicio1;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        String forma[] = {"Retângulo", "Círculo", "Triângulo", "Sair"};
        int op;
        double h, base, raio, lado;
        
        do{
            op = JOptionPane.showOptionDialog(null, "Selecione uma forma geométrica", "Calcular perímetro e área", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, forma, 0);

            if(op == 3) {
                break;
            }

            switch(op) {
                case 0:
                    h = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do retângulo: "));
                    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do retângulo: "));

                    Retangulo r1 = new Retangulo(h, base);

                    JOptionPane.showMessageDialog(null, "Perímetro = " + r1.calcularPerimetro() + "\nÁrea = " + r1.calcularArea());

                    break;

                case 1:
                    raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o raio do círculo: "));

                    Circulo c1 = new Circulo(raio);

                    JOptionPane.showMessageDialog(null, "Perímetro = " + c1.calcularPerimetro() + "\nÁrea = " + c1.calcularArea());

                    break;


                case 2:
                    h = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do triângulo: "));
                    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do triângulo: "));
                    lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o lado do triângulo: "));

                    Triangulo t1 = new Triangulo(base, h, lado);

                    JOptionPane.showMessageDialog(null, "Perímetro = " + t1.calcularPerimetro() + "\nÁrea = " + t1.calcularArea());

                    break;
            }
            
        }while(op != 3);
    }
}