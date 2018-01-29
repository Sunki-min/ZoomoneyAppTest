package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        

        Button btn_check_sign_up = (Button)findViewById(R.id.btn_check_sign_up);
        btn_check_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_sigIn = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(go_to_sigIn);
            }
        });


    }
}
