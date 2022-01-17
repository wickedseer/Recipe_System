package recipe_system;

public class home_page extends javax.swing.JFrame {

        public home_page() {
        initComponents();
       
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        ViewPageBtn = new javax.swing.JButton();
        AddPageBtn = new javax.swing.JButton();
        UpdatePageBtn = new javax.swing.JButton();
        DeletePageBtn = new javax.swing.JButton();
        MyProfileBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        jLabel3.setText("jLabel3");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(630, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 30, 90, 66);

        LogoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogoutBtn.setText("LOGOUT");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutBtn);
        LogoutBtn.setBounds(60, 350, 190, 40);

        ViewPageBtn.setBackground(new java.awt.Color(255, 255, 255));
        ViewPageBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ViewPageBtn.setText("VIEW RECIPE");
        ViewPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewPageBtn);
        ViewPageBtn.setBounds(60, 100, 190, 40);

        AddPageBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddPageBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddPageBtn.setText("ADD RECIPE");
        AddPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddPageBtn);
        AddPageBtn.setBounds(60, 150, 190, 40);

        UpdatePageBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdatePageBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdatePageBtn.setForeground(new java.awt.Color(51, 51, 51));
        UpdatePageBtn.setText("UPDATE RECIPE");
        UpdatePageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UpdatePageBtn);
        UpdatePageBtn.setBounds(60, 200, 190, 40);

        DeletePageBtn.setBackground(new java.awt.Color(255, 255, 255));
        DeletePageBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeletePageBtn.setText("DELETE RECIPE");
        DeletePageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeletePageBtn);
        DeletePageBtn.setBounds(60, 250, 190, 40);

        MyProfileBtn.setBackground(new java.awt.Color(255, 255, 255));
        MyProfileBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MyProfileBtn.setText("MY PROFILE ");
        MyProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyProfileBtnActionPerformed(evt);
            }
        });
        getContentPane().add(MyProfileBtn);
        MyProfileBtn.setBounds(60, 300, 190, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -20, 710, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        this.dispose();
        login_page a = new login_page();
        a.setVisible(true);
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void MyProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyProfileBtnActionPerformed
        this.dispose();
        my_profile b = new my_profile();
        b.setVisible(true);
    }//GEN-LAST:event_MyProfileBtnActionPerformed

    private void AddPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPageBtnActionPerformed
        this.dispose();
        add_recipe c = new add_recipe();
        c.setVisible(true);
    }//GEN-LAST:event_AddPageBtnActionPerformed

    private void ViewPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPageBtnActionPerformed
        this.dispose();
        view_recipe d = new view_recipe();
        d.setVisible(true);
    }//GEN-LAST:event_ViewPageBtnActionPerformed

    private void DeletePageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePageBtnActionPerformed
        this.dispose();
        delete_recipe e = new delete_recipe();
        e.setVisible(true);
    }//GEN-LAST:event_DeletePageBtnActionPerformed

    private void UpdatePageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePageBtnActionPerformed
        this.dispose();
        update_recipe f = new update_recipe();
        f.setVisible(true);
    }//GEN-LAST:event_UpdatePageBtnActionPerformed

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
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPageBtn;
    private javax.swing.JButton DeletePageBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton MyProfileBtn;
    private javax.swing.JButton UpdatePageBtn;
    private javax.swing.JButton ViewPageBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
