package DAO;
        
import Modelo.Funcionario;
import java.sql.*;
import java.util.List;

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
        a.Senha(rs.getString(2));
        FinalResulte = true;
            }
        }
     }catch (SQLException ex) {
        ex.getMessage();
     }
     return FinalResulte;
 }   

    public boolean Logar(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean Testar_Funcionario(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Alterar_Funcionario(Funcionario a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Funcionario> CapturarFuncionario(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}