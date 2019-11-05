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
@Repository("Continente_do_planetaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Continente_do_planetaDAO extends JpaRepository<Continente_do_planeta, java.lang.String> {

  /**
   * Obtém a instância de Continente_do_planeta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Continente_do_planeta entity WHERE entity.id = :id")
  public Continente_do_planeta findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Continente_do_planeta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Continente_do_planeta entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pais_do_continente entity WHERE entity.continente.id = :id")
  public Page<Pais_do_continente> findPais_do_continente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key planeta
   * @generated
   */
  @Query("SELECT entity FROM Continente_do_planeta entity WHERE entity.planeta.id = :id")
  public Page<Continente_do_planeta> findContinente_do_planetasByPlaneta(@Param(value="id") java.lang.String id, Pageable pageable);

}
