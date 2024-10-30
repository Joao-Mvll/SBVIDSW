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
    private String nome;
    private String ano_lancamento;
    private Ator ator_principal;
    private Ator ator_coadjuvante;
    private Date data_lancamento;
    private String duracao_minutos;
    private String classificacao_etaria_id;
    private Genero genero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
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

    public String getDuracao_minutos() {
        return duracao_minutos;
    }

    public void setDuracao_minutos(String duracao_minutos) {
        this.duracao_minutos = duracao_minutos;
    }

    public String getClassificacao_etaria_id() {
        return classificacao_etaria_id;
    }

    public void setClassificacao_etaria_id(String classificacao_etaria_id) {
        this.classificacao_etaria_id = classificacao_etaria_id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
}
