package DAO;

import POJO.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {

    public List<KhachHang> getAllKhachHang() {
        List<KhachHang> list = new ArrayList<>();
        String query = "SELECT * FROM khachhang";
        try (Connection conn = MySQLDataProvider.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(
                    rs.getString("MaKhachHang"),
                    rs.getString("TenKhachHang"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDienThoai")
                );
                list.add(khachHang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public KhachHang getKhachHangBySoDienThoai(String soDienThoai) {
    String query = "SELECT * FROM khachhang WHERE SoDienThoai = ?";
    try (Connection conn = MySQLDataProvider.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, soDienThoai);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new KhachHang(
                rs.getString("MaKhachHang"),
                rs.getString("TenKhachHang"),
                rs.getString("DiaChi"),
                rs.getString("SoDienThoai")
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

}
