/*
package com.proyecto_audiencias.audiencias.repositorio;

import com.proyecto_audiencias.audiencias.modelo.Audiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienciaRepository extends JpaRepository <Audiencia, Long> {



}
*/


package com.proyecto_audiencias.audiencias.repositorio;

import com.proyecto_audiencias.audiencias.modelo.Audiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudienciaRepository extends JpaRepository<Audiencia, Long> {
}