package domain;

import anotacao.TipoChave;

import java.math.BigDecimal;

public class Produto extends Persistente {
    @TipoChave("getCodigo")
    private String codigo;
    private String Nome;
    private BigDecimal preco;
    private Integer quant;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }
}
