package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Insertar;

public class ControladorInsertar implements ActionListener {

    Frm_Insertar vista = new Frm_Insertar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorInsertar(Frm_Insertar v, PaisVO pv, PaisDAO pd) {
        this.vista = v;
        this.pvo = pv;
        this.pdao = pd;

        vista.btnInsertarPais.addActionListener(this);
    }

    public void limpiarPais() {
        vista.txtNombre.setText(null);
        vista.txtCapital.setText(null);
        vista.txtPoblacion.setText(null);
        vista.txtNombre.requestFocus();
    }

    private void insertarPais() {
        pvo.setNombre_pais(vista.txtNombre.getText());
        pvo.setCapital_pais(vista.txtCapital.getText());
        pvo.setPoblacion_pais(Integer.parseInt(vista.txtPoblacion.getText()));
        pdao.insertar(pvo);
        JOptionPane.showMessageDialog(null, "Pais Insertado Correctamente");
        limpiarPais();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnInsertarPais) {
            this.insertarPais();
        }
    }

}
