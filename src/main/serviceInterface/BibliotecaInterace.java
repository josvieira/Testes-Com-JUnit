package main.serviceInterface;

import main.entity.Leitor;
import main.entity.Livro;
import main.exceptions.ValidaEmprestimoLivroException;
import main.exceptions.ValidaListaLivrosException;

import java.util.List;

public interface BibliotecaInterace {
    public boolean cadastrarLivro(Livro livro);

    public Integer cadastrarLivro(List<Livro> livros) throws ValidaListaLivrosException;

    public void emprestarLivro(Livro livro, Leitor leitor) throws ValidaEmprestimoLivroException;

    public Livro devolverLivro(Livro livro, Leitor leitor);
}
