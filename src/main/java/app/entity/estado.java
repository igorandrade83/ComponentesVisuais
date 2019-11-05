package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ESTADO
* @generated
*/
@Entity
@Table(name = "\"ESTADO\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.estado")
public class estado implements Serializable {

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
                @Column(name = "est_nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String est_nome;

/**
* Construtor
* @generated
*/
public estado(){
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
    public estado setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém est_nome
    * return est_nome
    * @generated
    */
    
    public java.lang.String getEst_nome(){
    return this.est_nome;
    }

    /**
    * Define est_nome
    * @param est_nome est_nome
    * @generated
    */
    public estado setEst_nome(java.lang.String est_nome){
    this.est_nome = est_nome;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
estado object = (estado)obj;
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