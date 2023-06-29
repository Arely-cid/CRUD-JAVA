
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class conexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tbc_69","root","");
            
            
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error Conexion" + e.getMessage());
            
            
        }
        return conectar;
    }
        
    
        
    
    
    
}
