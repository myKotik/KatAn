package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Library extends AppCompatActivity {

    Button btn_book1, btn_book4, btn_book3, btn_book2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

       ImageButton libr = findViewById(R.id.imgbtn);
        //кнопка перехода из бибилиотеки в уровни
        libr.setOnClickListener(v -> {
             Intent I = new Intent(Library.this, GamesLevels.class);
             startActivity(I);finish();
        });

        btn_book1 = findViewById(R.id.book_1);
        btn_book2 = findViewById(R.id.book_2);
        btn_book3 = findViewById(R.id.book_3);
        btn_book4 = findViewById(R.id.book_4);

        btn_book1.setOnClickListener(v -> {

            Intent i = new Intent(Library.this, Book1.class);
            startActivity(i);
        });
        btn_book2.setOnClickListener(v -> {
            Intent i2 = new Intent(Library.this, Book2.class);
            startActivity(i2);
        });
        btn_book3.setOnClickListener(v -> {
            Intent i3 = new Intent(Library.this, Book3.class);
            startActivity(i3);
        });
        btn_book4.setOnClickListener(v -> {
            Intent i4 = new Intent(Library.this, Book4.class);
            startActivity(i4);
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Library.this, GamesLevels.class);
        startActivity(i);finish();
    }
}
