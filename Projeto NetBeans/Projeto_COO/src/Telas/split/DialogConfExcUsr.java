/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

import java.awt.Component;
import javax.swing.JOptionPane;
import negocio.*;
import objetos.*;
import bancodados.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author ferna
 */
public class DialogConfExcUsr extends javax.swing.JDialog {
    
    private DescadastrarUsuario pai;
    
    /**
     * Creates new form DialogConfExcUsr
     * @param parent
     * @param modal
     */
    public DialogConfExcUsr(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void setPai(DescadastrarUsuario pai){
        this.pai = pai;
    }
    
    public void habilitaVisibilidadeDialogConfExcUsr(){
        this.setVisible(true);
    }
    
    public void desabilitaVisibilidadeDialogConfExcUsr(){
        this.setVisible(false);
    }
    
    public void setLabelNome_BDDiagConfExcUsr(String nome){
        LabelNome_BDDiagConfExcUsr.setText(nome);
    }
    
    public void setLabelEmail_BDDiagConfExcUsr(String email){
        LabelEmail_BDDiagConfExcUsr.setText(email);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoDescUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDescUsrActionPerformed
        // TODO add your handling code here:
        Object valor_nUSP = pai.getValueTabelaRowSelecionada();
        String nUSP = (String) valor_nUSP;
        try {
            RegrasNegocio r = new RegrasNegocio();
            r.excluirUsuario(nUSP);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            desabilitaVisibilidadeDialogConfExcUsr();
        } catch (RegrasNegocioException ex) {
            Log.gravaLog(ex);
            try {
                RegrasNegocio r = new RegrasNegocio();
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
        desabilitaVisibilidadeDialogConfExcUsr();
    }//GEN-LAST:event_BotaoRetFromDiagConfExcUsrActionPerformed

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
            java.util.logging.Logger.getLogger(DialogConfExcUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogConfExcUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogConfExcUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogConfExcUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogConfExcUsr dialog = new DialogConfExcUsr(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDescUsr;
    private javax.swing.JButton BotaoRetFromDiagConfExcUsr;
    private javax.swing.JDialog DialogConfExcUsr;
    private javax.swing.JLabel LabelDiagConfExcUsr;
    private javax.swing.JLabel LabelEmailDiagConfExcUsr;
    private javax.swing.JLabel LabelEmail_BDDiagConfExcUsr;
    private javax.swing.JLabel LabelNomeDiagConfExcUsr;
    private javax.swing.JLabel LabelNome_BDDiagConfExcUsr;
    private javax.swing.JLabel LabelSubDiagConfExcUsr;
    // End of variables declaration//GEN-END:variables
}
