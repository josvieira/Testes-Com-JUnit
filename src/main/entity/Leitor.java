package main.entity;

import java.util.ArrayList;
import java.util.List;

public class Leitor {
    private Integer id;
    private String nome;
    private String email;
    private List<Livro> livrosEmprestados;
    private List<Leitura> historicoDeLeituras;

    public Leitor(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.historicoDeLeituras = new ArrayList<Leitura>();
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    @Override
    public String toString() {
        return "Leitor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public List<Leitura> getHistoricoDeLeituras() {
        return historicoDeLeituras;
    }

    public void setHistoricoDeLeituras(List<Leitura> historicoDeLeituras) {
        this.historicoDeLeituras = historicoDeLeituras;
    }
}
