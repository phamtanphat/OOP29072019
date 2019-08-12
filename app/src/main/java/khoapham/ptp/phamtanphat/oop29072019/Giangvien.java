package khoapham.ptp.phamtanphat.oop29072019;
import android.util.Log;

import java.util.regex.Pattern;

public class Giangvien {
    // Thuộc tính
    public static String giamdoc = "Khoa pham";
    public String ten;
    public String diachi;


    public Giangvien(String ten, String diachi) {
        this.ten = ten;
        this.diachi = diachi;
    }

    // Hành vi
    public void hotroHocvien(){
        Log.d("BBB","Học online");
    }
    //constructor : phương thức khởi tạo
    //    public Giangvien(String ten , String diachi){
    //        this.ten = ten;
    //        this.diachi = diachi;
    //
    //    }
    // Phương thức setter , getter
    // alt + insert : generate phương thức
    //    public String getTen() {
    //        return ten;
    //    }
    //
    //    public void setTen(String ten) {
    //        this.ten = ten;
    //    }
    //
    //    public String getDiachi() {
    //        return diachi;
    //    }
    //
    //    public void setDiachi(String diachi) {
    //        this.diachi = diachi;
    //    }
}
