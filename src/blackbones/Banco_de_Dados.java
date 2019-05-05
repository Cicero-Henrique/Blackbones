package blackbones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Banco_de_Dados 
{

    private Connection connection = null;
    // manipula comandos SQL dinamicos
    private PreparedStatement ps = null;

    public void conectar(String database) 
    {
        String servidor = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "211170";
        try {

            // Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(servidor, usuario, senha);

            if (connection != null) {
                System.out.println("Conexão feita com sucesso!");
            }

        } catch (Exception e) {
            System.out.println("Erro = " + e);
        }
    }

    public void Inserir() 
    {

        String sql = "INSERT INTO cliente(nome, sexo, email, cpf, telefone, endereco) VALUES(?,?,?,?,?,?)";
        String nome = "Cícero";
        String email = "cicero@hotmail.com";
        String telefone = "000";
        String cpf = "0123";
        String endereco = "Tiradentes-Baependi-Minas Gerais";
        String sexo = "M";
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setString(2, sexo);
            stmt.setString(3, email);
            stmt.setString(4, cpf);
            stmt.setString(5, telefone);
            stmt.setString(6, endereco);
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void CadastrarCliente(Cliente c)
    {
        String sql = "INSERT INTO cliente(nome, email, endereco, telefone, indicacao, cpf) VALUES(?,?,?,?,?,?)";

        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getIndicacao());
            stmt.setString(6, c.getCpf());
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        
    }
    
    public void CadastrarConta(Conta c)
    {
        String sql = "INSERT INTO conta(nome, tipo_pagamento, tipo_conta, estado, valor, data_vencimento) VALUES(?,?,?,?,?,?)";
        
        java.sql.Date data = new java.sql.Date(c.getData().getTime());
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(sql);   
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTipo_pagamento());
            stmt.setString(3, c.getTipo_conta());
            stmt.setString(4, c.getStatus());
            stmt.setDouble(5, c.getValor());
            stmt.setDate(6, data);
            stmt.execute(); //executa comando     
            stmt.close();
        } catch (SQLException u) {System.out.println(u);}
    }
//
//    public boolean estaConectado() {
//        if (connection != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void CadastrarUsuario(Usuario user) throws SQLException {
//        String sql;
//        sql = "INSERT INTO usuario (login,senha) VALUES (?,?)";
//
//        try {
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, user.getLogin());
//            ps.setInt(2, user.getSenha());
//            ps.executeUpdate();
//
//            ps = connection.prepareStatement(sql);
//            ps.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println("Erro = " + e);
//        }
//
//    }
//
//    public void FecharBanco() throws SQLException {
//        connection.close();
//    }
//
//    public void EditarLogin(Usuario user) throws SQLException {
//        String sql;
//        sql = "UPDATE usuario SET login = ?, senha = ? WHERE id = ?";
//
//        ps = connection.prepareStatement(sql);
//        ps.setString(1, user.getLogin());
//        ps.setInt(2, user.getSenha());
//        ps.setString(3, user.getCpf());
//
//        ps.executeUpdate();
//
//    }
//
//    public int DeleteUsuario(Usuario user) throws SQLException {
//
//        String sql;
//        sql = "DELETE FROM tabela WHERE cpf = " + user.getCpf();
//
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ps.executeUpdate();
//
//        return 0;
//    }
//
//    public ArrayList<Usuario> LerBanco() throws SQLException {
//        String sql;
//        sql = "select * from usuario order by 1";
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        ArrayList<Usuario> lista_usuarios = new ArrayList<>();
//        Usuario user = new Usuario();
//        while (rs.next()) {
//            user.setId(rs.getInt("id"));
//            user.setLogin(rs.getString("login"));
//            user.setSenha(rs.getInt("senha"));
//            lista_usuarios.add(user);
//
//            System.out.println("Id = " + rs.getInt("id") + "; Nome: " + rs.getString("login") + ";Senha: " + rs.getInt("senha"));
//        }
//
//        rs.close();
//        ps.close();
//
//        return lista_usuarios;
//
//    
}
