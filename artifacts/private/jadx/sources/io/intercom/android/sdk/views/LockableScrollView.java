package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes13.dex */
public class LockableScrollView extends ScrollView {
    private boolean interceptTouch;
    private boolean isExpanded;
    private int maxHeight;
    private boolean scrollable;

    public LockableScrollView(Context context) {
        super(context);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.interceptTouch;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!this.isExpanded) {
            int mode = View.MeasureSpec.getMode(i11);
            i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.maxHeight), mode) : View.MeasureSpec.makeMeasureSpec(this.maxHeight, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.scrollable && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        if (this.scrollable) {
            super.scrollTo(i10, i11);
        }
    }

    public void setExpanded(boolean z10) {
        if (z10 != this.isExpanded) {
            this.isExpanded = z10;
            requestLayout();
            invalidate();
        }
    }

    public void setScrollingEnabled(boolean z10) {
        this.scrollable = z10;
    }

    public void setUp(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LockableScrollView);
        this.maxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LockableScrollView_intercomHeightLimit, 0);
        this.isExpanded = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LockableScrollView_intercomExpanded, true);
        this.interceptTouch = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LockableScrollView_intercomInterceptTouch, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void toggleExpanded() {
        setExpanded(!this.isExpanded);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
        setUp(attributeSet);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
        setUp(attributeSet);
    }
}
