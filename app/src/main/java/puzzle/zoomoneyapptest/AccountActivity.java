package puzzle.zoomoneyapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class AccountActivity extends AppCompatActivity {

    private SwipeRefreshLayout mSwipeRefresh;
//    ListView listView;
//    MyListAdapter myListAdapter;
//    ArrayList<list_item> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
//        listView = (ListView)findViewById(R.id.my_listview);

//        list_itemArrayList = new ArrayList<list_item>();
//
//        list_itemArrayList.add(new list_item("2018-02-05","KISA","1,500"));
//        list_itemArrayList.add(new list_item("2018-02-04","GS 편의점","700"));
//        list_itemArrayList.add(new list_item("2018-01-31","CU 편의점","1,700"));
//        list_itemArrayList.add(new list_item("2018-02-04","경찰병원역","2,100"));
//
//        myListAdapter = new MyListAdapter(AccountActivity.this,list_itemArrayList);
//        listView.setAdapter(myListAdapter);

//        mSwipeRefresh = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);

//        mSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                mSwipeRefresh.setRefreshing(false);
//            }
//        });

        ImageButton btn_check_account = (ImageButton) findViewById(R.id.btn_check_account);
        btn_check_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_signIn = new Intent(AccountActivity.this, SignInActivity.class);
                startActivity(go_to_signIn);
            }
        });

    }
}

