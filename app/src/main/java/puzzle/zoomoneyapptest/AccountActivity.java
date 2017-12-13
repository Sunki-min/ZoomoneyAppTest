package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Button btn_check_account = (Button)findViewById(R.id.btn_check_account);
        btn_check_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_signIn = new Intent(AccountActivity.this, SiginInActivity.class);
                startActivity(go_to_signIn);
            }
        });





    }
}
