package br.com.notafiscal;

import javax.persistence.Entity;
import
        javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "notafiscal")
public class NotaFiscal {
    @Id
    @GeneratedValue
    private Long id;
    private String empresa;
    private Double imposto;
    private Double valor;

    public NotaFiscal(){}

    public NotaFiscal(String nomeEmpresa, Double imposto, Double valor) {
        this.empresa = nomeEmpresa;
        this.valor = valor;
        this.imposto = imposto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}