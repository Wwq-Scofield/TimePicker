package com.zhs.timepicker.util;

import android.view.MotionEvent;

import com.zhs.timepicker.view.WheelView;

public final class LoopViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {

    final WheelView loopView;

    public LoopViewGestureListener(WheelView loopview) {
        loopView = loopview;
    }

    @Override
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        loopView.scrollBy(velocityY);
        return true;
    }
}
