package DAO;

import POJO.TheThanhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TheThanhVienDAO {

    // Kiểm tra nếu số điện thoại đã tồn tại trong cơ sở dữ liệu
    public boolean isPhoneExist(String soDienThoai) {
        String query = "SELECT COUNT(*) FROM thethanhvien tv JOIN khachhang kh ON tv.MaKhachHang = kh.MaKhachHang WHERE kh.SoDienThoai = ?";
        try (Connection conn = MySQLDataProvider.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, soDienThoai);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Thêm thẻ thành viên mới vào cơ sở dữ liệu
    public void insertTheThanhVien(TheThanhVien theThanhVien) {
        String query = "INSERT INTO thethanhvien (MaKhachHang, SoThe, NgayKichHoat, NgayHetHan) VALUES (?, ?, ?, ?)";
        try (Connection conn = MySQLDataProvider.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, theThanhVien.getMaKhachHang());
            stmt.setString(2, theThanhVien.getSoThe());
            stmt.setString(3, theThanhVien.getNgayKichHoat());
            stmt.setString(4, theThanhVien.getNgayHetHan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Lấy tất cả thẻ thành viên từ cơ sở dữ liệu
    public List<TheThanhVien> getAllTheThanhVien() {
        List<TheThanhVien> list = new ArrayList<>();
        String query = "SELECT * FROM thethanhvien";
        try (Connection conn = MySQLDataProvider.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                TheThanhVien theThanhVien = new TheThanhVien(
                    rs.getString("MaKhachHang"),
                    rs.getString("SoThe"),
                    rs.getString("NgayKichHoat"),
                    rs.getString("NgayHetHan")
                );
                theThanhVien.setMaThe(rs.getInt("MaThe"));
                list.add(theThanhVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Xóa thẻ thành viên khỏi cơ sở dữ liệu
    public void deleteTheThanhVien(String maThe) {
        String query = "DELETE FROM thethanhvien WHERE MaThe = ?";
        try (Connection conn = MySQLDataProvider.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, maThe);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Chỉnh sửa thông tin thẻ thành viên trong cơ sở dữ liệu
    public void updateTheThanhVien(TheThanhVien theThanhVien) {
        String query = "UPDATE thethanhvien SET MaKhachHang = ?, SoThe = ?, NgayKichHoat = ?, NgayHetHan = ? WHERE MaThe = ?";
        try (Connection conn = MySQLDataProvider.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, theThanhVien.getMaKhachHang());
            stmt.setString(2, theThanhVien.getSoThe());
            stmt.setString(3, theThanhVien.getNgayKichHoat());
            stmt.setString(4, theThanhVien.getNgayHetHan());
            stmt.setInt(5, theThanhVien.getMaThe());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public TheThanhVien getTheThanhVienBySoDienThoai(String soDienThoai) {
    String query = "SELECT tv.* FROM thethanhvien tv JOIN khachhang kh ON tv.MaKhachHang = kh.MaKhachHang WHERE kh.SoDienThoai = ?";
    try (Connection conn = MySQLDataProvider.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, soDienThoai);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            TheThanhVien theThanhVien = new TheThanhVien(
                rs.getString("MaKhachHang"),
                rs.getString("SoThe"),
                rs.getString("NgayKichHoat"),
                rs.getString("NgayHetHan")
            );
            theThanhVien.setMaThe(rs.getInt("MaThe"));
            return theThanhVien;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}


}
