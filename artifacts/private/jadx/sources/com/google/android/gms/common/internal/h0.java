package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends Button {
    public h0(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int b(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException("Unknown color scheme: " + i10);
    }

    public final void a(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = f6.a.c.f275037b;
        int i14 = f6.a.c.f275042g;
        int iB = b(i11, i13, i14, i14);
        int i15 = f6.a.c.f275046k;
        int i16 = f6.a.c.f275051p;
        int iB2 = b(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            iB = iB2;
        } else if (i10 != 2) {
            throw new IllegalStateException("Unknown button size: " + i10);
        }
        Drawable drawableR = androidx.core.graphics.drawable.c.r(resources.getDrawable(iB));
        androidx.core.graphics.drawable.c.o(drawableR, resources.getColorStateList(f6.a.b.f275035k));
        androidx.core.graphics.drawable.c.p(drawableR, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableR);
        int i17 = f6.a.b.f275025a;
        int i18 = f6.a.b.f275030f;
        setTextColor((ColorStateList) w.r(resources.getColorStateList(b(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(f6.a.e.f275081p));
        } else if (i10 == 1) {
            setText(resources.getString(f6.a.e.f275082q));
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown button size: " + i10);
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (com.google.android.gms.common.util.l.m(getContext())) {
            setGravity(19);
        }
    }
}
