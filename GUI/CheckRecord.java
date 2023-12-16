/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author waiho
 */
public class CheckRecord extends javax.swing.JFrame {

    /**
     * Creates new form CheckRecord
     */
    public CheckRecord() {
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

        CheckRecordPanel = new javax.swing.JPanel();
        NaviBar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Wednesday = new javax.swing.JLabel();
        ManageInfo = new javax.swing.JLabel();
        ManageApplication = new javax.swing.JLabel();
        CheckRecord = new javax.swing.JLabel();
        Report = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        CStudentRecord = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saitable = new javax.swing.JTable();
        stdrcd = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        ShowAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        spitable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CheckRecordPanel.setBackground(new java.awt.Color(74, 31, 61));
        CheckRecordPanel.setPreferredSize(new java.awt.Dimension(852, 550));
        CheckRecordPanel.setLayout(null);

        NaviBar.setBackground(new java.awt.Color(74, 31, 61));
        NaviBar.setMinimumSize(new java.awt.Dimension(852, 80));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N

        Wednesday.setBackground(new java.awt.Color(255, 255, 255));
        Wednesday.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Wednesday.setForeground(new java.awt.Color(255, 255, 255));
        Wednesday.setText("WEDNESDAY");

        ManageInfo.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageInfo.setForeground(new java.awt.Color(255, 255, 255));
        ManageInfo.setText("Manage Info");
        ManageInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageInfoMouseClicked(evt);
            }
        });

        ManageApplication.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageApplication.setForeground(new java.awt.Color(255, 255, 255));
        ManageApplication.setText("Manage Application");
        ManageApplication.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageApplicationMouseClicked(evt);
            }
        });

        CheckRecord.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        CheckRecord.setForeground(new java.awt.Color(255, 255, 255));
        CheckRecord.setText("Check Record");
        CheckRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckRecordMouseClicked(evt);
            }
        });

        Report.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Report.setForeground(new java.awt.Color(255, 255, 255));
        Report.setText("Report");
        Report.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NaviBarLayout = new javax.swing.GroupLayout(NaviBar);
        NaviBar.setLayout(NaviBarLayout);
        NaviBarLayout.setHorizontalGroup(
            NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBarLayout.createSequentialGroup()
                .addGroup(NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NaviBarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Wednesday))
                    .addGroup(NaviBarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(ManageApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageInfo)
                .addGap(18, 18, 18)
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        NaviBarLayout.setVerticalGroup(
            NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ManageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ManageApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Wednesday, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        CheckRecordPanel.add(NaviBar);
        NaviBar.setBounds(0, 0, 852, 100);
        CheckRecordPanel.add(jSeparator1);
        jSeparator1.setBounds(0, 180, 850, 20);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(852, 80));

        CStudentRecord.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        CStudentRecord.setForeground(new java.awt.Color(74, 31, 61));
        CStudentRecord.setText("Check Student Record");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(CStudentRecord)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(CStudentRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        CheckRecordPanel.add(jPanel2);
        jPanel2.setBounds(0, 100, 852, 80);

        saitable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Applicatoin ID", "Student ID", "Full Name", "Gender", "Room Type", "Arrival", "Check Out", "Status", "Payment", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(saitable);

        CheckRecordPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 420, 810, 120);
        CheckRecordPanel.add(stdrcd);
        stdrcd.setBounds(340, 200, 250, 30);

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        CheckRecordPanel.add(Search);
        Search.setBounds(600, 200, 110, 30);

        ShowAll.setText("Show All");
        ShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllActionPerformed(evt);
            }
        });
        CheckRecordPanel.add(ShowAll);
        ShowAll.setBounds(720, 200, 110, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID : ");
        CheckRecordPanel.add(jLabel1);
        jLabel1.setBounds(260, 200, 70, 30);

        spitable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Password", "Full Name", "Mobile Number", "IC/Passport", "Country", "Email", "Address", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(spitable);

        CheckRecordPanel.add(jScrollPane2);
        jScrollPane2.setBounds(20, 270, 810, 110);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Accommodation Info :");
        CheckRecordPanel.add(jLabel2);
        jLabel2.setBounds(20, 390, 190, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Personal Info :");
        CheckRecordPanel.add(jLabel3);
        jLabel3.setBounds(20, 240, 190, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CheckRecordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CheckRecordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageInfoMouseClicked
        // TODO add your handling code here:
        AdminPage ap = new AdminPage();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageInfoMouseClicked

    private void ManageApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageApplicationMouseClicked
        // TODO add your handling code here:
        ManageApplication ma = new ManageApplication();
        ma.setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageApplicationMouseClicked

    private void CheckRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckRecordMouseClicked
        // TODO add your handling code here:
        CheckRecord cr = new CheckRecord();
        cr.setVisible(true);
        dispose();

    }//GEN-LAST:event_CheckRecordMouseClicked

    private void ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseClicked
        // TODO add your handling code here:
        Report r = new Report();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReportMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                WelcomePage wp = new WelcomePage();
                wp.setVisible(true);
                dispose();
            } else {
                JOptionPane.getRootFrame().dispose();
            }
    }//GEN-LAST:event_LogoutMouseClicked

    private void ShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllActionPerformed
        // TODO add your handling code here:
        try (BufferedReader reader = new BufferedReader(new FileReader("StudentDetails.txt"))) {
                DefaultTableModel dtm = (DefaultTableModel) spitable.getModel();
                Object[] lines = reader.lines().toArray();
                dtm.setRowCount(0);
                for (Object line : lines) {
                    String[] parts = line.toString().split(">");
                    dtm.addRow(parts);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        
        try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                DefaultTableModel dtm = (DefaultTableModel) saitable.getModel();
                Object[] lines = reader.lines().toArray();
                dtm.setRowCount(0);
                for (Object line : lines) {
                    String[] parts = line.toString().split(">");
                    dtm.addRow(parts);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
    }//GEN-LAST:event_ShowAllActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        String input = stdrcd.getText();
        try {
            DefaultTableModel dtm = (DefaultTableModel) spitable.getModel();
            dtm.setRowCount(0);
            boolean applicationFound = false;
                    try (BufferedReader reader = new BufferedReader(new FileReader("StudentDetails.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] parts = line.split(">");
                            String rn = parts[0];                        
                        if (input.equals(rn)) {
                            dtm.addRow(parts);
                            applicationFound = true;
                            break;
                        }
                        else if(!input.equals(rn)){
                            applicationFound = false;
                        }
                        }
                    }                    
                    
                    if (applicationFound==false) {
                        JOptionPane.showMessageDialog(null, "Student ID not found.");
                    }
                    
                } catch (IOException ex) {
                    Logger.getLogger(ManageApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        try {
            DefaultTableModel dtm = (DefaultTableModel) saitable.getModel();
            dtm.setRowCount(0);
            boolean applicationFound = false;
                    try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] parts = line.split(">");
                            String rn = parts[1];                        
                        if (input.equals(rn)) {
                            dtm.addRow(parts);
                            applicationFound = true;
                            break;
                        }
                        else if(!input.equals(rn)){
                            applicationFound = false;
                        }
                        }
                    }                    
                    
                    if (applicationFound==false) {
                        JOptionPane.showMessageDialog(null, "Student ID not found.");
                    }
                    
                } catch (IOException ex) {
                    Logger.getLogger(ManageApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(CheckRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CStudentRecord;
    private javax.swing.JLabel CheckRecord;
    private javax.swing.JPanel CheckRecordPanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel ManageApplication;
    private javax.swing.JLabel ManageInfo;
    private javax.swing.JPanel NaviBar;
    private javax.swing.JLabel Report;
    private javax.swing.JButton Search;
    private javax.swing.JButton ShowAll;
    private javax.swing.JLabel Wednesday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable saitable;
    private javax.swing.JTable spitable;
    private javax.swing.JTextField stdrcd;
    // End of variables declaration//GEN-END:variables
}