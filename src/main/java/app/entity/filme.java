package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela FILME
* @generated
*/
@Entity
@Table(name = "\"FILME\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.filme")
public class filme implements Serializable {

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
                @Column(name = "filme_nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String filme_nome;

/**
* Construtor
* @generated
*/
public filme(){
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
    public filme setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém filme_nome
    * return filme_nome
    * @generated
    */
    
    public java.lang.String getFilme_nome(){
    return this.filme_nome;
    }

    /**
    * Define filme_nome
    * @param filme_nome filme_nome
    * @generated
    */
    public filme setFilme_nome(java.lang.String filme_nome){
    this.filme_nome = filme_nome;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
filme object = (filme)obj;
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