/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class GerenciadorTelas extends JFrame{
    public static void main(String[] args) {
        TelaMenuV2 tela = new TelaMenuV2();
        tela.setVisible(true);
    }
    
    public static void trocarTela(JFrame atual, JFrame nova){
        nova.setVisible(true);
        atual.setVisible(false);
    }
}
