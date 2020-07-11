package main.entity;

import java.util.Date;

public class Leitura {
    private Integer id;
    private Leitor idLeitor;
    private Livro idLivro;
    private String dataLeitura;
    private Integer paginasLidas;
    private boolean statusLeitura;

    public Leitura(Integer id, Leitor idLeitor, Livro idLivro, String dataLeitura, Integer paginasLidas, boolean statusLeitura) {
        this.id = id;
        this.idLeitor = idLeitor;
        this.idLivro = idLivro;
        this.dataLeitura = dataLeitura;
        this.paginasLidas = paginasLidas;
        this.statusLeitura = statusLeitura;
    }

    @Override
    public String toString() {
        return "Leitura{" +
                "idLeitor=" + idLeitor +
                ", idLivro=" + idLivro +
                ", dataLeitura=" + dataLeitura +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Leitor getIdLeitor() {
        return idLeitor;
    }

    public void setIdLeitor(Leitor idLeitor) {
        this.idLeitor = idLeitor;
    }

    public Livro getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Livro idLivro) {
        this.idLivro = idLivro;
    }

    public String getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(String dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public Integer getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(Integer paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public boolean isStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(boolean statusLeitura) {
        this.statusLeitura = statusLeitura;
    }
}
