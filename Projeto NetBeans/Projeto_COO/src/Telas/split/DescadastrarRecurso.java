/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.split;

import javax.swing.JOptionPane;
import negocio.*;
import objetos.*;
import bancodados.Log;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Denise
 */
public class DescadastrarRecurso extends AbstractJPanel {

    private final Background back;
    private final DefaultComboBoxModel model_tipo;
    private final DefaultComboBoxModel model_predio;
    
    /**
     * Creates new form DescadastrarRecurso
     * @param back
     * @param r
     */
    public DescadastrarRecurso(Background back) {
        this.back = back;
        model_tipo = new DefaultComboBoxModel(criaStringArrayModel_Tipo());
        model_predio = new DefaultComboBoxModel(criaStringArrayModel_Predios());
        initComponents();
    }
    
    public void desabilitaComponentesDescRec() {
        CBTiposExcluirRec.setEnabled(false);
        LabelTipoTelaExcluirRec.setEnabled(false);
        TabelaExcluirRec.setEnabled(false);
        ScrolExcluirRec.setEnabled(false);
        BotaoListaRecExcRec.setEnabled(false);
        BotaoGoDiagConfRec.setEnabled(false);
    }
    
    private List<Tipo> buscaTipos() {
        List<Tipo> tipos = null;
        try {
            tipos = r.listaTipos();

        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
        }

        return tipos;
    }

    private List<Predio> buscaPredios() {
        List<Predio> predios = null;
        try {
            predios = r.listaPredios();

        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
        }

        return predios;
    }
    
    //Cria e mantem estatico as strings
    private String[] criaStringArrayModel_Tipo(){
        List<Tipo> tipos = buscaTipos();
        ArrayList<String> strings = new ArrayList<>();
        String select = "Selecione";
        strings.add(select);
        for (Tipo tp : tipos){
            strings.add(tp.getNome());
        }
        String[] string_array = new String[strings.size()];
        string_array = strings.toArray(string_array);
        
        return string_array;
    }

    //Cria e mantem estatico as strings
    private String[] criaStringArrayModel_Predios(){
        List<Predio> predios = buscaPredios();
        ArrayList<String> strings = new ArrayList<>();
        String select = "Selecione";
        strings.add(select);
        for (Predio cs : predios){
            strings.add(cs.getNome());
        }
        String[] string_array = new String[strings.size()];
        string_array = strings.toArray(string_array);
        
        return string_array;
    }
    
