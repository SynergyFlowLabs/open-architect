package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class g extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f114380d = "skip";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f114381e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f114382f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final float f114383g = 0.66f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f114384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f114385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.material.shape.k f114386c;

    public g(@NonNull Context context) {
        this(context, null);
    }

    private static boolean B(View view) {
        return "skip".equals(view.getTag());
    }

    private void D() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f114384a);
            handler.post(this.f114384a);
        }
    }

    private void w(List<View> list, androidx.constraintlayout.widget.f fVar, int i10) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            fVar.M(it.next().getId(), r6.a.h.I0, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable x() {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        this.f114386c = kVar;
        kVar.m0(new com.google.android.material.shape.n(0.5f));
        this.f114386c.p0(ColorStateList.valueOf(-1));
        return this.f114386c;
    }

    public void A(@r int i10) {
        this.f114385b = i10;
        C();
    }

    protected void C() {
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        fVar.H(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != r6.a.h.I0 && !B(childAt)) {
                int i11 = (Integer) childAt.getTag(r6.a.h.F2);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            w((List) entry.getValue(), fVar, y(((Integer) entry.getKey()).intValue()));
        }
        fVar.r(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(u1.D());
        }
        D();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        D();
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.l int i10) {
        this.f114386c.p0(ColorStateList.valueOf(i10));
    }

    @r
    int y(int i10) {
        int iRound = this.f114385b;
        if (i10 == 2) {
            iRound = Math.round(iRound * f114383g);
        }
        return iRound;
    }

    @r
    public int z() {
        return this.f114385b;
    }

    public g(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(r6.a.k.f360899g0, this);
        u1.O1(this, x());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.Tr, i10, 0);
        this.f114385b = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Ur, 0);
        this.f114384a = new Runnable() { // from class: com.google.android.material.timepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f114379a.C();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
