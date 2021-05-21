/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopaisesmvc;

import controlador.ControladorBuscar;
import controlador.ControladorEliminar;
import controlador.ControladorInsertar;
import controlador.ControladorMenu;
import controlador.ControladorModificar;
import controlador.ControladorMostrar;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Buscar;
import vista.Frm_Eliminar1;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.Frm_Modificar;
import vista.Frm_Mostrar;

public class EjercicioPaisesMVC {

    public static void main(String[] args) {
        Frm_Menu m = new Frm_Menu();
        Frm_Insertar fi = new Frm_Insertar();
        Frm_Eliminar1 fe = new Frm_Eliminar1();
        Frm_Mostrar fm = new Frm_Mostrar();
        Frm_Modificar fmod = new Frm_Modificar();
        Frm_Buscar fb = new Frm_Buscar();
        PaisVO pvo = new PaisVO();
        PaisDAO pdao = new PaisDAO();
        ControladorMenu cm = new ControladorMenu(m, fi, fe, fm, fmod, fb);
        ControladorInsertar ci = new ControladorInsertar(fi, pvo, pdao);
        ControladorMostrar cmo = new ControladorMostrar(fm, pvo, pdao);
        ControladorModificar cmod = new ControladorModificar(fmod, pvo, pdao);
        ControladorBuscar cbi = new ControladorBuscar(fb, pvo, pdao);
        ControladorEliminar cel = new ControladorEliminar(fe, pvo, pdao);
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        fi.setLocationRelativeTo(m);
        fe.setLocationRelativeTo(m);
        fm.setLocationRelativeTo(m);
        fmod.setLocationRelativeTo(m);
        fb.setLocationRelativeTo(m);

    }

}
