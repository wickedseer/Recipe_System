package recipe_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class login_page extends javax.swing.JFrame {
   
    public login_page() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        SignInBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel6.setText("jLabel6");

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(645, 423));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        jLabel1.setText("LOGIN ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 70, 80, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("EMAIL:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 110, 60, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 170, 100, 20);

        t1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(250, 120, 210, 30);

        SignInBtn.setBackground(new java.awt.Color(0, 255, 51));
        SignInBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        SignInBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtn.setText("SIGN IN ");
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SignInBtn);
        SignInBtn.setBounds(150, 220, 100, 30);

        CloseBtn.setBackground(new java.awt.Color(51, 51, 51));
        CloseBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("CLOSE");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CloseBtn);
        CloseBtn.setBounds(310, 220, 100, 30);

        t2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(250, 170, 210, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Don't have an account?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 290, 190, 30);

        SignUpBtn.setBackground(new java.awt.Color(51, 0, 255));
        SignUpBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("SIGN UP");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpBtn);
        SignUpBtn.setBounds(460, 290, 100, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        jLabel5.setText("Experience the Great Food!");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 40, 340, 28);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -50, 710, 520);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(440, 100, 10, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db = "jdbc:mysql://localhost:3306/recipe_system?zeroDateTimeBehavior=convertToNull";
            Connection con = DriverManager.getConnection(db, "root", "P@ssw0rd");

            Statement stmt = con.createStatement();

            String passText = new String(t2.getPassword());
            String search = "select userid from login where username = '" + t1.getText() + 
                                    "' and password = '" + passText + "'";

            ResultSet rs = stmt.executeQuery(search);
            if (rs.next()) {
                int UserID = rs.getInt("UserID");
                if (UserID > 0) {
                    this.dispose();
                    home_page f3 = new home_page();
                    f3.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Access denined.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Access denined.");
            }
            
            rs.close();
            con.close();
            stmt.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in logging in");
        }
    }//GEN-LAST:event_SignInBtnActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        this.dispose();
        sign_up_page f3 = new sign_up_page();
        f3.setVisible(true);
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBtn;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
