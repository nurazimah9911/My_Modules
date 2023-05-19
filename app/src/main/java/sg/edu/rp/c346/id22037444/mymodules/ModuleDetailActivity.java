package sg.edu.rp.c346.id22037444.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode1);
        tvName = findViewById(R.id.textViewName1);
        tvYear = findViewById(R.id.textViewYear1);
        tvSem = findViewById(R.id.textViewSem1);
        tvCredit = findViewById(R.id.textViewCredit1);
        tvVenue = findViewById(R.id.textViewVenue1);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("ModuleCode");
        String name = intentReceived.getStringExtra("ModuleName");
        String year = intentReceived.getStringExtra("AcademicYear");
        String sem = intentReceived.getStringExtra("Semester");
        String credit = intentReceived.getStringExtra("ModuleCredit");
        String venue = intentReceived.getStringExtra("Venue");
        tvCode.setText(code);
        tvName.setText(name);
        tvYear.setText(year);
        tvSem.setText(sem);
        tvCredit.setText(credit);
        tvVenue.setText(venue);
    }
}