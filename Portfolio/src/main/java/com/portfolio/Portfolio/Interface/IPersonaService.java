
package com.portfolio.Portfolio.Interface;

import com.portfolio.Portfolio.Entity.Persona;
import java.util.List;

/**
 *
 * @author Lucas Robles
 */
public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void setPersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
