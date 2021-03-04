package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.start);

        start.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(MainActivity.this, GamesLevels.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {

            }
        });


       /* //logo
        webView = findViewById(R.id.logo);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String file = "file:android_asset/logo.gif";
        webView.loadUrl(file);

        //button start
        webView = findViewById(R.id.btn_start);

        WebSettings webSetting = webView.getSettings();
        webSetting.setJavaScriptEnabled(true);
        String files = "file:android_asset/btn.gif";
        webView.loadUrl(files);*/
    }
}