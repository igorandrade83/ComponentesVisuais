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
@Repository("Pais_do_continenteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Pais_do_continenteDAO extends JpaRepository<Pais_do_continente, java.lang.String> {

  /**
   * Obtém a instância de Pais_do_continente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pais_do_continente entity WHERE entity.id = :id")
  public Pais_do_continente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pais_do_continente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pais_do_continente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Estados_do_pais entity WHERE entity.pais.id = :id")
  public Page<Estados_do_pais> findEstados_do_pais(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key continente
   * @generated
   */
  @Query("SELECT entity FROM Pais_do_continente entity WHERE entity.continente.id = :id")
  public Page<Pais_do_continente> findPais_do_continentesByContinente(@Param(value="id") java.lang.String id, Pageable pageable);

}
