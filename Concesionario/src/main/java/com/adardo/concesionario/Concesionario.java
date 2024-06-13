package com.adardo.concesionario;

import com.adardo.concesionario.igu.Principal;

/**
 *
 * @author adria
 */
public class Concesionario {

    public static void main(String[] args) {
        //hacemos visible nuestra clase principal de igu
        
        Principal princ= new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        princ.setTitle("Concesionario");
        
    }
}
