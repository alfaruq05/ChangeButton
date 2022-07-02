package android.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    boolean iscolor = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (iscolor) {
                    btn.setBackgroundColor(Color.BLUE);
                    iscolor = false;
                } else {
                    btn.setBackgroundColor(Color.parseColor("#973aa8"));
                    iscolor = true;
                }

            }
        });
    }
}