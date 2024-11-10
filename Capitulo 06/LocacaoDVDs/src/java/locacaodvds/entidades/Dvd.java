/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locacaodvds.entidades;

import java.sql.Date;

/**
 *
 * @author bv3024903
 */
public class Dvd {
    
    private int id;
    private String titulo;
    private int ano_lancamento;
    private Ator ator_principal;
    private Ator ator_coadjuvante;
    private Date data_lancamento;
    private int duracao_minutos;
    private ClassificacaoEtaria classificacao;
    private Genero genero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Ator getAtor_principal() {
        return ator_principal;
    }

    public void setAtor_principal(Ator ator_principal) {
        this.ator_principal = ator_principal;
    }

    public Ator getAtor_coadjuvante() {
        return ator_coadjuvante;
    }

    public void setAtor_coadjuvante(Ator ator_coadjuvante) {
        this.ator_coadjuvante = ator_coadjuvante;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }


    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ClassificacaoEtaria getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(ClassificacaoEtaria classificacao) {
        this.classificacao = classificacao;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public int getDuracao_minutos() {
        return duracao_minutos;
    }

    public void setDuracao_minutos(int duracao_minutos) {
        this.duracao_minutos = duracao_minutos;
    }

    

    
    
}
