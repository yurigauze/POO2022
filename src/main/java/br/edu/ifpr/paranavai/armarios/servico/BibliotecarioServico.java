/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.BibliotecarioDao;
import br.edu.ifpr.paranavai.armarios.dao.BibliotecarioDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;

/**
 *
 * @author yuri_
 */
public class BibliotecarioServico {
    private static BibliotecarioDao dao = new BibliotecarioDaoImpl();

    public static List<Bibliotecario> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Bibliotecario buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static Bibliotecario inserir(Bibliotecario bibliotecario) {
        return dao.inserir(bibliotecario);
    }

    public static Bibliotecario atualizar(Bibliotecario bibliotecario) {
        return dao.atualizar(bibliotecario);
    }

    public static void excluir(Bibliotecario bibliotecario) {
        dao.excluir(bibliotecario);
    }
    
}
