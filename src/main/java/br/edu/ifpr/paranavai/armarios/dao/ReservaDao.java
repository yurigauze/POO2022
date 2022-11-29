/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;

public interface ReservaDao {
    public List<Reserva> buscarTodos();
    public Reserva buscarPorId(Integer id);
    public void inserir(Reserva localizacao);
    public void atualizar(Reserva localizacao);
    public void excluir(Reserva localizacao);
}