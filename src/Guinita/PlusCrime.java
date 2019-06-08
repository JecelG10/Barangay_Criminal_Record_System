/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guinita;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author God Of War
 */
public class PlusCrime extends javax.swing.JFrame {

    public PlusCrime() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Connection getConection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/addcrime", "root", "");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paara = new javax.swing.JPanel();
        tfSYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfVictim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfSAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfSAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfWitness = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfCase = new javax.swing.JTextField();
        tfWAge = new javax.swing.JTextField();
        cbGender = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        tfWAddress = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        Lcha = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTanan = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        LBlank = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        paara.setBackground(new java.awt.Color(0, 51, 51));

        tfSYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSYearActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Victim Name");

        tfVictim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVictimActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");

        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Victim Age");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        tfSAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSAgeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Barangay Criminal Record");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Victim Address");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Criminal case");

        tfSAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSAddressActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Witness Name");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Birthdate");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        tfWitness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWitnessActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Witness Age");

        tfCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCaseActionPerformed(evt);
            }
        });

        tfWAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWAgeActionPerformed(evt);
            }
        });

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        cbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenderActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Witness Address");

        tfWAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWAddressActionPerformed(evt);
            }
        });

        tfYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfYearActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Summoned Date");

        btnAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblTanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Case", "Gender", "Birthdate", "Age", "Address", "Summoned Date", "Victim Name", "Age", "Address", "Witness Name", "Age", "Address"
            }
        ));
        tblTanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTanan);

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paaraLayout = new javax.swing.GroupLayout(paara);
        paara.setLayout(paaraLayout);
        paaraLayout.setHorizontalGroup(
            paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paaraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paaraLayout.createSequentialGroup()
                        .addComponent(Lcha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paaraLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(26, 26, 26)
                                .addComponent(btnDelete)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paaraLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(paaraLayout.createSequentialGroup()
                                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21)
                                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paaraLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(LBlank, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfSYear, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(paaraLayout.createSequentialGroup()
                                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                .addComponent(tfYear, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfCase, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(141, 141, 141)
                                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfVictim, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfWAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfWAge, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfWitness, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfSAge, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfSAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(219, Short.MAX_VALUE))))
            .addGroup(paaraLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(173, 173, 173)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paaraLayout.setVerticalGroup(
            paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paaraLayout.createSequentialGroup()
                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paaraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfVictim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfSAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfSAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(tfWAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfSYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfWitness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfWAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Lcha))
                    .addGroup(paaraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBlank)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))))
                .addContainerGap(407, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(paara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String url;
        Connection conn = null;

        try {
            url = "jdbc:mysql://localhost:3306/crime";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, "user", "user");

            Statement s = conn.createStatement();
            s.executeUpdate("INSERT INTO addcrime (tfName,tfCase,cbGender,tfYear,tfAge,tfAddress,tfSYear,tfVictim,tfSAge,tfSAddress,tfWitness,tfWAge,tfWAddress) values ('" + tfName.getText() + "', '" + tfCase.getText() + "','" + cbGender.getSelectedItem() + "','" + tfYear.getText() + "', '" + tfAge.getText() + "', '" + tfAddress.getText() + "', '" + tfSYear.getText() + "', '" + tfVictim.getText() + "', '" + tfSAge.getText() + "', '" + tfSAddress.getText() + "', '" + tfWitness.getText() + "', '" + tfWAge.getText() + "', '" + tfWAddress.getText() + "')");
            JOptionPane.showMessageDialog(null, "Crime  added");

            System.out.println("Database Connected");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        DefaultTableModel model = (DefaultTableModel) tblTanan.getModel();
        if (!tfName.getText().trim().equals("")) {
            model.addRow(new Object[]{tfName.getText(), tfCase.getText(), cbGender.getSelectedItem().toString(),
                tfYear.getText(), tfAge.getText(), tfAddress.getText(),
                tfSYear.getText(), tfVictim.getText(), tfSAge.getText(), tfSAddress.getText(),
                tfWitness.getText(), tfWAge.getText(), tfWAddress.getText()});

        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void tfYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfYearActionPerformed
        String yer = tfYear.getText();
    }//GEN-LAST:event_tfYearActionPerformed

    private void cbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenderActionPerformed
        String gend = cbGender.getSelectedItem().toString();
    }//GEN-LAST:event_cbGenderActionPerformed

    private void tfCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCaseActionPerformed
        String crime = tfCase.getText();
    }//GEN-LAST:event_tfCaseActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        String name = tfName.getText();
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        String add = tfAddress.getText();
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        String edad = tfAge.getText();
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfWAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWAddressActionPerformed
        String add2 = tfWAddress.getText();
    }//GEN-LAST:event_tfWAddressActionPerformed

    private void tfWAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWAgeActionPerformed
        String edad2 = tfWAge.getText();
    }//GEN-LAST:event_tfWAgeActionPerformed

    private void tfWitnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWitnessActionPerformed
        String wit = tfWitness.getText();
    }//GEN-LAST:event_tfWitnessActionPerformed

    private void tfSAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSAddressActionPerformed
        String add = tfSAddress.getText();
    }//GEN-LAST:event_tfSAddressActionPerformed

    private void tfSAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSAgeActionPerformed
        String taon = tfSAge.getText();
    }//GEN-LAST:event_tfSAgeActionPerformed

    private void tfVictimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVictimActionPerformed
        String biktima = tfVictim.getText();
    }//GEN-LAST:event_tfVictimActionPerformed

    private void tfSYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSYearActionPerformed
        String yr = tfSYear.getText();
    }//GEN-LAST:event_tfSYearActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        tblTanan.setSize(588, 412);
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String url;
        Connection conn = null;

        try {
            url = "jdbc:mysql://localhost:3306/crime";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, "user", "user");

            Statement s = conn.createStatement();
            s.executeUpdate("UPDATE addcrime SET tfName='" + tfName.getText() + "', tfCase='" + tfCase.getText() + "', cbGender='" + cbGender.getSelectedItem() + "', tfYear='" + tfYear.getText() + "', tfAge='" + tfAge.getText() + "', tfAddress='" + tfAddress.getText() + "', tfSYear='" + tfSYear.getText() + "', tfVictim='" + tfVictim.getText() + "', tfSAge='" + tfSAge.getText() + "', tfSAddress='" + tfSAddress.getText() + "', tfWitness='" + tfWitness.getText() + "', tfWAge='" + tfWAge.getText() + "', tfWAddress='" + tfWAddress.getText() + "' WHERE tfName='" + tfName.getText() + "', tfCase='" + tfCase.getText() + "', cbGender='" + cbGender.getSelectedItem() + "', tfYear='" + tfYear.getText() + "', tfAge='" + tfAge.getText() + "', tfAddress='" + tfAddress.getText() + "', tfSYear='" + tfSYear.getText() + "', tfVictim='" + tfVictim + "', tfSAge='" + tfSAge + "', tfSAddress='" + tfSAddress.getText() + "', tfWitness='" + tfWitness.getText() + "', tfWAge='" + tfWAge.getText() + "', tfWAddress='" + tfWAddress.getText() + "'");
            JOptionPane.showMessageDialog(null, "Crime  Updated");

            System.out.println("Database Connected");
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        LBlank.setText(null);
        DefaultTableModel model = (DefaultTableModel) tblTanan.getModel();
        if (tblTanan.getSelectedRow() == 0) {
            if (tblTanan.getRowCount() == 0) {

            } else {
                model.setValueAt(tfName.getText(), tblTanan.getSelectedRow(), 0);
                model.setValueAt(tfCase.getText(), tblTanan.getSelectedRow(), 1);
                model.setValueAt(cbGender.getSelectedItem(), tblTanan.getSelectedRow(), 2);
                model.setValueAt(tfYear.getText(), tblTanan.getSelectedRow(), 3);
                model.setValueAt(tfAge.getText(), tblTanan.getSelectedRow(), 4);
                model.setValueAt(tfAddress.getText(), tblTanan.getSelectedRow(), 5);
                model.setValueAt(tfSYear.getText(), tblTanan.getSelectedRow(), 6);
                model.setValueAt(tfVictim.getText(), tblTanan.getSelectedRow(), 7);
                model.setValueAt(tfSAge.getText(), tblTanan.getSelectedRow(), 8);
                model.setValueAt(tfSAddress.getText(), tblTanan.getSelectedRow(), 9);
                model.setValueAt(tfWitness.getText(), tblTanan.getSelectedRow(), 10);
                model.setValueAt(tfWAge.getText(), tblTanan.getSelectedRow(), 11);
                model.setValueAt(tfWAddress.getText(), tblTanan.getSelectedRow(), 12);
            }
        } else {
            LBlank.setText("Table is empty!");
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FirstPage Info = new FirstPage();
        Info.setVisible(true);
        systemExit();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblTananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTananMouseClicked

        DefaultTableModel model = (DefaultTableModel) tblTanan.getModel();
        tfName.setText(model.getValueAt(tblTanan.getSelectedRow(), 0).toString());
        tfCase.setText(model.getValueAt(tblTanan.getSelectedRow(), 1).toString());
        cbGender.setSelectedItem(model.getValueAt(tblTanan.getSelectedRow(), 2).toString());
        tfYear.setText(model.getValueAt(tblTanan.getSelectedRow(), 3).toString());
        tfAge.setText(model.getValueAt(tblTanan.getSelectedRow(), 4).toString());
        tfAddress.setText(model.getValueAt(tblTanan.getSelectedRow(), 5).toString());
        tfSYear.setText(model.getValueAt(tblTanan.getSelectedRow(), 6).toString());
        tfVictim.setText(model.getValueAt(tblTanan.getSelectedRow(), 7).toString());
        tfSAge.setText(model.getValueAt(tblTanan.getSelectedRow(), 8).toString());
        tfSAddress.setText(model.getValueAt(tblTanan.getSelectedRow(), 9).toString());
        tfWitness.setText(model.getValueAt(tblTanan.getSelectedRow(), 10).toString());
        tfWAge.setText(model.getValueAt(tblTanan.getSelectedRow(), 11).toString());
        tfWAddress.setText(model.getValueAt(tblTanan.getSelectedRow(), 12).toString());

        systemExit();
    }//GEN-LAST:event_tblTananMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String url;
        Connection conn = null;

        try {
            url = "jdbc:mysql://localhost:3306/crime";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, "user", "user");

            Statement s = conn.createStatement();
            s.executeUpdate("DELETE FROM addcrime WHERE tfName='" + tfName.getText() + "', tfCase='" + tfCase.getText() + "', cbGender='" + cbGender.getSelectedItem() + "', tfYear='" + tfYear.getText() + "', tfAge='" + tfAge.getText() + "', tfAddress='" + tfAddress.getText() + "', tfSYear='" + tfSYear.getText() + "', tfVictim='" + tfVictim.getText() + "', tfSAge='" + tfSAge.getText() + "', tfSAddress='" + tfSAddress.getText() + "', tfWitness='" + tfWitness.getText() + "', tfWAge='" + tfWAge.getText() + "', tfWAddress='" + tfWAddress.getText() + "'");
            JOptionPane.showMessageDialog(null, "Crime  DELETE");

            System.out.println("Database Connected");
        } catch (Exception e) {
            System.out.println(e.toString());

            LBlank.setText(null);
            DefaultTableModel model = (DefaultTableModel) tblTanan.getModel();

            model.removeRow(tblTanan.getSelectedRow());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(PlusCrime.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlusCrime.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlusCrime.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlusCrime.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlusCrime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBlank;
    private javax.swing.JLabel Lcha;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paara;
    public static javax.swing.JTable tblTanan;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCase;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSAddress;
    private javax.swing.JTextField tfSAge;
    private javax.swing.JTextField tfSYear;
    private javax.swing.JTextField tfVictim;
    private javax.swing.JTextField tfWAddress;
    private javax.swing.JTextField tfWAge;
    private javax.swing.JTextField tfWitness;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
private void systemExit() {
        WindowEvent close = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

    }

}
