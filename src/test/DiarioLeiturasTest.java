package test;

import main.entity.Leitor;
import main.entity.Livro;
import main.exceptions.ValidaEmprestimoLivroException;
import main.exceptions.ValidaLivroEmprestado;
import main.service.Biblioteca;
import org.junit.Assert;
import org.junit.Test;

import static main.service.DiarioLeituras.registrarHistoricoLeitura;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class DiarioLeiturasTest {

    @Test
    public void registrarHistoricoLeituraLivroNullTest() {
        Leitor leitor = new Leitor(1, "Joana", "joana@gmail.com");
        Livro livro = null;
        Integer paginaslidas = 525;

        try {
            boolean retorno = registrarHistoricoLeitura(leitor, livro, paginaslidas);
            fail();
        }catch (Exception e){
            Assert.assertThat(e.getMessage(), equalTo("Livro ou leitor nulo"));
        }

    }

    @Test
    public void registrarLeituraLivroNaoEmprestadoTest() throws ValidaLivroEmprestado {
        Leitor leitor = new Leitor(1, "Joana", "joana@gmail.com");
        Livro livro = new Livro(5, "Guerra e Paz", "Tolstoi", 1200, "Russia", false);
        Integer paginaslidas = 525;
        try {
            registrarHistoricoLeitura(leitor, livro, paginaslidas);
            fail();
        }catch (Exception e){
            assertThat(e.getMessage(), equalTo("Não pode registrar histórico de livro que não fez emprestimo"));
        }


    }
}
