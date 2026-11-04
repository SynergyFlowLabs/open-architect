package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.x;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.j0;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.request.a;
import com.bumptech.glide.util.m;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int A3 = 1048576;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f97259g3 = -1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f97260h3 = 2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f97261i3 = 4;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f97262j3 = 8;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f97263k3 = 16;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f97264l3 = 32;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f97265m3 = 64;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f97266n3 = 128;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f97267o3 = 256;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f97268p3 = 512;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f97269q3 = 1024;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f97270r3 = 2048;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f97271s3 = 4096;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f97272t3 = 8192;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f97273u3 = 16384;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f97274v3 = 32768;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f97275w3 = 65536;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f97276x3 = 131072;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final int f97277y3 = 262144;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final int f97278z3 = 524288;
    private boolean X;

    @p0
    private Resources.Theme Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f97279a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Drawable f97283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f97284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Drawable f97285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f97286h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f97291m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Drawable f97293o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f97294p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f97295p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f97296p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f97297s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f97280b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private com.bumptech.glide.load.engine.j f97281c = com.bumptech.glide.load.engine.j.f96623e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private com.bumptech.glide.h f97282d = com.bumptech.glide.h.NORMAL;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f97287i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f97288j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f97289k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private com.bumptech.glide.load.g f97290l = com.bumptech.glide.signature.c.c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f97292n = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private com.bumptech.glide.load.j f97298t = new com.bumptech.glide.load.j();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    private Map<Class<?>, n<?>> f97299v = new com.bumptech.glide.util.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private Class<?> f97300w = Object.class;
    private boolean H1 = true;

    public a() {
        int i10 = 3 & (-1);
    }

    @NonNull
    private T C0(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
        return (T) D0(pVar, nVar, true);
    }

    @NonNull
    private T D0(@NonNull p pVar, @NonNull n<Bitmap> nVar, boolean z10) {
        T t10 = z10 ? (T) O0(pVar, nVar) : (T) v0(pVar, nVar);
        t10.H1 = true;
        return t10;
    }

    private T E0() {
        return this;
    }

    @NonNull
    private T F0() {
        if (this.X) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) E0();
    }

    private boolean g0(int i10) {
        return h0(this.f97279a, i10);
    }

    private static boolean h0(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @NonNull
    private T t0(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
        return (T) D0(pVar, nVar, false);
    }

    @NonNull
    @androidx.annotation.j
    public T A(@p0 Drawable drawable) {
        if (this.Z) {
            return (T) n().A(drawable);
        }
        this.f97283e = drawable;
        int i10 = this.f97279a | 16;
        this.f97284f = 0;
        this.f97279a = i10 & (-33);
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T A0(@p0 Drawable drawable) {
        if (this.Z) {
            return (T) n().A0(drawable);
        }
        this.f97285g = drawable;
        int i10 = this.f97279a | 64;
        this.f97286h = 0;
        this.f97279a = i10 & (-129);
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T B(@v int i10) {
        if (this.Z) {
            return (T) n().B(i10);
        }
        this.f97297s = i10;
        int i11 = this.f97279a | 16384;
        this.f97293o = null;
        this.f97279a = i11 & (-8193);
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T B0(@NonNull com.bumptech.glide.h hVar) {
        if (this.Z) {
            return (T) n().B0(hVar);
        }
        this.f97282d = (com.bumptech.glide.h) com.bumptech.glide.util.k.d(hVar);
        this.f97279a |= 8;
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T C(@p0 Drawable drawable) {
        if (this.Z) {
            return (T) n().C(drawable);
        }
        this.f97293o = drawable;
        int i10 = this.f97279a | 8192;
        this.f97297s = 0;
        this.f97279a = i10 & (-16385);
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T D() {
        return (T) C0(p.f97048c, new u());
    }

    @NonNull
    @androidx.annotation.j
    public T E(@NonNull com.bumptech.glide.load.b bVar) {
        com.bumptech.glide.util.k.d(bVar);
        return (T) G0(q.f97059g, bVar).G0(com.bumptech.glide.load.resource.gif.i.f97174a, bVar);
    }

    @NonNull
    @androidx.annotation.j
    public T F(@g0(from = 0) long j10) {
        return (T) G0(j0.f97001g, Long.valueOf(j10));
    }

    @NonNull
    public final com.bumptech.glide.load.engine.j G() {
        return this.f97281c;
    }

    @NonNull
    @androidx.annotation.j
    public <Y> T G0(@NonNull com.bumptech.glide.load.i<Y> iVar, @NonNull Y y10) {
        if (this.Z) {
            return (T) n().G0(iVar, y10);
        }
        com.bumptech.glide.util.k.d(iVar);
        com.bumptech.glide.util.k.d(y10);
        this.f97298t.e(iVar, y10);
        return (T) F0();
    }

    public final int H() {
        return this.f97284f;
    }

    @NonNull
    @androidx.annotation.j
    public T H0(@NonNull com.bumptech.glide.load.g gVar) {
        if (this.Z) {
            return (T) n().H0(gVar);
        }
        this.f97290l = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.d(gVar);
        this.f97279a |= 1024;
        return (T) F0();
    }

    @p0
    public final Drawable I() {
        return this.f97283e;
    }

    @NonNull
    @androidx.annotation.j
    public T I0(@x(from = 0.0d, to = 1.0d) float f10) {
        if (this.Z) {
            return (T) n().I0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f97280b = f10;
        this.f97279a |= 2;
        return (T) F0();
    }

    @p0
    public final Drawable J() {
        return this.f97293o;
    }

    @NonNull
    @androidx.annotation.j
    public T J0(boolean z10) {
        if (this.Z) {
            return (T) n().J0(true);
        }
        this.f97287i = !z10;
        this.f97279a |= 256;
        return (T) F0();
    }

    public final int K() {
        return this.f97297s;
    }

    @NonNull
    @androidx.annotation.j
    public T K0(@p0 Resources.Theme theme) {
        if (this.Z) {
            return (T) n().K0(theme);
        }
        this.Y = theme;
        this.f97279a |= 32768;
        return (T) F0();
    }

    public final boolean L() {
        return this.f97295p1;
    }

    @NonNull
    @androidx.annotation.j
    public T L0(@g0(from = 0) int i10) {
        return (T) G0(com.bumptech.glide.load.model.stream.b.f96898b, Integer.valueOf(i10));
    }

    @NonNull
    public final com.bumptech.glide.load.j M() {
        return this.f97298t;
    }

    @NonNull
    @androidx.annotation.j
    public T M0(@NonNull n<Bitmap> nVar) {
        return (T) N0(nVar, true);
    }

    public final int N() {
        return this.f97288j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    T N0(@NonNull n<Bitmap> nVar, boolean z10) {
        if (this.Z) {
            return (T) n().N0(nVar, z10);
        }
        s sVar = new s(nVar, z10);
        Q0(Bitmap.class, nVar, z10);
        Q0(Drawable.class, sVar, z10);
        Q0(BitmapDrawable.class, sVar.c(), z10);
        Q0(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.f(nVar), z10);
        return (T) F0();
    }

    public final int O() {
        return this.f97289k;
    }

    @NonNull
    @androidx.annotation.j
    final T O0(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
        if (this.Z) {
            return (T) n().O0(pVar, nVar);
        }
        v(pVar);
        return (T) M0(nVar);
    }

    @p0
    public final Drawable P() {
        return this.f97285g;
    }

    @NonNull
    @androidx.annotation.j
    public <Y> T P0(@NonNull Class<Y> cls, @NonNull n<Y> nVar) {
        return (T) Q0(cls, nVar, true);
    }

    public final int Q() {
        return this.f97286h;
    }

    @NonNull
    <Y> T Q0(@NonNull Class<Y> cls, @NonNull n<Y> nVar, boolean z10) {
        if (this.Z) {
            return (T) n().Q0(cls, nVar, z10);
        }
        com.bumptech.glide.util.k.d(cls);
        com.bumptech.glide.util.k.d(nVar);
        this.f97299v.put(cls, nVar);
        int i10 = this.f97279a;
        this.f97292n = true;
        this.f97279a = 67584 | i10;
        this.H1 = false;
        if (z10) {
            this.f97279a = i10 | 198656;
            this.f97291m = true;
        }
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T R0(@NonNull n<Bitmap>... nVarArr) {
        if (nVarArr.length > 1) {
            return (T) N0(new com.bumptech.glide.load.h(nVarArr), true);
        }
        return nVarArr.length == 1 ? (T) M0(nVarArr[0]) : (T) F0();
    }

    @NonNull
    public final com.bumptech.glide.h S() {
        return this.f97282d;
    }

    @NonNull
    @androidx.annotation.j
    @Deprecated
    public T S0(@NonNull n<Bitmap>... nVarArr) {
        return (T) N0(new com.bumptech.glide.load.h(nVarArr), true);
    }

    @NonNull
    public final Class<?> T() {
        return this.f97300w;
    }

    @NonNull
    @androidx.annotation.j
    public T T0(boolean z10) {
        if (this.Z) {
            return (T) n().T0(z10);
        }
        this.f97296p2 = z10;
        this.f97279a |= 1048576;
        return (T) F0();
    }

    @NonNull
    public final com.bumptech.glide.load.g U() {
        return this.f97290l;
    }

    @NonNull
    @androidx.annotation.j
    public T U0(boolean z10) {
        if (this.Z) {
            return (T) n().U0(z10);
        }
        this.f97294p0 = z10;
        this.f97279a |= 262144;
        return (T) F0();
    }

    public final float V() {
        return this.f97280b;
    }

    @p0
    public final Resources.Theme W() {
        return this.Y;
    }

    @NonNull
    public final Map<Class<?>, n<?>> X() {
        return this.f97299v;
    }

    public final boolean Y() {
        return this.f97296p2;
    }

    public final boolean Z() {
        return this.f97294p0;
    }

    @NonNull
    @androidx.annotation.j
    public T a(@NonNull a<?> aVar) {
        if (this.Z) {
            return (T) n().a(aVar);
        }
        if (h0(aVar.f97279a, 2)) {
            this.f97280b = aVar.f97280b;
        }
        if (h0(aVar.f97279a, 262144)) {
            this.f97294p0 = aVar.f97294p0;
        }
        if (h0(aVar.f97279a, 1048576)) {
            this.f97296p2 = aVar.f97296p2;
        }
        if (h0(aVar.f97279a, 4)) {
            this.f97281c = aVar.f97281c;
        }
        if (h0(aVar.f97279a, 8)) {
            this.f97282d = aVar.f97282d;
        }
        if (h0(aVar.f97279a, 16)) {
            this.f97283e = aVar.f97283e;
            this.f97284f = 0;
            this.f97279a &= -33;
        }
        if (h0(aVar.f97279a, 32)) {
            this.f97284f = aVar.f97284f;
            this.f97283e = null;
            this.f97279a &= -17;
        }
        if (h0(aVar.f97279a, 64)) {
            this.f97285g = aVar.f97285g;
            this.f97286h = 0;
            this.f97279a &= -129;
        }
        if (h0(aVar.f97279a, 128)) {
            this.f97286h = aVar.f97286h;
            this.f97285g = null;
            this.f97279a &= -65;
        }
        if (h0(aVar.f97279a, 256)) {
            this.f97287i = aVar.f97287i;
        }
        if (h0(aVar.f97279a, 512)) {
            this.f97289k = aVar.f97289k;
            this.f97288j = aVar.f97288j;
        }
        if (h0(aVar.f97279a, 1024)) {
            this.f97290l = aVar.f97290l;
        }
        if (h0(aVar.f97279a, 4096)) {
            this.f97300w = aVar.f97300w;
        }
        if (h0(aVar.f97279a, 8192)) {
            this.f97293o = aVar.f97293o;
            this.f97297s = 0;
            this.f97279a &= -16385;
        }
        if (h0(aVar.f97279a, 16384)) {
            this.f97297s = aVar.f97297s;
            this.f97293o = null;
            this.f97279a &= -8193;
        }
        if (h0(aVar.f97279a, 32768)) {
            this.Y = aVar.Y;
        }
        if (h0(aVar.f97279a, 65536)) {
            this.f97292n = aVar.f97292n;
        }
        if (h0(aVar.f97279a, 131072)) {
            this.f97291m = aVar.f97291m;
        }
        if (h0(aVar.f97279a, 2048)) {
            this.f97299v.putAll(aVar.f97299v);
            this.H1 = aVar.H1;
        }
        if (h0(aVar.f97279a, 524288)) {
            this.f97295p1 = aVar.f97295p1;
        }
        if (!this.f97292n) {
            this.f97299v.clear();
            int i10 = this.f97279a;
            this.f97291m = false;
            this.f97279a = i10 & (-133121);
            this.H1 = true;
        }
        this.f97279a |= aVar.f97279a;
        this.f97298t.d(aVar.f97298t);
        return (T) F0();
    }

    protected boolean a0() {
        return this.Z;
    }

    @NonNull
    public T b() {
        if (this.X && !this.Z) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.Z = true;
        return (T) n0();
    }

    public final boolean b0() {
        return g0(4);
    }

    public final boolean c0() {
        return this.X;
    }

    @NonNull
    @androidx.annotation.j
    public T d() {
        return (T) O0(p.f97050e, new l());
    }

    public final boolean d0() {
        return this.f97287i;
    }

    public final boolean e0() {
        return g0(8);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f97280b, this.f97280b) == 0 && this.f97284f == aVar.f97284f && m.d(this.f97283e, aVar.f97283e) && this.f97286h == aVar.f97286h && m.d(this.f97285g, aVar.f97285g) && this.f97297s == aVar.f97297s && m.d(this.f97293o, aVar.f97293o) && this.f97287i == aVar.f97287i && this.f97288j == aVar.f97288j && this.f97289k == aVar.f97289k && this.f97291m == aVar.f97291m && this.f97292n == aVar.f97292n && this.f97294p0 == aVar.f97294p0 && this.f97295p1 == aVar.f97295p1 && this.f97281c.equals(aVar.f97281c) && this.f97282d == aVar.f97282d && this.f97298t.equals(aVar.f97298t) && this.f97299v.equals(aVar.f97299v) && this.f97300w.equals(aVar.f97300w) && m.d(this.f97290l, aVar.f97290l) && m.d(this.Y, aVar.Y)) {
                return true;
            }
        }
        return false;
    }

    boolean f0() {
        return this.H1;
    }

    @NonNull
    @androidx.annotation.j
    public T h() {
        return (T) C0(p.f97049d, new com.bumptech.glide.load.resource.bitmap.m());
    }

    public int hashCode() {
        return m.p(this.Y, m.p(this.f97290l, m.p(this.f97300w, m.p(this.f97299v, m.p(this.f97298t, m.p(this.f97282d, m.p(this.f97281c, m.r(this.f97295p1, m.r(this.f97294p0, m.r(this.f97292n, m.r(this.f97291m, m.o(this.f97289k, m.o(this.f97288j, m.r(this.f97287i, m.p(this.f97293o, m.o(this.f97297s, m.p(this.f97285g, m.o(this.f97286h, m.p(this.f97283e, m.o(this.f97284f, m.l(this.f97280b)))))))))))))))))))));
    }

    @NonNull
    @androidx.annotation.j
    public T i() {
        return (T) O0(p.f97049d, new com.bumptech.glide.load.resource.bitmap.n());
    }

    public final boolean i0() {
        return g0(256);
    }

    public final boolean j0() {
        return this.f97292n;
    }

    public final boolean k0() {
        return this.f97291m;
    }

    public final boolean l0() {
        return g0(2048);
    }

    public final boolean m0() {
        return m.v(this.f97289k, this.f97288j);
    }

    @Override // 
    @androidx.annotation.j
    public T n() {
        try {
            T t10 = (T) super.clone();
            com.bumptech.glide.load.j jVar = new com.bumptech.glide.load.j();
            t10.f97298t = jVar;
            jVar.d(this.f97298t);
            com.bumptech.glide.util.b bVar = new com.bumptech.glide.util.b();
            t10.f97299v = bVar;
            bVar.putAll(this.f97299v);
            t10.X = false;
            t10.Z = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public T n0() {
        this.X = true;
        return (T) E0();
    }

    @NonNull
    @androidx.annotation.j
    public T o0(boolean z10) {
        if (this.Z) {
            return (T) n().o0(z10);
        }
        this.f97295p1 = z10;
        this.f97279a |= 524288;
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T p(@NonNull Class<?> cls) {
        if (this.Z) {
            return (T) n().p(cls);
        }
        this.f97300w = (Class) com.bumptech.glide.util.k.d(cls);
        this.f97279a |= 4096;
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T p0() {
        return (T) v0(p.f97050e, new l());
    }

    @NonNull
    @androidx.annotation.j
    public T q() {
        return (T) G0(q.f97063k, Boolean.FALSE);
    }

    @NonNull
    @androidx.annotation.j
    public T q0() {
        return (T) t0(p.f97049d, new com.bumptech.glide.load.resource.bitmap.m());
    }

    @NonNull
    @androidx.annotation.j
    public T r0() {
        return (T) v0(p.f97050e, new com.bumptech.glide.load.resource.bitmap.n());
    }

    @NonNull
    @androidx.annotation.j
    public T s(@NonNull com.bumptech.glide.load.engine.j jVar) {
        if (this.Z) {
            return (T) n().s(jVar);
        }
        this.f97281c = (com.bumptech.glide.load.engine.j) com.bumptech.glide.util.k.d(jVar);
        this.f97279a |= 4;
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T s0() {
        return (T) t0(p.f97048c, new u());
    }

    @NonNull
    @androidx.annotation.j
    public T t() {
        return (T) G0(com.bumptech.glide.load.resource.gif.i.f97175b, Boolean.TRUE);
    }

    @NonNull
    @androidx.annotation.j
    public T u() {
        if (this.Z) {
            return (T) n().u();
        }
        this.f97299v.clear();
        int i10 = this.f97279a;
        this.f97291m = false;
        this.f97292n = false;
        this.f97279a = (i10 & (-133121)) | 65536;
        this.H1 = true;
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T u0(@NonNull n<Bitmap> nVar) {
        return (T) N0(nVar, false);
    }

    @NonNull
    @androidx.annotation.j
    public T v(@NonNull p pVar) {
        return (T) G0(p.f97053h, com.bumptech.glide.util.k.d(pVar));
    }

    @NonNull
    final T v0(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
        if (this.Z) {
            return (T) n().v0(pVar, nVar);
        }
        v(pVar);
        return (T) N0(nVar, false);
    }

    @NonNull
    @androidx.annotation.j
    public T w(@NonNull Bitmap.CompressFormat compressFormat) {
        return (T) G0(com.bumptech.glide.load.resource.bitmap.e.f96969c, com.bumptech.glide.util.k.d(compressFormat));
    }

    @NonNull
    @androidx.annotation.j
    public <Y> T w0(@NonNull Class<Y> cls, @NonNull n<Y> nVar) {
        return (T) Q0(cls, nVar, false);
    }

    @NonNull
    @androidx.annotation.j
    public T x(@g0(from = 0, to = 100) int i10) {
        return (T) G0(com.bumptech.glide.load.resource.bitmap.e.f96968b, Integer.valueOf(i10));
    }

    @NonNull
    @androidx.annotation.j
    public T x0(int i10) {
        return (T) y0(i10, i10);
    }

    @NonNull
    @androidx.annotation.j
    public T y0(int i10, int i11) {
        if (this.Z) {
            return (T) n().y0(i10, i11);
        }
        this.f97289k = i10;
        this.f97288j = i11;
        this.f97279a |= 512;
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T z(@v int i10) {
        if (this.Z) {
            return (T) n().z(i10);
        }
        this.f97284f = i10;
        int i11 = this.f97279a | 32;
        int i12 = 5 | 0;
        this.f97283e = null;
        this.f97279a = i11 & (-17);
        return (T) F0();
    }

    @NonNull
    @androidx.annotation.j
    public T z0(@v int i10) {
        if (this.Z) {
            return (T) n().z0(i10);
        }
        this.f97286h = i10;
        int i11 = this.f97279a | 128;
        this.f97285g = null;
        this.f97279a = i11 & (-65);
        return (T) F0();
    }
}
