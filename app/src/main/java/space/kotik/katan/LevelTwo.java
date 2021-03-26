package space.kotik.katan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class LevelTwo extends AppCompatActivity {

    TextView text;
    TextView lesson;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);



        //загружаем текст уровня
        text = (TextView) findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_two));

        lesson = (TextView) findViewById(R.id.lesson);
        lesson.setText(getResources().getString(R.string.lessontwo));

                //кнопка назад
        ImageButton back = findViewById(R.id.btn_back);

        back.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(LevelTwo.this, GamesLevels.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        ImageButton go = findViewById(R.id.forward);
        // кнопка перехода из уровень в следующий
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(LevelTwo.this, LevelThree.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

                ViewPager viewPager = findViewById(R.id.viewPager);
        int[]  mImageIds = new int[]{R.drawable.two1, R.drawable.two2, R.drawable.two3};
        ImageAdapter adapter = new ImageAdapter(this,  mImageIds);
        viewPager.setAdapter(adapter);
    }

   /* public void OpenActivity(Activity activity) {
        try {
            Intent intent = new Intent(this, activity.getClass());
            startActivity(intent);
            this.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    //системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(LevelTwo.this, GamesLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}