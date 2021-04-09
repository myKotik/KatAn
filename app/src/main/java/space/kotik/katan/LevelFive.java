package space.kotik.katan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class LevelFive extends AppCompatActivity {

    TextView text;
    TextView lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);



        //загружаем текст уровня
        text = (TextView) findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_five));

        lesson = (TextView) findViewById(R.id.lesson);
        lesson.setText(getResources().getString(R.string.lessonfive));


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
                try {
                    Intent intent = new Intent(LevelFive.this, LevelSix.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        ViewPager viewPager = findViewById(R.id.viewPager);
        int[]  mImageIds = new int[]{R.drawable.five1, R.drawable.five2, R.drawable.five3};
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