package exercicio2;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        String temp[] = {"Celsius", "Fahrenheit", "Kelvin", "Sair"};
        int op, op2;
        double celsius, f, kelvin;
        
        Conversor c1 = new Conversor();

        do {
            op = JOptionPane.showOptionDialog(null, "Selecione a temperatura a ser convertida", "Converter temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, temp, 0);

            if(op == 3) {
                break;
            }

            op2 = JOptionPane.showOptionDialog(null, "Selecione a temperatura para a qual deseja converter", "Converter temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, temp, 0);

            if(op2 == 3) {
                break;
            }

            if(op == 0) {
                celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em celsius: "));
                c1.setCelsius(celsius);

                if(op2 == 0) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f°C = %.2f°C", celsius, celsius));
                
                }else if(op2 == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f°C = %.2f°F", celsius, c1.celsiusFahrenheit()));

                }else if(op2 == 2) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f°C = %.2fK", celsius, c1.celsiusKelvin()));

                }

            }else if(op == 1) {
                f = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em Fahrenheit: "));
                c1.setF(f);

                if(op2 == 0) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f°F = %.2f°C", f, c1.fahrenheitCelsius()));

                }else if(op2 == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f°F = %.2f°F", f, f));

                }else if(op2 == 2) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f°F = %.2f K", f, c1.fahrenheitKelvin()));

                }
            }else if(op == 2) {
                kelvin = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em Kelvin: "));
                c1.setKelvin(kelvin);

                if(op2 == 0) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f K = %.2f°C", kelvin, c1.kelvinCelsius()));

                }else if(op2 == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f° K = %.2f°F", kelvin, c1.kelvinFahrenheit()));

                }else if(op2 == 2) {
                    JOptionPane.showMessageDialog(null, String.format("%.2f K = %.2f K", kelvin, kelvin));

                }
            }

        }while(op != 3 && op2 != 3);
    }
}
