package main.exceptions;

public class ValidaListaLivrosException extends Exception{

    public static String MSG_lISTA_INVALIDA = "A lista de livros não pode estar vazia.";

    public ValidaListaLivrosException(String msg){
        super(msg);
    }

}
