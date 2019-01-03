/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

import bancodados.Log;
import java.awt.Component;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import negocio.*;
import objetos.*;


/**
 *
 * @author Denise
 */
public class DescadastrarUsuario extends AbstractJPanel {

    private final Background back;
    
    
    /**
     * Creates new form RemoverUsuario
     * @param back
     */
    public DescadastrarUsuario(Background back) {
        this.back = back;
        initComponents();
    }
    
    private void listaUsuario(JTable tb) {
        try {
            List<Usuario> lista = r.listaUsuarios();
            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            //equivalente a clearTable();
            model.setNumRows(0);
            tb.setRowSorter(new TableRowSorter(model));
            int col_size = tb.getColumnCount();
            tb.getColumnModel().getColumn(0).setPreferredWidth(75);
            tb.getColumnModel().getColumn(col_size - 2).setPreferredWidth(48);
            for (Usuario usu : lista) {
                model.addRow(new Object[]{usu.getNome(), usu.getNUSP(), usu.getTelefone(),
                    usu.getEmail(), usu.getCargo(), usu.getCurso()});
            }
        } catch (RegrasNegocioException ex) {
            Log.gravaLog(ex);
        }
    }
    
    @Override
    public void habilitaVisibilidade(){
        this.setVisible(true);
        Component[] array = this.getComponents();
        listaUsuario(TabelaRemUsr);
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }
    
