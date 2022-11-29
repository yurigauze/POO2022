package br.edu.ifpr.paranavai.armarios.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_estudante")
public class Estudante extends Pessoa{

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    private String ra;
}