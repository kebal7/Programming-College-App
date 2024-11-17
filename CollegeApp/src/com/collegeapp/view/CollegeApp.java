package com.collegeapp.view;

import com.collegeapp.model.StudentModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kebal Badal LMU ID: 23048668
 */

public class CollegeApp extends javax.swing.JFrame {
    
    private final ArrayList<StudentModel> studentList;
    DefaultTableModel defaultTableModel;

    public CollegeApp() {
        initComponents();
        studentList = new ArrayList();
        addStudentInformation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlMainTitle = new javax.swing.JPanel();
        lblMainTitle = new javax.swing.JLabel();
        tabPaneMainBody = new javax.swing.JTabbedPane();
        tabHome = new javax.swing.JPanel();
        tabAdminControl = new javax.swing.JPanel();
        tabStudentList = new javax.swing.JPanel();
        lblStudentInfoTableTitle = new javax.swing.JLabel();
        scrlPaneStudentInfo = new javax.swing.JScrollPane();
        tblStudentInfoTable = new javax.swing.JTable();
        loginPanel = new javax.swing.JPanel();
        loginFieldHolderPanel = new javax.swing.JPanel();
        lblLoginTitle = new javax.swing.JLabel();
        txtFieldUsername = new javax.swing.JTextField();
        txtFieldPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        pnlMain.setBackground(new java.awt.Color(237, 223, 224));

        pnlMainTitle.setBackground(new java.awt.Color(22, 66, 60));

        lblMainTitle.setBackground(new java.awt.Color(22, 66, 60));
        lblMainTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMainTitle.setForeground(new java.awt.Color(255, 249, 246));
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("Student Management Application");

        javax.swing.GroupLayout pnlMainTitleLayout = new javax.swing.GroupLayout(pnlMainTitle);
        pnlMainTitle.setLayout(pnlMainTitleLayout);
        pnlMainTitleLayout.setHorizontalGroup(
            pnlMainTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainTitleLayout.setVerticalGroup(
            pnlMainTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainTitleLayout.createSequentialGroup()
                .addComponent(lblMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
        );

        tabPaneMainBody.setBackground(new java.awt.Color(106, 156, 137));
        tabPaneMainBody.setForeground(new java.awt.Color(255, 255, 255));
        tabPaneMainBody.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        tabHome.setBackground(new java.awt.Color(106, 156, 137));

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        tabPaneMainBody.addTab("Home", tabHome);

        tabAdminControl.setBackground(new java.awt.Color(106, 156, 137));

        javax.swing.GroupLayout tabAdminControlLayout = new javax.swing.GroupLayout(tabAdminControl);
        tabAdminControl.setLayout(tabAdminControlLayout);
        tabAdminControlLayout.setHorizontalGroup(
            tabAdminControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        tabAdminControlLayout.setVerticalGroup(
            tabAdminControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        tabPaneMainBody.addTab("Admin Control", tabAdminControl);

        tabStudentList.setBackground(new java.awt.Color(106, 156, 137));

        lblStudentInfoTableTitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblStudentInfoTableTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentInfoTableTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentInfoTableTitle.setText("Student Information Table");

        tblStudentInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LMU_ID", "Full Name", "Program", "Contact No.", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentInfoTable.getTableHeader().setReorderingAllowed(false);
        scrlPaneStudentInfo.setViewportView(tblStudentInfoTable);
        if (tblStudentInfoTable.getColumnModel().getColumnCount() > 0) {
            tblStudentInfoTable.getColumnModel().getColumn(0).setResizable(false);
            tblStudentInfoTable.getColumnModel().getColumn(1).setResizable(false);
            tblStudentInfoTable.getColumnModel().getColumn(2).setResizable(false);
            tblStudentInfoTable.getColumnModel().getColumn(3).setResizable(false);
            tblStudentInfoTable.getColumnModel().getColumn(4).setMinWidth(40);
            tblStudentInfoTable.getColumnModel().getColumn(4).setMaxWidth(40);
        }

        javax.swing.GroupLayout tabStudentListLayout = new javax.swing.GroupLayout(tabStudentList);
        tabStudentList.setLayout(tabStudentListLayout);
        tabStudentListLayout.setHorizontalGroup(
            tabStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStudentListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlPaneStudentInfo)
                    .addGroup(tabStudentListLayout.createSequentialGroup()
                        .addComponent(lblStudentInfoTableTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 371, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabStudentListLayout.setVerticalGroup(
            tabStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStudentListLayout.createSequentialGroup()
                .addComponent(lblStudentInfoTableTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlPaneStudentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );

        tabPaneMainBody.addTab("Student List", tabStudentList);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneMainBody)
                .addGap(93, 93, 93))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPaneMainBody)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("College App");
        setMaximumSize(new java.awt.Dimension(700, 450));
        setMinimumSize(new java.awt.Dimension(700, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 450));

        loginPanel.setMaximumSize(new java.awt.Dimension(700, 450));
        loginPanel.setMinimumSize(new java.awt.Dimension(700, 450));
        loginPanel.setPreferredSize(new java.awt.Dimension(700, 450));

        loginFieldHolderPanel.setBackground(new java.awt.Color(106, 156, 137));
        loginFieldHolderPanel.setMaximumSize(new java.awt.Dimension(350, 450));
        loginFieldHolderPanel.setMinimumSize(new java.awt.Dimension(350, 450));
        loginFieldHolderPanel.setPreferredSize(new java.awt.Dimension(350, 450));

        lblLoginTitle.setBackground(new java.awt.Color(22, 66, 60));
        lblLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(255, 249, 246));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Login To Your System");

        txtFieldUsername.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));
        txtFieldUsername.setMaximumSize(new java.awt.Dimension(100, 30));
        txtFieldUsername.setMinimumSize(new java.awt.Dimension(100, 30));
        txtFieldUsername.setPreferredSize(new java.awt.Dimension(100, 30));
        txtFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsernameActionPerformed(evt);
            }
        });

        txtFieldPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        txtFieldPassword.setMaximumSize(new java.awt.Dimension(100, 30));
        txtFieldPassword.setMinimumSize(new java.awt.Dimension(100, 30));
        txtFieldPassword.setPreferredSize(new java.awt.Dimension(100, 30));
        txtFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPasswordActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginFieldHolderPanelLayout = new javax.swing.GroupLayout(loginFieldHolderPanel);
        loginFieldHolderPanel.setLayout(loginFieldHolderPanelLayout);
        loginFieldHolderPanelLayout.setHorizontalGroup(
            loginFieldHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFieldHolderPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(loginFieldHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginFieldHolderPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(loginFieldHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        loginFieldHolderPanelLayout.setVerticalGroup(
            loginFieldHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFieldHolderPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        txtFieldPassword.getAccessibleContext().setAccessibleName("Password");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(loginFieldHolderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 350, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFieldHolderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUsernameActionPerformed

    private void txtFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        pnlMain.setVisible(true);
        loginPanel.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void addStudentInformation()
    {
        StudentModel student1= new StudentModel(123,"Ronish Prajapati", "Artificial Intelligence", "981234567", (short)21);
        StudentModel student2= new StudentModel(124,"Prashant Rijal", "Artificial Intelligence", "9812342567", (short)25);
        
        studentList.add(student1);
        addToTable(student1);
        studentList.add(student2);
        addToTable(student2);
    
    }
    
    private void addToTable(StudentModel student)
    {
        defaultTableModel = (DefaultTableModel) tblStudentInfoTable.getModel();
        defaultTableModel.addRow(new Object[] {student.getLmuId(), student.getName(), 
                                    student.getProgram(), student.getContact(), student.getAge()});
    }
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
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollegeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollegeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JLabel lblStudentInfoTableTitle;
    private javax.swing.JPanel loginFieldHolderPanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMainTitle;
    private javax.swing.JScrollPane scrlPaneStudentInfo;
    private javax.swing.JPanel tabAdminControl;
    private javax.swing.JPanel tabHome;
    private javax.swing.JTabbedPane tabPaneMainBody;
    private javax.swing.JPanel tabStudentList;
    private javax.swing.JTable tblStudentInfoTable;
    private javax.swing.JTextField txtFieldPassword;
    private javax.swing.JTextField txtFieldUsername;
    // End of variables declaration//GEN-END:variables
}
