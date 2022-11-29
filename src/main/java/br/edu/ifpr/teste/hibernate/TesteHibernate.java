/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.teste.hibernate;
import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import org.hibernate.Session;

public class TesteHibernate {

    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        Localizacao local = new Localizacao("Biblioteca");
        sessao.save(local);
        sessao.getTransaction().commit();
        HibernateUtil.encerraSession();
    }
}
