/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujaimagen;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author carlos
 */
public class Client_DibujaImagen extends javax.swing.JFrame {

    
     
    
    
     BufferedImage myPicture;
     JLabel picLabel;
     JPanel jpanel;
     int seconds;
    /**
     * Creates new form NewJFrame
     */
    public Client_DibujaImagen(String filename, int sec){
        setUndecorated(true);
        initComponents();
        seconds = sec;
        
        setLayout (new BorderLayout());
        
        int w= this.getSize().width/2;
        int h= this.getSize().height/2-55;
        
        this.setLocation(0,100);
        
        try{
           myPicture = ImageIO.read(new File(filename));

        }catch ( IOException e){
            System.out.println ( e.getMessage());            
        }
        Graphics2D g = (Graphics2D) myPicture.getGraphics();
        jpanel = new JPanel();
        jpanel.setSize(1024, 780);
        Image scaledImage = myPicture.getScaledInstance(jpanel.getWidth(),jpanel.getHeight(), Image.SCALE_SMOOTH);
        
        
        // picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel = new JLabel(new ImageIcon(scaledImage));
        
        jpanel.add(picLabel);
        this.add(jpanel);
       // this.setVisible(true);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1280, 1024));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 780));

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
            java.util.logging.Logger.getLogger(Client_DibujaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_DibujaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_DibujaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_DibujaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_DibujaImagen("pp",1).setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void runClient()
    {
         
        int indx ;
        
        for (indx = 0; indx < seconds ; indx++){
            try {

                   Thread.sleep(1000);                 // milliseconds .
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.exit(0);
       

    }

    
}
