package recipe_system;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class view_recipe extends javax.swing.JFrame {

        public view_recipe() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ViewBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recipe1 = new javax.swing.JTable();
        EmptyTableBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW RECIPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 30, 146, 26);

        ViewBtn.setBackground(new java.awt.Color(0, 255, 0));
        ViewBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewBtn.setText("VIEW");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewBtn);
        ViewBtn.setBounds(450, 60, 110, 30);

        HomeBtn.setBackground(new java.awt.Color(255, 0, 51));
        HomeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("GO BACK TO HOME");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(HomeBtn);
        HomeBtn.setBounds(30, 406, 169, 33);

        recipe1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RecipeID", "Name", "Servings", "Directions", "Type", "PrepTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(recipe1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 108, 620, 274);

        EmptyTableBtn.setBackground(new java.awt.Color(0, 51, 255));
        EmptyTableBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmptyTableBtn.setForeground(new java.awt.Color(255, 255, 255));
        EmptyTableBtn.setText("EMPTY TABLE");
        EmptyTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmptyTableBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EmptyTableBtn);
        EmptyTableBtn.setBounds(65, 60, 168, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view-recipe.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 720, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        this.dispose();
        home_page f1 = new home_page();
        f1.setVisible(true);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) recipe1.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db = "jdbc:mysql://localhost:3306/recipe_system?zeroDateTimeBehavior=convertToNull";
            Connection con = DriverManager.getConnection(db, "root", "P@ssw0rd");
            Statement stmt = con.createStatement();

            String query = "select * from recipe;";
            ResultSet rs = stmt.executeQuery(query);
            int RecipeID;
            String Name, Servings, Directions, Type, PrepTime;

            while (rs.next()) {
                RecipeID = rs.getInt("RecipeID");
                Name = rs.getString("Name");
                Servings = rs.getString("Servings");
                Directions = rs.getString("Directions");
                Type = rs.getString("Type");
                PrepTime=rs.getString("prepTime");
                model.addRow(new Object[]{RecipeID, Name, Servings, Directions, Type,PrepTime});
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error in connectivity");

        }

    }//GEN-LAST:event_ViewBtnActionPerformed

    private void EmptyTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmptyTableBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) recipe1.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) 
            model.removeRow(0);
        }
    }//GEN-LAST:event_EmptyTableBtnActionPerformed

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
            java.util.logging.Logger.getLogger(view_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_recipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmptyTableBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recipe1;
    // End of variables declaration//GEN-END:variables
}
