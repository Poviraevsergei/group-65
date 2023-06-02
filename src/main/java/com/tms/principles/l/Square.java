package com.tms.principles.l;

public class Square extends Rectangle{

    @Override
    public void setX(int value) {
        super.setY(value);
        super.setX(value);
    }

    @Override
    public void setY(int value) {
        super.setY(value);
        super.setX(value);
    }
}
