package main.service;

import main.entity.Leitor;
import main.entity.Livro;
import main.exceptions.ValidaEmprestimoLivroException;
import main.exceptions.ValidaListaLivrosException;
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

    /**
     *
     * @param livro
     * @return FALSE se a intancia de Livro for Null. TRUE caso o livro seja cadastrado
     * Modificar os testes para retornar exceptions personalizadas
     */
    public boolean cadastrarLivro(Livro livro) {
        System.out.println(livro);
        if(livro == null){
            return false;
        }
        List<Livro> acervo = this.getAcervo();
        acervo.add(livro);
        this.setAcervo(acervo);
        return true;
    }

    @Override
    public Integer cadastrarLivro(List<Livro> livros) throws ValidaListaLivrosException {
        if (livros.isEmpty()){
            throw new ValidaListaLivrosException(ValidaListaLivrosException.MSG_lISTA_INVALIDA);
        }
        List<Livro> acervo = this.getAcervo();
        acervo.addAll(livros);

        this.setAcervo(acervo);
        System.out.println(acervo);
        return acervo.size();
    }

    @Override
    public void emprestarLivro(Livro livro, Leitor leitor) throws ValidaEmprestimoLivroException, NullPointerException {
        if(livro == null || leitor == null)
            throw new NullPointerException("Livro ou Leitor nulos");

        if (livro.getEmprestado())
            throw new ValidaEmprestimoLivroException(ValidaEmprestimoLivroException.MSG_LIVRO_EMPRESTADO);

        List<Livro> lisvrosEmprestados = new ArrayList<Livro>();

        if (leitor.getLivrosEmprestados().isEmpty()){
            lisvrosEmprestados.add(livro);
            leitor.setLivrosEmprestados(lisvrosEmprestados);
        }
        else {
            lisvrosEmprestados.add(livro);
            leitor.setLivrosEmprestados(lisvrosEmprestados);
        }

        livro.setEmprestado(true);
    }

    @Override
    public Livro devolverLivro(Livro livro, Leitor leitor) {
        return null;
    }
}
