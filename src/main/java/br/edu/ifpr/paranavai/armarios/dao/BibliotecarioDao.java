/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;

public interface BibliotecarioDao {
    public List<Bibliotecario> buscarTodos();
    public Bibliotecario buscarPorId(Integer id);
    public Bibliotecario inserir(Bibliotecario localizacao);
    public Bibliotecario atualizar(Bibliotecario localizacao);
    public void excluir(Bibliotecario localizacao);
}
