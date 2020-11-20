package test;

import main.entity.Leitor;
import main.entity.Livro;
import main.exceptions.ValidaEmprestimoLivroException;
import main.exceptions.ValidaListaLivrosException;
import main.service.Biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static main.exceptions.ValidaEmprestimoLivroException.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private List<Livro> acervo;

    @Before
    public void setUp(){
        biblioteca = new Biblioteca();
        acervo = new ArrayList<Livro>();

        Livro livro1 = new Livro(1, "Hibisco Roxo", "Chimamanda Ngozi", 250, "Nigéria", false);
        Livro livro2 = new Livro(2, "Angola Janga", "Marcelo D'Salete", 350, "Brasil", false);
        Livro livro3 = new Livro(3, "O Sol é para todos", "Harper Lee", 280, "USA", false);
        Livro livro4 = new Livro(4, "Frankenstein", "Marry Shaley", 400, "Inglaterra", false);
        Livro livro5 = new Livro(5, "Guerra e Paz", "Tolstoi", 1200, "Russia", false);
        Livro livro6 = new Livro(6, "Memorias Postumas de Bras Cubas", "Machado de Assis", 180, "Brasil", false);
        Livro livro7 = new Livro(7, "Tambem os brancos sabem Dançar", "Kalaf Epalanga", 300, "Angola", false);
        Livro livro8 = new Livro(8, "O Amanhã não está a venda", "Ailton Krenak", 50, "Brasil", false);
        Livro livro9 = new Livro(9, "Kindred", "Octavia E. Butler", 320, "USA", false);
        Livro livro10 = new Livro(10, "Orgulho e Preconceito", "JAne Austen", 250, "Inglaterra", false);

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

    @After
    public void tearDown(){
        this.acervo = null;
        this.biblioteca = null;
    }

    @Test
    public void cadastrarUmLivroTest(){
        boolean livroCadastrado = biblioteca.cadastrarLivro(acervo.get(0));

        assertTrue("Livro cadastrado com Sucesso", livroCadastrado);
        assertThat("Um Livro Cadastrado", biblioteca.getAcervo().size(), equalTo(1));
    }

    @Test
    public void cadastrarUmLivroNullTest(){
        System.out.println("Entrou no cadastrarUmLivroNull");
        Livro livro = new Livro();
        livro = null;//sem essa linha o método cadastrarLivro, da forma que está implementado, retorna True
        assertFalse("Instancia de livro Null", biblioteca.cadastrarLivro(livro));
    }

    @Test
    public void cadastrarListaLivroTest() throws ValidaListaLivrosException {
        Integer quantLivroCadastrado = biblioteca.cadastrarLivro(acervo);
        Integer tamanhoAcervo = acervo.size();

        assertEquals(tamanhoAcervo, quantLivroCadastrado, 0);
    }

    @Test
    public void cadastrarListaLivroNullTest() throws ValidaListaLivrosException {
        List<Livro> listaLivros = new ArrayList<Livro>();
        try {
            Integer quantLivroCadastrado = biblioteca.cadastrarLivro(listaLivros);
            fail();
        }catch (Exception e){
            assertThat(e.getMessage(), equalTo(ValidaListaLivrosException.MSG_lISTA_INVALIDA));
        }
    }

    @Test
    public void emprestarLivroTest() throws ValidaEmprestimoLivroException, NullPointerException{
        Leitor leitor = new Leitor(1, "Maria", "maria@gmail.com");
        biblioteca.emprestarLivro(acervo.get(3), leitor);

        assertFalse(leitor.getLivrosEmprestados().isEmpty());
        assertTrue(acervo.get(3).getEmprestado());
    }

    @Test
    public void emprestarLivroParamNullTest() throws ValidaEmprestimoLivroException, NullPointerException{
        try {
            biblioteca.emprestarLivro(null, null);
            fail();
        }catch (Exception e){
           assertThat(e.getMessage(), equalTo("Livro ou Leitor nulos"));
        }
    }

    @Test
    public void emprestarLivroEmprestadoTest() throws ValidaEmprestimoLivroException, NullPointerException {
        Leitor leitor = new Leitor(1, "Maria", "maria@gmail.com");
        Livro livro = acervo.get(5);
        livro.setEmprestado(true);
        try{
            biblioteca.emprestarLivro(livro, leitor);
            fail();
        }catch (Exception e){
            assertThat(e.getMessage(), equalTo(MSG_LIVRO_EMPRESTADO));
        }
    }
}
