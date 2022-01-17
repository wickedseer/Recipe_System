package recipe_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Calendar;

public class sign_up_page extends javax.swing.JFrame {

       public sign_up_page() {
        initComponents();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        BackToLoginBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        SignUpBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(659, 590));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        jLabel1.setText("SIGN UP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 90, 26);

        BackToLoginBtn.setBackground(new java.awt.Color(255, 51, 0));
        BackToLoginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackToLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToLoginBtn.setText("BACK TO LOGIN");
        BackToLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackToLoginBtn);
        BackToLoginBtn.setBounds(30, 500, 147, 25);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("FULL NAME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 80, 84, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("DOB:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 120, 35, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 360, 60, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("GENDER:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 160, 63, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("ADDRESS:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 200, 70, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("CREATE PASSWORD:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 400, 143, 26);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("CONFIRM PASSWORD:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 450, 155, 17);

        un.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(un);
        un.setBounds(290, 70, 259, 30);

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(date);
        date.setBounds(290, 110, 259, 30);

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(email);
        email.setBounds(292, 350, 259, 30);

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rb1.setText("MALE");
        getContentPane().add(rb1);
        rb1.setBounds(292, 155, 69, 29);

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rb2.setText("FEMALE");
        getContentPane().add(rb2);
        rb2.setBounds(470, 155, 87, 29);

        pass1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(pass1);
        pass1.setBounds(292, 394, 259, 30);

        pass2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(pass2);
        pass2.setBounds(290, 440, 260, 30);

        SignUpBtn.setBackground(new java.awt.Color(51, 51, 255));
        SignUpBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("SIGN UP");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpBtn);
        SignUpBtn.setBounds(310, 500, 93, 25);

        add.setColumns(20);
        add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add.setRows(5);
        jScrollPane2.setViewportView(add);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(292, 189, 259, 107);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("PHONE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 320, 53, 17);

        phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(phone);
        phone.setBounds(292, 309, 259, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-80, -30, 850, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToLoginBtnActionPerformed
        this.dispose();
        login_page f2 = new login_page();
        f2.setVisible(true);
    }//GEN-LAST:event_BackToLoginBtnActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
    try {
        String pwd = new String(pass1.getPassword());
        String pwd2 = new String(pass2.getPassword());

        if (!isNullOrEmpty(pwd) && pwd.equals(pwd2)) {
           Class.forName("com.mysql.cj.jdbc.Driver");
           String db = "jdbc:mysql://localhost:3306/recipe_system?zeroDateTimeBehavior=convertToNull";
           Connection con = DriverManager.getConnection(db, "root", "P@ssw0rd");
           Statement stmt = con.createStatement();

          String gender = "Female";

          if (rb1.isSelected()) {
                    gender = "Male";}
                
          String query1 = "INSERT INTO users (UserName, Address, DOB, Gender, Email, Phone)VALUES ('"
                                     + un.getText() + "','" + add.getText() + "','" + date.getText() + "','" + gender
                                     + "','" + email.getText() + "','" + phone.getText() + "');";

                stmt.executeUpdate(query1, Statement.RETURN_GENERATED_KEYS);

                ResultSet rs = stmt.getGeneratedKeys();
                if (rs != null && rs.next()) {
                    int userID = rs.getInt(1);

                    String passText = new String(pass2.getPassword());
                    String query2 = "INSERT INTO login (UserID, UserName, password)VALUES (" + userID
                            + ",  '" + email.getText() + "','" + passText + "');";

                    stmt.executeUpdate(query2);
                }

                JOptionPane.showMessageDialog(null, "Record succesfully added!");
                
                 rs.close();
                 con.close();
                 stmt.close();
            } else {
                JOptionPane.showMessageDialog(null, "Password does not match.");
            }
            }
    catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in insertion.");
        }
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private static boolean isNullOrEmpty(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToLoginBtn;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JTextArea add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField date;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JTextField phone;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
