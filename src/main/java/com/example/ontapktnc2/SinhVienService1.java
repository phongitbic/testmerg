package com.example.ontapktnc2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService1 {


    List<SinhVien1> list = new ArrayList<>();

    public String sua(String maSv, String ten, Integer tuoi, float diemTrungBinh, Integer kyHoc, String chuyenNganh){

        if(maSv == null){
            return "Mã sinh viên không được null";
        }

        if(maSv.trim().isEmpty()){
            return "Mã sinh viên không được để trống";
        }

        if(ten.trim().isEmpty()){
            return "Tên sinh viên không được để trống";
        }

        if(tuoi < 18){
            return "tuổi không được bé hơn 18";
        }

        if(diemTrungBinh < 0){
            return "Điểm trung bình phải là số dương";
        }

        if(kyHoc < 0){
            return "Kỳ học phải là số dương";
        }

        if(chuyenNganh.trim().isEmpty()){
            return "Chuyên ngành không được bỏ trống";
        }

        for (SinhVien1 sv: list) {
            if(sv.getMaSV().equals(maSv)){
                sv.setMaSV(maSv);
                sv.setTen(ten);
                sv.setTuoi(tuoi);
                sv.setDiemTrungBinh(diemTrungBinh);
                sv.setKyHoc(kyHoc);
                sv.setChuyenNganh(chuyenNganh);
                return "Sửa thành công";
            }
        }
        return "Sinh viên không tồn tại";
    }
}
