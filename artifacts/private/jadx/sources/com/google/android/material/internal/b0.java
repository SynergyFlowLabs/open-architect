package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f112806o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final float f112807p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final float f112808q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f112809r = "android.text.TextDirectionHeuristic";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f112810s = "android.text.TextDirectionHeuristics";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f112811t = "LTR";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f112812u = "RTL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f112813v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private static Constructor<StaticLayout> f112814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private static Object f112815x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f112816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f112817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f112818c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f112820e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f112827l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private c0 f112829n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f112819d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f112821f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f112822g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f112823h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f112824i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f112825j = f112806o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f112826k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private TextUtils.TruncateAt f112828m = null;

    static class a extends Exception {
        a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    private b0(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f112816a = charSequence;
        this.f112817b = textPaint;
        this.f112818c = i10;
        this.f112820e = charSequence.length();
        int i11 = 1 << 0;
    }

    private void b() throws a {
        if (f112813v) {
            return;
        }
        try {
            f112815x = this.f112827l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f112814w = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f112813v = true;
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    @NonNull
    public static b0 c(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @androidx.annotation.g0(from = 0) int i10) {
        return new b0(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        if (this.f112816a == null) {
            this.f112816a = "";
        }
        int iMax = Math.max(0, this.f112818c);
        CharSequence charSequenceEllipsize = this.f112816a;
        if (this.f112822g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f112817b, iMax, this.f112828m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f112820e);
        this.f112820e = iMin;
        if (this.f112827l && this.f112822g == 1) {
            this.f112821f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f112819d, iMin, this.f112817b, iMax);
        builderObtain.setAlignment(this.f112821f);
        builderObtain.setIncludePad(this.f112826k);
        builderObtain.setTextDirection(this.f112827l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f112828m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f112822g);
        float f10 = this.f112823h;
        if (f10 != 0.0f || this.f112824i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f112824i);
        }
        if (this.f112822g > 1) {
            builderObtain.setHyphenationFrequency(this.f112825j);
        }
        c0 c0Var = this.f112829n;
        if (c0Var != null) {
            c0Var.a(builderObtain);
        }
        return builderObtain.build();
    }

    @NonNull
    @z7.a
    public b0 d(@NonNull Layout.Alignment alignment) {
        this.f112821f = alignment;
        return this;
    }

    @NonNull
    @z7.a
    public b0 e(@androidx.annotation.p0 TextUtils.TruncateAt truncateAt) {
        this.f112828m = truncateAt;
        return this;
    }

    @NonNull
    @z7.a
    public b0 f(@androidx.annotation.g0(from = 0) int i10) {
        this.f112820e = i10;
        return this;
    }

    @NonNull
    @z7.a
    public b0 g(int i10) {
        this.f112825j = i10;
        return this;
    }

    @NonNull
    @z7.a
    public b0 h(boolean z10) {
        this.f112826k = z10;
        return this;
    }

    public b0 i(boolean z10) {
        this.f112827l = z10;
        return this;
    }

    @NonNull
    @z7.a
    public b0 j(float f10, float f11) {
        this.f112823h = f10;
        this.f112824i = f11;
        return this;
    }

    @NonNull
    @z7.a
    public b0 k(@androidx.annotation.g0(from = 0) int i10) {
        this.f112822g = i10;
        return this;
    }

    @NonNull
    @z7.a
    public b0 l(@androidx.annotation.g0(from = 0) int i10) {
        this.f112819d = i10;
        return this;
    }

    @NonNull
    @z7.a
    public b0 m(@androidx.annotation.p0 c0 c0Var) {
        this.f112829n = c0Var;
        return this;
    }
}
