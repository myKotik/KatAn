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


    Button btn_book1, btn_book4, btn_book3, btn_book2;

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

        btn_book1 = (Button)findViewById(R.id.book_1);
        btn_book2 = (Button)findViewById(R.id.book_2);
        btn_book3 = (Button)findViewById(R.id.book_3);
        btn_book4 = (Button)findViewById(R.id.book_4);

        btn_book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Library.this, Book1.class);
                startActivity(i);
            }
        });

        btn_book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Library.this, Book2.class);
                startActivity(i2);
            }
        });

        btn_book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Library.this, Book3.class);
                startActivity(i3);
            }
        });

        btn_book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Library.this, Book4.class);
                startActivity(i4);
            }
        });
    }
}
