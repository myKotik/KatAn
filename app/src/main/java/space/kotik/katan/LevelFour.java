package space.kotik.katan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class LevelFour extends AppCompatActivity {

    TextView text;
    TextView lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);

        //загружаем текст уровня
        text = findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_four));

        lesson = findViewById(R.id.lesson);
        lesson.setText(getResources().getString(R.string.lessonfour));

        ImageButton back = findViewById(R.id.btn_back);
        //кнопка назад
        back.setOnClickListener(v -> {
            Intent intent = new Intent(LevelFour.this, GamesLevels.class);
            startActivity(intent);finish();
        });

        ImageButton go = findViewById(R.id.forward);
        // кнопка перехода из уровень в следующий
        go.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(LevelFour.this, LevelFive.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        ViewPager viewPager = findViewById(R.id.viewPager);
        int[]  mImageIds = new int[]{R.drawable.four1, R.drawable.four2, R.drawable.four3, R.drawable.four4, R.drawable.four5,
                R.drawable.four6, R.drawable.four7, R.drawable.four8, R.drawable.four9,R.drawable.four10};
        ImageAdapter adapter = new ImageAdapter(this,  mImageIds);
        viewPager.setAdapter(adapter);
    }

    //системная кнопка назад
    @Override
    public void onBackPressed(){
super.onBackPressed();
    }
}