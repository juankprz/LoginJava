/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistecia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class verusuario {
    Conexion obj = new Conexion();

  public int Consultarusuario( String sql) {
        int consulta = 0;
        try {
            Statement instancia =obj.conectar().createStatement();
             ResultSet rs = instancia.executeQuery(sql);
           
            while(rs.next()){
            consulta=1;
            }
          //c¿ierra conexion
          obj.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 
       return consulta;
}   
   public int Consultarpass( String sqll, String pass) {
        String contra = null;
        int acceso=0;
        try {
            Statement instancia =obj.conectar().createStatement();
             ResultSet rs = instancia.executeQuery(sqll);
           
            while(rs.next()){
             contra=rs.getString("Password");
            }
          //c¿ierra conexion
          if(contra.equals(pass)){
              acceso=1;
          }
          obj.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 
       return acceso;
}   
}
