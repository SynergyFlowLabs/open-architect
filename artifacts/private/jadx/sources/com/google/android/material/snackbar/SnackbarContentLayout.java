package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.view.u1;
import com.google.android.material.color.u;
import com.google.android.material.motion.j;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f113926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f113927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f113928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f113929d;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    private static void d(@NonNull View view, int i10, int i11) {
        if (u1.c1(view)) {
            u1.m2(view, u1.n0(view), i10, u1.m0(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f113926a.getPaddingTop() == i11 && this.f113926a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f113926a, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f113926a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f113926a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f113928c).setStartDelay(j11).start();
        if (this.f113927b.getVisibility() == 0) {
            this.f113927b.setAlpha(0.0f);
            this.f113927b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f113928c).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f113926a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f113926a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f113928c).setStartDelay(j11).start();
        if (this.f113927b.getVisibility() == 0) {
            this.f113927b.setAlpha(1.0f);
            this.f113927b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f113928c).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f113927b.setTextColor(u.t(u.d(this, r6.a.c.f359214e4), this.f113927b.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f113927b;
    }

    public TextView getMessageView() {
        return this.f113926a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f113926a = (TextView) findViewById(r6.a.h.f360685i5);
        this.f113927b = (Button) findViewById(r6.a.h.f360677h5);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(r6.a.f.F1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(r6.a.f.E1);
        Layout layout = this.f113926a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f113929d <= 0 || this.f113927b.getMeasuredWidth() <= this.f113929d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f113929d = i10;
    }

    public SnackbarContentLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113928c = j.g(context, r6.a.c.Vd, com.google.android.material.animation.b.f111044b);
    }
}
