package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@e.a({"AppCompatCustomView"})
public class f0 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f258185a;

    public f0(Context context) {
        super(context);
        this.f258185a = new Rect();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            getLocalVisibleRect(this.f258185a);
            setColorFilter(Color.argb(50, 0, 0, 0));
        } else {
            if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    clearColorFilter();
                } else {
                    z10 = false;
                }
                return !super.onTouchEvent(motionEvent) || z10;
            }
            if (!this.f258185a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                clearColorFilter();
            }
        }
        z10 = true;
        if (super.onTouchEvent(motionEvent)) {
        }
    }

    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258185a = new Rect();
    }

    public f0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f258185a = new Rect();
    }
}
