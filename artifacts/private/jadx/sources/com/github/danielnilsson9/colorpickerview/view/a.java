package com.github.danielnilsson9.colorpickerview.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes4.dex */
public class a extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f102914g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f102915h = -9539986;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f102918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f102919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f102920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f102921f;

    public a(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f102916a == f102915h) {
            this.f102916a = typedArrayObtainStyledAttributes.getColor(0, f102915h);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b() {
        Rect rect = this.f102920e;
        this.f102921f = new Rect(rect.left + 1, rect.top + 1, rect.right - 1, rect.bottom - 1);
    }

    public int getBorderColor() {
        return this.f102916a;
    }

    public int getColor() {
        return this.f102917b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect = this.f102921f;
        this.f102918c.setColor(this.f102916a);
        canvas.drawRect(this.f102920e, this.f102918c);
        this.f102919d.setColor(this.f102917b);
        canvas.drawRect(rect, this.f102919d);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f102917b = bundle.getInt("color");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("color", this.f102917b);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Rect rect = new Rect();
        this.f102920e = rect;
        rect.left = getPaddingLeft();
        this.f102920e.right = i10 - getPaddingRight();
        this.f102920e.top = getPaddingTop();
        this.f102920e.bottom = i11 - getPaddingBottom();
        b();
    }

    public void setBorderColor(int i10) {
        this.f102916a = i10;
        invalidate();
    }

    public void setColor(int i10) {
        this.f102917b = i10;
        invalidate();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102916a = f102915h;
        this.f102917b = -16777216;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.f253879o8);
        this.f102916a = typedArrayObtainStyledAttributes.getColor(c1.s.f253903p8, f102915h);
        typedArrayObtainStyledAttributes.recycle();
        a(context);
        this.f102918c = new Paint();
        this.f102919d = new Paint();
    }
}
