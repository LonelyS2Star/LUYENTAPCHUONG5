/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1LTChuong5;

/**
 *
 * @author Ngoc Nhi
 */
public class ChuyenXeNoiThanh extends ChuyenXe {
    int soTuyen;
    float soKm;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKm() {
        return soKm;
    }

    public void setSoKm(float soKm) {
        this.soKm = soKm;
    }

   
         
    @Override
    public void InDoanhThu(double doanhThu) {
        System.out.println("ChuyenXeNoiThanh co doanh thu la: " + doanhThu); 
    

    }
    
          
}


