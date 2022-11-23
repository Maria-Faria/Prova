package exercicio4;

import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
       int palpite = 0, num;
       int tentativa = 0;

       Sorteio s1 = new Sorteio();
       num = (int) s1.sortear();

       do {
            tentativa++;

            try{

                palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um palpite para o número sorteado: "));

                if(palpite == num) {
                    JOptionPane.showMessageDialog(null, "Parabéns, você acertou em " + tentativa + " tentativas!");
                    break;
                }

                s1.comparar(palpite);

            }catch(Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
            } 
            
       }while(palpite != num);
    }
}
