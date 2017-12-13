package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SiginInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_in);

        Button check_sign_in = (Button)findViewById(R.id.check_sign_in);
        check_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_account = new Intent(SiginInActivity.this, AccountActivity.class);
                startActivity(go_to_account);
            }
        });

        TextView tv_sign_up = (TextView)findViewById(R.id.tv_sign_up);
        tv_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_signUp = new Intent(SiginInActivity.this, SignUpActivity.class);
                startActivity(go_to_signUp);

            }
        });


    }
}
