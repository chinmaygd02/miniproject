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
public class Dboy_sign_in extends javax.swing.JFrame {

    /**
     * Creates new form Dboy_sign_in
     */
    public Dboy_sign_in() {
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

        jLabel1 = new javax.swing.JLabel();
        dboyname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dboysetpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        dboyconfpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        dboyemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dboydate = new javax.swing.JTextField();
        dboymonth = new javax.swing.JTextField();
        dboyyear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dboygender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dboyusername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dboyaddress = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(42, 18, 37, 14);

        dboyname.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        dboyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dboynameActionPerformed(evt);
            }
        });
        getContentPane().add(dboyname);
        dboyname.setBounds(42, 41, 186, 20);

        jLabel2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("SET PASSWORD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(42, 89, 110, 14);

        dboysetpassword.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        getContentPane().add(dboysetpassword);
        dboysetpassword.setBounds(42, 118, 186, 20);

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(119, 51, 240));
        jLabel3.setText("CONFIRM PASSWORD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(372, 89, 150, 14);

        dboyconfpassword.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        getContentPane().add(dboyconfpassword);
        dboyconfpassword.setBounds(372, 118, 186, 20);

        jLabel4.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("EMAIL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(42, 166, 37, 14);

        dboyemail.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        getContentPane().add(dboyemail);
        dboyemail.setBounds(42, 189, 186, 20);

        jLabel5.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(119, 51, 240));
        jLabel5.setText("DOB");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(372, 166, 37, 14);

        dboydate.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        getContentPane().add(dboydate);
        dboydate.setBounds(372, 189, 45, 20);

        dboymonth.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        getContentPane().add(dboymonth);
        dboymonth.setBounds(424, 189, 44, 20);

        dboyyear.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        dboyyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dboyyearActionPerformed(evt);
            }
        });
        getContentPane().add(dboyyear);
        dboyyear.setBounds(475, 189, 44, 20);

        jLabel6.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(42, 238, 60, 14);

        dboygender.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        dboygender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        dboygender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dboygender);
        dboygender.setBounds(42, 261, 100, 20);

        jLabel7.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("SET USERNAME");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(372, 18, 100, 14);

        dboyusername.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        getContentPane().add(dboyusername);
        dboyusername.setBounds(372, 41, 186, 20);

        jLabel8.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(119, 51, 240));
        jLabel8.setText("ADDRESS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(372, 238, 80, 14);

        dboyaddress.setColumns(20);
        dboyaddress.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        dboyaddress.setRows(5);
        jScrollPane1.setViewportView(dboyaddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(372, 261, 146, 57);

        jButton1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(200, 51, 200));
        jButton1.setText("SUBMIT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(197, 418, 75, 23);

        jButton2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(200, 51, 200));
        jButton2.setText("RESET");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(343, 418, 70, 23);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 37, 0);

        jLabel10.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dboy_sign_in_page_img.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 660, 490);

        jMenu1.setText("HOME");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.jpg"))); // NOI18N
        jMenuItem1.setText("HOME");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("DBOY LOGIN");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sign_in.png"))); // NOI18N
        jMenuItem2.setText("DBOY LOGIN");
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

    private void dboyyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dboyyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dboyyearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //on clicking reset
        
        dboyname.setText("");
        dboysetpassword.setText("");
        dboyusername.setText("");
        dboyconfpassword.setText("");
        dboyemail.setText("");
        dboydate.setText("");
        dboymonth.setText("");
        dboyyear.setText("");
        dboyaddress.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dboynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dboynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dboynameActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //on clicking home
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //on clicking DBOY SIGN IN
        
        new sign_in_page().setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //on clicking submit
        
        int st=1;
        int i=0;
        
        
        JSONObject dboy_username_obj=new JSONObject();
        JSONObject dboy_password_obj=new JSONObject();
        JSONObject dboy_other_details_obj=new JSONObject();
        
        JSONArray dboy_username_jrr=new JSONArray();
        JSONArray dboy_password_jrr=new JSONArray();
        JSONArray dboy_other_details_jrr=new JSONArray();
        
        JSONParser Jp1=new JSONParser();
        JSONParser Jp2=new JSONParser();
        JSONParser Jp3=new JSONParser();
        
        try{
            FileReader dboy_username_file=new FileReader("dboyusernamefile.json");
            dboy_username_jrr=(JSONArray)Jp1.parse(dboy_username_file); 
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING DBOY USERNAME FILE");
        }
        
        try{
            FileReader dboy_password_file=new FileReader("dboypasswordfile.json");
            dboy_password_jrr=(JSONArray)Jp2.parse(dboy_password_file); 
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING DBOY PASSWORD FILE");
        }
        
        
        try{
            FileReader dboy_other_details_file=new FileReader("dboyotherdetailsfile.json");
            dboy_other_details_jrr=(JSONArray)Jp3.parse(dboy_other_details_file); 
        }
        catch(Exception e3)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING DBOY OTHER DETAIS FILE");
        }
        
        dboy_username_obj.put("dboyusername", dboyusername.getText());
        int dboy_usernames_size=dboy_username_jrr.size();
        
        dboy_password_obj.put("dboypassword", dboysetpassword.getText());
        
        
        
        dboy_other_details_obj.put("dboyname",dboyname.getText());
        dboy_other_details_obj.put("dboyemail",dboyemail.getText());
        dboy_other_details_obj.put("dboygender",dboygender.getSelectedItem());
        dboy_other_details_obj.put("dboydate",dboydate.getText());
        dboy_other_details_obj.put("dboymonth",dboymonth.getText());
        dboy_other_details_obj.put("dboyyear",dboyyear.getText());
        dboy_other_details_obj.put("dboyaddress",dboyaddress.getText());
        
        
        for(i=0;i<dboy_usernames_size;i++)
        {
            if(dboy_username_obj.equals(dboy_username_jrr.get(i)))
            {
                st=0;
                break;
            }
        }
        
        if(dboysetpassword.getText().equals("") || dboyname.getText().equals("") || dboyusername.getText().equals("") || dboyconfpassword.getText().equals("") || dboyemail.getText().equals("") || dboyaddress.getText().equals("") || dboydate.getText().equals("") || dboymonth.getText().equals("") || dboyyear.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
        }
        else if(!(dboysetpassword.getText().equals(dboyconfpassword.getText())))
        {
            JOptionPane.showMessageDialog(null, "Please confirm with the right password");
        }
        else if(st==1)
        {
            
            dboy_username_jrr.add(dboy_username_obj);
            dboy_password_jrr.add(dboy_password_obj);
            dboy_other_details_jrr.add(dboy_other_details_obj);
            
        
            try{
                FileWriter dboy_username_file=new FileWriter("dboyusernamefile.json");
                dboy_username_file.write(dboy_username_jrr.toJSONString());
                dboy_username_file.close();
            }
            catch(Exception ex1)
            {
                JOptionPane.showMessageDialog(null, "Error occured while fetching");
            }
        
            try{
                FileWriter dboy_password_file=new FileWriter("dboypasswordfile.json");
                dboy_password_file.write(dboy_password_jrr.toJSONString());
                dboy_password_file.close();
            }
            catch(Exception ex2)
            {
                JOptionPane.showMessageDialog(null, "Error occured while fetching");
            }
           
        
            try{
                FileWriter dboy_other_details_file=new FileWriter("dboyotherdetailsfile.json");
                dboy_other_details_file.write(dboy_other_details_jrr.toJSONString());
                dboy_other_details_file.close();
            }
            catch(Exception ex2)
            {
                JOptionPane.showMessageDialog(null, "Error occured while fetching");
            }

            JOptionPane.showMessageDialog(null,"Sign up successful");
            
            
        
            new sign_in_page().setVisible(true);
            
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Oops! Username already taken.Try another one!");
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dboy_sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dboy_sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dboy_sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dboy_sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dboy_sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dboyaddress;
    private javax.swing.JPasswordField dboyconfpassword;
    private javax.swing.JTextField dboydate;
    private javax.swing.JTextField dboyemail;
    private javax.swing.JComboBox<String> dboygender;
    private javax.swing.JTextField dboymonth;
    private javax.swing.JTextField dboyname;
    private javax.swing.JPasswordField dboysetpassword;
    private javax.swing.JTextField dboyusername;
    private javax.swing.JTextField dboyyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
