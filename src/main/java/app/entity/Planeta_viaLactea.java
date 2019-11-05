package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PLANETA_VIALACTEA
* @generated
*/
@Entity
@Table(name = "\"PLANETA_VIALACTEA\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.Planeta_viaLactea")
public class Planeta_viaLactea implements Serializable {

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
                @Column(name = "pla_nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String pla_nome;

/**
* Construtor
* @generated
*/
public Planeta_viaLactea(){
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
    public Planeta_viaLactea setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém pla_nome
    * return pla_nome
    * @generated
    */
    
    public java.lang.String getPla_nome(){
    return this.pla_nome;
    }

    /**
    * Define pla_nome
    * @param pla_nome pla_nome
    * @generated
    */
    public Planeta_viaLactea setPla_nome(java.lang.String pla_nome){
    this.pla_nome = pla_nome;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
Planeta_viaLactea object = (Planeta_viaLactea)obj;
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