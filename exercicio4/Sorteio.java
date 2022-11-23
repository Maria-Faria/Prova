package exercicio4;

public class Sorteio {
    private double num;

    public double sortear() {
        num = Math.random() * 1000;

        return num;
    }

    public void comparar(int palpite) throws Exception{
        if(palpite < num) {
            throw new MenorQueException();
        
        }else if(palpite > num) {
            throw new MaiorQueException();
        }
    }
}
