package modelo;

import java.util.ArrayList;

public interface ConsultasDAO {

    public void insertar(PaisVO p);

    public ArrayList<PaisVO> consultarTabla();

    public ArrayList<PaisVO> consultarID(PaisVO pvo);

    public void modificar(PaisVO p);

    public void eliminar(PaisVO p);

}
