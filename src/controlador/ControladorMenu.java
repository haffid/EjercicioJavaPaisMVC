package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Frm_Buscar;

import vista.Frm_Eliminar1;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.Frm_Modificar;
import vista.Frm_Mostrar;

public class ControladorMenu implements ActionListener {
    Frm_Menu vMe = new Frm_Menu();
    Frm_Insertar vI = new Frm_Insertar();
    Frm_Eliminar1 vE = new Frm_Eliminar1();
    Frm_Mostrar vM = new Frm_Mostrar();
    Frm_Modificar vMo = new Frm_Modificar();
    Frm_Buscar vbi = new Frm_Buscar();

    public ControladorMenu(Frm_Menu vMe, Frm_Insertar vI, Frm_Eliminar1 vE, Frm_Mostrar vM, Frm_Modificar vMo, Frm_Buscar vbi) {
        this.vMe = vMe;
        this.vI = vI;
        this.vE = vE;
        this.vM = vM;
        this.vMo = vMo;
        this.vbi = vbi;
        vMe.btnInsetar.addActionListener(this);
        vMe.btnEliminar.addActionListener(this);
        vMe.btnMostrar.addActionListener(this);
        vMe.btnModificar.addActionListener(this);
        vMe.btnBuscarID.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vMe.btnInsetar) {
            vI.setVisible(true);
        }
        if (e.getSource() == vMe.btnEliminar) {
            vE.setVisible(true);
        }
        if (e.getSource() == vMe.btnMostrar) {
            vM.setVisible(true);
        }
        if (e.getSource() == vMe.btnModificar) {
            vMo.setVisible(true);
        }
        if (e.getSource() == vMe.btnBuscarID) {
            vbi.setVisible(true);
        }
    }

}
