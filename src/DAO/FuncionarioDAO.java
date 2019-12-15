package DAO;
        
import Modelo.Funcionario;
import java.sql.*;

public class FuncionarioDAO extends ExecuteSQL {
    public FuncionarioDAO(Connection con) {
        super (con);
    }
 public boolean logar(String login, String senha){
  boolean FinalResulte = false;
  try {
  String consulta = "select  login, senha  from funcionario where login = '"+login+ " '  and senha = '"+senha+ "' ";
      PreparedStatement ps = getCon().prepareStatement(consulta);
      
  ResultSet rs = ps.executeQuery();
  
    if (rs != null){
    while (rs.next()){
    Funcionario a = new Funcionario();
    a.setLogin(rs.getString(1));
        a.SetSenha(rs.getString(2));
        FinalResulte = true;
            }
        }
     }catch (SQLException ex) {
        ex.getMessage();
     }
     return FinalResulte;
 }   
}