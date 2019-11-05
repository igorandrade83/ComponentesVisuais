package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CONTINENTE_DO_PLANETA
* @generated
*/
@Entity
@Table(name = "\"CONTINENTE_DO_PLANETA\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.Continente_do_planeta")
public class Continente_do_planeta implements Serializable {

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
                @Column(name = "con_nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String con_nome;

        /**
        * @generated
        */
            @ManyToOne
                    @JoinColumn(name="fk_planeta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Planeta_viaLactea planeta;

/**
* Construtor
* @generated
*/
public Continente_do_planeta(){
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
    public Continente_do_planeta setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém con_nome
    * return con_nome
    * @generated
    */
    
    public java.lang.String getCon_nome(){
    return this.con_nome;
    }

    /**
    * Define con_nome
    * @param con_nome con_nome
    * @generated
    */
    public Continente_do_planeta setCon_nome(java.lang.String con_nome){
    this.con_nome = con_nome;
    return this;
    }

    /**
    * Obtém planeta
    * return planeta
    * @generated
    */
    
    public Planeta_viaLactea getPlaneta(){
    return this.planeta;
    }

    /**
    * Define planeta
    * @param planeta planeta
    * @generated
    */
    public Continente_do_planeta setPlaneta(Planeta_viaLactea planeta){
    this.planeta = planeta;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
Continente_do_planeta object = (Continente_do_planeta)obj;
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