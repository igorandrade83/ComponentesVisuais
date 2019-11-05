package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CINCOK
* @generated
*/
@Entity
@Table(name = "\"CINCOK\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.cincok")
public class cincok implements Serializable {

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
                @Column(name = "num", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double num;

        /**
        * @generated
        */
                @Column(name = "text", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String text;

/**
* Construtor
* @generated
*/
public cincok(){
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
    public cincok setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém num
    * return num
    * @generated
    */
    
    public java.lang.Double getNum(){
    return this.num;
    }

    /**
    * Define num
    * @param num num
    * @generated
    */
    public cincok setNum(java.lang.Double num){
    this.num = num;
    return this;
    }

    /**
    * Obtém text
    * return text
    * @generated
    */
    
    public java.lang.String getText(){
    return this.text;
    }

    /**
    * Define text
    * @param text text
    * @generated
    */
    public cincok setText(java.lang.String text){
    this.text = text;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
cincok object = (cincok)obj;
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