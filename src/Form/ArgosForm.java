/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author avdus
 */
import javax.swing.table.DefaultTableModel;

public class ArgosForm extends javax.swing.JFrame {

    private void addMockStudentData() {
        resultTableModel.addRow(new Object[]{"������ ���� ���������", 25, "+7 (903) 322 22 30", "������ ���22"});
        resultTableModel.addRow(new Object[]{"������ ���� �������������", 22, "+7 (800) 555 35 35", "������ ���33"});
        resultTableModel.addRow(new Object[]{"������� ����� ���������", 12, "+7 (903) 555 34 12", "������ ���33"});
        resultTableModel.addRow(new Object[]{"�������� ������ ����������", 19, "+7 (800) 555 35 35", "������ ���10"});
        resultTableModel.addRow(new Object[]{"������� ������� ���������", 18, "+7 (900) 777 88 99", "������ ���12"});
        resultTableModel.addRow(new Object[]{"����� ����� ����������", 18, "+7 (905) 111 22 33", "������ ���12"});
        resultTableModel.addRow(new Object[]{"�������� ����� ������������", 21, "+7 (905) 123 45 67", "������ ���22"});
        resultTableModel.addRow(new Object[]{"��������� ��������� ��������", 20, "+7 (905) 234 56 78", "������ ���12"});
        resultTableModel.addRow(new Object[]{"�������� ������ ���������", 23, "+7 (905) 345 67 89", "������ ���22"});
        resultTableModel.addRow(new Object[]{"������ ��������� ����������", 22, "+7 (905) 456 78 90", "������ ���33"});
        resultTableModel.addRow(new Object[]{"������ ����� ������������", 24, "+7 (900) 888 77 66", "������ ���12"});
        resultTableModel.addRow(new Object[]{"������ ��������� ��������", 20, "+7 (900) 999 11 22", "������ ���22"});
        resultTableModel.addRow(new Object[]{"�������� ����� ���������", 22, "+7 (905) 111 22 33", "������ ���33"});
        resultTableModel.addRow(new Object[]{"������ ����� ����������", 23, "+7 (905) 222 33 44", "������ ���33"});
        resultTableModel.addRow(new Object[]{"��������� ��������� ��������", 21, "+7 (905) 333 44 55", "������ ���22"});
        resultTableModel.addRow(new Object[]{"�������� ����� ������������", 25, "+7 (905) 444 55 66", "������ ���12"});
        resultTableModel.addRow(new Object[]{"������� ������� �������������", 24, "+7 (900) 222 33 44", "������ ���10"});
        resultTableModel.addRow(new Object[]{"������� ����� ������������", 22, "+7 (900) 333 44 55", "������ ���22"});
        resultTableModel.addRow(new Object[]{"�������� ���� ����������", 23, "+7 (905) 777 88 99", "������ ���12"});
        resultTableModel.addRow(new Object[]{"������ ������� ���������", 21, "+7 (905) 888 99 00", "������ ���22"});
    }

    private void addMockTeacherData() {
        resultTableModel.addRow(new Object[]{"�������� �������� ��������", "����������", "+7 (903) 221 36 02", "B"});
        resultTableModel.addRow(new Object[]{"������� ����� �������������", "����������", "+7 (903) 221 36 02", "A, B"});
        resultTableModel.addRow(new Object[]{"������ �������� ����������", "����������", "+7 (903) 221 36 02", "B"});
        resultTableModel.addRow(new Object[]{"�������� ���������� ��������", "��������", "+7 (964) 842 22 15", "C"});
        resultTableModel.addRow(new Object[]{"������ ���� ������������", "��������", "+7 (964) 842 22 15", "A"});
        resultTableModel.addRow(new Object[]{"������� ������� ����������", "��������", "+7 (964) 842 22 15", "A, B, C"});
        resultTableModel.addRow(new Object[]{"������� ����� ����������", "����������", "+7 (903) 221 36 02", "A, B"});
        resultTableModel.addRow(new Object[]{"������ ����� ���������", "����������", "+7 (903) 221 36 02", "B"});
        resultTableModel.addRow(new Object[]{"������ ����� ���������", "����������", "+7 (903) 221 36 02", "C"});
        resultTableModel.addRow(new Object[]{"�������� ������ �������������", "��������", "+7 (964) 842 22 15", "B"});
        resultTableModel.addRow(new Object[]{"������� ������� ������������", "��������", "+7 (964) 842 22 15", "A, C"});
        resultTableModel.addRow(new Object[]{"��������� ������� �������������", "��������", "+7 (964) 842 22 15", "B"});
        resultTableModel.addRow(new Object[]{"�������� ����� ������������", "��������", "+7 (964) 842 22 15", "A, B"});
        resultTableModel.addRow(new Object[]{"������� ������ ���������", "����������", "+7 (903) 221 36 02", "C"});
        resultTableModel.addRow(new Object[]{"������� ��������� ���������", "����������", "+7 (903) 221 36 02", "A"});
        resultTableModel.addRow(new Object[]{"������� ����� ��������", "��������", "+7 (964) 842 22 15", "C"});
        resultTableModel.addRow(new Object[]{"������� ������ ���������", "��������", "+7 (964) 842 22 15", "A, B, C"});
        resultTableModel.addRow(new Object[]{"������� ����� ����������", "����������", "+7 (903) 221 36 02", "A"});
        resultTableModel.addRow(new Object[]{"������ ���� ����������", "��������", "+7 (964) 842 22 15", "B"});
    }

