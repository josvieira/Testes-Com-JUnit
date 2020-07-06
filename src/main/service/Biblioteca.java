package main.service;

import main.entity.Leitor;
import main.entity.Livro;
import main.serviceInterface.BibliotecaInterace;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements BibliotecaInterace {
    private List<Livro> acervo;

    public Biblioteca(List<Livro> lista ){
        this.acervo = lista;
    }

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public List<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<Livro> acervo) {
        this.acervo = acervo;
    }

    public boolean cadastrarLivro(Livro livro) throws Ex {
        if(livro == null){

        }

    }

    @Override
    public List<Livro> cadastrarLivro(List<Livro> livros) {
        return null;
    }

    @Override
    public boolean emprestarLivro(Livro livro, Leitor leitor) {
        return false;
    }

    @Override
    public Livro devolverLivro(Livro livro, Leitor leitor) {
        return null;
    }
}
