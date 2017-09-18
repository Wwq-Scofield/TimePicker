package com.app.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zhs.timepicker.view.TimePickerView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TimePickerView pvTime;
    private TextView tvTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTime= (TextView) findViewById(R.id.tvTime);
        tvTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pvTime.show();
            }
        });
        pvTime = new TimePickerView(this, TimePickerView.Type.YEAR_MONTH_DAY);
        // 控制时间范围
//		 Calendar calendar = Calendar.getInstance();
//		 pvTime.setRange(calendar.get(Calendar.YEAR) - 20,
//		 calendar.get(Calendar.YEAR));
        pvTime.setTime(new Date());
        pvTime.setCyclic(false);
        pvTime.setCancelable(true);
        // 时间选择后回调
        pvTime.setOnTimeSelectListener(new TimePickerView.OnTimeSelectListener()
        {
            @Override
            public void onTimeSelect(Date date)
            {
                tvTime.setText(getTime(date));
            }
        });
    }
    public   String getTime(Date date)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return format.format(date);
    }
}
