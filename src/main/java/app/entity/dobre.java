package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela DOBRE
* @generated
*/
@Entity
@Table(name = "\"DOBRE\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.dobre")
public class dobre implements Serializable {

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
                @Column(name = "num", nullable = true, unique = false, precision=6, scale=8, insertable=true, updatable=true)
        
        private java.math.BigDecimal num;

/**
* Construtor
* @generated
*/
public dobre(){
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
    public dobre setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém num
    * return num
    * @generated
    */
    
    public java.math.BigDecimal getNum(){
    return this.num;
    }

    /**
    * Define num
    * @param num num
    * @generated
    */
    public dobre setNum(java.math.BigDecimal num){
    this.num = num;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
dobre object = (dobre)obj;
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