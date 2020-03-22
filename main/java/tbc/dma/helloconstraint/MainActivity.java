package tbc.dma.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView textView;
    private Button btnCount;
    private Button btnToast;
    private Button btnZero;
    //private MainActivityBinding binding;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UI();
    }


    public void UI() {
        textView = findViewById(R.id.show_content);
        btnCount = findViewById(R.id.btnCount);
        btnToast = findViewById(R.id.btnToast);
        btnZero = findViewById(R.id.btnZero);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countUp();
                if(mCount%2 ==0)
                {
                    btnCount.setBackgroundColor(Color.YELLOW);
                    btnCount.setTextColor(Color.BLACK);
                }else{
                    btnCount.setBackgroundColor(Color.MAGENTA);
                    btnCount.setTextColor(Color.WHITE);
                }
                btnZero.setBackgroundColor(Color.GREEN);
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
                btnZero.setBackgroundColor(Color.GRAY);
                btnCount.setTextColor(Color.WHITE);
            }
        });

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_main);
        UI();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("key_name", textView.getText().toString());
        savedInstanceState.putInt("count", mCount);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        {
            textView.setText("" + savedInstanceState.getString("key_name"));
            mCount = savedInstanceState.getInt("count");

        }
    }

    public void countUp () {
        mCount++;
        if (textView != null)
            textView.setText(Integer.toString(mCount));
    }
}
