package khoapham.ptp.phamtanphat.oop29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show(1);

    }
    // phuong thức: method , function
    //1 : Phạm vi hoạt động : access modifier
    //2 : Giá trị trả về
    //3 : Tên
    private void show(Integer number){
        //autoboxing
        //unboxing
        Log.d("BBB",number + "");
    }
}
