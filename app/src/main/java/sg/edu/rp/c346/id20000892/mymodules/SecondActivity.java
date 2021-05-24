package sg.edu.rp.c346.id20000892.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        Intent i = getIntent();
        String code = i.getStringExtra("code");
        String name = i.getStringExtra("name");
        String year = i.getStringExtra("year");
        String sem = i.getStringExtra("sem");
        String cred = i.getStringExtra("cred");
        String venu = i.getStringExtra("venu");

        textView.setText("Module Code: " + code + "\n" +
                "Module Name: " + name + "\n" +
                "Academic Year: " + year + "\n" +
                "Semester: " + sem + "\n" +
                "Module Credit: " + cred + "\n" +
                "Venue: " + venu + "\n" );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(w);
            }
        });
    }



}