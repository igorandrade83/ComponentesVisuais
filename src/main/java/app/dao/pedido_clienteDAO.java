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
@Repository("pedido_clienteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface pedido_clienteDAO extends JpaRepository<pedido_cliente, java.lang.String> {

  /**
   * Obtém a instância de pedido_cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM pedido_cliente entity WHERE entity.id = :id")
  public pedido_cliente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de pedido_cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM pedido_cliente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key produto
   * @generated
   */
  @Query("SELECT entity FROM pedido_cliente entity WHERE entity.produto.id = :id")
  public Page<pedido_cliente> findpedido_clientesByProduto(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key cliente
   * @generated
   */
  @Query("SELECT entity FROM pedido_cliente entity WHERE entity.cliente.id = :id")
  public Page<pedido_cliente> findpedido_clientesByCliente(@Param(value="id") java.lang.String id, Pageable pageable);

}
