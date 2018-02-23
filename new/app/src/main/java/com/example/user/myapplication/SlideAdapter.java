package com.example.user.myapplication;


import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_images = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4

          };

    public String[] list_title = {
            "TITLE 1",
            "TITLE 2",
            "TITLE 3",
            "TITLE 4"
    };

    public String[] list_description = {
            "DESC 1",
            "DESC 2",
            "DESC 3",
            "DESC 4"

    };

    public int[] list_bgcolor = {
        Color.rgb(55,55,55),
        Color.rgb(239,85,85),
        Color.rgb(110, 49,89),
        Color.rgb(1, 188, 212)

    };

    public SlideAdapter(Context context) {
        this.context = context;

    }
    @Override
    public int getCount() {
        return list_title.length;
    }



    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView texttitle = (TextView) view.findViewById(R.id.texttitle);
        TextView description = (TextView) view.findViewById(R.id.textdescription);
        layoutslide.setBackgroundColor(list_bgcolor[position]);
        imgslide.setImageResource(list_images[position]);
        texttitle.setText(list_title[position]);
        description.setText(list_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
