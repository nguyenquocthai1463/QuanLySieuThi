/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import DAO.TheThanhVienDAO;
import POJO.TheThanhVien;
import DAO.KhachHangDAO;
import POJO.KhachHang;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
/**
 *
 * @author PC
 */
public class RegisMember extends javax.swing.JFrame {

    /**
     * Creates new form RegisMember
     */
    public RegisMember() {
        initComponents();
    }

    private void loadDataTheThanhVien() {
        TheThanhVienDAO theThanhVienDAO = new TheThanhVienDAO();
        DefaultTableModel model = (DefaultTableModel) jTableData.getModel();
        model.setRowCount(0);
        for (TheThanhVien theThanhVien : theThanhVienDAO.getAllTheThanhVien()) {
            model.addRow(new Object[]{
                theThanhVien.getMaThe(),
                theThanhVien.getMaKhachHang(),
                theThanhVien.getSoThe(),
                theThanhVien.getNgayKichHoat(),
                theThanhVien.getNgayHetHan()
            });
        }
    }
    
    private void loadDataKhachHang() {
        KhachHangDAO khachHangDAO = new KhachHangDAO();
        DefaultTableModel model = (DefaultTableModel) jTableKhachHang.getModel();
        model.setRowCount(0);
        for (KhachHang khachHang : khachHangDAO.getAllKhachHang()) {
            model.addRow(new Object[]{
                khachHang.getMaKhachHang(),
                khachHang.getTenKhachHang(),
                khachHang.getDiaChi(),
                khachHang.getSoDienThoai()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSave = new javax.swing.JButton();
        jTextFieldMaThe = new javax.swing.JTextField();
        jTextFieldMaKhachHang = new javax.swing.JTextField();
        jTextFieldTenKhachHang = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelTitle1 = new javax.swing.JLabel();
        jLabelTenKhachHang = new javax.swing.JLabel();
        jLabelSoThe = new javax.swing.JLabel();
        jLabelNgayKichHoat = new javax.swing.JLabel();
        jLabelNgayHetHan = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        Sửa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableKhachHang = new javax.swing.JTable();
        jButtoncheck = new javax.swing.JButton();
        jTextFieldSoDienThoai = new javax.swing.JTextField();
        jLabelMaKhachHang1 = new javax.swing.JLabel();
        jTextFieldSoThe1 = new javax.swing.JTextField();
        jDateNgayBatDau = new com.toedter.calendar.JDateChooser();
        jDateNgayHetHan = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSave.setText("Lưu");
        jButtonSave.setActionCommand("jButtonSave");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jTextFieldMaThe.setEnabled(false);
        jTextFieldMaThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaTheActionPerformed(evt);
            }
        });

        jLabelTitle.setText("Mã Thẻ");
        jLabelTitle.setToolTipText("");

        jLabelTitle1.setText("Đăng Ký Thẻ Thành Viên");

        jLabelTenKhachHang.setText("Tên Khách Hàng:");

        jLabelSoThe.setText("Số Thẻ");

        jLabelNgayKichHoat.setText("Ngày Kích Hoạt:");

        jLabelNgayHetHan.setText("Ngày Hết Hạn:");

        jButtonDelete.setText("Xóa");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Thẻ", "Mã Khách Hàng", "Số Thẻ", "Ngày Kích Hoạt", "Ngày Hết Hạn"
            }
        ));
        jScrollPane1.setViewportView(jTableData);

        Sửa.setText("Sửa");
        Sửa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SửaActionPerformed(evt);
            }
        });

        jTableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Địa Chỉ", "Số Điện Thoại"
            }
        ));
        jScrollPane2.setViewportView(jTableKhachHang);

        jButtoncheck.setText("Kiểm Tra");
        jButtoncheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncheckActionPerformed(evt);
            }
        });

        jLabelMaKhachHang1.setText("Mã Khách Hàng:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jDateNgayHetHan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelNgayKichHoat)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelMaKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelSoThe, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSoThe1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(Sửa))
                                        .addComponent(jButtoncheck))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jButtonSave)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonDelete)))))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jDateNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabelMaKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabelTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabelSoThe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextFieldMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jTextFieldMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jTextFieldTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jTextFieldSoThe1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jLabelNgayKichHoat)
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabelNgayHetHan)
                            .addGap(34, 34, 34)
                            .addComponent(Sửa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jButtoncheck))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addComponent(jTextFieldSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String maKhachHang = jTextFieldMaKhachHang.getText();
        String soThe = jTextFieldTenKhachHang.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String ngayKichHoat = dateFormat.format(jDateNgayBatDau.getDate());
        String ngayHetHan = dateFormat.format(jDateNgayHetHan.getDate());

        TheThanhVien theThanhVien = new TheThanhVien(maKhachHang, soThe, ngayKichHoat, ngayHetHan);
        TheThanhVienDAO theThanhVienDAO = new TheThanhVienDAO();

        theThanhVienDAO.insertTheThanhVien(theThanhVien);
        JOptionPane.showMessageDialog(this, "Đăng ký thẻ thành viên thành công!");
        loadDataTheThanhVien();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldMaTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaTheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaTheActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selectedRow = jTableData.getSelectedRow();
        if (selectedRow != -1) {
            String maThe = jTableData.getValueAt(selectedRow, 0).toString();
            TheThanhVienDAO theThanhVienDAO = new TheThanhVienDAO();
            theThanhVienDAO.deleteTheThanhVien(maThe);
            JOptionPane.showMessageDialog(this, "Xóa thẻ thành viên thành công!");
            loadDataTheThanhVien();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một thẻ thành viên để xóa.");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void SửaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SửaActionPerformed
        int selectedRow = jTableData.getSelectedRow();
        if (selectedRow != -1) {
            String maThe = jTableData.getValueAt(selectedRow, 0).toString();
            String maKhachHang = jTableData.getValueAt(selectedRow, 1).toString();
            String soThe = jTableData.getValueAt(selectedRow, 2).toString();
            String ngayKichHoat = jTableData.getValueAt(selectedRow, 3).toString();
            String ngayHetHan = jTableData.getValueAt(selectedRow, 4).toString();

            jTextFieldMaThe.setText(maThe);
            jTextFieldMaKhachHang.setText(maKhachHang);
            jTextFieldTenKhachHang.setText(soThe);
            try {
                jDateNgayBatDau.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(ngayKichHoat));
                jDateNgayHetHan.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(ngayHetHan));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một thẻ thành viên để chỉnh sửa.");
        }
    }//GEN-LAST:event_SửaActionPerformed

    private void jButtoncheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncheckActionPerformed
        String soDienThoai = jTextFieldSoDienThoai.getText();
        KhachHangDAO khachHangDAO = new KhachHangDAO();
        KhachHang khachHang = khachHangDAO.getKhachHangBySoDienThoai(soDienThoai);

        if (khachHang != null) {
            TheThanhVienDAO theThanhVienDAO = new TheThanhVienDAO();
            if (theThanhVienDAO.isPhoneExist(soDienThoai)) {
                TheThanhVien theThanhVien = theThanhVienDAO.getTheThanhVienBySoDienThoai(soDienThoai);
                if (theThanhVien != null) {
                    jTextFieldMaThe.setText(String.valueOf(theThanhVien.getMaThe()));
                    jTextFieldMaKhachHang.setText(theThanhVien.getMaKhachHang());
                    jTextFieldSoThe1.setText(theThanhVien.getSoThe()); // Sử dụng đúng biến
                    jTextFieldTenKhachHang.setText(khachHang.getTenKhachHang()); // Hiển thị tên khách hàng
                    try {
                        jDateNgayBatDau.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(theThanhVien.getNgayKichHoat()));
                        jDateNgayHetHan.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(theThanhVien.getNgayHetHan()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(this, "Thông tin thẻ thành viên đã tồn tại.");
                }
            } else {
                jTextFieldMaKhachHang.setText(khachHang.getMaKhachHang());
                jTextFieldTenKhachHang.setText(khachHang.getTenKhachHang()); // Hiển thị tên khách hàng
                jTextFieldSoThe1.setText("");  // Clear soThe field
                jDateNgayBatDau.setDate(null);
                jDateNgayHetHan.setDate(null);
                JOptionPane.showMessageDialog(this, "Khách hàng này chưa có thẻ thành viên. Vui lòng điền thông tin và lưu.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với số điện thoại này.");
        }
    }//GEN-LAST:event_jButtoncheckActionPerformed

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
            java.util.logging.Logger.getLogger(RegisMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sửa;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtoncheck;
    private com.toedter.calendar.JDateChooser jDateNgayBatDau;
    private com.toedter.calendar.JDateChooser jDateNgayHetHan;
    private javax.swing.JLabel jLabelMaKhachHang1;
    private javax.swing.JLabel jLabelNgayHetHan;
    private javax.swing.JLabel jLabelNgayKichHoat;
    private javax.swing.JLabel jLabelSoThe;
    private javax.swing.JLabel jLabelTenKhachHang;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableData;
    private javax.swing.JTable jTableKhachHang;
    private javax.swing.JTextField jTextFieldMaKhachHang;
    private javax.swing.JTextField jTextFieldMaThe;
    private javax.swing.JTextField jTextFieldSoDienThoai;
    private javax.swing.JTextField jTextFieldSoThe1;
    private javax.swing.JTextField jTextFieldTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
