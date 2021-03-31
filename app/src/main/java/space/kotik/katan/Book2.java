package space.kotik.katan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Book2 extends AppCompatActivity {

    PDFView book2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);

        book2 = (PDFView)findViewById(R.id.pdfbook1);

        book2.fromAsset("book_two.pdf").load();
    }
}