package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.appcompat.widget.j1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f112856b = "Theme.AppCompat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f112858d = "Theme.MaterialComponents";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f112855a = {r6.a.c.R3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f112857c = {r6.a.c.Y3};

    private g0() {
    }

    public static void a(@NonNull Context context) {
        e(context, f112855a, f112856b);
    }

    private static void b(@NonNull Context context, AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.Sx, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.Ux, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(r6.a.c.f359671y9, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@NonNull Context context) {
        e(context, f112857c, f112858d);
    }

    private static void d(@NonNull Context context, AttributeSet attributeSet, @NonNull @h1 int[] iArr, @androidx.annotation.f int i10, @g1 int i11, @h1 @androidx.annotation.p0 int... iArr2) {
        boolean zG;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.Sx, i10, i11);
        if (!typedArrayObtainStyledAttributes.getBoolean(r6.a.o.Vx, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zG = typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Tx, -1) != -1;
        } else {
            zG = g(context, attributeSet, iArr, i10, i11, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zG) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (j(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(@NonNull Context context) {
        return j(context, f112855a);
    }

    private static boolean g(@NonNull Context context, AttributeSet attributeSet, @NonNull @h1 int[] iArr, @androidx.annotation.f int i10, @g1 int i11, @NonNull @h1 int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i12, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@NonNull Context context) {
        return com.google.android.material.resources.b.b(context, r6.a.c.f359649x9, false);
    }

    public static boolean i(@NonNull Context context) {
        return j(context, f112857c);
    }

    private static boolean j(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    public static TypedArray k(@NonNull Context context, AttributeSet attributeSet, @NonNull @h1 int[] iArr, @androidx.annotation.f int i10, @g1 int i11, @h1 int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static j1 l(@NonNull Context context, AttributeSet attributeSet, @NonNull @h1 int[] iArr, @androidx.annotation.f int i10, @g1 int i11, @h1 int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return j1.G(context, attributeSet, iArr, i10, i11);
    }
}
