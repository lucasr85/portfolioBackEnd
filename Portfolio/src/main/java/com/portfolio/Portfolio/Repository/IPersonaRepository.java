
package com.portfolio.Portfolio.Repository;

import com.portfolio.Portfolio.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Robles
 */

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
