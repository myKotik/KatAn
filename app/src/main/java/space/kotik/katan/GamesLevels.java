package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GamesLevels extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameslevels);

        ImageButton back = findViewById(R.id.btn_back);
        //кнопка назад
        back.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(GamesLevels.this, SplashScreen.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        ImageButton lib = findViewById(R.id.library);
        //кнопка в библиотеку
        lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(GamesLevels.this, Library.class);
                startActivity(I);
                finish();
            }
        });

        ImageButton levelone = findViewById(R.id.Level_One);
        //кнопка на первый уровень
        levelone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GamesLevels.this, LevelOne.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ImageButton leveltwo = findViewById(R.id.Level_Two);
        //кнопка на второй уровень
        leveltwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GamesLevels.this, LevelTwo.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ImageButton levelthree = findViewById(R.id.Level_Three);
        //кнопка на третий уровень
        levelthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GamesLevels.this, LevelThree.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ImageButton levelfour = findViewById(R.id.Level_Four);
        //кнопка на четвертый уровень
        levelfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GamesLevels.this, LevelFour.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ImageButton levelfive = findViewById(R.id.Level_Five);
        //кнопка на пятый уровень
        levelfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GamesLevels.this, LevelFive.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ImageButton levelsix = findViewById(R.id.Level_Six);
        //кнопка на шестой уровень
        levelsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GamesLevels.this, LevelSix.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    //системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(GamesLevels.this, SplashScreen.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}