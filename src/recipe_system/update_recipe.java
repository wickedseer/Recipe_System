package recipe_system;

import java.sql.*;
import javax.swing.JOptionPane;

public class update_recipe extends javax.swing.JFrame {
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;

       public update_recipe() {
        initComponents();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        t20 = new javax.swing.JTextField();
        HomeBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t30 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t50 = new javax.swing.JTextField();
        LoadBtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t40 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        in1 = new javax.swing.JTextField();
        in2 = new javax.swing.JTextField();
        in3 = new javax.swing.JTextField();
        in4 = new javax.swing.JTextField();
        in5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        t60 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        jLabel1.setText("UPDATE RECIPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(297, 18, 174, 48);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER RECIPE ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 80, 123, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RECIPE_NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 130, 104, 17);
        getContentPane().add(t10);
        t10.setBounds(220, 70, 310, 32);

        t20.setEnabled(false);
        getContentPane().add(t20);
        t20.setBounds(220, 120, 310, 33);

        HomeBtn.setBackground(new java.awt.Color(255, 51, 51));
        HomeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("GO BACK TO HOME");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(HomeBtn);
        HomeBtn.setBounds(90, 710, 169, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SERVINGS:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 230, 75, 17);

        t30.setEnabled(false);
        getContentPane().add(t30);
        t30.setBounds(220, 220, 310, 31);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIRECTIONS:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 580, 89, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TYPE:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 180, 40, 17);

        t50.setEnabled(false);
        getContentPane().add(t50);
        t50.setBounds(218, 169, 310, 32);

        LoadBtn.setBackground(new java.awt.Color(0, 255, 0));
        LoadBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoadBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoadBtn.setText("LOAD RECIPE");
        LoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoadBtn);
        LoadBtn.setBounds(570, 80, 160, 30);

