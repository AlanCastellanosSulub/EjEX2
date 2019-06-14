package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Operaciones {

    Connection connection;

    public Operaciones(Connection conn){
        this.connection = conn;
    }

    public Cliente getCliente(int id){
        int clienteId = 0;
        String nombre = "", apellidos = "", direccion = "";

        String query = "SELECT clienteid, nombre, apellidos, direccion " +
                "FROM cliente " +
                "WHERE clienteID = " + id;

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                clienteId = rs.getInt("clienteid");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                direccion = rs.getString("direccion");
            }

            //System.out.println(clienteId + ", " + nombre + " " + apellidos + ", " + direccion);

            return new Cliente(clienteId, nombre, apellidos, direccion);
        }
        catch (java.sql.SQLException ex){
            ex.printStackTrace();
            System.out.println("SQLException:â�£" + ex.getMessage());
            System.out.println("SQLState:â�£" + ex.getSQLState());
            System.out.println("VendorError:â�£" + ex.getErrorCode());

            return null;
        }
    }

    public int deleteCliente(int id){
        int clienteId;
        String nombre, apellidos, direccion;

        String query = "delete from cliente where clienteID = " + id;

        int numRegs = 0;
        try {
            Statement stmt = connection.createStatement();
            numRegs = stmt.executeUpdate(query);

            System.out.println("Cantidad de registros afectados: " + numRegs);
        }
        catch (java.sql.SQLException ex){
            ex.printStackTrace();
            System.out.println("SQLException:␣" + ex.getMessage());
            System.out.println("SQLState:␣" + ex.getSQLState());
            System.out.println("VendorError:␣" + ex.getErrorCode());
        }

        return numRegs;
    }

    public int insertCliente(String nombre, String apellidos, String direccion){

        String query = "insert into cliente(nombre, apellidos, direccion) " +
                "values ('" + nombre + "', '" + apellidos + "', '" + direccion + "')";

      /*  insert into cliente(nombre, apellidos, direccion
                values ('Jorge', 'Estrada', 'Lázaro Cárdenas 123')  */

        int numRegs = 0;
        try {
            Statement stmt = connection.createStatement();
            numRegs = stmt.executeUpdate(query);

            System.out.println("Cantidad de registros afectados: " + numRegs);

        }
        catch (java.sql.SQLException ex){
            ex.printStackTrace();
            System.out.println("SQLException:␣" + ex.getMessage());
            System.out.println("SQLState:␣" + ex.getSQLState());
            System.out.println("VendorError:␣" + ex.getErrorCode());
        }

        return numRegs;
    }
    public int modificarClienteNom(int id,String nombre){

        String query = "update cliente set nombre='" + nombre + "' where clienteID = " + id;

      /*  insert into cliente(nombre, apellidos, direccion
                values ('Jorge', 'Estrada', 'Lázaro Cárdenas 123')  */

        int numRegs = 0;
        try {
            Statement stmt = connection.createStatement();
            numRegs = stmt.executeUpdate(query);

            System.out.println("Cantidad de registros afectados: " + numRegs);

        }
        catch (java.sql.SQLException ex){
            ex.printStackTrace();
            System.out.println("SQLException:␣" + ex.getMessage());
            System.out.println("SQLState:␣" + ex.getSQLState());
            System.out.println("VendorError:␣" + ex.getErrorCode());
        }

        return numRegs;
    }
    public int modificarClienteAll(int id,String nombre,String apellidos,String direccion){

        String query = "update cliente set nombre='" + nombre +
        		"' , apellidos='" + apellidos +
        		"' , direccion='" + direccion +
        		"' where clienteID = " + id;

      /*  insert into cliente(nombre, apellidos, direccion
                values ('Jorge', 'Estrada', 'Lázaro Cárdenas 123')  */

        int numRegs = 0;
        try {
            Statement stmt = connection.createStatement();
            numRegs = stmt.executeUpdate(query);

            System.out.println("Cantidad de registros afectados: " + numRegs);

        }
        catch (java.sql.SQLException ex){
            ex.printStackTrace();
            System.out.println("SQLException:␣" + ex.getMessage());
            System.out.println("SQLState:␣" + ex.getSQLState());
            System.out.println("VendorError:␣" + ex.getErrorCode());
        }

        return numRegs;
    }
    public int modificarClienteDi(int id,String direccion){

        String query = "update cliente set direccion='" + direccion + "' where clienteID = " + id;

      /*  insert into cliente(nombre, apellidos, direccion
                values ('Jorge', 'Estrada', 'Lázaro Cárdenas 123')  */

        int numRegs = 0;
        try {
            Statement stmt = connection.createStatement();
            numRegs = stmt.executeUpdate(query);

            System.out.println("Cantidad de registros afectados: " + numRegs);

        }
        catch (java.sql.SQLException ex){
            ex.printStackTrace();
            System.out.println("SQLException:␣" + ex.getMessage());
            System.out.println("SQLState:␣" + ex.getSQLState());
            System.out.println("VendorError:␣" + ex.getErrorCode());
        }

        return numRegs;
    }
    public int modificarClienteApe(int id,String apellidos){

        String query = "update cliente set apellidos='" + apellidos + "' where clienteID = " + id;

      /*  insert into cliente(nombre, apellidos, direccion
                values ('Jorge', 'Estrada', 'Lázaro Cárdenas 123')  */

        int numRegs = 0;
        try {
            Statement stmt = connection.createStatement();
            numRegs = stmt.executeUpdate(query);

            System.out.println("Cantidad de registros afectados: " + numRegs);

        }
        catch (java.sql.SQLException ex){
            ex.printStackTrace();
            System.out.println("SQLException:␣" + ex.getMessage());
            System.out.println("SQLState:␣" + ex.getSQLState());
            System.out.println("VendorError:␣" + ex.getErrorCode());
        }

        return numRegs;
    }

}
