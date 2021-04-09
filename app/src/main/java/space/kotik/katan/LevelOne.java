package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;


public class LevelOne extends AppCompatActivity {

    TextView text;
    TextView lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);

        //загружаем текст уровня
        text = findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_one));

        lesson = findViewById(R.id.lesson);
        lesson.setText(getResources().getString(R.string.lessonone));

        ImageButton back = findViewById(R.id.btn_back);
        //кнопка назад
        back.setOnClickListener(v -> {
            Intent intent = new Intent(LevelOne.this, GamesLevels.class);
            startActivity(intent);finish();
        });

        ImageButton go = findViewById(R.id.forward);
        // кнопка перехода из уровень в следующий
        go.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(LevelOne.this, LevelTwo.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        ViewPager viewPager = findViewById(R.id.viewPager);
        int[]  mImageIds = new int[]{R.drawable.one1, R.drawable.one2, R.drawable.one3, R.drawable.one4, R.drawable.one5,
                R.drawable.one6, R.drawable.one7, R.drawable.one8, R.drawable.one9, R.drawable.one10,
                R.drawable.one11, R.drawable.one12, R.drawable.one13, R.drawable.one14, R.drawable.one15,
                R.drawable.one16, R.drawable.one17, R.drawable.one18, R.drawable.one19, R.drawable.one20};
        ImageAdapter adapter = new ImageAdapter(this,  mImageIds);
        viewPager.setAdapter(adapter);
    }

   /* public void OpenActivity(Activity activity) {
            Intent intent = new Intent(this, activity.getClass());
            startActivity(intent);
            this.finish();
    }*/

    //системная кнопка назад
    @Override
    public void onBackPressed(){
super.onBackPressed();
    }
}