    private void resetaTela(){
        CBPredioExcluirRec.setSelectedIndex(0);
        CBTiposExcluirRec.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) TabelaExcluirRec.getModel();
        model.setNumRows(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogConfExcRec = new javax.swing.JDialog();
        LabelDialogConfExcRec = new javax.swing.JLabel();
        LabelSubDialogConfExcRec = new javax.swing.JLabel();
        LabelPredioDialogConfExcRec = new javax.swing.JLabel();
        LabelPredio_BDDialogConfExcRec = new javax.swing.JLabel();
        LabelTipoDialogConfExcRec = new javax.swing.JLabel();
        LabelTipo_BDDialogConfExcRec = new javax.swing.JLabel();
        LabelNomeDialogConfExcRec = new javax.swing.JLabel();
        LabelNome_BDDialogConfExcRec = new javax.swing.JLabel();
        BotaoDescRec = new javax.swing.JButton();
        BotaoRetFromDiagConfExcRec = new javax.swing.JButton();
        LabelNomeTelaDescRec = new javax.swing.JLabel();
        LabelSubTelaDescRec = new javax.swing.JLabel();
        LabelPredioTelaExcluirRec = new javax.swing.JLabel();
        LabelTipoTelaExcluirRec = new javax.swing.JLabel();
        BotaoRetFromDescRec = new javax.swing.JButton();
        BotaoGoDiagConfRec = new javax.swing.JButton();
        BotaoListaRecExcRec = new javax.swing.JButton();
        CBTiposExcluirRec = new javax.swing.JComboBox<>();
        CBPredioExcluirRec = new javax.swing.JComboBox<>();
        ScrolExcluirRec = new javax.swing.JScrollPane();
        TabelaExcluirRec = new javax.swing.JTable();

        DialogConfExcRec.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DialogConfExcRec.setTitle("Confirmação");
        DialogConfExcRec.setMinimumSize(new java.awt.Dimension(250, 250));

        LabelDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelDialogConfExcRec.setForeground(new java.awt.Color(255, 0, 0));
        LabelDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDialogConfExcRec.setText("Confirmar Ação");

        LabelSubDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelSubDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubDialogConfExcRec.setText("Deseja excluir este recurso?");

        LabelPredioDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelPredioDialogConfExcRec.setText("Prédio:");

        LabelPredio_BDDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredio_BDDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPredio_BDDialogConfExcRec.setText("I1");

        LabelTipoDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelTipoDialogConfExcRec.setText("Tipo:");

        LabelTipo_BDDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipo_BDDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelTipo_BDDialogConfExcRec.setText("Sala");

        LabelNomeDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LabelNomeDialogConfExcRec.setText("Nome:");

        LabelNome_BDDialogConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNome_BDDialogConfExcRec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNome_BDDialogConfExcRec.setText("320");

        BotaoDescRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoDescRec.setText("Confirmar");
        BotaoDescRec.setActionCommand("Sim");
        BotaoDescRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDescRecActionPerformed(evt);
            }
        });

        BotaoRetFromDiagConfExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDiagConfExcRec.setText("Cancelar");
        BotaoRetFromDiagConfExcRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDiagConfExcRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogConfExcRecLayout = new javax.swing.GroupLayout(DialogConfExcRec.getContentPane());
        DialogConfExcRec.getContentPane().setLayout(DialogConfExcRecLayout);
        DialogConfExcRecLayout.setHorizontalGroup(
            DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BotaoRetFromDiagConfExcRec)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoDescRec))
                    .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPredioDialogConfExcRec)
                            .addComponent(LabelNomeDialogConfExcRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPredio_BDDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogConfExcRecLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LabelNome_BDDialogConfExcRec, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelTipoDialogConfExcRec)
                        .addGap(61, 61, 61)
                        .addComponent(LabelTipo_BDDialogConfExcRec, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DialogConfExcRecLayout.setVerticalGroup(
            DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogConfExcRecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDialogConfExcRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubDialogConfExcRec)
                .addGap(9, 9, 9)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPredioDialogConfExcRec)
                    .addComponent(LabelPredio_BDDialogConfExcRec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoDialogConfExcRec)
                    .addComponent(LabelTipo_BDDialogConfExcRec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeDialogConfExcRec)
                    .addComponent(LabelNome_BDDialogConfExcRec))
                .addGap(36, 36, 36)
                .addGroup(DialogConfExcRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRetFromDiagConfExcRec)
                    .addComponent(BotaoDescRec))
                .addGap(14, 14, 14))
        );

        LabelNomeTelaDescRec.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        LabelNomeTelaDescRec.setForeground(new java.awt.Color(255, 0, 0));
        LabelNomeTelaDescRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeTelaDescRec.setText("EXCLUIR RECURSO");
        LabelNomeTelaDescRec.setToolTipText("");

        LabelSubTelaDescRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSubTelaDescRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTelaDescRec.setText("Remoção de Recurso do Sistema Dioniso");

        LabelPredioTelaExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelPredioTelaExcluirRec.setText("Prédio:");

        LabelTipoTelaExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipoTelaExcluirRec.setText("Tipo:");

        BotaoRetFromDescRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoRetFromDescRec.setText("Cancelar");
        BotaoRetFromDescRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRetFromDescRecActionPerformed(evt);
            }
        });

        BotaoGoDiagConfRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoGoDiagConfRec.setText("Excluir");
        BotaoGoDiagConfRec.setMaximumSize(new java.awt.Dimension(93, 27));
        BotaoGoDiagConfRec.setMinimumSize(new java.awt.Dimension(93, 27));
        BotaoGoDiagConfRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGoDiagConfRecActionPerformed(evt);
            }
        });

        BotaoListaRecExcRec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoListaRecExcRec.setText("Listar");
        BotaoListaRecExcRec.setMaximumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecExcRec.setMinimumSize(new java.awt.Dimension(113, 27));
        BotaoListaRecExcRec.setPreferredSize(new java.awt.Dimension(113, 27));
        BotaoListaRecExcRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaRecExcRecActionPerformed(evt);
            }
        });

        CBTiposExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBTiposExcluirRec.setModel(model_tipo);
        CBTiposExcluirRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTiposExcluirRecActionPerformed(evt);
            }
        });

        CBPredioExcluirRec.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CBPredioExcluirRec.setModel(model_predio);
        CBPredioExcluirRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPredioExcluirRecActionPerformed(evt);
            }
        });

        TabelaExcluirRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolExcluirRec.setViewportView(TabelaExcluirRec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeTelaDescRec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelSubTelaDescRec, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelPredioTelaExcluirRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBPredioExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(LabelTipoTelaExcluirRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBTiposExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoRetFromDescRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoListaRecExcRec, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BotaoGoDiagConfRec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrolExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LabelNomeTelaDescRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTelaDescRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBPredioExcluirRec)
                    .addComponent(CBTiposExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPredioTelaExcluirRec)
                    .addComponent(LabelTipoTelaExcluirRec))
                .addGap(13, 13, 13)
                .addComponent(ScrolExcluirRec, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoGoDiagConfRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoListaRecExcRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BotaoRetFromDescRec)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoRetFromDescRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDescRecActionPerformed
        // TODO add your handling code here:
        System.out.println("BotaoRetFromTelaDescadastrarRecurso");
        back.habilitaTelaDescadastrarSelecao();
        this.modified = false;
        resetaTela();
        back.desabilitaTelaDescadastrarRecurso();
    }//GEN-LAST:event_BotaoRetFromDescRecActionPerformed

    private void BotaoGoDiagConfRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGoDiagConfRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton8ActionPerformed()");
        if (TabelaExcluirRec.getSelectedRow() == (-1)) {
            JOptionPane.showMessageDialog(null, "Selecione um recurso para "
                + "excluir.");
        } else {
            System.out.println(TabelaExcluirRec.getSelectedRow());
            Object coluna_nome = TabelaExcluirRec.getValueAt(TabelaExcluirRec.getSelectedRow(), 0);
            String nome = (String) coluna_nome;
            LabelNome_BDDialogConfExcRec.setText(nome);
            LabelPredio_BDDialogConfExcRec.setText(CBPredioExcluirRec.getSelectedItem().toString());
            LabelTipo_BDDialogConfExcRec.setText(CBTiposExcluirRec.getSelectedItem().toString());
            DialogConfExcRec.setVisible(true);
        }
    }//GEN-LAST:event_BotaoGoDiagConfRecActionPerformed

    private void BotaoListaRecExcRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaRecExcRecActionPerformed
        // Botao Lista Recursos para Excluir
        try {
            String predio_name = CBPredioExcluirRec.getSelectedItem().toString();
            String tipo_name = CBTiposExcluirRec.getSelectedItem().toString();
            Predio predio = new Predio(predio_name);
            Tipo tipo = new Tipo(tipo_name);
            List<Recurso> lista = r.listaRecursos(predio, tipo);
            if (lista.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) TabelaExcluirRec.getModel();
                model.setNumRows(0);
                JOptionPane.showMessageDialog(null, "Não há recursos para "
                    + "serem listados.");
            } else {
                DefaultTableModel model = (DefaultTableModel) TabelaExcluirRec.getModel();
                TabelaExcluirRec.setRowSorter(new TableRowSorter(model));
                //equivalente a clearTable();
                model.setNumRows(0);
                for (Recurso rec : lista) {
                    System.out.println(rec.getNome());
                    System.out.println(rec.getPredio());
                    System.out.println(rec.getTipo());
                    model.addRow(new Object[]{rec.getNome()});
                }
            }
        } catch (RegrasNegocioException ex) {
            Log.gravaLog(ex);   //Pode gerar erro...
        }
    }//GEN-LAST:event_BotaoListaRecExcRecActionPerformed

    private void CBTiposExcluirRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTiposExcluirRecActionPerformed
        if (!this.modified) {
            List<Tipo> tipos = buscaTipos();
            String select = CBTiposExcluirRec.getItemAt(0);
            if (!tipos.isEmpty()) {
                
                CBTiposExcluirRec.removeAllItems();
                CBTiposExcluirRec.addItem(select);
                for (Tipo tp : tipos) {
                    CBTiposExcluirRec.addItem(tp.getNome());
                }
                this.modified = true;
            }
            else{
                CBTiposExcluirRec.removeAllItems();
                CBTiposExcluirRec.addItem(select);
                this.modified = true;
            }
        }
        //ComboBox Tipo Excluir Recurso
        String campo = CBPredioExcluirRec.getSelectedItem().toString();
        if ((campo.equalsIgnoreCase("SELECIONE"))) {
            ScrolExcluirRec.setEnabled(false);
            TabelaExcluirRec.setEnabled(false);
            BotaoListaRecExcRec.setEnabled(false);
            BotaoGoDiagConfRec.setEnabled(false);
        } else {
            ScrolExcluirRec.setEnabled(true);
            TabelaExcluirRec.setEnabled(true);
            BotaoListaRecExcRec.setEnabled(true);
            BotaoGoDiagConfRec.setEnabled(true);
            BotaoListaRecExcRecActionPerformed(evt);
        }
    }//GEN-LAST:event_CBTiposExcluirRecActionPerformed

    private void CBPredioExcluirRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPredioExcluirRecActionPerformed
        if (!this.modified) {
            List<Predio> predios = buscaPredios();
            String select = CBPredioExcluirRec.getItemAt(0);
            if (!predios.isEmpty()) {
                
                CBPredioExcluirRec.removeAllItems();
                CBPredioExcluirRec.addItem(select);
                for (Predio pd : predios) {
                    CBPredioExcluirRec.addItem(pd.getNome());
                }
                this.modified = true;
            }
            else{
                CBPredioExcluirRec.removeAllItems();
                CBPredioExcluirRec.addItem(select);
                this.modified = true;
            }
        }
        //ComboBox Predio Excluir Recurso
        String campo = CBPredioExcluirRec.getSelectedItem().toString();
        if ((campo.equalsIgnoreCase("SELECIONE"))) {
            CBTiposExcluirRec.setEnabled(false);
            LabelTipoTelaExcluirRec.setEnabled(false);
            ScrolExcluirRec.setEnabled(false);
            TabelaExcluirRec.setEnabled(false);
        } else {
            CBTiposExcluirRec.setEnabled(true);
            LabelTipoTelaExcluirRec.setEnabled(true);
        }
    }//GEN-LAST:event_CBPredioExcluirRecActionPerformed

    private void BotaoDescRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDescRecActionPerformed
        // Botao Descadastra Recurso
        try {
            Recurso rec = new Recurso();
            rec.setNome(LabelNome_BDDialogConfExcRec.getText());
            Predio predio = new Predio(LabelPredio_BDDialogConfExcRec.getText());
            rec.setPredio(predio);
            Tipo tipo = new Tipo(LabelTipo_BDDialogConfExcRec.getText());
            rec.setTipo(tipo);
            r.excluirRecurso(rec);
            JOptionPane.showMessageDialog(null, "Recurso excluído com sucesso!");
            DialogConfExcRec.setVisible(false);
        } catch (RegrasNegocioException e) {
            Log.gravaLog(e);
            JOptionPane.showMessageDialog(null, "Recurso não encontrado!");
        }
    }//GEN-LAST:event_BotaoDescRecActionPerformed

    private void BotaoRetFromDiagConfExcRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRetFromDiagConfExcRecActionPerformed
        // TODO add your handling code here:
        System.out.println("Telas.Telas.jButton31ActionPerformed()");
        DialogConfExcRec.setVisible(false);
    }//GEN-LAST:event_BotaoRetFromDiagConfExcRecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDescRec;
    private javax.swing.JButton BotaoGoDiagConfRec;
    private javax.swing.JButton BotaoListaRecExcRec;
    private javax.swing.JButton BotaoRetFromDescRec;
    private javax.swing.JButton BotaoRetFromDiagConfExcRec;
    private javax.swing.JComboBox<String> CBPredioExcluirRec;
    private javax.swing.JComboBox<String> CBTiposExcluirRec;
    private javax.swing.JDialog DialogConfExcRec;
    private javax.swing.JLabel LabelDialogConfExcRec;
    private javax.swing.JLabel LabelNomeDialogConfExcRec;
    private javax.swing.JLabel LabelNomeTelaDescRec;
    private javax.swing.JLabel LabelNome_BDDialogConfExcRec;
    private javax.swing.JLabel LabelPredioDialogConfExcRec;
    private javax.swing.JLabel LabelPredioTelaExcluirRec;
    private javax.swing.JLabel LabelPredio_BDDialogConfExcRec;
    private javax.swing.JLabel LabelSubDialogConfExcRec;
    private javax.swing.JLabel LabelSubTelaDescRec;
    private javax.swing.JLabel LabelTipoDialogConfExcRec;
    private javax.swing.JLabel LabelTipoTelaExcluirRec;
    private javax.swing.JLabel LabelTipo_BDDialogConfExcRec;
    private javax.swing.JScrollPane ScrolExcluirRec;
    private javax.swing.JTable TabelaExcluirRec;
    // End of variables declaration//GEN-END:variables
}
