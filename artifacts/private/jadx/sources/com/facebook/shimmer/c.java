package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.t0;
import androidx.annotation.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f102117v = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float[] f102118a = new float[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f102119b = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RectF f102120c = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f102121d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    int f102122e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    int f102123f = 1291845631;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f102124g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f102125h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f102126i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f102127j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f102128k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f102129l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f102130m = 0.5f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f102131n = 20.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f102132o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f102133p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f102134q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f102135r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f102136s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f102137t = 1000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f102138u;

    public static class a extends b<a> {
        public a() {
            this.f102139a.f102134q = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.c.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a f() {
            return this;
        }
    }

    public static abstract class b<T extends b<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f102139a = new c();

        private static float b(float f10, float f11, float f12) {
            return Math.min(f11, Math.max(f10, f12));
        }

        public c a() {
            this.f102139a.c();
            this.f102139a.d();
            return this.f102139a;
        }

        public T c(Context context, AttributeSet attributeSet) {
            return (T) d(context.obtainStyledAttributes(attributeSet, com.facebook.shimmer.b.c.f102096a, 0, 0));
        }

        T d(TypedArray typedArray) {
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102100e)) {
                i(typedArray.getBoolean(com.facebook.shimmer.b.c.f102100e, this.f102139a.f102132o));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102097b)) {
                g(typedArray.getBoolean(com.facebook.shimmer.b.c.f102097b, this.f102139a.f102133p));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102098c)) {
                h(typedArray.getFloat(com.facebook.shimmer.b.c.f102098c, 0.3f));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102108m)) {
                p(typedArray.getFloat(com.facebook.shimmer.b.c.f102108m, 1.0f));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102104i)) {
                l(typedArray.getInt(com.facebook.shimmer.b.c.f102104i, (int) this.f102139a.f102137t));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102111p)) {
                r(typedArray.getInt(com.facebook.shimmer.b.c.f102111p, this.f102139a.f102135r));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102112q)) {
                s(typedArray.getInt(com.facebook.shimmer.b.c.f102112q, (int) this.f102139a.f102138u));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102113r)) {
                t(typedArray.getInt(com.facebook.shimmer.b.c.f102113r, this.f102139a.f102136s));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102102g)) {
                int i10 = typedArray.getInt(com.facebook.shimmer.b.c.f102102g, this.f102139a.f102121d);
                if (i10 == 1) {
                    j(1);
                } else if (i10 == 2) {
                    j(2);
                } else if (i10 != 3) {
                    j(0);
                } else {
                    j(3);
                }
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102114s)) {
                if (typedArray.getInt(com.facebook.shimmer.b.c.f102114s, this.f102139a.f102124g) != 1) {
                    u(0);
                } else {
                    u(1);
                }
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102103h)) {
                k(typedArray.getFloat(com.facebook.shimmer.b.c.f102103h, this.f102139a.f102130m));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102106k)) {
                n(typedArray.getDimensionPixelSize(com.facebook.shimmer.b.c.f102106k, this.f102139a.f102125h));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102105j)) {
                m(typedArray.getDimensionPixelSize(com.facebook.shimmer.b.c.f102105j, this.f102139a.f102126i));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102110o)) {
                q(typedArray.getFloat(com.facebook.shimmer.b.c.f102110o, this.f102139a.f102129l));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102116u)) {
                w(typedArray.getFloat(com.facebook.shimmer.b.c.f102116u, this.f102139a.f102127j));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102107l)) {
                o(typedArray.getFloat(com.facebook.shimmer.b.c.f102107l, this.f102139a.f102128k));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102115t)) {
                v(typedArray.getFloat(com.facebook.shimmer.b.c.f102115t, this.f102139a.f102131n));
            }
            return (T) f();
        }

        public T e(c cVar) {
            j(cVar.f102121d);
            u(cVar.f102124g);
            n(cVar.f102125h);
            m(cVar.f102126i);
            w(cVar.f102127j);
            o(cVar.f102128k);
            q(cVar.f102129l);
            k(cVar.f102130m);
            v(cVar.f102131n);
            i(cVar.f102132o);
            g(cVar.f102133p);
            r(cVar.f102135r);
            t(cVar.f102136s);
            s(cVar.f102138u);
            l(cVar.f102137t);
            c cVar2 = this.f102139a;
            cVar2.f102123f = cVar.f102123f;
            cVar2.f102122e = cVar.f102122e;
            return (T) f();
        }

        protected abstract T f();

        public T g(boolean z10) {
            this.f102139a.f102133p = z10;
            return (T) f();
        }

        public T h(@x(from = 0.0d, to = 1.0d) float f10) {
            int iB = (int) (b(0.0f, 1.0f, f10) * 255.0f);
            c cVar = this.f102139a;
            cVar.f102123f = (iB << 24) | (cVar.f102123f & 16777215);
            return (T) f();
        }

        public T i(boolean z10) {
            this.f102139a.f102132o = z10;
            return (T) f();
        }

        public T j(int i10) {
            this.f102139a.f102121d = i10;
            return (T) f();
        }

        public T k(float f10) {
            if (f10 >= 0.0f) {
                this.f102139a.f102130m = f10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
        }

        public T l(long j10) {
            if (j10 >= 0) {
                this.f102139a.f102137t = j10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j10);
        }

        public T m(@t0 int i10) {
            if (i10 >= 0) {
                this.f102139a.f102126i = i10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given invalid height: " + i10);
        }

        public T n(@t0 int i10) {
            if (i10 >= 0) {
                this.f102139a.f102125h = i10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given invalid width: " + i10);
        }

        public T o(float f10) {
            if (f10 >= 0.0f) {
                this.f102139a.f102128k = f10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f10);
        }

        public T p(@x(from = 0.0d, to = 1.0d) float f10) {
            int iB = (int) (b(0.0f, 1.0f, f10) * 255.0f);
            c cVar = this.f102139a;
            cVar.f102122e = (iB << 24) | (cVar.f102122e & 16777215);
            return (T) f();
        }

        public T q(float f10) {
            if (f10 >= 0.0f) {
                this.f102139a.f102129l = f10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f10);
        }

        public T r(int i10) {
            this.f102139a.f102135r = i10;
            return (T) f();
        }

        public T s(long j10) {
            if (j10 >= 0) {
                this.f102139a.f102138u = j10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j10);
        }

        public T t(int i10) {
            this.f102139a.f102136s = i10;
            return (T) f();
        }

        public T u(int i10) {
            this.f102139a.f102124g = i10;
            return (T) f();
        }

        public T v(float f10) {
            this.f102139a.f102131n = f10;
            return (T) f();
        }

        public T w(float f10) {
            if (f10 >= 0.0f) {
                this.f102139a.f102127j = f10;
                return (T) f();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f10);
        }
    }

    /* JADX INFO: renamed from: com.facebook.shimmer.c$c, reason: collision with other inner class name */
    public static class C0926c extends b<C0926c> {
        public C0926c() {
            this.f102139a.f102134q = false;
        }

        public C0926c A(@l int i10) {
            this.f102139a.f102122e = i10;
            return f();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.facebook.shimmer.c.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public C0926c d(TypedArray typedArray) {
            super.d(typedArray);
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102099d)) {
                z(typedArray.getColor(com.facebook.shimmer.b.c.f102099d, this.f102139a.f102123f));
            }
            if (typedArray.hasValue(com.facebook.shimmer.b.c.f102109n)) {
                A(typedArray.getColor(com.facebook.shimmer.b.c.f102109n, this.f102139a.f102122e));
            }
            return f();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.c.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public C0926c f() {
            return this;
        }

        public C0926c z(@l int i10) {
            c cVar = this.f102139a;
            cVar.f102123f = (i10 & 16777215) | (cVar.f102123f & (-16777216));
            return f();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
        public static final int Q0 = 0;
        public static final int R0 = 1;
        public static final int S0 = 2;
        public static final int T0 = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
        public static final int U0 = 0;
        public static final int V0 = 1;
    }

    c() {
    }

    int a(int i10) {
        int i11 = this.f102126i;
        return i11 > 0 ? i11 : Math.round(this.f102128k * i10);
    }

    void b(int i10, int i11) {
        double dMax = Math.max(i10, i11);
        int iRound = Math.round(((float) ((dMax / Math.sin(1.5707963267948966d - Math.toRadians(this.f102131n % 90.0f))) - dMax)) / 2.0f) * 3;
        float f10 = -iRound;
        this.f102120c.set(f10, f10, e(i10) + iRound, a(i11) + iRound);
    }

    void c() {
        if (this.f102124g != 1) {
            int[] iArr = this.f102119b;
            int i10 = this.f102123f;
            iArr[0] = i10;
            int i11 = this.f102122e;
            iArr[1] = i11;
            iArr[2] = i11;
            iArr[3] = i10;
            return;
        }
        int[] iArr2 = this.f102119b;
        int i12 = this.f102122e;
        iArr2[0] = i12;
        iArr2[1] = i12;
        int i13 = this.f102123f;
        iArr2[2] = i13;
        iArr2[3] = i13;
    }

    void d() {
        int i10 = 1 >> 1;
        if (this.f102124g != 1) {
            this.f102118a[0] = Math.max(((1.0f - this.f102129l) - this.f102130m) / 2.0f, 0.0f);
            this.f102118a[1] = Math.max(((1.0f - this.f102129l) - 0.001f) / 2.0f, 0.0f);
            this.f102118a[2] = Math.min(((this.f102129l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f102118a[3] = Math.min(((this.f102129l + 1.0f) + this.f102130m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f102118a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f102129l, 1.0f);
        this.f102118a[2] = Math.min(this.f102129l + this.f102130m, 1.0f);
        this.f102118a[3] = 1.0f;
    }

    int e(int i10) {
        int i11 = this.f102125h;
        return i11 > 0 ? i11 : Math.round(this.f102127j * i10);
    }
}
