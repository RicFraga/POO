package Vistas;
import Clases.*;

public class SeleccionP extends javax.swing.JFrame {
    private Juego juego;   
    private Jugador a2;    
    //private Thread hilo3 = new Thread(this);
    
    public SeleccionP(Jugador a) {
        initComponents();
        this.setLocationRelativeTo(null);
        a2 = new Jugador(a.getNombre());
        a2.setPersonaje(a.getPersonaje());
        juego = new Juego(a2);
        NombreJ.setText(a.getNombre());    
        //hilo3.start();
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        person = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        NombreJ = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        person.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        person.setForeground(new java.awt.Color(204, 0, 0));
        person.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Captian America", "Redskull", "Spiderman", "Venom", "Hulk", "Red Hulk", "Thor", "Loki", "Wolverine", "Magneto", "Ciclope", "Mystique", "Deadpool", "Taskmaster", "Antman", "Ironman" }));
        person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personActionPerformed(evt);
            }
        });
        getContentPane().add(person, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 172, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Selecciona a tu personaje de");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        NombreJ.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        NombreJ.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NombreJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 190, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("  Salir  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 10, -1, -1));

        jNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Personaje personajes[] = new Personaje[16];
        personajes[0] = new SuperHeroe("Capitan America",true);
        personajes[1] = new SuperVillano("Redskull",false);
        personajes[2] = new SuperHeroe("Spiderman",true);
        personajes[3] = new SuperVillano("Venom",false);
        personajes[4] = new SuperHeroe("Hulk",true);
        personajes[5] = new SuperVillano("Red Hulk",false);
        personajes[6] = new SuperHeroe("Thor",true);
        personajes[7] = new SuperVillano("Loki",false);
        personajes[8] = new SuperHeroe("Wolverine",true);
        personajes[9] = new SuperVillano("Magento",false);
        personajes[10] = new SuperHeroe("Ciclope",true);
        personajes[11] = new SuperVillano("Mystique",false);
        personajes[12] = new SuperHeroe("Deadpool",true);
        personajes[13] = new SuperVillano("Taskmaster",false);
        personajes[14] = new SuperHeroe("Antman",true);
        personajes[15] = new SuperHeroe("Ironman",false);
                
        this.setVisible(false);
        a2.setPersonaje(person.getSelectedIndex());
        juego.setVisible(true);  
        
        try {
        Vistas.Inicio.dout.writeUTF(Integer.toString(a2.getPersonaje()));
        } catch(Exception e) {
            System.out.println("Error de Conexion Mandar Personaje");
        }
        
        try {
        a2.setPersonajeRival(Integer.parseInt(Vistas.Inicio.din.readUTF()));
        } catch(Exception e) {
            System.out.println("Error de Conexion Recibir Personaje");
        }
        //hilo3.stop();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void personActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personActionPerformed
                
    }//GEN-LAST:event_personActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreJ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JComboBox<String> person;
    // End of variables declaration//GEN-END:variables

    /*@Override
    public void run() {
            try {
                while(true)
                    Vistas.Inicio.din.readUTF();
            } catch(Exception e) {
                System.out.println("ERROR EN EL HILO SELECCIONP");
            }        
        }*/
}