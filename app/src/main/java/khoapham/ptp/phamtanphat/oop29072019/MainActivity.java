package khoapham.ptp.phamtanphat.oop29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Đối tượng : object , class
        // khởi tạo class
        Giangvien tanphat = new Giangvien();
        tanphat.ten = "Pham Tấn Phát";
        tanphat.diachi = "Nguyễn Lâm";
        tanphat.hotroHocvien();

    }

}
