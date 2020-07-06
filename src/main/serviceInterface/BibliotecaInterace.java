package main.serviceInterface;

import main.entity.Leitor;
import main.entity.Livro;

import java.util.List;

public interface BibliotecaInterace {
    public boolean cadastrarLivro(Livro livro);

    public List<Livro> cadastrarLivro(List<Livro> livros);

    public boolean emprestarLivro(Livro livro, Leitor leitor);

    public Livro devolverLivro(Livro livro, Leitor leitor);
}
