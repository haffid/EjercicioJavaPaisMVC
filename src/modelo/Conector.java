package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conector {

    private String driver = "com.mysql.jdbc.Driver";
    private String servidor = "127.1.1.0";
    private String usuario = "root";
    private String password = "";
    private String bd = "bd_java_con1";
    private String cadena;

    Connection con;
    Statement st;

    public void conectar() {
        this.cadena = "jdbc:mysql://" + this.servidor + "/" + this.bd;
        try {
            Class.forName(this.driver).newInstance();
            this.con = DriverManager.getConnection(this.cadena, this.usuario, this.password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public int consulta_multiples(String consulta) {
        int resultado;
        try {
            this.conectar();
            this.st = this.con.createStatement();
            resultado = this.st.executeUpdate(consulta);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return 0;
        }
        return resultado;
    }

    public ResultSet consulta_obtener(String consulta) {
        try {
            this.conectar();
            ResultSet respuesta = null;
            this.st = this.con.createStatement();
            respuesta = st.executeQuery(consulta);

            return respuesta;

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void desconectar() {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
