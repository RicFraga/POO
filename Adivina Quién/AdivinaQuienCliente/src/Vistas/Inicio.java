package Vistas;

import Clases.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.*;
import java.io.*;

public class Inicio extends javax.swing.JFrame {
    private SeleccionP seleccion;
    private Jugador uno;
    public static Socket socket;
    public static DataInputStream din;
    public static DataOutputStream dout;
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getToonImage(){
      Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Icono.png"));
      return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NomJug = new javax.swing.JTextField();
        BotonEmpezar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getToonImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Jugador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        NomJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomJugActionPerformed(evt);
            }
        });
        getContentPane().add(NomJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 173, -1));

        BotonEmpezar.setBackground(new java.awt.Color(255, 255, 255));
        BotonEmpezar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BotonEmpezar.setForeground(new java.awt.Color(204, 0, 0));
        BotonEmpezar.setText("Empezar");
        BotonEmpezar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEmpezarMouseClicked(evt);
            }
        });
        BotonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Adivina.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/depositphotos_190561622-stock-video-pop-art-colorful-background-hd.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomJugActionPerformed
       
    }//GEN-LAST:event_NomJugActionPerformed

    private void BotonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpezarActionPerformed
        
    }//GEN-LAST:event_BotonEmpezarActionPerformed

    private void BotonEmpezarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEmpezarMouseClicked
        try {
            socket = new Socket("localhost",12345);
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());
        } catch(Exception e) {
            System.out.println("Error al establecer la conexion");
        }    
        
        uno = new Jugador(NomJug.getText());
        seleccion = new SeleccionP(uno);        
        seleccion.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_BotonEmpezarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) throws Exception {                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);                
            }
        });                
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEmpezar;
    private javax.swing.JTextField NomJug;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}