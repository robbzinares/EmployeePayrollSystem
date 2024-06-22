/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;

/**
 *
 */
import employee.payroll.system.LOGINCONNECTION.db;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class users extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public users() {
        initComponents();
        conn = db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        Fillcombo();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        cmd_add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        txt_combo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_dep = new javax.swing.JTextField();
        cmd_delete = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmd_viewInfo = new javax.swing.JButton(); // New button for viewing personal information

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmd_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Save-icon.png")));
        cmd_add.setText("Add ");
        cmd_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_addActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login_Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 18)));

        jLabel1.setText("Select Users");

        txt_combo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                txt_comboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel3.setText("Password");

        jLabel2.setText("Username");

        jLabel4.setText("Id");

        txt_id.setEditable(false);

        jLabel5.setText("Division");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addGap(29, 29, 29))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(20, 20, 20)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_dep)
                                        .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_username, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                        .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txt_dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addContainerGap())
        );

        cmd_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/delete_16x16.gif")));
        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmd_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/update icon.png")));
        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/erase-128.png")));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        // Adding the new View Info button
        cmd_viewInfo.setText("View Info");
        cmd_viewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_viewInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmd_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmd_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmd_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmd_viewInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) // Add view info button to the panel
                                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cmd_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmd_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmd_update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmd_viewInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))) // Align view info button
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
        );

        pack();
    }

    // Event for the Add button
    private void cmd_addActionPerformed(java.awt.event.ActionEvent evt) {
        String sql = "insert into Users (username, password, division) values (?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.setString(2, txt_password.getText());
            pst.setString(3, txt_dep.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Data is saved successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }

    // Event for the Delete button
    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {
        String sql = "delete from Users where username = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data deleted successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }

    // Event for the Update button
    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {
        String sql = "update Users set username = ?, password = ?, division = ? where id = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.setString(2, txt_password.getText());
            pst.setString(3, txt_dep.getText());
            pst.setString(4, txt_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }

    // Event for the Clear button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        txt_id.setText("");
        txt_username.setText("");
        txt_password.setText("");
        txt_dep.setText("");
    }

    // Event for the combo box
    private void txt_comboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
        String tmp = (String) txt_combo.getSelectedItem();
        String sql = "select * from Users where username=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("id");
                txt_id.setText(add1);
                String add2 = rs.getString("username");
                txt_username.setText(add2);
                String add3 = rs.getString("password");
                txt_password.setText(add3);
                String add4 = rs.getString("division");
                txt_dep.setText(add4);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // New method for viewing personal information
    private void cmd_viewInfoActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txt_username.getText();
        String sql = "select * from Users where username=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            if (rs.next()) {
                String info = "ID: " + rs.getString("id") + "\n" +
                        "Username: " + rs.getString("username") + "\n" +
                        "Password: " + rs.getString("password") + "\n" +
                        "Division: " + rs.getString("division");
                JOptionPane.showMessageDialog(null, info);
            } else {
                JOptionPane.showMessageDialog(null, "User not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Fillcombo() {
        try {
            String sql = "select * from Users";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("username");
                txt_combo.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void Update_table() {
        // Implement the table update functionality if needed
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new users().setVisible(true);
            }
        });
    }

    private javax.swing.JButton cmd_add;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton cmd_viewInfo; // Declaration of new View Info button
    private javax.swing.JComboBox txt_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
}
