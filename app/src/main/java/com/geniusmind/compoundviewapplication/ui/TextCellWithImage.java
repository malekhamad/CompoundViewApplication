package com.geniusmind.compoundviewapplication.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

import com.geniusmind.compoundviewapplication.R;

public class TextCellWithImage extends LinearLayout {

    private TextView textTitle ;
    private ImageView imageView ;

    public TextCellWithImage(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);

    }

    public TextCellWithImage(Context context) {
        super(context);
        init(context,null);
    }

    private void init(Context context, AttributeSet attrs){
        LayoutInflater.from(context).inflate(R.layout.cell_text_image,this,true);

        textTitle = findViewById(R.id.title);
        imageView = findViewById(R.id.image_launcher);

        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.TextCellWithImage, 0, 0);
        String titleText = a.getString(R.styleable.TextCellWithImage_titleText);

        Drawable drawable = a.getDrawable(R.styleable.TextCellWithImage_img_src);
         textTitle.setText(titleText);
         imageView.setImageDrawable(drawable);
        a.recycle();
    }

    public void setTextTitle(String text){
        textTitle.setText(text);
    }

    public void setImage(@DrawableRes int resourceImageId){
        imageView.setImageResource(resourceImageId);
    }






}
