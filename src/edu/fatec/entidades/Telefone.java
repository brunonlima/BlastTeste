package edu.fatec.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Telefone implements Serializable,Bean{
    
	private static final long serialVersionUID = -1720447297719958096L;
	private long id;
    private String ddd,numero,operadora;

    public Telefone(){}
    
    public Telefone(String ddd, String numero, String operadora) {
        this.ddd = ddd;
        this.numero = numero;
        this.operadora = operadora;
    }

   @Id
   @GeneratedValue
   @Override
    public long getId() {
        return id;
    }

   
    public void setId(long id) {
        this.id = id;
    }

    @Column
    public String getDdd() {
        return ddd;
    }

   
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

  @Column
    public String getNumero() {
        return numero;
    }

   
    public void setNumero(String numero) {
        this.numero = numero;
    }

   @Column
    public String getOperadora() {
        return operadora;
    }

   
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
}

