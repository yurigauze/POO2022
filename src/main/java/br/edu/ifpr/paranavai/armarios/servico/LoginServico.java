/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.visao.TelaInicial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**        
 * 
 * 
 *
 * @author Aluno
 */
public class LoginServico {
    
    

    public static String verifica(String email, String senha){
       if (email.equals("admin@admin.com" ) || email.equals("admin")){
           if (senha.equals("12345")|| email.equals("admin")){
                return "Sucesso no login!";
           }
           return "Senha inválida!";
       }
       return "E-mail inválido!";         
    }
    
}
