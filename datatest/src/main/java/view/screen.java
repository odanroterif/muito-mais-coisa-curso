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
        sendB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(height_field)
                            .addGap(78, 78, 78))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(height)
                                .addComponent(name_filed, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(age))
                        .addGap(222, 222, 222)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mom_field)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dad_field)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cpf_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cpf)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mother_name)
                            .addComponent(father_name))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(sendB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height)
                    .addComponent(cpf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sendB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpf_field;
    private javax.swing.JTextField dad_field;
    private javax.swing.JLabel father_name;
    private javax.swing.JLabel height;
    private javax.swing.JTextField height_field;
    private javax.swing.JTextField mom_field;
    private javax.swing.JLabel mother_name;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_filed;
    private javax.swing.JButton sendB;
    // End of variables declaration//GEN-END:variables
}
