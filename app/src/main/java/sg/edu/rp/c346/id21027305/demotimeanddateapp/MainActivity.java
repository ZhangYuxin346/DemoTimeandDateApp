package sg.edu.rp.c346.id21027305.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
DatePicker dp;
TimePicker tp;
Button btnDisplayDate;
Button btnDisplayTime;
TextView tvDisplay;
Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnDisplayDate=findViewById(R.id.btnDisplayDate);
        btnDisplayTime=findViewById(R.id.btnDisplayTime);
        tvDisplay=findViewById(R.id.textView);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay.setText("Time is "+tp.getCurrentHour().toString()+":"+tp.getCurrentMinute().toString());
            }
        });


        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d = dp.getDayOfMonth();
                int m = dp.getMonth()+1;
                int y = dp.getYear();
                tvDisplay.setText(String.format("Date is " + d + "/" + m +"/" + y));

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.updateDate(2020, 0, 1);
                tp.setCurrentHour(12);
                tp.setCurrentMinute(00);
            }
        });
    }

}