package com.example.fatima.menulist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Burger extends AppCompatActivity {

    String[] name= {"cheeseburger","zinger burger", "hamburger", "steak burger", "chicken burger","beef burger"};
    String[] price={"RS: 350", "RS: 350","RS: 350","RS: 350","RS: 350","RS: 350",};
    int[] images = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
      ListView listview = findViewById(R.id.listview);
        CustomeAdapter customeAdapter=new CustomeAdapter();
        listview.setAdapter(customeAdapter);
    }
    class CustomeAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1=getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageview= view1.findViewById(R.id.imageView);
            TextView textView=view1.findViewById(R.id.name);
            TextView textView1=view1.findViewById(R.id.price);
            imageview.setImageResource(images[i]);
            textView.setText(name[i]);
            textView1.setText(price[i]);
            return view1;
        }
    }
}
