package Tsubasa.csie.constraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 40;

    public void bigger(View V) {

        TextView  hello;
        hello = findViewById(R.id.textView);
        hello.setTextSize(++size);

    }

}
