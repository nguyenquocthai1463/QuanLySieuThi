package POJO;

public class TheThanhVien {
    private int MaThe; // Mã thẻ tự động tăng
    private String MaKhachHang;
    private String SoThe;
    private String NgayKichHoat;
    private String NgayHetHan;

    // Constructor
    public TheThanhVien(String MaKhachHang, String SoThe, String NgayKichHoat, String NgayHetHan) {
        this.MaKhachHang = MaKhachHang;
        this.SoThe = SoThe;
        this.NgayKichHoat = NgayKichHoat;
        this.NgayHetHan = NgayHetHan;
    }

    // Getters and Setters
    public int getMaThe() {
        return MaThe;
    }

    public void setMaThe(int MaThe) {
        this.MaThe = MaThe;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getSoThe() {
        return SoThe;
    }

    public void setSoThe(String SoThe) {
        this.SoThe = SoThe;
    }

    public String getNgayKichHoat() {
        return NgayKichHoat;
    }

    public void setNgayKichHoat(String NgayKichHoat) {
        this.NgayKichHoat = NgayKichHoat;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }
}
