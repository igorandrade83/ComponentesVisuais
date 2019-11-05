package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PEDIDO_CLIENTE
* @generated
*/
@Entity
@Table(name = "\"PEDIDO_CLIENTE\"")
@XmlRootElement
    @CronappSecurity
@JsonFilter("app.entity.pedido_cliente")
public class pedido_cliente implements Serializable {

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
                    @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private produto produto;

        /**
        * @generated
        */
            @ManyToOne
                    @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private cliente cliente;

        /**
        * @generated
        */
                @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidade;

/**
* Construtor
* @generated
*/
public pedido_cliente(){
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
    public pedido_cliente setId(java.lang.String id){
    this.id = id;
    return this;
    }

    /**
    * Obtém produto
    * return produto
    * @generated
    */
    
    public produto getProduto(){
    return this.produto;
    }

    /**
    * Define produto
    * @param produto produto
    * @generated
    */
    public pedido_cliente setProduto(produto produto){
    this.produto = produto;
    return this;
    }

    /**
    * Obtém cliente
    * return cliente
    * @generated
    */
    
    public cliente getCliente(){
    return this.cliente;
    }

    /**
    * Define cliente
    * @param cliente cliente
    * @generated
    */
    public pedido_cliente setCliente(cliente cliente){
    this.cliente = cliente;
    return this;
    }

    /**
    * Obtém quantidade
    * return quantidade
    * @generated
    */
    
    public java.lang.Integer getQuantidade(){
    return this.quantidade;
    }

    /**
    * Define quantidade
    * @param quantidade quantidade
    * @generated
    */
    public pedido_cliente setQuantidade(java.lang.Integer quantidade){
    this.quantidade = quantidade;
    return this;
    }

/**
* @generated
*/
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
pedido_cliente object = (pedido_cliente)obj;
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