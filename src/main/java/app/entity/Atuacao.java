package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ATUACAO
* @generated
*/
@Entity
@Table(name = "\"ATUACAO\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.Atuacao")
public class Atuacao implements Serializable {

/**
* UID da classe, necessário na serialização
* @generated
*/
private static final long serialVersionUID = 1L;

        /**
        * @generated
        */
        @Id
            @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

        /**
        * @generated
        */
            @ManyToOne
                    @JoinColumn(name="fk_filme", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private filme filme;

        /**
        * @generated
        */
            @ManyToOne
                    @JoinColumn(name="fk_ator", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Ator ator;

        /**
        * @generated
        */
                @Column(name = "Salario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal salario;

/**
* Construtor
* @generated
*/
public Atuacao(){
}


    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
    return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Atuacao setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém filme
    * return filme
    * @generated
    */
    
    public filme getFilme(){
    return this.filme;
    }

    /**
    * Define filme
    * @param filme filme
    * @generated
    */
    public Atuacao setFilme(filme filme){
    this.filme = filme;
    return this;
    }

    /**
    * Obtém ator
    * return ator
    * @generated
    */
    
    public Ator getAtor(){
    return this.ator;
    }

    /**
    * Define ator
    * @param ator ator
    * @generated
    */
    public Atuacao setAtor(Ator ator){
    this.ator = ator;
    return this;
    }

    /**
    * Obtém salario
    * return salario
    * @generated
    */
    
    public java.math.BigDecimal getSalario(){
    return this.salario;
    }

    /**
    * Define salario
    * @param salario salario
    * @generated
    */
    public Atuacao setSalario(java.math.BigDecimal salario){
    this.salario = salario;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
Atuacao object = (Atuacao)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
return true;
}

/**
* @generated
*/
@Override
public int hashCode() {
int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
return result;
}

}