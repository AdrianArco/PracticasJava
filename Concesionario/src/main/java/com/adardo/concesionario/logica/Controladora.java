/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adardo.concesionario.logica;

import com.adardo.concesionario.persistencia.ControladoraPersis;
import java.util.List;

/**
 *
 * @author adria
 */
public class Controladora {
    ControladoraPersis controlPersis= new ControladoraPersis();

    public void guardar(String modelo, String marca, String color, String motor, String matricula, int puertas) {
        Automovil coche= new Automovil();
        coche.setModelo(modelo);
        coche.setMarca(marca);
        coche.setColor(color);
        coche.setMotor(motor);
        coche.setMatricula(matricula);
        coche.setCantPuertas(puertas);
        
        controlPersis.agregar(coche);
    }

    public void borrarCoche(int id) {
        controlPersis.borrar(id);
    }

    public List<Automovil> traerList() {
        return controlPersis.traerLista();
    }



    public Automovil traerCoche(int id) {
        return controlPersis.traerCoch(id);
    }

    public void modificar(int id, String modelo, String marca, String color, String motor, String matricula, int puertas) {
        Automovil coche= new Automovil();
        coche.setId(id);
        coche.setModelo(modelo);
        coche.setMarca(marca);
        coche.setColor(color);
        coche.setMotor(motor);
        coche.setMatricula(matricula);
        coche.setCantPuertas(puertas);
        controlPersis.modificarCoche(coche);
    }
}
