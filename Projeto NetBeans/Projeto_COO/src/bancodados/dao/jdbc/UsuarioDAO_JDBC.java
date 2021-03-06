/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.Log;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import objetos.Usuario;
import bancodados.dao.UsuarioDAO;
import objetos.Curso;

/**
 *
 * @author Lucas
 */
public class UsuarioDAO_JDBC extends ConectorDAO_JDBC implements UsuarioDAO {

    public UsuarioDAO_JDBC() throws Banco_de_DadosException {
        super();
    }

    @Override
    public void insere(Usuario usuario) throws Banco_de_DadosException {
        abreConexao();
        try {
            String nome = usuario.getNome();
            System.out.println(nome);
            Usuario u = busca(usuario.getNUSP());
            if (u == null) {
                preparaComandoSQL("insert into USUARIO(NOME, NUSP, EMAIL, TELEFONE, CARGO, CURSO) values (?, ?, ?, ?, ?, ?)");
                pstmt.setString(1, usuario.getNome());
                pstmt.setString(2, usuario.getNUSP());
                pstmt.setString(3, usuario.getEmail());
                pstmt.setString(4, usuario.getTelefone());
                pstmt.setString(5, usuario.getCargo());
                pstmt.setString(6, usuario.getCurso().getNome());
                pstmt.execute();
            } else {
                JOptionPane.showMessageDialog(null, "Esse Número USP já foi cadastrado!");
                return;
            }
            //comentario
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();
    }

    @Override
    public Usuario busca(String numeroUSP) throws Banco_de_DadosException {

        Usuario usuario = null;
        try {
            abreConexao();
            preparaComandoSQL("SELECT * FROM USUARIO WHERE NUSP=?");
            pstmt.setString(1, numeroUSP);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                //baseado na ordem do SQL

                int id_usuario = rs.getInt(1);
                String nome = rs.getString(2);
                String nusp = rs.getString(3);
                String email = rs.getString(4);
                String cargo = rs.getString(5);
                String curso_name = rs.getString(6);
                Curso curso = new Curso(curso_name);
                String telefone = rs.getString(7);
                usuario = new Usuario();
                usuario.setCargo(cargo);
                usuario.setId_Usuario(id_usuario);
                System.out.println("ID USUARIO: " + id_usuario);
                usuario.setNUSP(nusp);
                usuario.setNome(nome);
                usuario.setCurso(curso);
                usuario.setEmail(email);
                usuario.setTelefone(telefone);

                return usuario;
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas ao ler o resultado da consulta.");
        }

        fechaConexao();
        return usuario;
    }

    @Override
    public LinkedList<Usuario> lista() throws Banco_de_DadosException {
        
        LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
        preparaComandoSQL("select * from USUARIO");

        try {
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String NUSP = rs.getString(2);
                String nome = rs.getString(3);
                String telefone = rs.getString(4);
                String email = rs.getString(5);
                String cargo = rs.getString(6);
                String curso_name = rs.getString(7);
                Curso curso = new Curso(curso_name);
                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setNUSP(NUSP);
                usuario.setTelefone(telefone);
                usuario.setEmail(email);
                usuario.setCargo(cargo);
                usuario.setCurso(curso);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas ao ler o resultado da consulta.");
        }
        fechaConexao();
        return usuarios;
    }

    @Override
    public void excluir(String nUSP) throws Banco_de_DadosException {
        String query = String.format("DELETE FROM USUARIO WHERE "
                + "NUSP = '%s' ", nUSP);
        try {
            preparaComandoSQL(query);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmetros da consulta.");
        }
    }

    @Override
    public boolean verificaQuantCoordenador(Curso curso) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("SELECT COUNT(nome) FROM USUARIO WHERE CURSO=? AND CARGO="
                    + "'COORDENADOR'");
            pstmt.setString(1, curso.getNome());
            rs = pstmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int quantidade = rs.getInt(1);
                    if (quantidade >= 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException();
        }
    }

}
