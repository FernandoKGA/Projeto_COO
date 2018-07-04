/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

import bancodados.Log;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.*;
import objetos.*;

/**
 *
 * @author Denise
 */
public class DesmarcarReserva extends javax.swing.JPanel {

    private final Background back;
    private final DialogConfExcResv dialog;
    
    /**
     * Creates new form DesmarcarReserva
     * @param back
     */
    public DesmarcarReserva(Background back) {
        this.back = back;
        this.dialog = new DialogConfExcResv(back,true);
        dialog.setPai(this);  //Vazamento???
        initComponents();
    }

    public String getTF_NUSP_DesmResv(){
        return this.TF_NUSP_DesmResv.getText();
    }
    
    public void habilitaTabelaDesmResv(){
        TabelaDesmResv.setEnabled(true);
    }
    
    public void desabilitaTabelaDesmResv(){
        TabelaDesmResv.setEnabled(false);
    }
    
    public void habilitaVisibilidadeTelaDesmResv(){
        this.setVisible(false);
        Component[] array = this.getComponents();
        for (Component array1 : array) {
            array1.setVisible(false);
        }
    }
    
    public void desabilitaVisibilidadeTelaDesmResv(){
        this.setVisible(true);
        Component[] array = this.getComponents();
        for (Component array1 : array) {
            array1.setVisible(true);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNomeTelaDesmResv = new javax.swing.JLabel();
        LabelUsuarioTelaDesmResv = new javax.swing.JLabel();
        TF_NUSP_DesmResv = new javax.swing.JTextField();
        BotaoBusca_DesmResv = new javax.swing.JButton();
        ScrolDesmResv = new javax.swing.JScrollPane();
        TabelaDesmResv = new javax.swing.JTable();
        BotaoGoDiagConfResv = new javax.swing.JButton();
        BotaoRetFromDesmResv = new javax.swing.JButton();

        LabelNomeTelaDesmResv.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaDesmResv.setForeground(new java.awt.Color(250, 0, 0));
        LabelNomeTelaDesmResv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaDesmResv.setText("DESMARCAR RESERVA");

        LabelUsuarioTelaDesmResv.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        LabelUsuarioTelaDesmResv.setText("Usuário:");

        TF_NUSP_DesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NUSP_DesmResvActionPerformed(evt);
            }
        });

        BotaoBusca_DesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoBusca_DesmResv.setText("Buscar");
        BotaoBusca_DesmResv.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoBusca_DesmResv.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoBusca_DesmResv.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoBusca_DesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBusca_DesmResvActionPerformed(evt);
            }
        });

        TabelaDesmResv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Predio", "Tipo", "Nome", "Horário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDesmResv.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        ScrolDesmResv.setViewportView(TabelaDesmResv);

        BotaoGoDiagConfResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoDiagConfResv.setText("Desmarcar");
        BotaoGoDiagConfResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoDiagConfResvActionPerformed(evt);
            }
        });

        BotaoRetFromDesmResv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDesmResv.setText("Voltar");
        BotaoRetFromDesmResv.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDesmResv.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDesmResv.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoRetFromDesmResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDesmResvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaDesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrolDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelUsuarioTelaDesmResv)
                                .addGap(18, 18, 18)
                                .addComponent(TF_NUSP_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(BotaoBusca_DesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoRetFromDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoGoDiagConfResv)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LabelNomeTelaDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuarioTelaDesmResv)
                    .addComponent(TF_NUSP_DesmResv)
                    .addComponent(BotaoBusca_DesmResv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ScrolDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoGoDiagConfResv)
                    .addComponent(BotaoRetFromDesmResv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TF_NUSP_DesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NUSP_DesmResvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NUSP_DesmResvActionPerformed

    private void BotaoBusca_DesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBusca_DesmResvActionPerformed
        // Botao Buscar Reservas do Usuario para excluir
        List<Reserva> listaReservas = null;
        try {
            RegrasNegocio r = new RegrasNegocio();
            //NAO USAR .getSelectedText()!!!!!!!
            String numeroUSP = TF_NUSP_DesmResv.getText();
            if (back.verificaNUSP(numeroUSP)) {
                listaReservas = r.listaReservasDoUsuario(numeroUSP);
                DefaultTableModel model = (DefaultTableModel) TabelaDesmResv.getModel();
                int last_col = TabelaDesmResv.getColumnCount() - 1;
                //Dá espaco para os horarios aparecerem corretamente e nao precisarem ser editados
                TabelaDesmResv.getColumnModel().getColumn(last_col).setPreferredWidth(90);
                //equivalente a clearTable();
                model.setNumRows(0);
                for (Reserva res : listaReservas) {
                    String horarios = res.getHoraInicio() + " - " + res.getHoraFim();
                    Recurso rec = res.getRecurso();
                    model.addRow(new Object[]{res.getData(), rec.getPredio(), rec.getTipo(), rec.getNome(), horarios});
                }
            }
            r.atualizaReservas();
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
        }
    }//GEN-LAST:event_BotaoBusca_DesmResvActionPerformed

    private void BotaoGoDiagConfResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGoDiagConfResvActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton14ActionPerformed()");
        if (TabelaDesmResv.getSelectedRow() == (-1)) {
            JOptionPane.showMessageDialog(null, "Selecione uma reserva para "
                + "excluir.");
        } else {
            int row = TabelaDesmResv.getSelectedRow();
            Object data = TabelaDesmResv.getValueAt(row, 0);
            String data_show = (String) data;
            Object predio = TabelaDesmResv.getValueAt(row, 1);
            String predio_show = (String) predio;
            Object tipo = TabelaDesmResv.getValueAt(row, 2);
            String tipo_show = (String) tipo;
            Object recurso = TabelaDesmResv.getValueAt(row, 3);
            String recurso_show = (String) recurso;
            Object hora = TabelaDesmResv.getValueAt(row, 4);
            String hora_show = (String) hora;

            //Insercao na Dialog
            dialog.setLabelData_BDDiagConfDesmResv(data_show);
            dialog.setLabelPredio_BDDiagConfDesmResv(predio_show);
            dialog.setLabelTipo_BDDiagConfDesmResv(tipo_show);
            dialog.setLabelRec_BDDiagConfDesmResv(recurso_show);
            dialog.setLabelHora_BDDiagConfDesmResv(hora_show);

            TabelaDesmResv.setEnabled(false);
            dialog.habilitaVisibilidadeDialogConfExcResv();
        }
    }//GEN-LAST:event_BotaoGoDiagConfResvActionPerformed

    private void BotaoRetFromDesmResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDesmResvActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaDesmarcarReserva");
        back.habilitaTelaDescadastrarSelecao();
        back.desabilitaTelaDesmarcarReserva();
    }//GEN-LAST:event_BotaoRetFromDesmResvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBusca_DesmResv;
    private javax.swing.JButton BotaoGoDiagConfResv;
    private javax.swing.JButton BotaoRetFromDesmResv;
    private javax.swing.JLabel LabelNomeTelaDesmResv;
    private javax.swing.JLabel LabelUsuarioTelaDesmResv;
    private javax.swing.JScrollPane ScrolDesmResv;
    private javax.swing.JTextField TF_NUSP_DesmResv;
    private javax.swing.JTable TabelaDesmResv;
    // End of variables declaration//GEN-END:variables
}