    private void addMockLessonData() {
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"��������", "������ �������� ����������", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"��������", "������ �������� ����������", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "�������� �������� ��������", "������ A", "��������� 101", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"��������", "������ �������� ����������", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "������ ����", "������ B", "��������", "������ 2", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ����� ����������", "������ C", "��������� 102", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"��������", "��������� ������� �������������", "������ A", "��������", "������ 3", "14:30-16:30"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
        resultTableModel.addRow(new Object[]{"������", "������� ������� ����������", "������ B", "��������� 103", "-", "12:00-14:00"});
    }

    // ��������
    public static String EMAIL = "mailto:avto@argoc.ru";
    public static String PHONE = "tel:+74957488191";
    public static String CAR = "Assets/carred.png";

    // ������ �������� "�����"
    private Timer blinkTimer;
    private boolean isArgosVisible = true;
    
    // ������
    private Timer carAnimationTimer;

    private DefaultTableModel resultTableModel;

    /**
     * Creates new form ArgosForm
     */
    public ArgosForm() {
        initComponents();
        initResultTable();
        loadInitialData();
        initMovingCarAnimation();
    }

    // ��������
    private void initMovingCarAnimation() {
        getContentPane().add(carLabel);

        int carAnimationInterval = 20;
        carAnimationTimer = new Timer(carAnimationInterval, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveCar();
            }
        });
        carAnimationTimer.start();
    }

    // �������� ������
    private void moveCar() {
        int x = carLabel.getX();
        int y = carLabel.getY();

        // ������: ���������� ������
        x = (x + 5) % getWidth();

        carLabel.setLocation(x, y);
    }

    private void toggleArgosVisibility() {
        isArgosVisible = !isArgosVisible;
        label2.setVisible(isArgosVisible);
    }

    private void initResultTable() {
        resultTableModel = new DefaultTableModel();
        resultTableModel.setColumnIdentifiers(new Object[]{"���", "�������", "�������", "������"});
        jTable1.setModel(resultTableModel);
    }

    // ��������� �������
    private void loadInitialData() {
        String defaultCategory = "�������";
        jComboBox1.setSelectedItem(defaultCategory);
        updateTableData(defaultCategory);
    }

    // ������� ������ �� ������
    private void clearTableData() {
        resultTableModel.setRowCount(0);
    }

    private void updateTableData(String category) {
        clearTableData();

        switch (category) {
            case "�������":
                resultTableModel.setColumnIdentifiers(new Object[]{"���", "�������", "�������", "������"});
                addMockStudentData();
                break;
            case "�������������":
                resultTableModel.setColumnIdentifiers(new Object[]{"���", "���", "�������", "��������� ����"});
                addMockTeacherData();
                break;
            case "�������":
                resultTableModel.setColumnIdentifiers(new Object[]{"���", "�������������", "������", "���������", "������", "�����"});
                addMockLessonData();
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logobtn = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        email = new javax.swing.JButton();
        phone = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        carLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("�������� �����");

        logobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.png"))); // NOI18N
        logobtn.setBorder(null);
        logobtn.setBorderPainted(false);
        logobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logobtnActionPerformed(evt);
            }
        });

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label1.setText("���������");

        label2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 174, 0));
        label2.setText("�����");

        email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/email.png"))); // NOI18N
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        phone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/phone.png"))); // NOI18N
        phone.setBorder(null);
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "�������", "�������������", "�������" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "���", "�������", "�������", "������"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        carLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/carred2.png"))); // NOI18N
        carLabel.setMaximumSize(new java.awt.Dimension(48, 20));
        carLabel.setMinimumSize(new java.awt.Dimension(48, 20));
        carLabel.setPreferredSize(new java.awt.Dimension(648, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logobtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(carLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logobtn))))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(carLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String selectedCategory = (String) jComboBox1.getSelectedItem();
        updateTableData(selectedCategory);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // ����� �� �����
        try {
            Desktop.getDesktop().mail(new URI(EMAIL));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // ������ �� ��������
        try {
            Desktop.getDesktop().browse(new URI(PHONE));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_phoneActionPerformed

    private void logobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logobtnActionPerformed
        clearTableData();
    }//GEN-LAST:event_logobtnActionPerformed

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
            java.util.logging.Logger.getLogger(ArgosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArgosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArgosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArgosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArgosForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carLabel;
    private javax.swing.JButton email;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton logobtn;
    private javax.swing.JButton phone;
    // End of variables declaration//GEN-END:variables
}
