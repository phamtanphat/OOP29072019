package khoapham.ptp.phamtanphat.oop29072019;


import android.util.Log;

public class Trogiang extends Giangvien {

    public String chuyennganh;

    public Trogiang(String ten, String diachi , String chuyennganh) {
        super(ten, diachi);
        this.chuyennganh = chuyennganh;
    }

    //annotation : chu thích
    @Override
    public void hotroHocvien() {
        Log.d("BBB","tro giang");
    }
}
