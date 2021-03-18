package space.kotik.katan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class LevelOne extends AppCompatActivity {

   /* private Context mContext;
    private int[] mImageIds = new int[]{
R.drawable.one1, R.drawable.one2, R.drawable.one3, R.drawable.one4, R.drawable.one5, R.drawable.one6,
            R.drawable.one7, R.drawable.one8, R.drawable.one9, R.drawable.one10, R.drawable.one11, R.drawable.one12,
            R.drawable.one13, R.drawable.one14, R.drawable.one15, R.drawable.one16, R.drawable.one17, R.drawable.one18,
            R.drawable.one19, R.drawable.one20
    };
   void ImageAdapter(Context context){
        mContext = context;}
    public int getCount(){
       return mImageIds.length;}
    public boolean isViewFormObject(View view, Object object){
       return false;}
    @Override
            public Object instantiateItem*/


    TextView text;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level);



        //загружаем текст уровня
        text = (TextView) findViewById(R.id.one);
                text.setText(getResources().getString(R.string.level_one));

                //кнопка назад
        ImageButton back = findViewById(R.id.btn_back);

        back.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(LevelOne.this, GamesLevels.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }



    //системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(LevelOne.this, GamesLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}