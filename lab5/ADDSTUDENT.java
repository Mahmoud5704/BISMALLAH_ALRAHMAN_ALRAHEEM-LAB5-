package gui;
import backend.Login;
import backend.StudentOperations;
import backend.StudentModule;
import validation.Validation;
import java.awt.Dimension;
import javax.swing.InputVerifier;
import javax.swing.JFrame;

public class ADDSTUDENT extends javax.swing.JPanel {
    private JFrame frame;
    public ADDSTUDENT() {
        initComponents();
    }
   @Override
    public void setVisible(boolean f) {
        if (f) {
            frame = new JFrame("Add Student");
      //      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(this);
            frame.setPreferredSize(new Dimension(788, 400));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ///////////////////////////////////////////////////////
            IDVerifierObj = Validation.getIDVerifier(IDField);
            IDField.setInputVerifier(IDVerifierObj);
            nameVerifierObj = Validation.getNameVerifier(nameField);
            nameField.setInputVerifier(nameVerifierObj);
            GPAVerifierObj = Validation.getGPAVerifier(gradeField);
            gradeField.setInputVerifier(GPAVerifierObj);
            departmentVerifierObj = Validation.getDepartmentVerifier(DepartmentField);
            DepartmentField.setInputVerifier(departmentVerifierObj);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
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

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("name");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELOott\\Documents\\NetBeansProjects\\GUII\\ADD.JPG (2).jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel1.setMinimumSize(new java.awt.Dimension(80, 29));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 370));

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

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
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
        IDField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDFieldFocusLost(evt);
            }
        });
        IDField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                IDFieldInputMethodTextChanged(evt);
            }
        });
        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });
        IDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDFieldKeyTyped(evt);
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
        jLabel15.setText("ADD STUDENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(Add))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(98, 98, 98))
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
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(jButton2))
                .addGap(28, 28, 28))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 490, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        boolean condition = IDVerifierObj.getIsValid() && nameVerifierObj.getIsValid() && GPAVerifierObj.getIsValid() && departmentVerifierObj.getIsValid(); //all must be valid
        if(!condition)
            return;
        String name = nameField.getText();
        String ID = IDField.getText();
        String department = DepartmentField.getText();
        String grade = gradeField.getText();
        String age = (String) ageBox.getSelectedItem();
        String gender = (String) genderBox.getSelectedItem();
        StudentOperations operator = new StudentOperations();
        StudentModule student = new StudentModule(Integer.parseInt(ID), name, Integer.parseInt(age), gender, department, Double.parseDouble(grade));
        boolean success = operator.AddStudent(student);
        String message;
        if(success)
            message = "Student added successfully!";
        else
            message = "error adding student... make sure another student doesn't have this ID";
        javax.swing.JOptionPane.showMessageDialog(frame, message);
    }//GEN-LAST:event_AddActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MAIN().setVisible(true);
        frame.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IDFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_IDFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldInputMethodTextChanged

    private void IDFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldKeyTyped

    private void IDFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldFocusLost

    private void IDFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField DepartmentField;
    private javax.swing.JTextField IDField;
    private javax.swing.JComboBox<String> ageBox;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JTextField gradeField;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
   private Validation.IDVerifier IDVerifierObj;
   private Validation.nameVerifier nameVerifierObj;
   private Validation.GPAVerifier GPAVerifierObj;
   private Validation.departmentVerifier departmentVerifierObj;
}
