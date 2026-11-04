package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.k;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.graphics.h;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k(api = 21)
    public static final boolean f113330a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f113331b = {R.attr.state_pressed};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f113332c = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f113333d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f113334e = {R.attr.state_hovered};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f113335f = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f113336g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f113337h = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f113338i = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f113339j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f113340k = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    static final String f113341l = b.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    static final String f113342m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    @w0(21)
    private static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @u
        public static Drawable b(@NonNull Context context, @t0 int i10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(com.google.android.material.color.u.k(context, r6.a.c.f359488q3, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10));
        }
    }

    private b() {
    }

    @NonNull
    public static ColorStateList a(@p0 ColorStateList colorStateList) {
        if (f113330a) {
            int[] iArr = f113333d;
            return new ColorStateList(new int[][]{f113339j, iArr, StateSet.NOTHING}, new int[]{d(colorStateList, f113335f), d(colorStateList, iArr), d(colorStateList, f113331b)});
        }
        int[] iArr2 = f113335f;
        int[] iArr3 = f113336g;
        int[] iArr4 = f113337h;
        int[] iArr5 = f113338i;
        int[] iArr6 = f113331b;
        int[] iArr7 = f113332c;
        int[] iArr8 = f113333d;
        int[] iArr9 = f113334e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f113339j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{d(colorStateList, iArr2), d(colorStateList, iArr3), d(colorStateList, iArr4), d(colorStateList, iArr5), 0, d(colorStateList, iArr6), d(colorStateList, iArr7), d(colorStateList, iArr8), d(colorStateList, iArr9), 0});
    }

    @NonNull
    @w0(21)
    public static Drawable b(@NonNull Context context, @t0 int i10) {
        return a.b(context, i10);
    }

    @l
    @e.b(21)
    private static int c(@l int i10) {
        return h.D(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    @l
    private static int d(@p0 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f113330a ? c(colorForState) : colorForState;
    }

    @NonNull
    public static ColorStateList e(@p0 ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean f(@NonNull int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
