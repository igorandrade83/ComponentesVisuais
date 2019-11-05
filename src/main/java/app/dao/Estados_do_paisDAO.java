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
@Repository("Estados_do_paisDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Estados_do_paisDAO extends JpaRepository<Estados_do_pais, java.lang.String> {

  /**
   * Obtém a instância de Estados_do_pais utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Estados_do_pais entity WHERE entity.id = :id")
  public Estados_do_pais findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Estados_do_pais utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Estados_do_pais entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key pais
   * @generated
   */
  @Query("SELECT entity FROM Estados_do_pais entity WHERE entity.pais.id = :id")
  public Page<Estados_do_pais> findEstados_do_paissByPais(@Param(value="id") java.lang.String id, Pageable pageable);

}
