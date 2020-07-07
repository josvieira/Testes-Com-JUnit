package main.exceptions;

public class ValidaEmprestimoLivroException extends Exception {
    public static String MSG_LIVRO_EMPRESTADO = "O livro já está emprestado";
    
    public ValidaEmprestimoLivroException(String msg){
        super(msg);
    }
}
