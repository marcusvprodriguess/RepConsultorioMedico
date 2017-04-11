/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

import java.util.Date;

/**
 *
 * @author Marcus
 */
public class Paciente {
    private int id_pct;
    private String nome;
    private String rg;
    private String cpf;
    private Date dataNascimento;
    private String telefoneRes;
    private String telefoneCel;
    private String observacao;

    public int getId_pct() {
        return id_pct;
    }

    public void setId_pct(int id_pct) {
        this.id_pct = id_pct;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefoneRes() {
        return telefoneRes;
    }

    public void setTelefoneRes(String telefoneRes) {
        this.telefoneRes = telefoneRes;
    }

    public String getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(String telefoneCel) {
        this.telefoneCel = telefoneCel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
}
