package quanlydanhschgiadichnhadat;

import java.util.Scanner;

public class GiaoDich {
      private String MaGiaoDich, NgayGiaoDich;
      private long DonGia;
      private float DienTich;
      Scanner scanner = new Scanner(System.in);
      
      
      public GiaoDich() {
    	  super();
      }
      
      public GiaoDich(String MaGiaoDich, String NgayGiaoDich, long DonGia, float DienTich) {
    	  super();
    	  this.MaGiaoDich = MaGiaoDich;
    	  this.NgayGiaoDich = NgayGiaoDich;
    	  this.DonGia = DonGia;
    	  this.DienTich = DienTich;
      }
      
      public String getMaGiaoDich() {
    	  return MaGiaoDich;
      }
      
      public void setMaGiaoDich(String MaGiaoDich) {
    	  this.MaGiaoDich = MaGiaoDich;
      }
      
      public String getNgayGiaoDich() {
    	  return NgayGiaoDich;
      }
      
      public void setNgayGiaoDich(String NgayGiaoDich) {
    	  this.NgayGiaoDich = NgayGiaoDich;
      }
      
      public long getDonGia() {
    	  return DonGia;
      }
      
      public void setDonGia(long DonGia) {
    	  this.DonGia = DonGia;
      }
      
      public float getDienTich() {
    	  return DienTich;
      }
      
      public void setDienTich(float DienTich) {
    	  this.DienTich = DienTich;
      }
      
      public void nhap()
      {
    	  System.out.print("Nhap ma giao dich: ");
    	  MaGiaoDich = scanner.nextLine();
    	  System.out.print("Nhap ngay giao dich (dd/mm/yyyy)");
    	  NgayGiaoDich = scanner.nextLine();
    	  System.out.print("Nhap đon gia: ");
    	  DonGia = Long.parseLong(scanner.nextLine());
    	  System.out.print("Nhap dien tich: ");
    	  DienTich = Float.parseFloat(scanner.nextLine());
      }
      
      @Override
      public String toString() {
    	  return "Ma giao dich: " + this.MaGiaoDich + ", ngày giao dịch: " + this.getNgayGiaoDich() + 
    	            ", đon gia: " + this.DonGia + ", dien tich: " + this.DienTich;
      }
      
      
}
