
package conalep;

import com.si.baseDatos.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
        
       this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnPrestamos = new javax.swing.JButton();
        btnGuia = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(17, 152, 85));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 350, 80));

        jPanel4.setBackground(new java.awt.Color(17, 152, 85));
        jPanel4.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setText("Buenos días.");
        jPanel4.add(jLabel2);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 210, 40));

        btnInventario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(80, 144, 207));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inventarios.png"))); // NOI18N
        btnInventario.setText("  Inventario");
        btnInventario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 160, 50));

        btnAlumnos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnAlumnos.setForeground(new java.awt.Color(80, 144, 207));
        btnAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alumno.png"))); // NOI18N
        btnAlumnos.setText("    Alumnos");
        btnAlumnos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 160, 50));

        btnLibros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(80, 144, 207));
        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registroli.png"))); // NOI18N
        btnLibros.setText("  Registro de Librio");
        btnLibros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        jPanel2.add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 160, 50));

        btnPrestamos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnPrestamos.setForeground(new java.awt.Color(80, 144, 207));
        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestamo.png"))); // NOI18N
        btnPrestamos.setText("    Prestamos");
        btnPrestamos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 160, 50));

        btnGuia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnGuia.setForeground(new java.awt.Color(80, 144, 207));
        btnGuia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guia.png"))); // NOI18N
        btnGuia.setText("   Guia de usuario");
        btnGuia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(btnGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 160, 50));

        barraProgreso.setBackground(new java.awt.Color(255, 255, 255));
        barraProgreso.setOpaque(true);
        barraProgreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraProgresoStateChanged(evt);
            }
        });
        jPanel2.add(barraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 650, 40));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel1.setText("Bienvenido...");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 340, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Conalep-logo.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 350, 200));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblio.jpg"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        // TODO add your handling code here:
        
        Alumnos newframe = new Alumnos();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        
       Inventario newframe = new Inventario();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        // TODO add your handling code here:
        
        RegistroLibro newframe = new RegistroLibro();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        // TODO add your handling code here:
        
        Prestamos newframe = new Prestamos();
       newframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void barraProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraProgresoStateChanged
      
        if(barraProgreso.getValue()==0 && barraProgreso.isIndeterminate()){
            Thread thread  = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(50);
                    barraProgreso.setValue(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            dispose();
        });
        thread.start();
        }
        barraProgreso.setMaximum(100);
        setVisible(true);
        
        
    }//GEN-LAST:event_barraProgresoStateChanged

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//                hacer la conexion
        Conexion.iniciar();
        
        //evaluar la condicion
        
        if(Conexion.conexion==null){
            
            VentanaPrincipal is=new VentanaPrincipal();
            is.setVisible(false);
           
//             JOptionPane.showMessageDialog(null,"No Conectando BD");
             System.exit(0);
          
           
        }else {
            
//            JOptionPane.showMessageDialog(null,"Conectando exitodsamente la BD");
            VentanaPrincipal is = new VentanaPrincipal();
            is.setVisible(true);
        }
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnGuia;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
