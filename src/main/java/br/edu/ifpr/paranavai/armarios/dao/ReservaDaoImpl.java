/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;
import java.util.List;
import org.hibernate.Session;

public class ReservaDaoImpl implements ReservaDao {

    private Session sessao;

    public ReservaDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Reserva> buscarTodos() {
        List<Reserva> reserva = null;
        try {
            sessao.beginTransaction();
            reserva = (List<Reserva>) this.sessao.createQuery("from Reserva").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }
    
    @Override
    public Reserva buscarPorId(Integer id) {
        Reserva reserva = null;
        try {
            sessao.beginTransaction();
            reserva = (Reserva) sessao.get(Reserva.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }

    @Override
    public void inserir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.persist(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.update(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.delete(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}