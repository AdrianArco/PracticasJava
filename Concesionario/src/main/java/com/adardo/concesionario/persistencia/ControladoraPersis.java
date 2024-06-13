package com.adardo.concesionario.persistencia;

import com.adardo.concesionario.logica.Automovil;
import com.adardo.concesionario.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adria
 */
public class ControladoraPersis {
    AutomovilJpaController cocheJpa= new AutomovilJpaController();
    
    public void agregar(Automovil coche) {
        cocheJpa.create(coche);
    }

    public void borrar(int id) {
        try {
            cocheJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Automovil> traerLista() {
        return   cocheJpa.findAutomovilEntities();
             
    }

    public Automovil traerCoch(int id) {
        return cocheJpa.findAutomovil(id);
    }

    public void modificarCoche(Automovil coche) {
        try {
            cocheJpa.edit(coche);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
