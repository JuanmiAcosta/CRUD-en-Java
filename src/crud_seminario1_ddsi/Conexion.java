package crud_seminario1_ddsi;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    //Constructor por defecto
    private Conexion(){}
    
    //Creamos variable para guardar el estado de la conexion con BD
    private static Connection conexion;
    
    //Una variable para crear una sola instancia (Singleotn)
    private static Conexion instancia;
    
    //Identificador de conexión
    private int id=0;
    
    //Variables para conectarnos a la BD
    private static final String URL="jdbc:oracle:thin:@//oracle0.ugr.es:1521/practbd.oracle0.ugr.es"; 
    private static final String USERNAME="x4313742"; //x y los siguientes dígitos de tu DNI, la password igual
    private static final String PASSWORD="x4313742"; 
    
    public Connection conectar(){ // Método de conexión a la BD
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            JOptionPane.showMessageDialog(null, "Establecida conexión con BD. Nº de conexión: " + id);
            conexion = DriverManager.getConnection(URL,USERNAME,PASSWORD    );
            id++;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la BD  : " + e);
        }
        return conexion;
    }
    
    public void cierreConexion() throws SQLException{ // Método para cerrar la conexión      
        try{
            JOptionPane.showMessageDialog(null, "Cerrada conexión con BD. Nº de conexión: " + id);
            conexion.close();
            id--;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión con la BD  : " + e);
            conexion.close();
        }finally{
            conexion.close(); // En caso de fallo catastrófico
        }
    }
    
    //Patron Singleton
    public static Conexion getInstance(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
