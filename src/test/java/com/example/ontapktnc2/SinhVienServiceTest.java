package com.example.ontapktnc2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {

    SinhVienService service;
    String actual, expected;
    @BeforeEach
    void setUp() {
        service = new SinhVienService();
        service.themSinhVien(new SinhVien("PH47330","Phong", 25,9.5f,1,"PTPM"));
        System.out.println(service.list);
    }

    @AfterEach
    void tearDown() {
        service = null;
    }

    @Test
    void themSinhVienMaSinhVienTonTai() {
        actual = service.themSinhVien(new SinhVien("PH47330","Phong", 25,9.5f,1,"PTPM"));
        expected= "Mã sinh viên đã tồn tại";
        assertEquals(expected,actual);
    }


    @Test
    void themSinhVienThanhCong() {
        actual = service.themSinhVien(new SinhVien("PH47331","Phong", 25,9.5f,1,"PTPM"));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }

    @Test
    void themSinhVienVoiTuoiNhoHon18() {
        actual = service.themSinhVien(new SinhVien("PH47331","Phong", 17,9.5f,1,"PTPM"));
        expected= "tuổi phải lớn hơn 17";
        assertEquals(expected,actual);
    }


    @Test
    void themSinhVienVoiTenRong() {
        actual = service.themSinhVien(new SinhVien("PH47332","", 20,9.5f,1,"PTPM"));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }

    @Test
    void themSinhVienVoiDiemTrungBinhLaSoAm() {
        actual = service.themSinhVien(new SinhVien("PH47333","Hoa", 20,-9.5f,1,"PTPM"));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }



    @Test
    void themSinhVienVoiBoTrongChuyenNganh() {
        actual = service.themSinhVien(new SinhVien("PH47334","Hoa", 20,-9.5f,1,""));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }


    @Test
    void themSinhVienVoiKiHocLaSoAm() {
        actual = service.themSinhVien(new SinhVien("PH47334","Hoa", 20,10,1,"Web"));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }

    @Test
    void themSinhVienVoiKiHocRong() {
        actual = service.themSinhVien(new SinhVien("PH47334","Hoa", 20,10,null,"Web"));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }


    @Test
    void themSinhVienVoiChuyenNganhRong() {
        actual = service.themSinhVien(new SinhVien("PH47334","Hoa", 20,10,5,null));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }

    @Test
    void themSinhVienVoiMaSinhVienRong() {
        actual = service.themSinhVien(new SinhVien(null,"Hoa", 20,10,5,"MKT"));
        expected= "thêm sinh viên thành công";
        assertEquals(expected,actual);
    }

}