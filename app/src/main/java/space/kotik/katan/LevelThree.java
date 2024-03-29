package space.kotik.katan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class LevelThree extends AppCompatActivity {

    TextView text;
    TextView lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);


        //загружаем текст уровня
        text = findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_three));

        lesson = findViewById(R.id.lesson);
        lesson.setText(getResources().getString(R.string.lessonthree));


        ImageButton back = findViewById(R.id.btn_back);
        //кнопка назад
        back.setOnClickListener(v -> {
            Intent intent = new Intent(LevelThree.this, GamesLevels.class);
            startActivity(intent);finish();
        });

        ImageButton go = findViewById(R.id.forward);
        // кнопка перехода из уровень в следующий
        go.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(LevelThree.this, LevelFour.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        ViewPager viewPager = findViewById(R.id.viewPager);
        int[]  mImageIds = new int[]{R.drawable.three1, R.drawable.three2, R.drawable.three3, R.drawable.three4, R.drawable.three5,
                R.drawable.three6, R.drawable.three7, R.drawable.three8, R.drawable.three9};
        ImageAdapter adapter = new ImageAdapter(this,  mImageIds);
        viewPager.setAdapter(adapter);
    }

    //системная кнопка назад
    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}