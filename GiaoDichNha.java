package quanlydanhschgiadichnhadat;

public class GiaoDichNha extends GiaoDich {
     private String LoaiNha, DiaChi;
     private int Chon;
     
     public GiaoDichNha() {
    	 super();
     }
     
     public GiaoDichNha(String LoaiNha, String DiaChi) {
    	 super();
    	 this.LoaiNha = LoaiNha;
    	 this.DiaChi = DiaChi;
     }
     
     public String getLoaiNha() {
    	 return LoaiNha;
     }
     
     public void setLoaiNha(String LoaiNha) {
    	 this.LoaiNha = LoaiNha;
     }
     
     public String getDiaChi() {
    	 return DiaChi;
     }
     
     public void setDiaChi(String DiaChi) {
    	 this.DiaChi = DiaChi;
     }
     
     public void nhap() {
    	 super.nhap();
    	 System.out.print("Nhap dia chi: ");
    	 DiaChi = scanner.nextLine();
    	 System.out.print("Nhap loai nha (0: cao cap, 1: thuong): ");
    	 Chon = scanner.nextInt();
    	 switch(Chon) {
    	    case 0:
    	    	LoaiNha = "Cao cap";
    	    	break;
    	    case 1:
    	    	LoaiNha = "Thuong";
    	    	break;
    	    default:
    	    	System.out.println("Chon ss khong hop le ");
    	    	break;
    	 }
     }
     @Override
     public String toString() {
         return super.toString() + ", loai nha: " + this.LoaiNha + ", dia chi: " + this.DiaChi;
     }
}
