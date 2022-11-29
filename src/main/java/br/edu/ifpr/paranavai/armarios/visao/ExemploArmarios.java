/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.conexao.Conexao;
import br.edu.ifpr.paranavai.armarios.controle.ArmarioControle;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ExemploArmarios extends javax.swing.JFrame {
    
    private List<Armario> listaArmario;

    /**
     * Creates new form ExemploArmarios
     */
    public ExemploArmarios() {
        initComponents();
        this.listaArmario = ArmarioControle.listarTodasArmario();
        populaCorreto(this.listaArmario);
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Busca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Adicionar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BUSCAS ARMARIOS");

        Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Busca)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Adicionar)
                        .addGap(45, 45, 45)
                        .addComponent(Alterar)
                        .addGap(26, 26, 26)
                        .addComponent(Excluir)
                        .addGap(18, 18, 18)
                        .addComponent(Voltar)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Busca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adicionar)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Voltar))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Numero", "Observação", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Armario> listaAtualizada = new ArrayList<>();
        for (int i = 0; i < this.listaArmario.size(); i++) {
            if (this.listaArmario.get(i).getNumero().contains(Busca.getText())) {
                listaAtualizada.add(this.listaArmario.get(i));
            }
        }
        this.populaCorreto(listaAtualizada);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            int dadosLinha = jTable1.getSelectedRow();
            int codigo = (int) jTable1.getModel().getValueAt(dadosLinha, 0);
            
            for (Armario armario : this.listaArmario) {
                if(armario.getArmarioId() == codigo){
                    // abrir um formulário para alteracao
                    FormularioArmarios form = new FormularioArmarios(armario);
                    form.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
            }
            
            this.listaArmario = ArmarioControle.listarTodasArmario();
            populaCorreto(listaArmario);
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            int dadosLinha = jTable1.getSelectedRow();
            int codigo = (int) jTable1.getModel().getValueAt(dadosLinha, 0);
            
            for (Armario localizacao : this.listaArmario) {
                if(localizacao.getArmarioId() == codigo)
                    ArmarioControle.excluir(localizacao);
            }
            
            this.listaArmario = ArmarioControle.listarTodasArmario();
            populaCorreto(listaArmario);
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscaActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        FormularioArmarios form = new FormularioArmarios();
        form.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_AdicionarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    

    private void populaCorreto(List<Armario> listaArmario) {
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) jTable1.getModel();

        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }

        for (Armario armario : listaArmario) {
            Object[] dadosLinha = new Object[8];
            dadosLinha[0] = armario.getArmarioId();
            dadosLinha[1] = armario.getNumero();
            dadosLinha[2] = armario.getObservacoes();
            dadosLinha[3] = armario.isAtivo();
            
            modeloDeColunasDaTabela.addRow(dadosLinha);
            
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExemploArmarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExemploArmarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExemploArmarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExemploArmarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExemploArmarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton Alterar;
    private javax.swing.JTextField Busca;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}