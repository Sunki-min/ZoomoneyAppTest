package puzzle.zoomoneyapptest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by min on 2018-02-03.
 */

public class MyListAdapter extends BaseAdapter {
    Context context;
    ArrayList<list_item> list_itemArrayList;

    TextView date;
    TextView place;
    TextView money;

    public MyListAdapter(Context context, ArrayList<list_item> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }


    @Override
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
            date = (TextView) convertView.findViewById(R.id.tv_date);
            place = (TextView) convertView.findViewById(R.id.tv_place);
            money = (TextView) convertView.findViewById(R.id.tv_money);
        }

        date.setText(list_itemArrayList.get(position).getDate());
        place.setText(list_itemArrayList.get(position).getPlace());
        money.setText(list_itemArrayList.get(position).getMoney());

        return convertView;
    }
}
