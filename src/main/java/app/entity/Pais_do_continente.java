package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PAIS_DO_CONTINENTE
* @generated
*/
@Entity
@Table(name = "\"PAIS_DO_CONTINENTE\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.Pais_do_continente")
public class Pais_do_continente implements Serializable {

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
                @Column(name = "pai_nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String pai_nome;

        /**
        * @generated
        */
            @ManyToOne
                    @JoinColumn(name="fk_continente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Continente_do_planeta continente;

/**
* Construtor
* @generated
*/
public Pais_do_continente(){
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
    public Pais_do_continente setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém pai_nome
    * return pai_nome
    * @generated
    */
    
    public java.lang.String getPai_nome(){
    return this.pai_nome;
    }

    /**
    * Define pai_nome
    * @param pai_nome pai_nome
    * @generated
    */
    public Pais_do_continente setPai_nome(java.lang.String pai_nome){
    this.pai_nome = pai_nome;
    return this;
    }

    /**
    * Obtém continente
    * return continente
    * @generated
    */
    
    public Continente_do_planeta getContinente(){
    return this.continente;
    }

    /**
    * Define continente
    * @param continente continente
    * @generated
    */
    public Pais_do_continente setContinente(Continente_do_planeta continente){
    this.continente = continente;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
Pais_do_continente object = (Pais_do_continente)obj;
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