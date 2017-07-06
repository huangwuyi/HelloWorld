package com.cnhtc.cold.helloworld;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cold on 2017/7/6.
 */

public class LoadButtom extends View {
    public LoadButtom(Context context) {
        super(context);
    }

    public LoadButtom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
