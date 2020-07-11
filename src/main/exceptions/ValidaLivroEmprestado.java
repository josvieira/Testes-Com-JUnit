package main.exceptions;

public class ValidaLivroEmprestado extends Exception{

    public static String MSG_LIVRO_NAO_EMPRESTADO = "Não pode registrar histórico de livro que não fez emprestimo";

    public ValidaLivroEmprestado(String msg){
        super(msg);
    }
}
