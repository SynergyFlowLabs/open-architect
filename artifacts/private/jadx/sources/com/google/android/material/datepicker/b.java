package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final a f112365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final a f112366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final a f112367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final a f112368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    final a f112369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    final a f112370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    final a f112371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    final Paint f112372h;

    b(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, r6.a.c.Ac, j.class.getCanonicalName()), r6.a.o.Im);
        this.f112365a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Nm, 0));
        this.f112371g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Lm, 0));
        this.f112366b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Mm, 0));
        this.f112367c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Om, 0));
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.Qm);
        this.f112368d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Sm, 0));
        this.f112369e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Rm, 0));
        this.f112370f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Tm, 0));
        Paint paint = new Paint();
        this.f112372h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
