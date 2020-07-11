package main.service;

import main.entity.Leitor;
import main.entity.Leitura;
import main.entity.Livro;
import main.exceptions.ValidaLivroEmprestado;

import java.util.ArrayList;
import java.util.List;

public class DiarioLeituras {

    public static boolean registrarHistoricoLeitura(Leitor leitor, Livro livro, Integer paginasLidas) throws NullPointerException, ValidaLivroEmprestado {
        if (leitor == null || livro == null)
            throw new NullPointerException("Livro ou leitor nulo");

        List<Livro> livrosEmprestados = new ArrayList<Livro>();
        livrosEmprestados = leitor.getLivrosEmprestados();
        if (!livrosEmprestados.contains(livro))
            throw new ValidaLivroEmprestado("Não pode registrar histórico de livro que não fez emprestimo");

        boolean statusLeitura = (paginasLidas == livro.getTotalPaginas()) ? true : false;

       Leitura leitura = new Leitura(1, leitor, livro, "20/02/2020", paginasLidas, statusLeitura);
       List<Leitura> leituras = new ArrayList<Leitura>();
       leituras = leitor.getHistoricoDeLeituras();
       leituras.add(leitura);
       leitor.setHistoricoDeLeituras(leituras);

        return true;
    }


}
