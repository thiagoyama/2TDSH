package br.com.fiap.jpa.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="EAD_TB_PRODUTO")
					//nome no java, nome da sequence no banco, incremento
@SequenceGenerator(name="produto", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)
public class Produto {

	@Id
	@Column(name="cd_produto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	private Integer codigo;
	
	@Column(name="nm_produto", nullable = false, length = 50) //nullable -> pode ser nulo?
	private String nome;
	
	@Column(name="vl_produto", nullable = false)
	private BigDecimal valor;
	
	@Column(name="ds_produto", length = 200)
	private String descricao;
	
	@Column(name="qt_produto", nullable = false)
	private Integer quantidade;
	
	@Temporal(TemporalType.DATE) //DATE -> Grava somente a data no banco
	@Column(name="dt_vencimento")
	private Calendar dataVencimento;
	
	@Temporal(TemporalType.DATE) //TIMESTAMP -> data e hora
	@Column(name="dt_fabricacao")
	private Calendar dataFabricacao;
	
	@Column(updatable = false, name="dt_cadastro", nullable = false) //updatable -> pode atualizar o campo?
	private LocalDate dataCadastro;
	
	@Transient //Não será uma coluna na tabela
	private Integer idade;
	
	@Lob //Define um campo do tipo BLOB no oracle
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)//gravar o texto da constante
	@Column(name="ds_material", nullable = false, length = 20)
	private Material material;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
}