package space.kotik.katan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class LevelTwo extends AppCompatActivity {

    TextView text;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);



        //загружаем текст уровня
        text = (TextView) findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_two));

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


        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }



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