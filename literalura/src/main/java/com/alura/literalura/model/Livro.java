package com.alura.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;
    private String idioma;
    private Double numeroDownloads;

    @ManyToOne
    private Autor autor;

    public Livro() {}

    public Livro(DadosLivro dadosLivro, Autor autor) {
        this.titulo = dadosLivro.titulo();
        this.idioma = dadosLivro.idiomas().isEmpty() ? "Desconhecido" : dadosLivro.idiomas().get(0); // Pega o primeiro idioma
        this.numeroDownloads = dadosLivro.numeroDownloads();
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  "----- LIVRO -----\n" +
                "Titulo: " + titulo + "\n" +
                "Autor: " + autor.getNome() + "\n" +
                "Idioma: " + idioma + "\n" +
                "Numero de downloads: " + numeroDownloads + "\n" +
                "-----------------\n";
    }

    // Getters e Setters...
}
