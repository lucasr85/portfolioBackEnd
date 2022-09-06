package com.portfolio.Portfolio.Controller;

import com.portfolio.Portfolio.Entity.Persona;
import com.portfolio.Portfolio.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas Robles
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @PostMapping("/personas/guardar")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.setPersona(persona);
        return "Los datos se ingresaron correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "Se eliminó a la persona";
    }

    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nombre2,
            @RequestParam("apellido") String apellido2,
            @RequestParam("img") String img2) {
        Persona persona = ipersonaService.findPersona(id);
        persona.setNombre(nombre2);
        persona.setApellido(apellido2);
        persona.setImg(img2);

        ipersonaService.setPersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/buscar/{id}")
    public Persona findPersona(@PathVariable Long id){
        return ipersonaService.findPersona(id);
    }
}
