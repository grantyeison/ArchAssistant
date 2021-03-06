/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.TacticaDAO;
import DAO.TacticaJPADAO;
import Modelo.Atributocalidad;
import Modelo.Patron;
import java.util.List;
import javax.ejb.EJB;
import Modelo.Tactica;

/**
 *
 * @author Prometheus
 */
public class TacticaBean 
{
    @EJB
    private TacticaDAO dao;

    public TacticaBean() 
    {
        /*if (dao != null)
        {*/
            dao = new TacticaJPADAO();
            System.out.println("***Tactica DAO ha sido creado***");
        //}
    }
    
    public List<Tactica> Listar()
    {
        return dao.ListarTacticas();
    }
    
    public void Crear(Tactica atr)
    {
        dao.CrearTactica(atr);
    }
    
    public Tactica Buscar(int id)
    {
        return dao.BuscarTactica(id);
    }
    
    public void Eliminar(Tactica atr)
    {
        dao.EliminarTactica(atr);
    }
    
    public void Modificar(Tactica atr)
    {
        dao.ModificarTactica(atr);
    }
    
    public List<Tactica> BuscarPorAtributoDeCalidad(Atributocalidad atr)
    {
        return dao.BuscarTacticaPorAtributoDeCalidad(atr);
    }
    /*
    public List<Patron> ListadoPatronesDeTactica(int tac) {
        return dao.ListadoPatronesDeTactica(tac);
        
    }*/
    
    public List<Tactica> ListarTacticasPorPatron(Patron pat) {
        return dao.ListarTacticasPorPatron(pat);
        
    }    
}
