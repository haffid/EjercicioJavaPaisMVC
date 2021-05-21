package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Buscar;

public class ControladorBuscar implements ActionListener, KeyListener {

    Frm_Buscar fb = new Frm_Buscar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorBuscar(Frm_Buscar fb, PaisVO pvo, PaisDAO pdao) {
        this.fb = fb;
        this.pvo = pvo;
        this.pdao = pdao;

        fb.btnBuscarID.addActionListener(this);
        fb.txtBuscarID.addKeyListener(this);

    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        PaisVO pvo = new PaisVO();
        pvo.setNombre_pais(fb.txtBuscarID.getText());
        m.setColumnCount(0);
        m.addColumn("Id del Pais");
        m.addColumn("Nombre del País");
        m.addColumn("Capital del País");
        m.addColumn("Población");

        for (PaisVO v : this.pdao.consultarID(pvo)) {
            m.addRow(new Object[]{v.getId(), v.getNombre_pais(), v.getCapital_pais(), v.getPoblacion_pais()});
        }
        fb.tblBuscarID.setModel(m);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fb.btnBuscarID) {
            this.mostrar();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.mostrar();
    }

}
