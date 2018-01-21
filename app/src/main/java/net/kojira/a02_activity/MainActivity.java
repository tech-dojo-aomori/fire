package net.kojira.a02_activity;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        imageView=findViewById(R.id.imageView3);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "blue", Toast.LENGTH_SHORT).show();
                text.setText("blue");
                imageView.setImageResource(R.drawable.oil);
            }
        });
    }
}
