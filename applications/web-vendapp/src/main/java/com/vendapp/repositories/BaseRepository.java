package com.vendapp.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Esta interface representa los metodos que todos los repositorios deben heredar
 *
 * @param <T> Entity de base datos a manipular
 * @param <ID> Primary Key del Entity (Integer, Long, etc.)
 */

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

}
