package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes12.dex */
public class ViewPagerCompat extends ViewPager {

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private boolean f249552i4;

    public ViewPagerCompat(Context context) {
        super(context);
        this.f249552i4 = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f249552i4 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f249552i4 && super.onTouchEvent(motionEvent);
    }

    public void setScrollWithFingerEnabled(boolean z10) {
        this.f249552i4 = z10;
    }

    public ViewPagerCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249552i4 = false;
    }
}
