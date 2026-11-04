package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"AppCompatCustomView"})
@b1({b1.a.LIBRARY_GROUP})
public class q0 extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f112903a;

    public q0(Context context) {
        this(context, null);
    }

    public final void c(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f112903a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f112903a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        c(i10, true);
    }

    public q0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f112903a = getVisibility();
    }
}
