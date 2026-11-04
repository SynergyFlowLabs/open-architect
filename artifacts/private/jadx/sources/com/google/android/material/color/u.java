package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.collection.b3;

/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f112068a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f112069b = 0.54f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f112070c = 0.38f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f112071d = 0.32f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f112072e = 0.12f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f112073f = 40;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f112074g = 100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f112075h = 90;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f112076i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f112077j = 94;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f112078k = 92;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f112079l = 80;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f112080m = 20;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f112081n = 30;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f112082o = 90;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f112083p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f112084q = 17;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f112085r = 6;

    private u() {
    }

    @androidx.annotation.l
    public static int a(@androidx.annotation.l int i10, @g0(from = 0, to = b3.f12144d) int i11) {
        return androidx.core.graphics.h.D(i10, (Color.alpha(i10) * i11) / 255);
    }

    @androidx.annotation.l
    public static int b(@NonNull Context context, @androidx.annotation.f int i10, @androidx.annotation.l int i11) {
        Integer numF = f(context, i10);
        return numF != null ? numF.intValue() : i11;
    }

    @androidx.annotation.l
    public static int c(Context context, @androidx.annotation.f int i10, String str) {
        return w(context, com.google.android.material.resources.b.i(context, i10, str));
    }

    @androidx.annotation.l
    public static int d(@NonNull View view, @androidx.annotation.f int i10) {
        return w(view.getContext(), com.google.android.material.resources.b.j(view, i10));
    }

    @androidx.annotation.l
    public static int e(@NonNull View view, @androidx.annotation.f int i10, @androidx.annotation.l int i11) {
        return b(view.getContext(), i10, i11);
    }

    @androidx.annotation.l
    @p0
    public static Integer f(@NonNull Context context, @androidx.annotation.f int i10) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, i10);
        if (typedValueA != null) {
            return Integer.valueOf(w(context, typedValueA));
        }
        return null;
    }

    @androidx.annotation.l
    private static int g(@androidx.annotation.l int i10, @g0(from = 0, to = 100) int i11) {
        com.google.android.material.color.utilities.l lVarB = com.google.android.material.color.utilities.l.b(i10);
        lVarB.j(i11);
        return lVarB.k();
    }

    @androidx.annotation.l
    private static int h(@androidx.annotation.l int i10, @g0(from = 0, to = 100) int i11, int i12) {
        com.google.android.material.color.utilities.l lVarB = com.google.android.material.color.utilities.l.b(g(i10, i11));
        lVarB.g(i12);
        return lVarB.k();
    }

    @NonNull
    public static n i(@androidx.annotation.l int i10, boolean z10) {
        return z10 ? new n(g(i10, 40), g(i10, 100), g(i10, 90), g(i10, 10)) : new n(g(i10, 80), g(i10, 20), g(i10, 30), g(i10, 90));
    }

    @NonNull
    public static n j(@NonNull Context context, @androidx.annotation.l int i10) {
        return i(i10, r(context));
    }

    @NonNull
    public static ColorStateList k(@NonNull Context context, @androidx.annotation.f int i10, @NonNull ColorStateList colorStateList) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, i10);
        ColorStateList colorStateListX = typedValueA != null ? x(context, typedValueA) : null;
        return colorStateListX == null ? colorStateList : colorStateListX;
    }

    @p0
    public static ColorStateList l(@NonNull Context context, @androidx.annotation.f int i10) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, i10);
        if (typedValueA == null) {
            return null;
        }
        int i11 = typedValueA.resourceId;
        if (i11 != 0) {
            return androidx.core.content.d.h(context, i11);
        }
        int i12 = typedValueA.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    @androidx.annotation.l
    @b1({b1.a.LIBRARY_GROUP})
    public static int m(@NonNull Context context, @androidx.annotation.l int i10) {
        return h(i10, r(context) ? 94 : 12, 6);
    }

    @androidx.annotation.l
    @b1({b1.a.LIBRARY_GROUP})
    public static int n(@NonNull Context context, @androidx.annotation.l int i10) {
        return h(i10, r(context) ? 92 : 17, 6);
    }

    @androidx.annotation.l
    public static int o(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        return com.google.android.material.color.utilities.a.b(i10, i11);
    }

    @androidx.annotation.l
    public static int p(@NonNull Context context, @androidx.annotation.l int i10) {
        return o(i10, c(context, r6.a.c.R3, u.class.getCanonicalName()));
    }

    public static boolean q(@androidx.annotation.l int i10) {
        return i10 != 0 && androidx.core.graphics.h.n(i10) > 0.5d;
    }

    static boolean r(@NonNull Context context) {
        return com.google.android.material.resources.b.b(context, r6.a.c.f359605v9, true);
    }

    @androidx.annotation.l
    public static int s(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        return androidx.core.graphics.h.v(i11, i10);
    }

    @androidx.annotation.l
    public static int t(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return s(i10, androidx.core.graphics.h.D(i11, Math.round(Color.alpha(i11) * f10)));
    }

    @androidx.annotation.l
    public static int u(@NonNull View view, @androidx.annotation.f int i10, @androidx.annotation.f int i11) {
        return v(view, i10, i11, 1.0f);
    }

    @androidx.annotation.l
    public static int v(@NonNull View view, @androidx.annotation.f int i10, @androidx.annotation.f int i11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return t(d(view, i10), d(view, i11), f10);
    }

    private static int w(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? androidx.core.content.d.g(context, i10) : typedValue.data;
    }

    private static ColorStateList x(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? androidx.core.content.d.h(context, i10) : ColorStateList.valueOf(typedValue.data);
    }
}
