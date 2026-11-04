package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes8.dex */
public class PreloaderBarView extends ProgressBar {
    public PreloaderBarView(Context context) {
        super(context);
        a(context, null, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.Mv, i10, 0);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(c1.s.Nv, -1);
            typedArrayObtainStyledAttributes.recycle();
            setIndeterminate(true);
            setColor(color);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setColor(int i10) {
        setIndeterminateDrawable(new c0(i10));
    }

    public PreloaderBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public PreloaderBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10);
    }
}
