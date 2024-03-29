/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini_proj;

import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Chinmay
 */
public class Electronics extends javax.swing.JFrame {

    /**
     * Creates new form Electronics
     */
    public Electronics() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXPRESS DISPATCH-ELECTRONICS");
        setMinimumSize(new java.awt.Dimension(661, 745));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_to_cart_img2.jpg"))); // NOI18N
        jButton1.setText("BUY NOW");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 260, 190, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/headphones_img2.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 340, 170, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/laprop_img3.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(84, 75, 169, 136);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mobile_img2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 60, 130, 140);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel4.setText("MOBILE RS15,999");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 220, 150, 16);

        jButton2.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_to_cart_img2.jpg"))); // NOI18N
        jButton2.setText("BUY NOW");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 260, 200, 25);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel5.setText("LAPTOP RS 35,999");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 220, 160, 16);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel6.setText("HEADPHONES RS699");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 540, 180, 16);

        jButton3.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_to_cart_img2.jpg"))); // NOI18N
        jButton3.setText("BUY NOW");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 580, 200, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/smart_watch_img.jpeg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 340, 170, 180);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel8.setText("SMART WATCH RS3,999");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 540, 200, 16);

        jButton4.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_to_cart_img2.jpg"))); // NOI18N
        jButton4.setText("BUY NOW");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(400, 580, 200, 25);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel9.setText("ELECTRONICS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(19, 13, 182, 33);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 0, 0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/electronics_page_img1.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 660, 730);

        jMenu1.setText("BACK");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back_img.jpg"))); // NOI18N
        jMenuItem1.setText("GO BACK");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("LOG OUT");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.jpg"))); // NOI18N
        jMenuItem2.setText("LOG OUT");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //on buying laptop
        
        String rname=JOptionPane.showInputDialog(null,"Enter Reciepant Name");
        String r_x_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant X coordinate");
        String r_y_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant Y coordinate");
         
        JSONObject spl_customer_obj=new JSONObject();
        JSONArray spl_customer_jrr=new JSONArray();
        JSONParser Jp=new JSONParser();
         
        try{
            FileReader spl_customer_file=new FileReader("rdeliveryspecialcustomerfile.json");
            spl_customer_jrr=(JSONArray)Jp.parse(spl_customer_file); 
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING rdeliveryspecialcustomerfile FILE");
        }
         
        spl_customer_obj.put("reciepant name",rname);
        spl_customer_obj.put("x coordinate",r_x_coordinate);
        spl_customer_obj.put("y coordinate",r_y_coordinate);
        spl_customer_obj.put("item purchased","Laptop");
        
        spl_customer_jrr.add(spl_customer_obj);
        
        try{
            FileWriter spl_customer_file=new FileWriter("rdeliveryspecialcustomerfile.json");
            spl_customer_file.write(spl_customer_jrr.toJSONString());
            spl_customer_file.close();
        }
        catch(Exception ex1)
        {
            JOptionPane.showMessageDialog(null, "Error occured while writing");
        }
        
        JOptionPane.showMessageDialog(null,"YAY!Your order has been placed!");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //on buying smart watch
        
        String rname=JOptionPane.showInputDialog(null,"Enter Reciepant Name");
        String r_x_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant X coordinate");
        String r_y_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant Y coordinate");
         
        JSONObject spl_customer_obj=new JSONObject();
        JSONArray spl_customer_jrr=new JSONArray();
        JSONParser Jp=new JSONParser();
         
        try{
            FileReader spl_customer_file=new FileReader("rdeliveryspecialcustomerfile.json");
            spl_customer_jrr=(JSONArray)Jp.parse(spl_customer_file); 
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING rdeliveryspecialcustomerfile FILE");
        }
         
        spl_customer_obj.put("reciepant name",rname);
        spl_customer_obj.put("x coordinate",r_x_coordinate);
        spl_customer_obj.put("y coordinate",r_y_coordinate);
        spl_customer_obj.put("item purchased","Smart Watch");
        
        spl_customer_jrr.add(spl_customer_obj);
        
        try{
            FileWriter spl_customer_file=new FileWriter("rdeliveryspecialcustomerfile.json");
            spl_customer_file.write(spl_customer_jrr.toJSONString());
            spl_customer_file.close();
        }
        catch(Exception ex1)
        {
            JOptionPane.showMessageDialog(null, "Error occured while writing");
        }
        
        JOptionPane.showMessageDialog(null,"YAY!Your order has been placed!");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //on clicking back
        new first_page().setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //on clicking log out
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //on buying mobile
        
        String rname=JOptionPane.showInputDialog(null,"Enter Reciepant Name");
        String r_x_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant X coordinate");
        String r_y_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant Y coordinate");
         
        JSONObject spl_customer_obj=new JSONObject();
        JSONArray spl_customer_jrr=new JSONArray();
        JSONParser Jp=new JSONParser();
         
        try{
            FileReader spl_customer_file=new FileReader("rdeliveryspecialcustomerfile.json");
            spl_customer_jrr=(JSONArray)Jp.parse(spl_customer_file); 
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING rdeliveryspecialcustomerfile FILE");
        }
         
        spl_customer_obj.put("reciepant name",rname);
        spl_customer_obj.put("x coordinate",r_x_coordinate);
        spl_customer_obj.put("y coordinate",r_y_coordinate);
        spl_customer_obj.put("item purchased","Mobile");
        
        spl_customer_jrr.add(spl_customer_obj);
        
        try{
            FileWriter spl_customer_file=new FileWriter("rdeliveryspecialcustomerfile.json");
            spl_customer_file.write(spl_customer_jrr.toJSONString());
            spl_customer_file.close();
        }
        catch(Exception ex1)
        {
            JOptionPane.showMessageDialog(null, "Error occured while writing");
        }
        
        JOptionPane.showMessageDialog(null,"YAY!Your order has been placed!");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //on buying headphones
        
        String rname=JOptionPane.showInputDialog(null,"Enter Reciepant Name");
        String r_x_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant X coordinate");
        String r_y_coordinate=JOptionPane.showInputDialog(null,"Enter Reciepant Y coordinate");
         
        JSONObject spl_customer_obj=new JSONObject();
        JSONArray spl_customer_jrr=new JSONArray();
        JSONParser Jp=new JSONParser();
         
        try{
            FileReader spl_customer_file=new FileReader("rdeliveryspecialcustomerfile.json");
            spl_customer_jrr=(JSONArray)Jp.parse(spl_customer_file); 
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING rdeliveryspecialcustomerfile FILE");
        }
         
        spl_customer_obj.put("reciepant name",rname);
        spl_customer_obj.put("x coordinate",r_x_coordinate);
        spl_customer_obj.put("y coordinate",r_y_coordinate);
        spl_customer_obj.put("item purchased","Headphones");
        
        spl_customer_jrr.add(spl_customer_obj);
        
        try{
            FileWriter spl_customer_file=new FileWriter("rdeliveryspecialcustomerfile.json");
            spl_customer_file.write(spl_customer_jrr.toJSONString());
            spl_customer_file.close();
        }
        catch(Exception ex1)
        {
            JOptionPane.showMessageDialog(null, "Error occured while writing");
        }
        
        JOptionPane.showMessageDialog(null,"YAY!Your order has been placed!");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Electronics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
