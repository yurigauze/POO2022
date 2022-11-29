/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.teste.servico;  

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;

public class ServicoTeste {

    public static void main(String[] args) {
        Localizacao local = new Localizacao("Biblioteca");
        LocalizacaoServico.inserir(local);
    }
}
