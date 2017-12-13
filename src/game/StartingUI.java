/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.List;

import main.mainCC;


/**
 *
 * @author HP
 */
public class StartingUI extends javax.swing.JFrame {

    /**
     * Creates new form StartingUI
     */
    public StartingUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newgame = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        leaderboard = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        newgame.setText("New Game");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        getContentPane().add(newgame);
        newgame.setBounds(220, 180, 120, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/TImg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 30, 360, 120);

        leaderboard.setText("Leaderboard");
        leaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardActionPerformed(evt);
            }
        });
        getContentPane().add(leaderboard);
        leaderboard.setBounds(220, 220, 120, 23);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(240, 260, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/BG1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        // TODO add your handling code here:
        Result result = new Result();
        result.setSize(400,350);
        result.setVisible(true);
        result.setLocationRelativeTo(null);
        new mainCC();
    }//GEN-LAST:event_newgameActionPerformed

    private void leaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardActionPerformed
        // TODO add your handling code here:
        Leaderboard lead = new Leaderboard();
        lead.setSize(412,270);
        lead.setVisible(true);
        lead.setLocationRelativeTo(null);
    }//GEN-LAST:event_leaderboardActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(StartingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartingUI start = new StartingUI();
                start.setSize(600,400);
                start.setVisible(true);
                start.setLocationRelativeTo(null);
            }
        });
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton leaderboard;
    private javax.swing.JButton newgame;
    // End of variables declaration//GEN-END:variables
}
