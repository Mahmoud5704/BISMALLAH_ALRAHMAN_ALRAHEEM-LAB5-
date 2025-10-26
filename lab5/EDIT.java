package lab5;

import javax.swing.JOptionPane;
import validation.Validation;
import backend.StudentOperations;
import backend.StudentModule;
import java.util.List;

public class EDIT extends javax.swing.JDialog {

    javax.swing.JTable edittable;
    private int row;
    private static int originalID;
    public EDIT(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
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
        nameField.setText(a);
        IDField.setText(b);//id
        DepartmentField.setText(c);
        gradeField.setText(d);//grade
        ageBox.setSelectedItem(e);
        genderBox.setSelectedItem(f);
    }

    public String[] getUpdatedData() {
        return new String[]{
            nameField.getText(),
            IDField.getText(),
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
        this.originalID = Integer.parseInt(col2);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(saveButton))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(168, 168, 168))
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(jButton2))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        boolean condition = IDVerifierObj.getIsValid() && nameVerifierObj.getIsValid() && GPAVerifierObj.getIsValid() && departmentVerifierObj.getIsValid(); //all must be valid
        if(!condition)
            return;
        String[] updatedData = getUpdatedData();
        StudentOperations operator = new StudentOperations();
        String name = nameField.getText();
        String ID = IDField.getText();
        String department = DepartmentField.getText();
        String grade = gradeField.getText();
        String age = ageBox.getSelectedItem().toString();
        String gender = genderBox.getSelectedItem().toString();
        StudentModule student = new StudentModule(Integer.parseInt(ID), name, Integer.parseInt(age), gender, department, Double.parseDouble(grade));
        boolean success = operator.UpdateStudent(originalID, student);
        for (int i = 0; i < updatedData.length; i++) {
            if (updatedData[i] == null) updatedData[i] = "";
            edittable.setValueAt(updatedData[i], row, i);
        }
        String message;
        if(success)
            message = "Data saved successfully!";
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
