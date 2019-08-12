package khoapham.ptp.phamtanphat.oop29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //immutable
//    final int[] mangnumber = {1,2,3,4,5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Đối tượng : object , class
        // khởi tạo class
//        Giangvien tanphat = new Giangvien("Phạm Tấn Phát","Nguyễn Lâm");
//        tanphat.setTen("AAA");

//        -Nhanvien
//              *Thuộc tính
//                  +Ten : String
//                  +Tuoi : Integer
//                  +Calamviec : String
//                *Phương thức
//                    +setGiolamviec(Integer time)
//                        ca sang : 8h - 17h (Mốc 24h tiếng)
//                        ca tối : 18h - 7h   (Mốc 24h tiếng)
//                        24<giolamviec < 0 : ca sáng

        // non - access modifier : final , static
//        mangnumber[0] = 10;
        Log.d("BBB",Giangvien.giamdoc);
    }


}
