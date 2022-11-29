/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;
import org.hibernate.Session;

public class BibliotecarioDaoImpl implements BibliotecarioDao {

    private Session sessao;

    public BibliotecarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Bibliotecario> buscarTodos() {
        List<Bibliotecario> bibliotecario = null;
        try {
            sessao.beginTransaction();
            bibliotecario = (List<Bibliotecario>) this.sessao.createQuery("from Bibliotecario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecario;
    }
    
    @Override
    public Bibliotecario buscarPorId(Integer id) {
        Bibliotecario bibliotecario = null;
        try {
            sessao.beginTransaction();
            bibliotecario = (Bibliotecario) sessao.get(Bibliotecario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecario;
    }

    @Override
    public Bibliotecario inserir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.persist(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecario;
    }

    @Override
    public Bibliotecario atualizar(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.update(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecario;
    }

    @Override
    public void excluir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.delete(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   