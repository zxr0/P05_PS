package sg.edu.rp.c346.id20000892.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView module1;
    TextView module2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        module1 = findViewById(R.id.module1);
        module2 = findViewById(R.id.module2);

        module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("code", "C346");
                i.putExtra("name", "Android Programming");
                i.putExtra("year", "2020");
                i.putExtra("sem", "1");
                i.putExtra("cred", "4");
                i.putExtra("venu", "W62E");
                startActivity(i);
            }
        });

        module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("code", "C349");
                i.putExtra("name", "iPad Programming");
                i.putExtra("year", "2020");
                i.putExtra("sem", "1");
                i.putExtra("cred", "4");
                i.putExtra("venu", "W66M");
                startActivity(i);
            }
        });
    }
}