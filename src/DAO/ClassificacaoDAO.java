
package DAO;

import Modelo.Classificacao;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;


public class ClassificacaoDAO extends ExecuteSQL {

    public ClassificacaoDAO(Connection con) {
        super(con);
    }

    
     public void ListarPrecoClassificacao () {
        System.out.println("suahusahshs");
    
    
    public String Inserir_Cliente(Cliente a) {
        String sql = "insert into cliente values (0,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1,a.getNome());
            ps.setString(2,a.getNascimento());
            ps.setString(3,a.getRG ());
            ps.setString(4,a.getCPF());
            ps.setString(5,a.getEmail());
            ps.setString(6,a.getTelefone());
            ps.setString(7,a.getBairro());
            ps.setString(8,a.getRua());
            ps.setInt (9, a.getNumero());
            ps.setString(10,a.getCEP());
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com  sucesso.";
            }
      

        }

    public List<Classificacao> ListarComboClassificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Excluir_Classificacao(Classificacao a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Classificacao> ConsultaCodigoClassificacao(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
