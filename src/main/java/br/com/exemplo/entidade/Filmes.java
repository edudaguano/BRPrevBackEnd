package br.com.exemplo.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@EnableAutoConfiguration
@Entity
@Table(name="tb_filme")
public class Filmes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long    id;
	private String nome;
	private String ano;
	private String descricao;
	
}
