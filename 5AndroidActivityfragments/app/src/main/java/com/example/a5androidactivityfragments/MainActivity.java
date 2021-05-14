package com.example.a5androidactivityfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "С латинского языка имя Сергей переводится как \"высокий\" или \"высокочтимый\".");
        startActivity(i);
    }
    public void onClick2(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Алексей Переводится с древнегреческого как - \"защитник\".");
        startActivity(i);
    }
    public void onClick3(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Григорий Переводится с древнегреческого как -\"бодрствующий\", \"неспящий\".");
        startActivity(i);
    }
    public void onClick4(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Иван Переводится с древнееврейского как - \"Яхве (Бог) смилостивился, помиловал (дар Бога)\".");
        startActivity(i);
    }
    public void onClick5(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Роман Происходит от латинского слова \"романус\", переводится как римский, римлянин.");
        startActivity(i);
    }
    public void onClick6(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Евгений Переводится с древнегреческого как - \"благородный\".");
        startActivity(i);
    }
    public void onClick7(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Павел Происходит от латинского \"паулюс\", переводится как - \"маленький\" (малыш).");
        startActivity(i);
    }
    public void onClick8(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Дмитрий Происходит от древнегреческого слова \"деметрисс\", переводится как - \"принадлежащий Деметре\"");
        startActivity(i);
    }
    public void onClick9(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Емельян Переводится с древнегреческого как - \"льстивый, приятный в слове\".");
        startActivity(i);
    }
}