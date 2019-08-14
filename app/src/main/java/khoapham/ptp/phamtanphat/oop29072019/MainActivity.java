package khoapham.ptp.phamtanphat.oop29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for 0 - 100
        // 1 : in so le
        // 2: in so chan
        // 3 : in so chia 3 dư 1
        // 4 : in so chinh phương ( Căn bậc 2)
    }
    private void insole(){
        for (int i = 0 ; i <= 100 ; i++){
            if (i % 2 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insochan(){
        for (int i = 0 ; i <= 100 ; i++){
            if (i % 2 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insochia3du1(){
        for (int i = 0 ; i <= 100 ; i++){
            if (i % 3 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insochinhphuong(){
        for (int i = 0 ; i <= 100 ; i++){
            if (Math.sqrt(i) % 1 == 0){
                Log.d("BBB",i + "");
            }
        }
    }

}