    public Object getValueTabelaRowSelecionada(){
        return TabelaRemUsr.getValueAt(TabelaRemUsr.getSelectedRow(), 0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogConfExcUsr = new javax.swing.JDialog();
        LabelDiagConfExcUsr = new javax.swing.JLabel();
        LabelSubDiagConfExcUsr = new javax.swing.JLabel();
        LabelNomeDiagConfExcUsr = new javax.swing.JLabel();
        LabelNome_BDDiagConfExcUsr = new javax.swing.JLabel();
        LabelEmailDiagConfExcUsr = new javax.swing.JLabel();
        LabelEmail_BDDiagConfExcUsr = new javax.swing.JLabel();
        BotaoDescUsr = new javax.swing.JButton();
        BotaoRetFromDiagConfExcUsr = new javax.swing.JButton();
        LabelSubTelaRemUsr = new javax.swing.JLabel();
        LabelNomeTelaRemUsr = new javax.swing.JLabel();
        BotaoRetFromRemUsr = new javax.swing.JButton();
        BotaoGoDiagConfUsr = new javax.swing.JButton();
        ScrolRemUsr = new javax.swing.JScrollPane();
        TabelaRemUsr = new javax.swing.JTable();
        BotaoListUsrRemUsr = new javax.swing.JButton();

        DialogConfExcUsr.setTitle("Confirmação");
        DialogConfExcUsr.setMinimumSize(new java.awt.Dimension(250, 250));

        LabelDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelDiagConfExcUsr.setForeground(new java.awt.Color(255, 0, 0));
        LabelDiagConfExcUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDiagConfExcUsr.setText("Confirmar Ação");

        LabelSubDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelSubDiagConfExcUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubDiagConfExcUsr.setText("Deseja excluir o usuário?");

        LabelNomeDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelNomeDiagConfExcUsr.setText("Nome:");

        LabelNome_BDDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNome_BDDiagConfExcUsr.setText("Teste da Silva");

        LabelEmailDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelEmailDiagConfExcUsr.setText("E-mail:");

        LabelEmail_BDDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelEmail_BDDiagConfExcUsr.setText("teste.silva@email.com");

        BotaoDescUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoDescUsr.setText("Confirmar");
        BotaoDescUsr.setActionCommand("Sim");
        BotaoDescUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDescUsrActionPerformed(evt);
            }
        });

        BotaoRetFromDiagConfExcUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDiagConfExcUsr.setText("Cancelar");
        BotaoRetFromDiagConfExcUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDiagConfExcUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogConfExcUsrLayout = new javax.swing.GroupLayout(DialogConfExcUsr.getContentPane());
        DialogConfExcUsr.getContentPane().setLayout(DialogConfExcUsrLayout);
        DialogConfExcUsrLayout.setHorizontalGroup(
            DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelDiagConfExcUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubDiagConfExcUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                        .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEmailDiagConfExcUsr)
                            .addComponent(LabelNomeDiagConfExcUsr, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelEmail_BDDiagConfExcUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelNome_BDDiagConfExcUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                        .addComponent(BotaoRetFromDiagConfExcUsr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoDescUsr)
                        .addContainerGap())))
        );
        DialogConfExcUsrLayout.setVerticalGroup(
            DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogConfExcUsrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDiagConfExcUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubDiagConfExcUsr)
                .addGap(27, 27, 27)
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeDiagConfExcUsr)
                    .addComponent(LabelNome_BDDiagConfExcUsr))
                .addGap(14, 14, 14)
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmailDiagConfExcUsr)
                    .addComponent(LabelEmail_BDDiagConfExcUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(DialogConfExcUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromDiagConfExcUsr)
                    .addComponent(BotaoDescUsr))
                .addGap(23, 23, 23))
        );

        LabelSubTelaRemUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaRemUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaRemUsr.setText("Remoção de Usuário do Sistema Dioniso");

        LabelNomeTelaRemUsr.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaRemUsr.setForeground(new java.awt.Color(255, 0, 0));
        LabelNomeTelaRemUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaRemUsr.setText("EXCLUIR USUÁRIO");
        LabelNomeTelaRemUsr.setToolTipText("");

        BotaoRetFromRemUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromRemUsr.setText("Cancelar");
        BotaoRetFromRemUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromRemUsrActionPerformed(evt);
            }
        });

        BotaoGoDiagConfUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoDiagConfUsr.setText("Excluir");
        BotaoGoDiagConfUsr.setMaximumSize(new java.awt.Dimension(89, 27));
        BotaoGoDiagConfUsr.setMinimumSize(new java.awt.Dimension(89, 27));
        BotaoGoDiagConfUsr.setPreferredSize(new java.awt.Dimension(89, 27));
        BotaoGoDiagConfUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoDiagConfUsrActionPerformed(evt);
            }
        });

        TabelaRemUsr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nUSP", "Nome", "E-mail", "Cargo", "Curso", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolRemUsr.setViewportView(TabelaRemUsr);

        BotaoListUsrRemUsr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoListUsrRemUsr.setText("Listar");
        BotaoListUsrRemUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListUsrRemUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaRemUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotaoRetFromRemUsr)
                        .addGap(71, 71, 71)
                        .addComponent(BotaoListUsrRemUsr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoGoDiagConfUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrolRemUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(LabelSubTelaRemUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelNomeTelaRemUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaRemUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScrolRemUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromRemUsr)
                    .addComponent(BotaoGoDiagConfUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoListUsrRemUsr))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoRetFromRemUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromRemUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaRemoverUsuario");
        back.habilitaTelaDescadastrarSelecao();
        back.desabilitaTelaDescadastrarUsuario();
    }//GEN-LAST:event_BotaoRetFromRemUsrActionPerformed

    private void BotaoGoDiagConfUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGoDiagConfUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton20ActionPerformed()");
        if (TabelaRemUsr.getSelectedRow() == (-1)) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário para excluir.");
        } else {
            DialogConfExcUsr.setVisible(true);
            System.out.println(TabelaRemUsr.getSelectedRow());
            Object coluna_nome = TabelaRemUsr.getValueAt(TabelaRemUsr.getSelectedRow(), 1);
            String nome = (String) coluna_nome;
            Object coluna_email = TabelaRemUsr.getValueAt(TabelaRemUsr.getSelectedRow(), 2);
            String email = (String) coluna_email;

            LabelNome_BDDiagConfExcUsr.setText(nome);
            LabelEmail_BDDiagConfExcUsr.setText(email);
        }
    }//GEN-LAST:event_BotaoGoDiagConfUsrActionPerformed

    private void BotaoListUsrRemUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListUsrRemUsrActionPerformed
        // TODO add your handling code here:
        listaUsuario(TabelaRemUsr);
    }//GEN-LAST:event_BotaoListUsrRemUsrActionPerformed

    private void BotaoDescUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDescUsrActionPerformed
        // TODO add your handling code here:
        Object valor_nUSP = getValueTabelaRowSelecionada();
        String nUSP = (String) valor_nUSP;
        try {
            r.excluirUsuario(nUSP);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            DialogConfExcUsr.setVisible(false);
        } catch (RegrasNegocioException ex) {
            Log.gravaLog(ex);
            try {
                Usuario usr = r.buscaUsuario(nUSP);
                if (usr == null) {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
            } catch (RegrasNegocioException e) {
                Logger.getLogger(DialogConfExcUsr.class.getName()).log(Level.SEVERE, null, e);
            }
            Logger.getLogger(DialogConfExcUsr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoDescUsrActionPerformed

    private void BotaoRetFromDiagConfExcUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDiagConfExcUsrActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton26ActionPerformed()");
        DialogConfExcUsr.setVisible(false);
    }//GEN-LAST:event_BotaoRetFromDiagConfExcUsrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDescUsr;
    private javax.swing.JButton BotaoGoDiagConfUsr;
    private javax.swing.JButton BotaoListUsrRemUsr;
    private javax.swing.JButton BotaoRetFromDiagConfExcUsr;
    private javax.swing.JButton BotaoRetFromRemUsr;
    private javax.swing.JDialog DialogConfExcUsr;
    private javax.swing.JLabel LabelDiagConfExcUsr;
    private javax.swing.JLabel LabelEmailDiagConfExcUsr;
    private javax.swing.JLabel LabelEmail_BDDiagConfExcUsr;
    private javax.swing.JLabel LabelNomeDiagConfExcUsr;
    private javax.swing.JLabel LabelNomeTelaRemUsr;
    private javax.swing.JLabel LabelNome_BDDiagConfExcUsr;
    private javax.swing.JLabel LabelSubDiagConfExcUsr;
    private javax.swing.JLabel LabelSubTelaRemUsr;
    private javax.swing.JScrollPane ScrolRemUsr;
    private javax.swing.JTable TabelaRemUsr;
    // End of variables declaration//GEN-END:variables
}
