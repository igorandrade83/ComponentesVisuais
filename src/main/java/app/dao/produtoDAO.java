package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("produtoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface produtoDAO extends JpaRepository<produto, java.lang.String> {

  /**
   * Obtém a instância de produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM produto entity WHERE entity.id = :id")
  public produto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM produto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM pedido_cliente entity WHERE entity.produto.id = :id")
  public Page<pedido_cliente> findPedido_cliente(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.cliente FROM pedido_cliente entity WHERE entity.produto.id = :id")
  public Page<cliente> listCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM pedido_cliente entity WHERE entity.produto.id = :instanceId AND entity.cliente.id = :relationId")
  public int deleteCliente(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
