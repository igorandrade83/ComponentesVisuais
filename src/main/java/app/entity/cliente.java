package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CLIENTE
* @generated
*/
@Entity
@Table(name = "\"CLIENTE\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.cliente")
public class cliente implements Serializable {

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
                @Column(name = "cli_nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cli_nome;

        /**
        * @generated
        */
                @Column(name = "CPF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cpF;

/**
* Construtor
* @generated
*/
public cliente(){
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
    public cliente setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém cli_nome
    * return cli_nome
    * @generated
    */
    
    public java.lang.String getCli_nome(){
    return this.cli_nome;
    }

    /**
    * Define cli_nome
    * @param cli_nome cli_nome
    * @generated
    */
    public cliente setCli_nome(java.lang.String cli_nome){
    this.cli_nome = cli_nome;
    return this;
    }

    /**
    * Obtém cpF
    * return cpF
    * @generated
    */
    
    public java.lang.String getCpF(){
    return this.cpF;
    }

    /**
    * Define cpF
    * @param cpF cpF
    * @generated
    */
    public cliente setCpF(java.lang.String cpF){
    this.cpF = cpF;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
cliente object = (cliente)obj;
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