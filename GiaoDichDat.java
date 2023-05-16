package quanlydanhschgiadichnhadat;

public class GiaoDichDat extends GiaoDich {
      private String LoaiDat;
      
      public GiaoDichDat() {
    	  super();
      }
      
      public GiaoDichDat(String LoaiDat) {
    	  super();
    	  this.LoaiDat = LoaiDat;
      }
      
      public String getLoaiDat() {
    	  return LoaiDat;
      }
      
      public void setLoaiDat(String LoaiDat) {
    	  this.LoaiDat = LoaiDat;
      }
      
      public void nhap() {
    	  super.nhap();
    	  System.out.print("Nhap loai đat (A/B/C): ");
    	  LoaiDat = scanner.nextLine();
      }
      
      @Override
      public String toString() {
    	  return super.toString() + ", Loai đat: " + this.LoaiDat;
      }
}
