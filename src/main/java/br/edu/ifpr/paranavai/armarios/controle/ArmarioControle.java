/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.servico.ArmarioServico;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ArmarioControle {
    public static List<Armario> listarTodasArmario(){
        return ArmarioServico.buscarTodos();
    }
    public static Armario inserir(Armario armario) {
        return ArmarioServico.inserir(armario);
    }

    public static Armario buscarPorId(int codigo) {
        return ArmarioServico.buscarPorId(codigo);
    }
    public static Armario atualizar(Armario armario) {
        return ArmarioServico.atualizar(armario);
    }
    
    public static void excluir (Armario armario) {
        ArmarioServico.excluir(armario);
    }
}
