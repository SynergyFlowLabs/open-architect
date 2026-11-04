package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.core.content.d;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import com.google.android.material.resources.c;
import com.google.android.material.shape.k;

/* JADX INFO: loaded from: classes4.dex */
public class a extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f112519f = r6.a.n.Mj;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final k f112520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f112521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private int f112522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f112523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f112524e;

    public a(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f112522c;
    }

    @t0
    public int getDividerInsetEnd() {
        return this.f112524e;
    }

    @t0
    public int getDividerInsetStart() {
        return this.f112523d;
    }

    public int getDividerThickness() {
        return this.f112521b;
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = true;
        if (u1.c0(this) != 1) {
            z10 = false;
        }
        int i11 = z10 ? this.f112524e : this.f112523d;
        if (z10) {
            width = getWidth();
            i10 = this.f112523d;
        } else {
            width = getWidth();
            i10 = this.f112524e;
        }
        this.f112520a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f112520a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i12 = this.f112521b;
        if (i12 > 0 && measuredHeight != i12) {
            measuredHeight = i12;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(@l int i10) {
        if (this.f112522c != i10) {
            this.f112522c = i10;
            this.f112520a.p0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(@n int i10) {
        setDividerColor(d.g(getContext(), i10));
    }

    public void setDividerInsetEnd(@t0 int i10) {
        this.f112524e = i10;
    }

    public void setDividerInsetEndResource(@q int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@t0 int i10) {
        this.f112523d = i10;
    }

    public void setDividerInsetStartResource(@q int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@t0 int i10) {
        if (this.f112521b != i10) {
            this.f112521b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@q int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public a(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Lc);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f112519f;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f112520a = new k();
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.In, i10, i11, new int[0]);
        this.f112521b = typedArrayK.getDimensionPixelSize(r6.a.o.Mn, getResources().getDimensionPixelSize(r6.a.f.Q9));
        this.f112523d = typedArrayK.getDimensionPixelOffset(r6.a.o.Ln, 0);
        this.f112524e = typedArrayK.getDimensionPixelOffset(r6.a.o.Kn, 0);
        setDividerColor(c.a(context2, typedArrayK, r6.a.o.Jn).getDefaultColor());
        typedArrayK.recycle();
    }
}
