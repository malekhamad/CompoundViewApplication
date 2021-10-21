package com.geniusmind.compoundviewapplication.model;

import com.geniusmind.compoundviewapplication.enumerations.ViewTypeEnum;

public class Item {
    private String mText ;
    private ViewTypeEnum mViewTypeEnum ;

    public Item(String text, ViewTypeEnum viewTypeEnum) {
        mText = text;
        mViewTypeEnum = viewTypeEnum;
    }

    public String getText() {
        return mText;
    }

    public ViewTypeEnum getViewTypeEnum() {
        return mViewTypeEnum;
    }
}
