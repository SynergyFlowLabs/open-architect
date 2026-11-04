package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.p0;
import androidx.annotation.x;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f88866q = -3987645.8f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f88867r = 784923401;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.k f88868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final T f88869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public T f88870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final Interpolator f88871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Interpolator f88872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final Interpolator f88873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f88874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public Float f88875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f88876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f88877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f88878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f88879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f88880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f88881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f88882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f88883p;

    public a(com.airbnb.lottie.k kVar, @p0 T t10, @p0 T t11, @p0 Interpolator interpolator, float f10, @p0 Float f11) {
        this.f88876i = f88866q;
        this.f88877j = f88866q;
        this.f88878k = f88867r;
        this.f88879l = f88867r;
        this.f88880m = Float.MIN_VALUE;
        this.f88881n = Float.MIN_VALUE;
        this.f88882o = null;
        this.f88883p = null;
        this.f88868a = kVar;
        this.f88869b = t10;
        this.f88870c = t11;
        this.f88871d = interpolator;
        this.f88872e = null;
        this.f88873f = null;
        this.f88874g = f10;
        this.f88875h = f11;
    }

    public boolean a(@x(from = 0.0d, to = 1.0d) float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t10, T t11) {
        return new a<>(t10, t11);
    }

    public float c() {
        if (this.f88868a == null) {
            return 1.0f;
        }
        if (this.f88881n == Float.MIN_VALUE) {
            if (this.f88875h == null) {
                this.f88881n = 1.0f;
            } else {
                this.f88881n = f() + ((this.f88875h.floatValue() - this.f88874g) / this.f88868a.e());
            }
        }
        return this.f88881n;
    }

    public float d() {
        if (this.f88877j == f88866q) {
            this.f88877j = ((Float) this.f88870c).floatValue();
        }
        return this.f88877j;
    }

    public int e() {
        if (this.f88879l == f88867r) {
            this.f88879l = ((Integer) this.f88870c).intValue();
        }
        return this.f88879l;
    }

    public float f() {
        com.airbnb.lottie.k kVar = this.f88868a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f88880m == Float.MIN_VALUE) {
            this.f88880m = (this.f88874g - kVar.r()) / this.f88868a.e();
        }
        return this.f88880m;
    }

    public float g() {
        if (this.f88876i == f88866q) {
            this.f88876i = ((Float) this.f88869b).floatValue();
        }
        return this.f88876i;
    }

    public int h() {
        if (this.f88878k == f88867r) {
            this.f88878k = ((Integer) this.f88869b).intValue();
        }
        return this.f88878k;
    }

    public boolean i() {
        return this.f88871d == null && this.f88872e == null && this.f88873f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f88869b + ", endValue=" + this.f88870c + ", startFrame=" + this.f88874g + ", endFrame=" + this.f88875h + ", interpolator=" + this.f88871d + AbstractJsonLexerKt.END_OBJ;
    }

    public a(com.airbnb.lottie.k kVar, @p0 T t10, @p0 T t11, @p0 Interpolator interpolator, @p0 Interpolator interpolator2, float f10, @p0 Float f11) {
        this.f88876i = f88866q;
        this.f88877j = f88866q;
        this.f88878k = f88867r;
        this.f88879l = f88867r;
        this.f88880m = Float.MIN_VALUE;
        this.f88881n = Float.MIN_VALUE;
        this.f88882o = null;
        this.f88883p = null;
        this.f88868a = kVar;
        this.f88869b = t10;
        this.f88870c = t11;
        this.f88871d = null;
        this.f88872e = interpolator;
        this.f88873f = interpolator2;
        this.f88874g = f10;
        this.f88875h = f11;
    }

    protected a(com.airbnb.lottie.k kVar, @p0 T t10, @p0 T t11, @p0 Interpolator interpolator, @p0 Interpolator interpolator2, @p0 Interpolator interpolator3, float f10, @p0 Float f11) {
        this.f88876i = f88866q;
        this.f88877j = f88866q;
        this.f88878k = f88867r;
        this.f88879l = f88867r;
        this.f88880m = Float.MIN_VALUE;
        this.f88881n = Float.MIN_VALUE;
        this.f88882o = null;
        this.f88883p = null;
        this.f88868a = kVar;
        this.f88869b = t10;
        this.f88870c = t11;
        this.f88871d = interpolator;
        this.f88872e = interpolator2;
        this.f88873f = interpolator3;
        this.f88874g = f10;
        this.f88875h = f11;
    }

    public a(T t10) {
        this.f88876i = f88866q;
        this.f88877j = f88866q;
        this.f88878k = f88867r;
        this.f88879l = f88867r;
        int i10 = 6 | 1;
        this.f88880m = Float.MIN_VALUE;
        this.f88881n = Float.MIN_VALUE;
        this.f88882o = null;
        this.f88883p = null;
        this.f88868a = null;
        this.f88869b = t10;
        this.f88870c = t10;
        this.f88871d = null;
        this.f88872e = null;
        this.f88873f = null;
        this.f88874g = Float.MIN_VALUE;
        this.f88875h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(T t10, T t11) {
        this.f88876i = f88866q;
        this.f88877j = f88866q;
        this.f88878k = f88867r;
        this.f88879l = f88867r;
        this.f88880m = Float.MIN_VALUE;
        this.f88881n = Float.MIN_VALUE;
        this.f88882o = null;
        this.f88883p = null;
        this.f88868a = null;
        this.f88869b = t10;
        this.f88870c = t11;
        this.f88871d = null;
        this.f88872e = null;
        this.f88873f = null;
        this.f88874g = Float.MIN_VALUE;
        this.f88875h = Float.valueOf(Float.MAX_VALUE);
    }
}
