package view;

import datatest.connect_person;
import interacters.person;


public class screen extends javax.swing.JFrame 
{

  
    public screen() 
    {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        father_name = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        mother_name = new javax.swing.JLabel();
        name_filed = new javax.swing.JTextField();
        dad_field = new javax.swing.JTextField();
        cpf_field = new javax.swing.JTextField();
        height_field = new javax.swing.JTextField();
        mom_field = new javax.swing.JTextField();
        age_field = new javax.swing.JTextField();
        sendB = new javax.swing.JButton();
        tableB = new javax.swing.JButton();
        alterB = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio do milhão");

        name.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        name.setText("Nome");

        age.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        age.setText("Idade");

        height.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        height.setText("Altura");

        father_name.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        father_name.setText("Nome do pai");

        cpf.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        cpf.setText("CPF");

        mother_name.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        mother_name.setText("Nome da mãe");

        sendB.setBackground(new java.awt.Color(0, 0, 0));
        sendB.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        sendB.setForeground(new java.awt.Color(255, 255, 255));
        sendB.setText("ENVIAR");
        sendB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sendB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBActionPerformed(evt);
            }
        });

        tableB.setBackground(new java.awt.Color(0, 0, 0));
        tableB.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tableB.setForeground(new java.awt.Color(255, 255, 255));
        tableB.setText("VISUALIZAR");
        tableB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tableB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableBActionPerformed(evt);
            }
        });

        alterB.setBackground(new java.awt.Color(0, 0, 0));
        alterB.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        alterB.setForeground(new java.awt.Color(255, 255, 255));
        alterB.setText("ALTERAR");
        alterB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        alterB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(height)
                        .addComponent(name)
                        .addComponent(age)
                        .addComponent(height_field, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(age_field)
                        .addComponent(name_filed))
                    .addComponent(sendB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(father_name)
                            .addComponent(dad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf_field, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf)
                            .addComponent(tableB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mother_name)
                            .addComponent(mom_field, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(alterB)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(mother_name))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_filed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mom_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(father_name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dad_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height)
                    .addComponent(cpf))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alterB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBActionPerformed
        
        person user = new  person();
        connect_person co_user = new connect_person();
        String Name = name_filed.getText();
        String Dname = dad_field.getText();
        String Mname = mom_field.getText();
        String Cpf = cpf_field.getText();
        int Age = Integer.parseInt(age_field.getText());
        float Height = Float.parseFloat(height_field.getText());
        
        Name = Name.toLowerCase();
        Dname = Dname.toLowerCase();
        Mname = Mname.toLowerCase();
        
        if (Cpf.length() > 6)
        {
            Cpf = Cpf.substring(0,6);
            user.setCpf(Cpf);
        }
        else
        {
            user.setCpf(Cpf);
        }
        
        if (Age <= 18) 
        {
            user.setMom_name(Mname);
            user.setDad_name(Dname);
        }
                
        user.setAge(Age);
        user.setName(Name);
        user.setHeight(Height);
        
        co_user.sign_in(user);
    }//GEN-LAST:event_sendBActionPerformed

    private void tableBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableBActionPerformed
        
        view_table assembly = new view_table();
        connect_person Tview = new connect_person();
        
        Tview.viewer();
        assembly.lister();
        
        assembly.setVisible(true);
        assembly.setDefaultCloseOperation(assembly.DISPOSE_ON_CLOSE); 
               
    }//GEN-LAST:event_tableBActionPerformed

    private void alterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterBActionPerformed

       alter_table assemb = new alter_table();
       connect_person Tview = new connect_person();
        
        
        
        
        assemb.setVisible(true);
        assemb.setDefaultCloseOperation(assemb.DISPOSE_ON_CLOSE);  
        
    }//GEN-LAST:event_alterBActionPerformed

    
    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField age_field;
    private javax.swing.JButton alterB;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpf_field;
    private javax.swing.JTextField dad_field;
    private javax.swing.JLabel father_name;
    private javax.swing.JLabel height;
    private javax.swing.JTextField height_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField mom_field;
    private javax.swing.JLabel mother_name;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_filed;
    private javax.swing.JButton sendB;
    private javax.swing.JButton tableB;
    // End of variables declaration//GEN-END:variables
}
