package test;

import main.entity.Livro;
import main.service.Biblioteca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaTest {

    Biblioteca biblioteca;
    List<Livro> acervo = new ArrayList<Livro>();

    @Before
    public void setUp(){
        Livro livro1 = new Livro(1, "Hibisco Roxo", "Chimamanda Ngozi", 250, "Nigéria");
        Livro livro2 = new Livro(2, "Angola Janga", "Marcelo D'Salete", 350, "Brasil");
        Livro livro3 = new Livro(3, "O Sol é para todos", "Harper Lee", 280, "USA");
        Livro livro4 = new Livro(4, "Frankenstein", "Marry Shaley", 400, "Inglaterra");
        Livro livro5 = new Livro(5, "Guerra e Paz", "Tolstoi", 1200, "Russia");
        Livro livro6 = new Livro(6, "Memorias Postumas de Bras Cubas", "Machado de Assis", 180, "Brasil");
        Livro livro7 = new Livro(7, "Tambem os brancos sabem Dançar", "Kalaf Epalanga", 300, "Angola");
        Livro livro8 = new Livro(8, "O Amanhã não está a venda", "Ailton Krenak", 50, "Brasil");
        Livro livro9 = new Livro(9, "Kindred", "Octavia E. Butler", 320, "USA");
        Livro livro10 = new Livro(10, "Orgulho e Preconceito", "JAne Austen", 250, "Inglaterra");


        acervo.add(livro1);
        acervo.add(livro2);
        acervo.add(livro3);
        acervo.add(livro4);
        acervo.add(livro5);
        acervo.add(livro6);
        acervo.add(livro7);
        acervo.add(livro8);
        acervo.add(livro9);
        acervo.add(livro10);
    }


    @Test
    public void cadastrarUmLivroTest(){
        biblioteca = new Biblioteca();
        boolean livroCadastrado = biblioteca.cadastrarLivro(acervo.get(0));

        Assert.assertTrue(livroCadastrado);
    }
}
