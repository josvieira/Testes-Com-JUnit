package main.entity;

import java.util.Date;

public class Leitura {
    private Integer id;
    private Leitor idLeitor;
    private Livro idLivro;
    private Date dataLeitura;

    public Leitura(Integer id, Leitor idLeitor, Livro idLivro, Date dataLeitura) {
        this.id = id;
        this.idLeitor = idLeitor;
        this.idLivro = idLivro;
        this.dataLeitura = dataLeitura;
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

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }
}
