/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.LinkedList;
import objetos.Laboratorio;
import objetos.Recurso;

/**
 *
 * @author Lucas
 */
public interface recursoDAO {
    public void insere(Recurso recurso) throws Banco_de_DadosException;
    //Variação de Recurso - Laboratório
    public void insereLab(Laboratorio laboratorio) throws Banco_de_DadosException;
    public Recurso busca(String nome, String predio, String tipo) throws Banco_de_DadosException;
    public Recurso buscaPorID(int idRecurso) throws Banco_de_DadosException;
    public LinkedList<Recurso> listaTodos() throws Banco_de_DadosException;
    public LinkedList<Recurso> lista(String predio, String tipo) throws Banco_de_DadosException;
    public void excluir(Recurso recurso) throws Banco_de_DadosException;
}