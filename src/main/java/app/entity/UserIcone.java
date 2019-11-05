package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela USERICONE
* @generated
*/
@Entity
@Table(name = "\"USERICONE\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.UserIcone")
public class UserIcone implements Serializable {

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
                @Column(name = "Nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

        /**
        * @generated
        */
                @Column(name = "login", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String login;

        /**
        * @generated
        */
                @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;

        /**
        * @generated
        */
                @Column(name = "icon", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String icon;

/**
* Construtor
* @generated
*/
public UserIcone(){
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
    public UserIcone setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
    return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public UserIcone setNome(java.lang.String nome){
    this.nome = nome;
    return this;
    }

    /**
    * Obtém login
    * return login
    * @generated
    */
    
    public java.lang.String getLogin(){
    return this.login;
    }

    /**
    * Define login
    * @param login login
    * @generated
    */
    public UserIcone setLogin(java.lang.String login){
    this.login = login;
    return this;
    }

    /**
    * Obtém email
    * return email
    * @generated
    */
    
    public java.lang.String getEmail(){
    return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public UserIcone setEmail(java.lang.String email){
    this.email = email;
    return this;
    }

    /**
    * Obtém icon
    * return icon
    * @generated
    */
    
    public java.lang.String getIcon(){
    return this.icon;
    }

    /**
    * Define icon
    * @param icon icon
    * @generated
    */
    public UserIcone setIcon(java.lang.String icon){
    this.icon = icon;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
UserIcone object = (UserIcone)obj;
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