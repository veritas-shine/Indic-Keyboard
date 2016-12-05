package glv.io.miaotext;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText view = (EditText)findViewById(R.id.editText);
        Context context = getApplicationContext();
        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/MiaoUnicode-Regular.ttf");
        view.setTypeface(font);
    }
}
