/*
* The MIT License
*
* Copyright (c) 2019 Derick Felix
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
 */
package com.github.derickfelix.bankapplication.views.users;

import com.github.derickfelix.bankapplication.models.User;
import com.github.derickfelix.bankapplication.repositories.UserRepository;
import com.github.derickfelix.bankapplication.repositories.impl.RepositoryFactory;
import com.github.derickfelix.bankapplication.securities.AuthSecurity;
import com.github.derickfelix.bankapplication.utilities.MessageUtility;
import java.util.Optional;

public class UsersFrameForm extends javax.swing.JInternalFrame {

    private final MainForm mainForm;
    private final UserRepository repository;
    private User user;
    
    public UsersFrameForm(MainForm mainForm)
    {
        this.mainForm = mainForm;
        this.repository = (UserRepository) new RepositoryFactory().getInstance("user");
        initComponents();
        customSettings();
    }
    
    private void customSettings()
    {
        if (!AuthSecurity.isUserAdmin()) {
            cmbRole.removeItemAt(1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        toolbar = new javax.swing.JToolBar();
        tbtnAdd = new javax.swing.JButton();
        tbtnSave = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        paneInputs = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cmbRole = new javax.swing.JComboBox<>();
        lblRole = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Zwei Bank Application - User Form");

        toolbar.setFloatable(false);
        toolbar.setRollover(true);

        tbtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        tbtnAdd.setToolTipText("Add New");
        tbtnAdd.setFocusable(false);
        tbtnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tbtnAddActionPerformed(evt);
            }
        });
        toolbar.add(tbtnAdd);

        tbtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        tbtnSave.setToolTipText("Search");
        tbtnSave.setFocusable(false);
        tbtnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tbtnSaveActionPerformed(evt);
            }
        });
        toolbar.add(tbtnSave);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        paneInputs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        lblName.setText("Name");

        lblUsername.setText("Username");

        lblPassword.setText("Password");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Administrator" }));

        lblRole.setText("Role");

        javax.swing.GroupLayout paneInputsLayout = new javax.swing.GroupLayout(paneInputs);
        paneInputs.setLayout(paneInputsLayout);
        paneInputsLayout.setHorizontalGroup(
            paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName)
                    .addComponent(cmbRole, 0, 270, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneInputsLayout.setVerticalGroup(
            paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInputsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneInputsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(lblUsername)))
                .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneInputsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRole)
                        .addComponent(lblPassword)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toolbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave))
                .addGap(12, 12, 12))
        );

        setBounds(300, 100, 628, 286);
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tbtnSaveActionPerformed
    {//GEN-HEADEREND:event_tbtnSaveActionPerformed
        save();
    }//GEN-LAST:event_tbtnSaveActionPerformed

    private void tbtnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tbtnAddActionPerformed
    {//GEN-HEADEREND:event_tbtnAddActionPerformed
        clearForm();
    }//GEN-LAST:event_tbtnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
    {//GEN-HEADEREND:event_btnSaveActionPerformed
        save();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void clearForm()
    {
        txtName.setText("");
        txtUsername.setText("");
        cmbRole.setSelectedIndex(0);
        lblPassword.setVisible(true);
        txtPassword.setVisible(true);
        txtPassword.setText("");
    }
    
    private void save()
    {
        String name = txtName.getText();
        String username = txtUsername.getText();
        String role = cmbRole.getItemAt(cmbRole.getSelectedIndex());
        String password = new String(txtPassword.getPassword());
        
        if (name.isEmpty() || username.isEmpty() || role.isEmpty() || (user == null && password.isEmpty())) {
            MessageUtility.warning(mainForm, "There are invalid fields");
        } else {
            if (user == null) {
                user = new User();
                user.setPassword(password);
            }

            Optional<User> optional = repository.findByUsername(username);
            if (optional.isPresent() && !optional.get().getUsername().equals(user.getUsername())) {
                MessageUtility.warning(mainForm, "Username already in use!");
                return;
            }
            
            user.setName(name);
            user.setUsername(username);
            user.setRole(role);
            
            repository.save(user);
            
            MessageUtility.info(mainForm, "Content saved successfully!");
            clearForm();
        }
    }
    
    public UsersFrameForm setUser(User user)
    {
        this.user = user;
        
        txtName.setText(user.getName());
        txtUsername.setText(user.getUsername());
        lblPassword.setVisible(false);
        txtPassword.setVisible(false);
        
        int index = 0;
        for (int i = 0; i < cmbRole.getItemCount(); i++) {
            if (cmbRole.getItemAt(i).equals(user.getRole())) {
                index = i;
                break;
            }
        }

        cmbRole.setSelectedIndex(index);
        
        return this;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel paneInputs;
    private javax.swing.JButton tbtnAdd;
    private javax.swing.JButton tbtnSave;
    private javax.swing.JToolBar toolbar;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