        Updatebtn.setBackground(new java.awt.Color(0, 0, 255));
        Updatebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        Updatebtn.setText("UPDATE & SAVE");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Updatebtn);
        Updatebtn.setBounds(510, 710, 160, 40);

        t40.setColumns(20);
        t40.setRows(5);
        t40.setEnabled(false);
        jScrollPane1.setViewportView(t40);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 580, 320, 110);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGREDIENT 1:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 330, 101, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INGREDIENT 2:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 380, 101, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INGREDIENT 3:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 430, 101, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("INGREDIENT 4:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 480, 101, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("INGREDIENT 5:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 530, 101, 17);

        in1.setEnabled(false);
        getContentPane().add(in1);
        in1.setBounds(220, 320, 230, 31);

        in2.setEnabled(false);
        getContentPane().add(in2);
        in2.setBounds(220, 370, 230, 30);

        in3.setEnabled(false);
        getContentPane().add(in3);
        in3.setBounds(220, 420, 230, 32);

        in4.setEnabled(false);
        in4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in4ActionPerformed(evt);
            }
        });
        getContentPane().add(in4);
        in4.setBounds(222, 469, 230, 31);

        in5.setEnabled(false);
        in5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in5ActionPerformed(evt);
            }
        });
        getContentPane().add(in5);
        in5.setBounds(220, 521, 230, 32);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("QUANTITY:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(468, 529, 74, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("QUANTITY:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(470, 320, 74, 17);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("QUANTITY:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 370, 74, 17);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("QUANTITY:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 420, 74, 17);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("QUANTITY:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(470, 476, 74, 17);

        q1.setEnabled(false);
        getContentPane().add(q1);
        q1.setBounds(562, 313, 170, 30);

        q2.setEnabled(false);
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        getContentPane().add(q2);
        q2.setBounds(562, 363, 170, 30);

        q3.setEnabled(false);
        getContentPane().add(q3);
        q3.setBounds(562, 413, 170, 30);

        q4.setEnabled(false);
        getContentPane().add(q4);
        q4.setBounds(562, 469, 170, 30);

        q5.setEnabled(false);
        getContentPane().add(q5);
        q5.setBounds(560, 522, 170, 30);

        t60.setEnabled(false);
        getContentPane().add(t60);
        t60.setBounds(220, 270, 310, 32);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PREP TIME:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(120, 280, 79, 17);

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Vridhi\\Project\\update2.jpg")); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, -120, 1320, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        this.dispose();
        home_page f1 = new home_page();
        f1.setVisible(true);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void LoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtnActionPerformed
        try {
            int RecipeID;
            String Name, Servings, Directions, Type, PrepTime;
            int ingredientNo = 1;

            Class.forName("com.mysql.cj.jdbc.Driver");
            String db = "jdbc:mysql://localhost:3306/recipe_system?zeroDateTimeBehavior=convertToNull";
            Connection con = DriverManager.getConnection(db, "root", "P@ssw0rd");
            Statement stmt = con.createStatement();

            String query = "select * from recipe where RecipeID = " + t10.getText() + ";";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                RecipeID = rs.getInt("RecipeID");
                Name = rs.getString("Name");
                Servings = rs.getString("Servings");
                Directions = rs.getString("Directions");
                Type = rs.getString("Type");
                PrepTime = rs.getString("prepTime");

                t20.setText(Name);
                t30.setText(Servings);
                t40.setText(Directions);
                t50.setText(Type);
                t60.setText(PrepTime);

                t20.setEnabled(true);
                t30.setEnabled(true);
                t40.setEnabled(true);
                t50.setEnabled(true);
                t60.setEnabled(true);

                String query2 = "select * from recipeingredients where recipeid=" + t10.getText() + ";";
                ResultSet rs2 = stmt.executeQuery(query2);

                while (rs2.next()) {
                    switch (ingredientNo) {
                        case 1:
                            in1.setEnabled(true);
                            in1.setText(rs2.getString("ingredientsname"));
                            q1.setEnabled(true);
                            q1.setText(rs2.getString("ingredientsquantity"));
                            break;
                        case 2:
                            in2.setEnabled(true);
                            in2.setText(rs2.getString("ingredientsname"));
                            q2.setEnabled(true);
                            q2.setText(rs2.getString("ingredientsquantity"));
                            break;
                        case 3:
                            in3.setEnabled(true);
                            in3.setText(rs2.getString("ingredientsname"));
                            q3.setEnabled(true);
                            q3.setText(rs2.getString("ingredientsquantity"));
                            break;
                        case 4:
                            in4.setEnabled(true);
                            in4.setText(rs2.getString("ingredientsname"));
                            q4.setEnabled(true);
                            q4.setText(rs2.getString("ingredientsquantity"));
                            break;
                        case 5:
                            in5.setEnabled(true);
                            in5.setText(rs2.getString("ingredientsname"));
                            q5.setEnabled(true);
                            q5.setText(rs2.getString("ingredientsquantity"));
                            break;
                    }
                    ingredientNo = ingredientNo + 1;
                }
                rs2.close();
            } else {
                JOptionPane.showMessageDialog(null, "No Recipe Found. \n Please enter valid RecipeID.");
            }

            con.close();
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error in connectivity");
        }
    }//GEN-LAST:event_LoadBtnActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "surely wanna update the record?");
        if (ans == JOptionPane.YES_OPTION) {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           String db = "jdbc:mysql://localhost:3306/recipe_system?zeroDateTimeBehavior=convertToNull";
           Connection con = DriverManager.getConnection(db, "root", "P@ssw0rd");

                Statement stmt = con.createStatement();

                String query = "update recipe set Name='" + t20.getText() + "',Servings='" + t30.getText() +
                                       "',Directions='" + t40.getText() + "',Type='" + t50.getText() + "',prepTime='" 
                                       + t60.getText() + "' where RecipeID=" + t10.getText() + ";";
                stmt.executeUpdate(query);

                String query1 = "delete from recipeingredients where RecipeID=" + t10.getText() + ";";
                stmt.executeUpdate(query1);

                if (!isNullOrEmpty(in1.getText()) && !isNullOrEmpty(q1.getText())) {
                    String query11 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,"
                            + "`IngredientsQuantity`) VALUES (" + t10.getText() + " , '" + in1.getText() + "','"
                            + q1.getText() + "')";
                    stmt.executeUpdate(query11);
                }

                if (!isNullOrEmpty(in2.getText()) && !isNullOrEmpty(q2.getText())) {
                    String query12 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,"
                            + "`IngredientsQuantity`) VALUES (" + t10.getText() + " , '" + in2.getText() + "','" 
                            + q2.getText() + "')";
                    stmt.executeUpdate(query12);
                }

                if (!isNullOrEmpty(in3.getText()) && !isNullOrEmpty(q3.getText())) {
                    String query13 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,"
                            + "`IngredientsQuantity`) VALUES (" + t10.getText() + " , '" + in3.getText() + "','"
                            + q3.getText() + "')";
                    stmt.executeUpdate(query13);
                }

                if (!isNullOrEmpty(in4.getText()) && !isNullOrEmpty(q4.getText())) {
                    String query14 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,"
                            + "`IngredientsQuantity`) VALUES (" + t10.getText() + " , '" + in4.getText() +
                            "','" + q4.getText() + "')";
                    stmt.executeUpdate(query14);
                }

                if (!isNullOrEmpty(in5.getText()) && !isNullOrEmpty(q5.getText())) {
                    String query15 = "INSERT INTO recipeingredients (`RecipeID`, `IngredientsName`,"
                            + "`IngredientsQuantity`) VALUES (" + t10.getText() + " , '" + in5.getText() +
                            "','" + q5.getText() + "')";
                    stmt.executeUpdate(query15);
                }

                JOptionPane.showMessageDialog(null, "Recipe sucessfully updated!");

                t10.setText("");
                t20.setText("");
                t30.setText("");
                t40.setText("");
                t50.setText("");
                t60.setText("");
                
                in1.setText("");
                in2.setText("");
                in3.setText("");
                in4.setText("");
                in5.setText("");
                
                q1.setText("");
                q2.setText("");
                q3.setText("");
                q4.setText("");
                q5.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in table updation");

            }
        }
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private static boolean isNullOrEmpty(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }
       
    private void in4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in4ActionPerformed

    private void in5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in5ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

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
            java.util.logging.Logger.getLogger(update_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_recipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton LoadBtn;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JTextField in1;
    private javax.swing.JTextField in2;
    private javax.swing.JTextField in3;
    private javax.swing.JTextField in4;
    private javax.swing.JTextField in5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t20;
    private javax.swing.JTextField t30;
    private javax.swing.JTextArea t40;
    private javax.swing.JTextField t50;
    private javax.swing.JTextField t60;
    // End of variables declaration//GEN-END:variables
}
