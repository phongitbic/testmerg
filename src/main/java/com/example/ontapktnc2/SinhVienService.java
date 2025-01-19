package com.example.ontapktnc2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    List<SinhVien> list = new ArrayList<>();

    public String themSinhVien(SinhVien sinhVien){

        for (SinhVien sv: list) {
            if(sv.getMaSV().equals(sinhVien.getMaSV())){
                return "Mã sinh viên đã tồn tại";
            }
        }

        if(sinhVien.getTen().trim().isEmpty()){
            return "Không được để trống tên";
        }

        if(sinhVien.getTuoi()<=17){
            return "tuổi phải lớn hơn 17";
        }

        list.add(sinhVien);
        return "thêm sinh viên thành công";
    }


    public String suaSinhVien(String maSV, String ten, Integer tuoi, Float diemTrungBinh, Integer kiHoc, String chuyenNganh){

        if(maSV.trim().isEmpty()){
            return "Mã sinh viên không được để trống";
        }

        if(ten.trim().isEmpty()){
            return "Tên sinh viên không được để trống";
        }

        if(tuoi < 18){
            return "Tuổi không được dưới 18";
        }

        if(diemTrungBinh < 0){
            return "Điểm trung không được bé hơn 0";
        }

        if(kiHoc < 1){
            return "Kì học phải bắt đầu từ 1";
        }

        if(chuyenNganh.trim().isEmpty()){
            return "Chuyên nghành không được để trống";
        }

        for (SinhVien sv: list) {
            if(sv.getMaSV().equals(maSV)){
                sv.setMaSV(maSV);
                sv.setTen(ten);
                sv.setTuoi(tuoi);
                sv.setDiemTrungBinh(diemTrungBinh);
                sv.setKiHoc(kiHoc);
                sv.setChuyenNganh(chuyenNganh);

                return "Sửa thành công";
            }
        }

        return "Mã sinh viên không tồn tại";
    }
}
