package br.com.cdl.moviehub.modelos;

public class Documentario extends Titulo{

    
    private String nome;
    private String tema;
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // MÉTODO PARA EXIBIR DADOS
    public void exibeFichaTecnica() {
        System.out.println("===== DOCUMENTÁRIO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Tema: " + tema);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }
}