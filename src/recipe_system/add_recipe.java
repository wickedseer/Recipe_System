package recipe_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class add_recipe extends javax.swing.JFrame {

        public add_recipe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t4 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        in2 = new javax.swing.JTextField();
        in3 = new javax.swing.JTextField();
        in4 = new javax.swing.JTextField();
        in5 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        in1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(626, 800));
        setMinimumSize(new java.awt.Dimension(626, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD RECIPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 149, 35);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RECIEPE NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 70, 115, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SERVINGS:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 170, 81, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INGREDIENTS:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 270, 104, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("QUANTITY:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 270, 80, 17);

        t4.setColumns(20);
        t4.setRows(5);
        jScrollPane3.setViewportView(t4);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(162, 555, 365, 104);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DIRECTIONS:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(55, 555, 94, 17);

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
        HomeBtn.setBounds(60, 680, 180, 40);

        AddBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBtn.setText("ADD RECIPE");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddBtn);
        AddBtn.setBounds(400, 680, 140, 40);
        getContentPane().add(t3);
        t3.setBounds(278, 160, 297, 33);
        getContentPane().add(t2);
        t2.setBounds(278, 65, 297, 31);
        getContentPane().add(in2);
        in2.setBounds(55, 354, 216, 30);
        getContentPane().add(in3);
        in3.setBounds(55, 397, 216, 30);
        getContentPane().add(in4);
        in4.setBounds(55, 446, 216, 30);
        getContentPane().add(in5);
        in5.setBounds(55, 495, 216, 32);
        getContentPane().add(q1);
        q1.setBounds(370, 308, 205, 33);
        getContentPane().add(q2);
        q2.setBounds(370, 354, 205, 30);
        getContentPane().add(q3);
        q3.setBounds(370, 397, 205, 31);
        getContentPane().add(q4);
        q4.setBounds(370, 446, 205, 31);
        getContentPane().add(q5);
        q5.setBounds(370, 496, 205, 30);

        in1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in1ActionPerformed(evt);
            }
        });
        getContentPane().add(in1);
        in1.setBounds(55, 306, 216, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TYPE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 120, 44, 17);
        getContentPane().add(t5);
        t5.setBounds(278, 114, 297, 33);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COOK TIME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 220, 87, 17);
        getContentPane().add(t6);
        t6.setBounds(278, 211, 297, 31);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("      ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-20, -60, 820, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
      
        this.dispose();
       home_page f1 = new home_page();
            f1.setVisible(true);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String db = "jdbc:mysql://localhost:3306/recipe_system?zeroDateTimeBehavior=convertToNull";
        Connection con = DriverManager.getConnection(db, "root", "P@ssw0rd");

        Statement stmt = con.createStatement();

 String query = "INSERT INTO recipe (`Name`,`Servings`,`Directions`,`Type`,`prepTime`) VALUES ('" 
                        + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','"
                        +t6.getText()+"')";
 
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs != null && rs.next()) {
                int recipeID = rs.getInt(1);

                if (!isNullOrEmpty(in1.getText()) && !isNullOrEmpty(q1.getText())) {
                    String query1 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,`IngredientsQuantity`) VALUES (" + recipeID + " , '" + in1.getText() + "','" + q1.getText() + "')";
                    stmt.executeUpdate(query1);
                }

                if (!isNullOrEmpty(in2.getText()) && !isNullOrEmpty(q2.getText())) {
                    String query2 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,`IngredientsQuantity`) VALUES (" + recipeID + " , '" + in2.getText() + "','" + q2.getText() + "')";
                    stmt.executeUpdate(query2);
                }

                if (!isNullOrEmpty(in3.getText()) && !isNullOrEmpty(q3.getText())) {
                    String query3 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,`IngredientsQuantity`) VALUES (" + recipeID + " , '" + in3.getText() + "','" + q3.getText() + "')";
                    stmt.executeUpdate(query3);
                }

                if (!isNullOrEmpty(in4.getText()) && !isNullOrEmpty(q4.getText())) {
                    String query4 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,`IngredientsQuantity`) VALUES (" + recipeID + " , '" + in4.getText() + "','" + q4.getText() + "')";
                    stmt.executeUpdate(query4);
                }

                if (!isNullOrEmpty(in5.getText()) && !isNullOrEmpty(q5.getText())) {
                    String query5 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,`IngredientsQuantity`) VALUES (" + recipeID + " , '" + in5.getText() + "','" + q5.getText() + "')";
                    stmt.executeUpdate(query5);
                }
            }
            JOptionPane.showMessageDialog(null, "record succesfully added");

            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
            t5.setText(" ");
            t6.setText(" ");
            in1.setText(" ");
            in2.setText(" ");
            in3.setText(" ");
            in4.setText(" ");
            in5.setText(" ");
            q1.setText(" ");
            q2.setText(" ");
            q3.setText(" ");
            q4.setText(" ");
            q5.setText(" ");
            
            rs.close();
            con.close();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error in insertion");

        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void in1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in1ActionPerformed
   
    }//GEN-LAST:event_in1ActionPerformed

    
   private static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
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
            java.util.logging.Logger.getLogger(add_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_recipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField in1;
    private javax.swing.JTextField in2;
    private javax.swing.JTextField in3;
    private javax.swing.JTextField in4;
    private javax.swing.JTextField in5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextArea t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
