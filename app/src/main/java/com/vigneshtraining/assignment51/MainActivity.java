package com.vigneshtraining.assignment51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater M =getMenuInflater();
        M.inflate(R.menu.my_menu,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //item.setIcon(android.R.drawable.btn_star_big_on);
        //Toast.makeText(this, "Selected: "+item.getTitle(), Toast.LENGTH_SHORT).show();

        switch (item.getItemId()){

            case R.id.TextRed:
                tv.setTextColor(getColor(R.color.Red));
                break;

            case R.id.TextGreen:
                tv.setTextColor(getColor(R.color.Green));
                break;

            case R.id.TextBlue:
                tv.setTextColor(getColor(R.color.Blue));
                break;




        }
       

        return super.onOptionsItemSelected(item);
    }


}
