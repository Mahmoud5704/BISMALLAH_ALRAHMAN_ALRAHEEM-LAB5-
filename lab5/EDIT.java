package lab5;

import javax.swing.JOptionPane;
import validation.Validation;
import backend.StudentOperations;
import backend.StudentModule;
import backend.TableLoader;
import javax.swing.table.DefaultTableModel;

public class EDIT extends javax.swing.JDialog {

    javax.swing.JTable edittable;
    private int row;
    private static int originalID;
    private static String iname;
    private static String iID;
    private static String idepartment;
    private static String igrade;
    private static String iage;
    private static String igender;
    public EDIT(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        ////////////////////////////////////////////////////////////
        IDVerifierObj = Validation.getIDVerifier(IDField);
        IDField.setInputVerifier(IDVerifierObj);
        nameVerifierObj = Validation.getNameVerifier(nameField);
        nameField.setInputVerifier(nameVerifierObj);
        GPAVerifierObj = Validation.getGPAVerifier(gradeField);
        gradeField.setInputVerifier(GPAVerifierObj);
        departmentVerifierObj = Validation.getDepartmentVerifier(DepartmentField);
        DepartmentField.setInputVerifier(departmentVerifierObj);
        
    }

    public void setFields(String a, String b, String c, String d, String e, String f) {
        nameField.setText(b);
        IDField.setText(a);//id
        DepartmentField.setText(c);
        gradeField.setText(d);//grade
        ageBox.setSelectedItem(e);
        genderBox.setSelectedItem(f);
    }

    public String[] getUpdatedData() {
        return new String[]{
           IDField.getText() ,
            nameField.getText(),
            DepartmentField.getText(),
            gradeField.getText(),
            ageBox.getSelectedItem().toString(),
            genderBox.getSelectedItem().toString()};
    }

    public void openEditDialogForRow(java.awt.Frame parent, int row, javax.swing.JTable edittable) {
        String col1 = (edittable.getValueAt(row, 0) == null) ? "" : edittable.getValueAt(row, 0).toString();
        String col2 = (edittable.getValueAt(row, 1) == null) ? "" : edittable.getValueAt(row, 1).toString();
        String col3 = (edittable.getValueAt(row, 2) == null) ? "" : edittable.getValueAt(row, 2).toString();
        String col4 = (edittable.getValueAt(row, 3) == null) ? "" : edittable.getValueAt(row, 3).toString();
        String col5 = (edittable.getValueAt(row, 4) == null) ? "" : edittable.getValueAt(row, 4).toString();
        String col6 = (edittable.getValueAt(row, 5) == null) ? "" : edittable.getValueAt(row, 5).toString();
        EDIT.originalID = Integer.parseInt(col1);
        iname = col2;
        iID = col1;
        idepartment = col3;
        igrade = col4;
        iage = col5;
        igender = col6;
        EDIT dialog = new EDIT(parent, true);
        dialog.row = row;
        dialog.edittable = edittable;
        dialog.setFields(col1, col2, col3, col4, col5, col6);
        dialog.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ageBox = new javax.swing.JComboBox<>();
        genderBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        DepartmentField = new javax.swing.JTextField();
        gradeField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setToolTipText("ADD STUDENT");

        nameField.setBackground(new java.awt.Color(0, 0, 102));
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField.setSelectionColor(new java.awt.Color(255, 255, 255));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        saveButton.setText("save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ageBox.setBackground(new java.awt.Color(0, 0, 102));
        ageBox.setForeground(new java.awt.Color(255, 255, 255));
        ageBox.setMaximumRowCount(7);
        ageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35" }));
        ageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageBoxActionPerformed(evt);
            }
        });

        genderBox.setBackground(new java.awt.Color(0, 0, 102));
        genderBox.setForeground(new java.awt.Color(255, 255, 255));
        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STUDENT ID");

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("STUDENT name");

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DEPARTMENT");

        jLabel12.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GRADE");

        jLabel13.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AGE");

        jLabel14.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("GENDER");

        IDField.setBackground(new java.awt.Color(0, 0, 102));
        IDField.setForeground(new java.awt.Color(255, 255, 255));
        IDField.setCaretColor(new java.awt.Color(255, 255, 255));
        IDField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });

        DepartmentField.setBackground(new java.awt.Color(0, 0, 102));
        DepartmentField.setForeground(new java.awt.Color(255, 255, 255));
        DepartmentField.setCaretColor(new java.awt.Color(255, 255, 255));
        DepartmentField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DepartmentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentFieldActionPerformed(evt);
            }
        });

        gradeField.setBackground(new java.awt.Color(0, 0, 102));
        gradeField.setForeground(new java.awt.Color(255, 255, 255));
        gradeField.setCaretColor(new java.awt.Color(255, 255, 255));
        gradeField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        gradeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("edit STUDENT");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ⓘ Full name only, a full name consists of 3 to 4 names");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ⓘ ID must be 5 digits");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html>ⓘdepartment name must be 2 to 200 characters long<br>(letters only)</html>");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ⓘ GPA between 0 and 4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(184, 184, 184))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField)
                                    .addComponent(DepartmentField))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(33, 33, 33)
                        .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(gradeField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String tail = " field is incorrect \n";
        String error_message = "";
        String name = nameField.getText();
        String ID = IDField.getText();
        String department = DepartmentField.getText();
        String grade = gradeField.getText();
        String age = ageBox.getSelectedItem().toString();
        String gender = genderBox.getSelectedItem().toString();
        if(!IDVerifierObj.getIsValid() && !ID.equals(iID))
            error_message += "ID" + tail;
        if(!nameVerifierObj.getIsValid() && !name.equals(iname))
            error_message += "name" + tail;
        if(!GPAVerifierObj.getIsValid() && !grade.equals(igrade))
            error_message += "grade" + tail;
        if(!departmentVerifierObj.getIsValid() && !department.equals(idepartment))
            error_message += "department" + tail;
        if(!error_message.equals("")){ //message not empty?
            javax.swing.JOptionPane.showMessageDialog(this, error_message);
            return;
        }
        StudentOperations operator = new StudentOperations();
        StudentModule student = new StudentModule(Integer.parseInt(ID), name, Integer.parseInt(age), gender, department, Double.parseDouble(grade));
        boolean success = operator.UpdateStudent(originalID, student);
        String message;
        if(success){
            message = "Data saved successfully!";
        }
        else
            message = "Error: student not found or another student has the entered ID";
        JOptionPane.showMessageDialog(this, message);
        dispose(); 
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageBoxActionPerformed

    private void genderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderBoxActionPerformed

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldActionPerformed

    private void DepartmentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentFieldActionPerformed

    private void gradeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    /*  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
 /*  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
 /*  java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                EDIT dialog = new EDIT(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DepartmentField;
    private javax.swing.JTextField IDField;
    private javax.swing.JComboBox<String> ageBox;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JTextField gradeField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
    private Validation.IDVerifier IDVerifierObj;
    private Validation.nameVerifier nameVerifierObj;
    private Validation.GPAVerifier GPAVerifierObj;
    private Validation.departmentVerifier departmentVerifierObj;
}
