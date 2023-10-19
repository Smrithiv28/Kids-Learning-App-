package ideanity.oceans.kidslearning;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    RelativeLayout color, number, alphabet, week, shape;
    LinearLayout poem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        color = findViewById(R.id.color);
        number = findViewById(R.id.number);
        alphabet = findViewById(R.id.alphabet);
        week = findViewById(R.id.week);
        shape = findViewById(R.id.shape);
        poem = findViewById(R.id.lil_poem);

        color.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ColorsActivity.class)));

        number.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, NumbersActivity.class)));

        alphabet.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AlphabetActivity.class)));

        week.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, WeekActivity.class)));

        shape.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ShapesActivity.class)));

        poem.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PoemsActivity.class)));

    }

    public void Sheep(View view)
    {
        String id3 = "YanYDTGkLH8";
        Intent appIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id3));
        Intent webIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YanYDTGkLH8" + id3));
        try {
            startActivity(appIntent3);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent3);

        }
    }

    public void Stars(View view) {
        String id2 = "aTrtKikAW6E";
        Intent appIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id2));
        Intent webIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hqzvHfy-Ij0" + id2));
        try {
            startActivity(appIntent2);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent2);

        }
    }

    public void Lamb(View view) {
        String id1 = "aTrtKikAW6E";
        Intent appIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id1));
        Intent webIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + id1));
        try {
            startActivity(appIntent1);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent1);
        }
    }
}
