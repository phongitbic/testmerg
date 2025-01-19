package com.example.ontapktnc2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Phan1Test {

    Phan1 phan1;

    String expected, actual;

    @BeforeEach
    void setUp() {
        phan1 = new Phan1();
    }

    @AfterEach
    void tearDown() {
        phan1 = null;
    }

    @Test
    void trungBinhCong() {
        actual = phan1.trungBinhCong(10, 10, 10);
        expected = "Điểm trung bình cộng là:10.0";
        assertEquals(expected, actual);
    }


    @Test
    void trungBinhCongVoiDiemToanLaSoAm() {
        actual = phan1.trungBinhCong(-1, 10, 10);
        expected = "điểm Toán phải >0";
        assertEquals(expected, actual);
    }


    @Test
    void trungBinhCongVoiDiemToanLonHon10() {
        actual = phan1.trungBinhCong(11, 10, 10);
        expected = "điểm Toán phải <=10";
        assertEquals(expected, actual);
    }

    @Test
    void trungBinhCongVoiDiemLyLonHon10() {
        actual = phan1.trungBinhCong(7, 11, 10);
        expected = "diểm lý phải <= 10";
        assertEquals(expected, actual);
    }

    @Test
    void trungBinhCongVoiDiemLyLaSoAm() {
        actual = phan1.trungBinhCong(7, -3, 10);
        expected = "diểm lý phải > 0";
        assertEquals(expected, actual);
    }

    // done bài 1


    //bài 2

    @Test
    void tinhThuongVoiHaiSoHopLe() {
        actual = phan1.tinhThuong(10, 2);
        expected = "thương là:5";
        assertEquals(expected, actual);
    }

    @Test
    void tinhThuongVoiSoBiChiaLa0() {
        actual = phan1.tinhThuong(10, 0);
        expected = "Không thể chia cho 0";
        assertEquals(expected, actual);
    }

    @Test
    void tinhThuongVoiSoChiaLa0() {
        actual = phan1.tinhThuong(0, 10);
        expected = "thương là:0";
        assertEquals(expected, actual);
    }

    @Test
    void tinhThuongVoiHaiSoLaSoAm() {
        actual = phan1.tinhThuong(-20, -5);
        expected = "thương là:4";
        assertEquals(expected, actual);
    }


    @Test
    void tinhThuongVoiSoBiChiaLaSoAm() {
        actual = phan1.tinhThuong(20, -1);
        expected = "thương là:-20";
        assertEquals(expected, actual);
    }





}