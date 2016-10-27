/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio Martinez
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
public class GUI extends javax.swing.JFrame {
    String palabra="";
    int intentos=6;
    String secreto="";
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        palabratextfield.setText("");
        letratextfield.setText("");
        final int limite = 1;
        KeyListener keyListener = new KeyListener() {
            public void keyPressed(KeyEvent keyEvent) {
            }

            public void keyReleased(KeyEvent keyEvent) {
            }

            public void keyTyped(KeyEvent keyEvent) {
                if (letratextfield.getText().length() == limite) {
                        keyEvent.consume();
                    }

            }
        };

        letratextfield.addKeyListener(keyListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palabratextfield = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        letratextfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salida = new javax.swing.JLabel();
        salida1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AHORCADO");

        jButton1.setText("JUGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        letratextfield.setEnabled(false);
        letratextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letratextfieldActionPerformed(evt);
            }
        });

        jButton2.setText("INTENTO");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Inserte una palabra");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inserte una letra");

        salida.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        salida1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        salida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(palabratextfield)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(letratextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 221, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(palabratextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letratextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salida1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letratextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letratextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letratextfieldActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!"".equals(palabratextfield.getText())){
            jButton2.setEnabled(true);
            letratextfield.setEnabled(true);
            
            palabra=palabratextfield.getText();
            
            secreto="";
            for(int x=0; x<palabra.length();x++){
                secreto=secreto+"_";
            }
            salida1.setText(secreto);
        }else{
            JOptionPane.showMessageDialog(null, "Inserta una palabra para comenzar a jugar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    String reemplazar(int pos, char Char){
        String temp="";
        
        char[] secretochars=secreto.toCharArray();
        
        secretochars[pos]=Char;
        
        temp=String.valueOf(secretochars);
        return temp;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!"".equals(letratextfield.getText())){
            char letra=letratextfield.getText().charAt(0);
            int cont=0;
            boolean no=true;
            if(intentos>0){
                for(int x=0; x<palabra.length();x++){
                    if(letra==palabra.charAt(x)){
                        cont++;
                        salida.setText("LA LETRA "+letra+" SE ENCUENTRA "+cont+" veces");
                        secreto=reemplazar(x,letra);
                        salida1.setText(secreto);
                        no=false;
                        if(!secreto.contains("_")){
                            int opc=JOptionPane.showConfirmDialog(null, "¡HAZ GANADO!\n¿Deseas jugar de nuevo?","GANASTE",JOptionPane.YES_NO_OPTION);
                            if(opc==JOptionPane.YES_OPTION){
                                jButton2.setEnabled(false);
                                letratextfield.setEnabled(false);
                                letratextfield.setText("");
                                palabratextfield.setText("");
                                intentos=6;
                                salida.setText("");
                                salida1.setText("");
                            }else{
                                System.exit(0);
                            }
                        }
                    } 
                }
                if(no){
                    intentos--;
                    salida.setText("LA LETRA "+letra+" NO SE ENCUENTRA, TE QUEDAN "+intentos+" INTENTOS");
                }
            }else{
                JOptionPane.showMessageDialog(null, "SE TE ACABARON LOS INTENTOS","ERROR",JOptionPane.ERROR_MESSAGE);
                int opc=JOptionPane.showConfirmDialog(null, "HAZ PERDIDO :( \n¿Deseas jugar de nuevo?","PERDISTE",JOptionPane.YES_NO_OPTION);
                            if(opc==JOptionPane.YES_OPTION){
                                jButton2.setEnabled(false);
                                letratextfield.setEnabled(false);
                                letratextfield.setText("");
                                palabratextfield.setText("");
                                intentos=6;
                                salida.setText("");
                                salida1.setText("");
                            }else{
                                System.exit(0);
                            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Inserte una letra para su intento","ERROR",JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField letratextfield;
    private javax.swing.JPasswordField palabratextfield;
    private javax.swing.JLabel salida;
    private javax.swing.JLabel salida1;
    // End of variables declaration//GEN-END:variables
}
