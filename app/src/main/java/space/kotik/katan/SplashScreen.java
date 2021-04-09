package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    LottieAnimationView load;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int SPLASH_DISPLAY_LENGHT = 3000;
        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(SplashScreen.this, GamesLevels.class);
            SplashScreen.this.startActivity(mainIntent);
            SplashScreen.this.finish();
        }, SPLASH_DISPLAY_LENGHT);
        load = findViewById(R.id.loading);
        load.setOnClickListener(v -> load.playAnimation());
    }
}