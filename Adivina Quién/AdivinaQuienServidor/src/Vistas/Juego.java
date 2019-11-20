package Vistas;

import Clases.*;
import java.net.*;

public class Juego extends javax.swing.JFrame {
    final Jugador a3;    
    private Socket socket;        
    //final Thread hilo2 = new Thread();
    private Tiempo tp;
    
    public Juego(Jugador a) {        
        initComponents();        
        this.setLocationRelativeTo(null);
        a3 = new Jugador(a.getNombre());
        a3.setPersonaje(a.getPersonaje()); 
        a3.setPersonajeRival(a.getPersonajeRival());
        tiempo.setText(a3.getNombre()); 
        //hilo2.start();  
        tp = new Tiempo();
        tp.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Imagen2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Imagen12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Imagen3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Imagen4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Imagen5 = new javax.swing.JLabel();
        Imagen6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Imagen9 = new javax.swing.JLabel();
        Imagen8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaChat = new javax.swing.JTextArea();
        Mensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboAdivinar = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        BotonEnviar = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        Imagen10 = new javax.swing.JLabel();
        Imagen11 = new javax.swing.JLabel();
        Imagen13 = new javax.swing.JLabel();
        Imagen14 = new javax.swing.JLabel();
        Imagen15 = new javax.swing.JLabel();
        Imagen17 = new javax.swing.JLabel();
        Imagen16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Imagen18 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        jButton1.setText("C. América");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 10, 110, 28);

        Imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Villanos/CráneoRojo.jpg"))); // NOI18N
        Imagen2.setText("jLabel1");
        getContentPane().add(Imagen2);
        Imagen2.setBounds(170, 40, 90, 123);

