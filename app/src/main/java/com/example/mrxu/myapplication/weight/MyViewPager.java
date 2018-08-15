package com.example.mrxu.myapplication.weight;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by dell on 2018/8/2.
 */

public class MyViewPager extends ViewPager {
    
    public MyViewPager(Context context) {
        super(context);
    }
    
    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    
    float lastX;
    float lastY;
    float currentX;
    float currentY;
    
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        
        if (getCurrentItem() == 2) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    Log.d("mine", "Banner Down");
                    currentX = lastX = event.getX();
                    currentY = lastY = event.getY();
                }
                case MotionEvent.ACTION_MOVE: {
                    currentX = event.getX();
                    currentY = event.getY();
                    if (Math.abs(currentX - lastX) > Math.abs(currentY - lastY) && Math.abs(currentX - lastX) > 20) {
                        Log.d("mine", "Banner Move");
                        return true;
                    }
                }
                break;
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL: {
                    Log.d("mine", "Banner Up");
                    lastX = currentX = lastY = currentY = 0;
                }
                break;
            }
            
        }
        
        return super.onInterceptTouchEvent(event);
    }
}
