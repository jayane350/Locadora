package DAO;


 import java.sql.*;
 import javax.swing.JOptionPane;

public class Conexao {
    
   public static Connection AbrirConexao() {
      Connection con = null;
       try {
          Class.forName ("com.msql.jbdc.Drive");
          String url = "jdbc:msql://localhost/Locadora";
          con = DriverManager.getConnection (url, "root", "");     
       
       } catch (Exception e) {
           JOptionPane.showMessageDialog (null, "Erro na conexão com o Banco",
                   "Video Locadora", JOptionPane.ERROR_MESSAGE);
      e.getMessage();
       }
       return con;
       
   } 

   public static void FecharConexão(Connection con) {
       try {
            con.close();
            
   } catch (Exception e) {
         System.out.println(e.getMessage());
}
   }
}