        jButton2.setText("Redskull");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 10, 100, 28);

        Imagen12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/América.jpg"))); // NOI18N
        getContentPane().add(Imagen12);
        Imagen12.setBounds(20, 40, 94, 130);

        jButton3.setText("Spiderman");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 10, 110, 28);

        Imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/Spiderman.jpg"))); // NOI18N
        Imagen3.setText("jLabel1");
        getContentPane().add(Imagen3);
        Imagen3.setBounds(310, 40, 90, 120);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 60, 90, 80);

        jButton5.setText("Venom");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 10, 100, 28);

        Imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Villanos/Venom.jpg"))); // NOI18N
        Imagen4.setText("jLabel1");
        getContentPane().add(Imagen4);
        Imagen4.setBounds(440, 40, 90, 120);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 60, 90, 80);

        jButton6.setText("Hulk");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(17, 180, 100, 28);

        jButton7.setText("Red Hulk");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(159, 180, 100, 28);

        jButton8.setText("Thor");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(309, 180, 90, 28);

        jButton9.setText("Loki");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(435, 180, 90, 28);

        Imagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/Hulk.jpg"))); // NOI18N
        Imagen5.setText("jLabel1");
        getContentPane().add(Imagen5);
        Imagen5.setBounds(20, 210, 90, 120);

        Imagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Villanos/RedHulk.jpg"))); // NOI18N
        Imagen6.setText("jLabel5");
        getContentPane().add(Imagen6);
        Imagen6.setBounds(170, 210, 90, 120);

        jLabel8.setText("\n");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 210, 100, 80);

        Imagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Villanos/Loki.jpg"))); // NOI18N
        getContentPane().add(Imagen9);
        Imagen9.setBounds(440, 210, 90, 120);

        Imagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/Thor.jpg"))); // NOI18N
        getContentPane().add(Imagen8);
        Imagen8.setBounds(310, 210, 90, 120);

        AreaChat.setColumns(20);
        AreaChat.setRows(5);
        jScrollPane1.setViewportView(AreaChat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 110, 340, 430);

        Mensaje.setText("Haz un pregunta");
        getContentPane().add(Mensaje);
        Mensaje.setBounds(590, 550, 230, 28);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("CHAT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(740, 80, 51, 16);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("¿Listo para adivinar?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(670, 600, 200, 26);

        ComboAdivinar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Captian America", "Redskull", "Spiderman", "Venom", "Hulk", "Red Hulk", "Thor", "Loki", "Wolverine", "Magneto", "Ciclope", "Mystique", "Deadpool", "Taskmaster", "Antman", "Ironman" }));
        ComboAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAdivinarActionPerformed(evt);
            }
        });
        getContentPane().add(ComboAdivinar);
        ComboAdivinar.setBounds(600, 640, 160, 30);

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("¡ADIVINA!");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(790, 640, 130, 38);

        jButton11.setText("Wolverine");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(10, 340, 110, 28);

        jButton12.setText("Magneto");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(170, 340, 90, 28);

        jButton13.setText("Cíclope");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(313, 340, 90, 28);

        jButton14.setText("Mystique");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(443, 340, 90, 28);

        BotonEnviar.setBackground(new java.awt.Color(204, 204, 204));
        BotonEnviar.setText("Enviar");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEnviar);
        BotonEnviar.setBounds(830, 550, 100, 28);

        jButton15.setText("Deadpool");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(20, 510, 90, 28);

        jButton16.setText("Taskmaster");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(160, 510, 110, 28);

        jButton17.setText("Antman");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(300, 510, 110, 28);

        jButton18.setText("Ironman");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(440, 510, 90, 28);

        Imagen10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/Wolverine.jpg"))); // NOI18N
        getContentPane().add(Imagen10);
        Imagen10.setBounds(20, 370, 90, 123);

        Imagen11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Villanos/Magneto.jpg"))); // NOI18N
        getContentPane().add(Imagen11);
        Imagen11.setBounds(170, 370, 90, 130);

        Imagen13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/Ciclope.jpg"))); // NOI18N
        getContentPane().add(Imagen13);
        Imagen13.setBounds(310, 370, 90, 130);

        Imagen14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Villanos/Mistyque.jpg"))); // NOI18N
        getContentPane().add(Imagen14);
        Imagen14.setBounds(440, 370, 92, 130);

        Imagen15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/Deadpool.jpg"))); // NOI18N
        getContentPane().add(Imagen15);
        Imagen15.setBounds(20, 540, 90, 120);

        Imagen17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/AntMan.jpg"))); // NOI18N
        getContentPane().add(Imagen17);
        Imagen17.setBounds(310, 540, 94, 130);

        Imagen16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Villanos/TaskMaster.jpg"))); // NOI18N
        getContentPane().add(Imagen16);
        Imagen16.setBounds(170, 540, 90, 120);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("TIEMPO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(610, 10, 80, 30);

        Imagen18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Heroes/Ironman.jpg"))); // NOI18N
        getContentPane().add(Imagen18);
        Imagen18.setBounds(443, 540, 100, 130);

        jButton19.setBackground(new java.awt.Color(255, 204, 153));
        jButton19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 102, 0));
        jButton19.setText("SALIR");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(880, 10, 90, 33);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(630, 30, 60, 30);

        tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo3.jpg"))); // NOI18N
        tiempo.setText("HHHAHAHAHAHAHA");
        tiempo.setToolTipText("");
        tiempo.setMinimumSize(new java.awt.Dimension(1920, 1500));
        getContentPane().add(tiempo);
        tiempo.setBounds(0, 0, 1060, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Imagen12.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Imagen2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Imagen3.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Imagen4.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Imagen5.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Imagen6.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Imagen8.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Imagen9.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(ComboAdivinar.getSelectedIndex() == a3.getPersonajeRival()) {
            System.out.println("Has ganado");
        }
        else
            System.out.println("Has perdido");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
        AreaChat.append(a3.getNombre() + ": " + Mensaje.getText() + "\n");        
        
        try {
        Vistas.Inicio.dout.writeUTF(a3.getNombre() + ": " + Mensaje.getText() + "\n");
        } catch(Exception e) {
            System.out.println("Error de Conexion");
        }                        
        
        try {
        AreaChat.append(Vistas.Inicio.din.readUTF() + "\n");
        } catch(Exception e) {
            System.out.println("Error de Conexion");
        } 
    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Imagen10.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Imagen11.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Imagen13.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Imagen14.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Imagen15.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Imagen16.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Imagen17.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Imagen18.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void ComboAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAdivinarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAdivinarActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton19ActionPerformed
                                              
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea AreaChat;
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JComboBox<String> ComboAdivinar;
    private javax.swing.JLabel Imagen10;
    private javax.swing.JLabel Imagen11;
    private javax.swing.JLabel Imagen12;
    private javax.swing.JLabel Imagen13;
    private javax.swing.JLabel Imagen14;
    private javax.swing.JLabel Imagen15;
    private javax.swing.JLabel Imagen16;
    private javax.swing.JLabel Imagen17;
    private javax.swing.JLabel Imagen18;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JLabel Imagen4;
    private javax.swing.JLabel Imagen5;
    private javax.swing.JLabel Imagen6;
    private javax.swing.JLabel Imagen8;
    private javax.swing.JLabel Imagen9;
    public static javax.swing.JTextField Mensaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
 
    /*@Override
    public void run() {
            while(true) {
                try {                
                    String text = "";
                    text += Vistas.Inicio.din.readUTF();
                    AreaChat.append(text + "\n");                
            } catch(Exception e) {
                System.out.println("ERROR EN EL HILO " + e);
            }        
        }
    }*/
}