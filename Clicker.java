package program;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class Clicker extends javax.swing.JFrame {
    int score = 0, maxScore = 0;
    boolean clicked;
    Random random = new Random();
    public Clicker() {
        initComponents();
        new Timer(800, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(clicked) {
                    clicked = false;
                    score++;
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    if(score > maxScore)
                        maxScore = score;
                    score = 0;
                }
                scoreLabel.setText("Score: " + score);
                maxScoreLabel.setText("Best score: " + maxScore);
                player.setLocation(random.nextInt(470), random.nextInt(470));
                clicked = false;
                player.setEnabled(true);
            }
        }).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        maxScoreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clicker");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        scoreLabel.setText("Score: 0");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(0, 0, 250, 20);

        player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/click_me.png"))); // NOI18N
        player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playerMouseClicked(evt);
            }
        });
        getContentPane().add(player);
        player.setBounds(410, 220, 35, 35);

        maxScoreLabel.setText("Best score: 0");
        getContentPane().add(maxScoreLabel);
        maxScoreLabel.setBounds(250, 0, 250, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerMouseClicked
        player.setEnabled(false);
        clicked = true;
    }//GEN-LAST:event_playerMouseClicked
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
            java.util.logging.Logger.getLogger(Clicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clicker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel maxScoreLabel;
    private javax.swing.JLabel player;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
