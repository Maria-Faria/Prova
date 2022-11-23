package exercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        String prontuario[] = new String[3]; 
        String nome[] = new String[3];
        double n1[] = new double[3]; 
        double n2[] = new double[3];
                
        for(int i = 0; i < 3; i++) {
            prontuario[i] = JOptionPane.showInputDialog(null, "Digite o prontuário do aluno " + (i + 1));
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do aluno " + (i + 1));

            n1[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1 do aluno " + (i + 1)));
            n2[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2 do aluno " + (i + 1)));
        }

        ArrayList<Aluno> dados = new ArrayList<Aluno>();

        try {
            File f = criarArquivo("alunos.txt");
            gerarDados(dados, prontuario, nome, n1, n2);
            gravarDados(dados, "alunos.txt");
            lerArquivo(f, dados);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File criarArquivo(String nomeArq) throws IOException{
        File f = new File(nomeArq);

        boolean success = f.createNewFile();
        
        if(success) {
            JOptionPane.showMessageDialog(null, "Arquivo " + f + " criado com sucesso!");
        
        }else {
            JOptionPane.showMessageDialog(null, "Arquivo " + f + " já existe!");
        }

        return f;
    }

    public static void gerarDados(ArrayList<Aluno> dados, String prontuario[], String nome[], double n1[], double n2[]) {
        Aluno a1 = new Aluno(prontuario[0], nome[0], n1[0], n2[0]);
        dados.add(a1);

        Aluno a2 = new Aluno(prontuario[1], nome[1], n1[1], n2[1]);
        dados.add(a2);

        Aluno a3 = new Aluno(prontuario[2], nome[2], n1[2], n2[2]);
        dados.add(a3);
    }

    public static void gravarDados(ArrayList<Aluno> dados, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            PrintWriter printwriter = new PrintWriter(writer);

            for(int i = 0; i < dados.size(); i++) {
                printwriter.println(dados.get(i).getProntuario() + ", " + dados.get(i).getNome() + ", " + dados.get(i).getN1() + ", " + dados.get(i).getN2());
            }

            printwriter.close();
        
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo(File nomeArq, ArrayList<Aluno> dados) {
        try{
            FileReader fr = new FileReader(nomeArq);
            BufferedReader in = new BufferedReader(fr);

            String linha = null;
            String info[];
            double media;
            int i = 0;

            ArrayList<String> aprovados = new ArrayList<String>();
            ArrayList<String> exame = new ArrayList<String>();
            ArrayList<String> reprovados = new ArrayList<String>();

            while((linha = in.readLine()) != null) {

                info = linha.split(",");
                
                media = (Double.parseDouble(info[2]) + Double.parseDouble(info[3]))/2;

                if(media > 6) {
                    JOptionPane.showMessageDialog(null, dados.get(i).getNome() + " foi aprovado(a)!");
                    aprovados.add(dados.get(i).getNome());
                
                }else if(media < 4) {
                    JOptionPane.showMessageDialog(null, dados.get(i).getNome() + " foi reprovado(a)...");
                    reprovados.add(dados.get(i).getNome());

                }else{
                    JOptionPane.showMessageDialog(null, dados.get(i).getNome() + " está em exame...");
                    exame.add(dados.get(i).getNome());
                }

                i++;
            }

            in.close();
           
            FileWriter writer = new FileWriter("alunos.txt", true);
            PrintWriter printwriter = new PrintWriter(writer);

            printwriter.println("\nAlunos aprovados:");
            for(int j = 0; j < aprovados.size(); j++) {
                printwriter.println(aprovados.get(j));
            }

            printwriter.println("\nAlunos reprovados:");
            for(int j = 0; j < reprovados.size(); j++) {
                printwriter.println(reprovados.get(j));
            }

            printwriter.println("\nAlunos em exame:");
            for(int j = 0; j < exame.size(); j++) {
                printwriter.println(exame.get(j));
            }

            printwriter.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
