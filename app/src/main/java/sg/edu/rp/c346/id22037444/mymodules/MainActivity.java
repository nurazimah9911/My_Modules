package sg.edu.rp.c346.id22037444.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView androidPro;
    TextView iPadPro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidPro = findViewById(R.id.textViewAndroid);
        iPadPro = findViewById(R.id.textViewIPad);

        androidPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "Module Code: C346");
                intent.putExtra("ModuleName", "Module Name: Android Programming");
                intent.putExtra("AcademicYear", "Academic Year: 1");
                intent.putExtra("Semester", "Semester: 1");
                intent.putExtra("ModuleCredit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W66M");
                startActivity(intent);
            }
        });
    }
}