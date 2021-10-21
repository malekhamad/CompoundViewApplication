package com.geniusmind.compoundviewapplication.enumerations;

public enum ViewTypeEnum {

    TEXT_TYPE(1),
        IMAGE_TYPE(2),
            TEXT_IMAGE_TYPE(3);

    private int mValue ;

     ViewTypeEnum(int mValue){
        this.mValue = mValue ;
    }
}
