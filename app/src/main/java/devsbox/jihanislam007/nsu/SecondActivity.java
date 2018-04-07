package devsbox.jihanislam007.nsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView TexView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TexView = findViewById(R.id.TexViewone);

        TexView.setText(getIntent().getStringExtra("titel_name"));
    }
}


/// jihanislam007@gmail.com

















