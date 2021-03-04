package space.kotik.katan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GamesLevels extends AppCompatActivity {


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameslevels);

        ImageButton back = findViewById(R.id.btn_back);

        back.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(GamesLevels.this, MainActivity.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {

            }
        });

    }
}