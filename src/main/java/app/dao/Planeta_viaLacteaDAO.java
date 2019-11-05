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
@Repository("Planeta_viaLacteaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Planeta_viaLacteaDAO extends JpaRepository<Planeta_viaLactea, java.lang.String> {

  /**
   * Obtém a instância de Planeta_viaLactea utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Planeta_viaLactea entity WHERE entity.id = :id")
  public Planeta_viaLactea findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Planeta_viaLactea utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Planeta_viaLactea entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Continente_do_planeta entity WHERE entity.planeta.id = :id")
  public Page<Continente_do_planeta> findContinente_do_planeta(@Param(value="id") java.lang.String id, Pageable pageable);

}
