package exercicio4;

public class MenorQueException extends Exception{
    
    public String getMessage() {
        return "Número informado menor do que o número sorteado!";
    }
}
