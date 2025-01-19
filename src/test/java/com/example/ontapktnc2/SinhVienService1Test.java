package com.example.ontapktnc2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienService1Test {

    SinhVienService1 service1;

    String expected, actual;
    @BeforeEach
    void setUp() {
        service1 = new SinhVienService1();

        service1.list.add(new SinhVien1("PH47330","Phong",25, 8.5f, 6, "PTPM"));
    }

    @AfterEach
    void tearDown() {
        service1 = null;
    }

    @Test
    void suaThanhCong() {
        actual = service1.sua("PH47330","Phong",25, 8.5f, 6, "WEB");
        expected = "Sửa thành công";
        assertEquals(expected,actual);
    }

    @Test
    void suakhongThanhCongDoTruongMaDeTrong() {
        actual = service1.sua("","Phong",25, 8.5f, 6, "WEB");
        expected = "Mã sinh viên không được để trống";
        assertEquals(expected,actual);
    }

    @Test
    void suakhongThanhCongDoMaSinhVienKhongTonTai() {
        actual = service1.sua("PH47332","Phong",25, 8.5f, 6, "WEB");
        expected = "Sinh viên không tồn tại";
        assertEquals(expected,actual);
    }


    @Test
    void suakhongThanhCongDoTenBoTrong() {
        actual = service1.sua("PH47330","",25, 8.5f, 6, "WEB");
        expected = "Tên sinh viên không được để trống";
        assertEquals(expected,actual);
    }

    @Test
    void suakhongThanhCongDoTuoiNhoHon18() {
        actual = service1.sua("PH47330","Hợp",17, 8.5f, 6, "WEB");
        expected = "tuổi không được bé hơn 18";
        assertEquals(expected,actual);
    }

    @Test
    void suaKhongThanhCongDoKyHocNhoHon0() {
        actual = service1.sua("PH47330", "Hợp", 20, 2.5f, -1, "WEB");
        expected = "Kỳ học phải là số dương"; // Đúng thông báo cho kỳ học
        assertEquals(expected, actual);
    }


    @Test
    void suaKhongThanhCongDoDiemTrungBinhNhoHon0() {
        actual = service1.sua("PH47330", "Hợp", 20, -2.5f, 6, "WEB");
        expected = "Điểm trung bình phải là số dương"; // Đúng thông báo cho kỳ học
        assertEquals(expected, actual);
    }

    @Test
    void suaKhongThanhCongDoChuyenNganhBoTrong() {
        actual = service1.sua("PH47330", "Hợp", 20, 2.5f, 6, "");
        expected = "Chuyên ngành không được bỏ trống"; // Đúng thông báo cho kỳ học
        assertEquals(expected, actual);
    }


    @Test
    void suaKhongThanhCongDoMaSVNull() {
        actual = service1.sua(null, "Hợp", 20, 2.5f, 1, "WEB");
        expected = "Mã sinh viên không được null";
        assertEquals(expected, actual);
    }

}