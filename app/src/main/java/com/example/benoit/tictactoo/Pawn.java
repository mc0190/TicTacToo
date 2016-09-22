package com.example.benoit.tictactoo;

import android.widget.ImageButton;

/**
 * Created by benoit on 22/09/2016.
 */
public class Pawn {

    private int EMPTY = 0, X = 1, O = 2 ;

    private ImageButton imageButton;
    private int value;

    public Pawn(ImageButton imageButton) {
        this.imageButton = imageButton ;
        this.value = EMPTY ;
    }

    public int getValue() {
        return value ;
    }

    public void setValue(int i) {
        this.value = i;
        if (value == EMPTY) {
            imageButton.setImageResource(R.mipmap.empty);
        } else if (value == X)
            imageButton.setImageResource(R.mipmap.x);
        else
            imageButton.setImageResource(R.mipmap.o);

    }

    public ImageButton getImageButton() {
        return imageButton;
    }

    public void setImageButton(ImageButton imageButton) {
        this.imageButton = imageButton;
    }

    public void reset() {
        this.value = EMPTY ;
        this.imageButton.setImageResource(R.mipmap.empty);
    }

    public boolean isEmpty() {
        if (this.value == EMPTY)
            return true ;
        return false;
    }
}
