package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;


public class LevelOne extends AppCompatActivity {

    TextView text;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);



        //загружаем текст уровня
        text = (TextView) findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_one));


        ImageButton back = findViewById(R.id.btn_back);
        //кнопка назад
        back.setOnClickListener(v -> {
           onBackPressed();
        });

        ImageButton go = findViewById(R.id.forward);
        // кнопка перехода из уровень в следующий
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity(new LevelTwo());
            }
        });


        ViewPager viewPager = findViewById(R.id.viewPager);
        int[]  mImageIds = new int[]{R.drawable.btn_back, R.drawable.btn_back, R.drawable.btn_back, R.drawable.btn_back, R.drawable.btn_back};
        ImageAdapter adapter = new ImageAdapter(this,  mImageIds);
        viewPager.setAdapter(adapter);
    }

    public void OpenActivity(Activity activity) {
        try {
            Intent intent = new Intent(this, activity.getClass());
            startActivity(intent);
            this.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //системная кнопка назад
    @Override
    public void onBackPressed(){
super.onBackPressed();
    }
}