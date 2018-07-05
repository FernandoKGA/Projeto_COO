/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.Log;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import objetos.Laboratorio;
import objetos.Recurso;
import bancodados.dao.RecursoDAO;

/**
 *
 * @author ferna
 */
public class RecursoDAO_JDBC extends ConectorDAO_JDBC implements RecursoDAO{

    public RecursoDAO_JDBC() throws Banco_de_DadosException{
        super();
    }
    
    @Override
    public void insere(Recurso recurso) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("insert into RECURSO (NOME, PREDIO, TIPO) values (?, ?, ?)");

        try {
            pstmt.setString(1, recurso.getNome());
            pstmt.setString(2, recurso.getPredio());
            pstmt.setString(3, recurso.getTipo());
            pstmt.execute();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();    
    }

    @Override
    public void insereLab(Laboratorio l) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("insert into Recurso (nome, predio, tipo, curso) values (?, ?, ?, ?)");

            pstmt.setString(1, l.getNome());
            pstmt.setString(2, l.getPredio());
            pstmt.setString(3, l.getTipo()); //que obviamente vai ser LABORATORIO
            System.out.println(l.getCurso());
            pstmt.setString(4, l.getCurso());
            pstmt.execute();
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();
    }


    @Override
    public Recurso busca(String nome, String predio, String tipo) throws Banco_de_DadosException {
    Recurso r = null;
        try {
            preparaComandoSQL("SELECT IDRECURSO FROM RECURSO "
                    + "WHERE NOME=? AND PREDIO=? AND TIPO=?");
            pstmt.setString(1, nome);
            pstmt.setString(2, predio);
            pstmt.setString(3, tipo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String idrecurso = rs.getString(1);
                r = new Recurso();
                r.setNome(nome);
                r.setPredio(predio);
                r.setTipo(tipo);
                r.setId_Recurso(idrecurso);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return r;
    }

    @Override
    public Recurso buscaPorID(int idRecurso) throws Banco_de_DadosException {
     Recurso r = null;
        try {
            preparaComandoSQL("SELECT NOME,PREDIO,TIPO FROM RECURSO WHERE IDRECURSO=?");
            pstmt.setInt(1, idRecurso);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1);
                String predio = rs.getString(2);
                String tipo = rs.getString(3);
                r = new Recurso();
                r.setNome(nome);
                r.setPredio(predio);
                r.setTipo(tipo);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return r;
    }

    @Override
    public List<Recurso> listaTodos() throws Banco_de_DadosException {
    List<Recurso> recursos = new ArrayList<>();
        try {
            abreConexao();
            preparaComandoSQL("SELECT * FROM RECURSO");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String recNome = rs.getString(2); //nome
                String recPredio = rs.getString(3); //predio
                String recTipo = rs.getString(4);  //tipo
                Recurso r = new Recurso();
                r.setNome(recNome);
                r.setPredio(recPredio);
                r.setTipo(recTipo);
                recursos.add(r);
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return recursos;    
    }

    @Override
    public List<Recurso> lista(String predio, String tipo) throws Banco_de_DadosException {
        List<Recurso> recursos = new LinkedList<>();
        try {
            preparaComandoSQL("SELECT NOME,IDRECURSO FROM RECURSO WHERE PREDIO = ? AND TIPO = ?");
            System.out.println(predio);
            pstmt.setString(1, predio);
            pstmt.setString(2, tipo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1); //nome
                String idrecurso = rs.getString(2); //idrecurso
                Recurso r = new Recurso();
                r.setNome(nome);
                r.setId_Recurso(idrecurso);
                r.setPredio(predio);
                r.setTipo(tipo);
                recursos.add(r);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return recursos;   
    }

    @Override
    public void excluir(Recurso recurso) throws Banco_de_DadosException {
        preparaComandoSQL("DELETE FROM  RECURSO WHERE NOME=? AND PREDIO=? AND TIPO=?");
        try {
            pstmt.setString(1, recurso.getNome());
            pstmt.setString(2, recurso.getPredio());
            pstmt.setString(3, recurso.getTipo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");    }
    }
}