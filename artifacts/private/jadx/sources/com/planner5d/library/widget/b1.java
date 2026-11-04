package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class b1 extends BackgroundImageView {
    public b1(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDimensionPixelSize(c1.f.f251046ge), View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE));
    }

    public b1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
