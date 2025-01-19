package com.example.ontapktnc2;

public class Phan1 {
    public String trungBinhCong(double diemToan, double diemLy, double diemHoa){

        if(diemToan < 0){
            return "điểm Toán phải >0";
        }

        if(diemToan > 10){
            return "điểm Toán phải <=10";
        }

        if(diemLy < 0){
            return "diểm lý phải > 0";
        }

        if(diemLy > 10){
            return "diểm lý phải <= 10";
        }

        if(diemHoa < 0){
            return "diểm hóa phải > 0";
        }

        if(diemHoa > 10){
            return "diểm hóa phải <= 10";
        }

        double trungBinhCong= (diemToan + diemLy +diemHoa)/3;
        return "Điểm trung bình cộng là:" + trungBinhCong;
    }


    public String tinhThuong(int soChia, int soBiChia ){

        if(soBiChia == 0 ){
            return "Không thể chia cho 0";
        }

        int Thuong = soChia/soBiChia;

        return "thương là:" + Thuong;

    }


}
