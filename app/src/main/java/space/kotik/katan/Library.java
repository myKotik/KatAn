package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.transition.Scene;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Library extends AppCompatActivity {


    TextView book1, book4, book3, book2;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton libr = findViewById(R.id.imgbtn);
        //кнопка перехода из бибилиотеки в уровни
        libr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Library.this, GamesLevels.class);
                startActivity(I);
                finish();
            }
        });

        book1 = (TextView)findViewById(R.id.book1);
        book2 = (TextView)findViewById(R.id.book2);
        book3 = (TextView)findViewById(R.id.book3);
        book4 = (TextView)findViewById(R.id.book4);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Library.this, Book1.class);
                startActivity(i);
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Library.this, Book2.class);
                startActivity(i2);
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Library.this, Book3.class);
                startActivity(i3);
            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Library.this, Book4.class);
                startActivity(i4);
            }
        });
    }
}
