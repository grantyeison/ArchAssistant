/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Controlador;
import Modelo.Proyecto;
import java.util.List;

/**
 *
 * @author Prometheus
 */
public interface ControladorDAO {
    
    List<Controlador> ListarControladores(Proyecto proy);    
    
    void CrearControlador(Controlador con);
    
    Controlador BuscarControlador(int id);
    
    void ModificarControlador (Controlador con);
    
    void EliminarControlador (Controlador con);
    
}
