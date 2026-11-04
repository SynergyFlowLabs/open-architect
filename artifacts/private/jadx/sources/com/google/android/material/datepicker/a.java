package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Rect f112359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f112360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f112361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f112362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f112363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.shape.p f112364f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, com.google.android.material.shape.p pVar, @NonNull Rect rect) {
        androidx.core.util.t.i(rect.left);
        androidx.core.util.t.i(rect.top);
        androidx.core.util.t.i(rect.right);
        androidx.core.util.t.i(rect.bottom);
        this.f112359a = rect;
        this.f112360b = colorStateList2;
        this.f112361c = colorStateList;
        this.f112362d = colorStateList3;
        this.f112363e = i10;
        this.f112364f = pVar;
    }

    @NonNull
    static a a(@NonNull Context context, @g1 int i10) {
        androidx.core.util.t.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, r6.a.o.Um);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(r6.a.o.Vm, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(r6.a.o.Xm, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(r6.a.o.Wm, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(r6.a.o.Ym, 0));
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.Zm);
        ColorStateList colorStateListA2 = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.en);
        ColorStateList colorStateListA3 = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.f361671cn);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.dn, 0);
        com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.b(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.f361621an, 0), typedArrayObtainStyledAttributes.getResourceId(r6.a.o.f361646bn, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, pVarM, rect);
    }

    int b() {
        return this.f112359a.bottom;
    }

    int c() {
        return this.f112359a.left;
    }

    int d() {
        return this.f112359a.right;
    }

    int e() {
        return this.f112359a.top;
    }

    void f(@NonNull TextView textView) {
        g(textView, null, null);
    }

    void g(@NonNull TextView textView, @p0 ColorStateList colorStateList, @p0 ColorStateList colorStateList2) {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k();
        kVar.setShapeAppearanceModel(this.f112364f);
        kVar2.setShapeAppearanceModel(this.f112364f);
        if (colorStateList == null) {
            colorStateList = this.f112361c;
        }
        kVar.p0(colorStateList);
        kVar.F0(this.f112363e, this.f112362d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f112360b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f112360b.withAlpha(30), kVar, kVar2);
        Rect rect = this.f112359a;
        u1.O1(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
