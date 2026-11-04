package br.com.fatec.sistemacomercioweb.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer estoque;
    private String historico_precos;
    private String itensvendas;
    public Produto() {
    }
    public Produto(String nome, String descricao,
                   BigDecimal preco, Integer estoque,
                   String historico_precos, String itensvendas) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.historico_precos = historico_precos;
        this.itensvendas = itensvendas;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    public String getHistorico_precos() {
        return historico_precos;
    }
    public void setHistorico_precos(String historico_precos) {
        this.historico_precos = historico_precos;
    }
    public String getItensvendas() {
        return itensvendas;
    }
    public void setItensvendas(String itensvendas) {
        this.itensvendas = itensvendas;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", historico_precos='" + historico_precos + '\'' +
                ", itensvendas='" + itensvendas + '\'' +
                '}';
    }
}
