package com.ggpo.portable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.ggpo.portable.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("ggpo_native");
    }

    @Override
    protected void Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    public native String stringFromJNI();
}
