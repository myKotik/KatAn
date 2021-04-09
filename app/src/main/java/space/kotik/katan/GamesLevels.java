package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class GamesLevels extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameslevels);

        ImageButton lib = findViewById(R.id.library);
        //кнопка в библиотеку
        lib.setOnClickListener(v -> {
            Intent I = new Intent(GamesLevels.this, Library.class);
            startActivity(I);
            finish();
        });

        ImageButton levelone = findViewById(R.id.Level_One);
        //кнопка на первый уровень
        levelone.setOnClickListener(v -> {
                Intent intent = new Intent(GamesLevels.this, LevelOne.class);
                startActivity(intent);finish();
        });

        ImageButton leveltwo = findViewById(R.id.Level_Two);
        //кнопка на второй уровень
        leveltwo.setOnClickListener(v -> {
            Intent intent = new Intent(GamesLevels.this, LevelTwo.class);
            startActivity(intent);finish();
        });

        ImageButton levelthree = findViewById(R.id.Level_Three);
        //кнопка на третий уровень
        levelthree.setOnClickListener(v -> {
                Intent intent = new Intent(GamesLevels.this, LevelThree.class);
                startActivity(intent);finish();
        });

        ImageButton levelfour = findViewById(R.id.Level_Four);
        //кнопка на четвертый уровень
        levelfour.setOnClickListener(v -> {
                Intent intent = new Intent(GamesLevels.this, LevelFour.class);
                startActivity(intent);finish();
        });

        ImageButton levelfive = findViewById(R.id.Level_Five);
        //кнопка на пятый уровень
        levelfive.setOnClickListener(v -> {
                Intent intent = new Intent(GamesLevels.this, LevelFive.class);
                startActivity(intent);finish();
        });

        ImageButton levelsix = findViewById(R.id.Level_Six);
        //кнопка на шестой уровень
        levelsix.setOnClickListener(v -> {
                Intent intent = new Intent(GamesLevels.this, LevelSix.class);
                startActivity(intent);finish();
        });

    }
    //системная кнопка назад
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else {
            backToast = Toast.makeText(getBaseContext(), "Нажмите ещё раз для того, чтобы выйти.", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}