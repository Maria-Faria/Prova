package exercicio3;

import java.io.Serializable;

public class Aluno implements Serializable{
    private String prontuario, nome;
    private double n1, n2;

    public Aluno(String prontuario, String nome, double n1, double n2) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.n1 = n1;
        this.n2  = n2;
    }

    public String getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }
    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}
