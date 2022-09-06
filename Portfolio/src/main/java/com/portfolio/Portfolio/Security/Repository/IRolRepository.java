package com.portfolio.Portfolio.Security.Repository;

import com.portfolio.Portfolio.Security.Entity.Rol;
import com.portfolio.Portfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Robles
 */

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);    
}
