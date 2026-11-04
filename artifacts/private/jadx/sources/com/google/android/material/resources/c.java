package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.p0;
import androidx.appcompat.widget.j1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f113297a = 1.3f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f113298b = 2.0f;

    private c() {
    }

    @p0
    public static ColorStateList a(@NonNull Context context, @NonNull TypedArray typedArray, @h1 int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListA = j.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListA;
    }

    @p0
    public static ColorStateList b(@NonNull Context context, @NonNull j1 j1Var, @h1 int i10) {
        int iU;
        ColorStateList colorStateListA;
        return (!j1Var.C(i10) || (iU = j1Var.u(i10, 0)) == 0 || (colorStateListA = j.a.a(context, iU)) == null) ? j1Var.d(i10) : colorStateListA;
    }

    private static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(@NonNull Context context, @NonNull TypedArray typedArray, @h1 int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @p0
    public static Drawable e(@NonNull Context context, @NonNull TypedArray typedArray, @h1 int i10) {
        Drawable drawableB;
        if (typedArray.hasValue(i10)) {
            boolean z10 = true | false;
            int resourceId = typedArray.getResourceId(i10, 0);
            if (resourceId != 0 && (drawableB = j.a.b(context, resourceId)) != null) {
                return drawableB;
            }
        }
        return typedArray.getDrawable(i10);
    }

    public static float f(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    @h1
    static int g(@NonNull TypedArray typedArray, @h1 int i10, @h1 int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    @p0
    public static d h(@NonNull Context context, @NonNull TypedArray typedArray, @h1 int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static int i(@NonNull Context context, @g1 int i10, int i11) {
        if (i10 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, r6.a.o.cw);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(r6.a.o.dw, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i11;
    }

    public static boolean j(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= f113297a;
    }

    public static boolean k(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
