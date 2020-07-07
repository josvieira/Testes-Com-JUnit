package main.entity;

public class Livro {
    private Integer id;
    private String titulo;
    private String autor;
    private Integer totalPaginas;
    private String paisOrigemAutor;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(Integer id, String titulo, String autor, Integer totalPaginas, String paisOrigemAutor, boolean emprestado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paisOrigemAutor = paisOrigemAutor;
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", paisOrigem='" + paisOrigemAutor + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(Integer totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public String getPaisOrigemAutor() {
        return paisOrigemAutor;
    }

    public void setPaisOrigemAutor(String paisOrigemAutor) {
        this.paisOrigemAutor = paisOrigemAutor;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
