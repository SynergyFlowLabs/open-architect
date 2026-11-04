package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.core.graphics.o;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f113002a = "cubic-bezier";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f113003b = "path";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f113004c = "(";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f113005d = ")";

    private j() {
    }

    private static float a(String[] strArr, int i10) {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator c(String str) {
        if (!e(str, f113002a)) {
            if (e(str, f113003b)) {
                return androidx.core.view.animation.b.c(o.e(b(str, f113003b)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = b(str, f113002a).split(",");
        if (strArrSplit.length == 4) {
            return androidx.core.view.animation.b.b(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean d(String str) {
        if (!e(str, f113002a) && !e(str, f113003b)) {
            return false;
        }
        return true;
    }

    private static boolean e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(f113004c);
        return str.startsWith(sb2.toString()) && str.endsWith(f113005d);
    }

    public static int f(@NonNull Context context, @androidx.annotation.f int i10, int i11) {
        return com.google.android.material.resources.b.e(context, i10, i11);
    }

    @NonNull
    public static TimeInterpolator g(@NonNull Context context, @androidx.annotation.f int i10, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return d(strValueOf) ? c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
