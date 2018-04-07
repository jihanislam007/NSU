package devsbox.jihanislam007.nsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button PushButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PushButton = findViewById(R.id.PushButton);

        PushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(MainActivity.this,SecondActivity.class);

                String value= "Hello NSU";
                in.putExtra("titel_name", value);

                startActivity(in);
            }
        });

    }
}






