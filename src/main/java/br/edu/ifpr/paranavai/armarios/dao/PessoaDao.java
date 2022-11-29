/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Pessoa;

public interface PessoaDao {
    public List<Pessoa> buscarTodos();
    public Pessoa buscarPorId(Integer id);
    public void inserir(Pessoa localizacao);
    public void atualizar(Pessoa localizacao);
    public void excluir(Pessoa localizacao);
}