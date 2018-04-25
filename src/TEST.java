
import Persistecia.Conexion;
import Persistecia.verusuario;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        String sql="SELECT * FROM Usuarios Where Nombre='juan';";
       verusuario obj = new verusuario();
       int consulta= obj.Consultarusuario(sql);
       System.out.println(""+consulta);
       
      
    }
    
}
