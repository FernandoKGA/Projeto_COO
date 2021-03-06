/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.List;
import objetos.Predio;
import objetos.Recurso;
import objetos.Tipo;

/**
 *
 * @author Lucas
 */
public interface RecursoDAO {
    public void insere(Recurso recurso) throws Banco_de_DadosException;
    //Variação de Recurso - Laboratório
    public void insereLab(Recurso r) throws Banco_de_DadosException;
    public Recurso busca(String nome, Predio predio, Tipo tipo) throws Banco_de_DadosException;
    public Recurso buscaPorID(int idRecurso) throws Banco_de_DadosException;
    public List<Recurso> listaTodos() throws Banco_de_DadosException;
    public List<Recurso> lista(Predio predio, Tipo tipo) throws Banco_de_DadosException;
    public void excluir(Recurso recurso) throws Banco_de_DadosException;
}
