package quanlydanhschgiadichnhadat;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public void list() {
		   ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
		   ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<>();
		   int SoGiaoDichDat = 0, SoGiaoDichNha = 0;
		   long TongTienGiaoDichDat = 0, TrungBinhThanhTien = 0;
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.print("Nhap thong tin giao dich dat: ");
		   SoGiaoDichDat = scanner.nextInt();
		   System.out.print("Nhap so giao dich nha: ");
		   SoGiaoDichNha = scanner.nextInt();
		   
		   System.out.print("Nhap thong tin giao dich đat: ");
		   for (int i = 0; i < SoGiaoDichDat; i++) {
			   System.out.println("Nhap thong tin giao dich dat thu " + (i + 1) + ":");
			   GiaoDichDat GiaoDichDat = new GiaoDichDat();
			   GiaoDichDat.nhap();
			arrGiaoDichDat.add(GiaoDichDat);
		   }
		   
		   System.out.println("Nhap thong tin giao dich nha: ");
		   for(int i = 0; i < SoGiaoDichNha; i++) {
			   System.out.println("Nhap thong tin giao dich nha thu " + (i + 1) + ":");
			   GiaoDichNha GiaoDichNha = new GiaoDichNha();
			   GiaoDichNha.nhap();
			arrGiaoDichNha.add(GiaoDichNha);
		   }
		   
		   System.out.println("---Thong Tin Cac Giao Dich Dat---");
		   for(int i = 0; i < arrGiaoDichDat.size(); i++) {
		   System.out.println(arrGiaoDichDat.get(i).toString());
	   }   
		   System.out.println("---Thong Tin Các Giao Dich Nha---");
		   for(int i = 0; i < arrGiaoDichNha.size(); i++) {
		   System.out.println(arrGiaoDichNha.get(i).toString());
	   }
		   
	       for (int i = 0; i < arrGiaoDichDat.size(); i++) {
	           if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")) {
	               TongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
	                   arrGiaoDichDat.get(i).getDonGia() * 1.5;
	           } else if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B") || 
	                   arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C")) {
	               TongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
	                   arrGiaoDichDat.get(i).getDonGia();
	           }
	       }
	       TrungBinhThanhTien = TongTienGiaoDichDat / (arrGiaoDichDat.size());
	       System.out.println("Trung binh thanh tien cua giao dich dat = " + TrungBinhThanhTien);
	       System.out.println("Cac giao dich đat cua thang 5 nam 2024: ");
	       for (int i = 0; i < arrGiaoDichDat.size(); i++) {
	           String[] dateGiaoDichDat = arrGiaoDichDat.get(i).getNgayGiaoDich().split("/");
	           if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
	               System.out.println(arrGiaoDichDat.get(i).toString());
	           }
	       }
	        
	       System.out.println("Cac giao dich nha cua thang 5 nam 2023: ");
	       for (int i = 0; i < arrGiaoDichNha.size(); i++) {
	           String[] dateGiaoDichNha = arrGiaoDichNha.get(i).getNgayGiaoDich().split("/");
	           if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
	               System.out.println(arrGiaoDichNha.get(i).toString());
	           }
	       }
	   
	       
	}

}
