/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1LTChuong5;

/**
 *
 * @author Ngoc Nhi
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    String noiDen;
    int soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
   
    @Override
  public void InDoanhThu(double doanhThu) {
        System.out.println("ChuyenXeNoiThanh co doanh thu la: " + doanhThu); 
    
  }
}
