package androidx.media3.common;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface z0 {
    public static final int A = 0;
    public static final int A0 = 14;
    public static final int B = 1;
    public static final int B0 = 15;
    public static final int C = 2;
    public static final int C0 = 16;
    public static final int D = 3;
    public static final int D0 = 17;
    public static final int E = 0;

    @Deprecated
    public static final int E0 = 18;
    public static final int F = 1;
    public static final int F0 = 18;
    public static final int G = 2;

    @Deprecated
    public static final int G0 = 19;
    public static final int H = 3;
    public static final int H0 = 19;
    public static final int I = 4;
    public static final int I0 = 31;
    public static final int J = 5;
    public static final int J0 = 20;
    public static final int K = 6;
    public static final int K0 = 21;
    public static final int L = 7;
    public static final int L0 = 22;
    public static final int M = 8;
    public static final int M0 = 23;
    public static final int N = 9;
    public static final int N0 = 24;
    public static final int O = 10;

    @Deprecated
    public static final int O0 = 25;
    public static final int P = 11;
    public static final int P0 = 33;
    public static final int Q = 12;

    @Deprecated
    public static final int Q0 = 26;
    public static final int R = 13;
    public static final int R0 = 34;
    public static final int S = 14;
    public static final int S0 = 35;
    public static final int T = 15;
    public static final int T0 = 27;
    public static final int U = 16;
    public static final int U0 = 28;
    public static final int V = 17;
    public static final int V0 = 29;
    public static final int W = 18;
    public static final int W0 = 30;
    public static final int X = 19;
    public static final int X0 = 32;
    public static final int Y = 20;
    public static final int Y0 = -1;
    public static final int Z = 21;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f61881a = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f61882a0 = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f61883b = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f61884b0 = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f61885c = 3;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f61886c0 = 24;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61887d = 4;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f61888d0 = 25;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61889e = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f61890e0 = 26;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61891f = 2;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f61892f0 = 27;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f61893g = 3;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f61894g0 = 28;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61895h = 4;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f61896h0 = 29;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61897i = 5;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f61898i0 = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f61899j = 6;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f61900j0 = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f61901k = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f61902k0 = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f61903l = 1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f61904l0 = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f61905m = 2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f61906m0 = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f61907n = 3;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f61908n0 = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f61909o = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @Deprecated
    public static final int f61910o0 = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f61911p = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f61912p0 = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f61913q = 2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @Deprecated
    public static final int f61914q0 = 6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f61915r = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f61916r0 = 7;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f61917s = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f61918s0 = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f61919t = 2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @Deprecated
    public static final int f61920t0 = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f61921u = 3;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f61922u0 = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f61923v = 4;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f61924v0 = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f61925w = 5;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @Deprecated
    public static final int f61926w0 = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f61927x = 6;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f61928x0 = 11;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f61929y = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f61930y0 = 12;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f61931z = 1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f61932z0 = 13;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f61933b = new a().f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f61934c = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f61935a;

        @androidx.media3.common.util.b1
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f61936b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final s.b f61937a;

            @z7.a
            public a a(int i10) {
                this.f61937a.a(i10);
                return this;
            }

            @z7.a
            public a b(c cVar) {
                this.f61937a.b(cVar.f61935a);
                return this;
            }

            @z7.a
            public a c(int... iArr) {
                this.f61937a.c(iArr);
                return this;
            }

            @z7.a
            public a d() {
                this.f61937a.c(f61936b);
                return this;
            }

            @z7.a
            public a e(int i10, boolean z10) {
                this.f61937a.d(i10, z10);
                return this;
            }

            public c f() {
                return new c(this.f61937a.e());
            }

            @z7.a
            public a g(int i10) {
                this.f61937a.f(i10);
                return this;
            }

            @z7.a
            public a h(int... iArr) {
                this.f61937a.g(iArr);
                return this;
            }

            @z7.a
            public a i(int i10, boolean z10) {
                this.f61937a.h(i10, z10);
                return this;
            }

            public a() {
                this.f61937a = new s.b();
            }

            private a(c cVar) {
                s.b bVar = new s.b();
                this.f61937a = bVar;
                bVar.b(cVar.f61935a);
            }
        }

        @androidx.media3.common.util.b1
        public static c e(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f61934c);
            if (integerArrayList == null) {
                return f61933b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.f();
        }

        @androidx.media3.common.util.b1
        public a b() {
            return new a();
        }

        public boolean c(int i10) {
            return this.f61935a.a(i10);
        }

        public boolean d(int... iArr) {
            return this.f61935a.b(iArr);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f61935a.equals(((c) obj).f61935a);
            }
            return false;
        }

        public int f(int i10) {
            return this.f61935a.c(i10);
        }

        public int g() {
            return this.f61935a.d();
        }

        @androidx.media3.common.util.b1
        public Bundle h() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f61935a.d(); i10++) {
                arrayList.add(Integer.valueOf(this.f61935a.c(i10)));
            }
            bundle.putIntegerArrayList(f61934c, arrayList);
            return bundle;
        }

        public int hashCode() {
            return this.f61935a.hashCode();
        }

        private c(s sVar) {
            this.f61935a = sVar;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f61938a;

        @androidx.media3.common.util.b1
        public f(s sVar) {
            this.f61938a = sVar;
        }

        public boolean a(int i10) {
            return this.f61938a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f61938a.b(iArr);
        }

        public int c(int i10) {
            return this.f61938a.c(i10);
        }

        public int d() {
            return this.f61938a.d();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f61938a.equals(((f) obj).f61938a);
            }
            return false;
        }

        public int hashCode() {
            return this.f61938a.hashCode();
        }
    }

    public interface g {
        @androidx.media3.common.util.b1
        @Deprecated
        default void A(int i10) {
        }

        default void B(float f10) {
        }

        @androidx.media3.common.util.b1
        @Deprecated
        default void C(boolean z10, int i10) {
        }

        default void E(androidx.media3.common.text.d dVar) {
        }

        @androidx.media3.common.util.b1
        default void F(r0 r0Var) {
        }

        @androidx.media3.common.util.b1
        default void K(int i10) {
        }

        default void M(int i10, boolean z10) {
        }

        default void N(q0 q0Var) {
        }

        default void O(x0 x0Var) {
        }

        default void Q(c cVar) {
        }

        default void S(z0 z0Var, f fVar) {
        }

        default void V(z3 z3Var, int i10) {
        }

        default void W(long j10) {
        }

        default void X(i4 i4Var) {
        }

        default void Y(o oVar) {
        }

        default void a(n4 n4Var) {
        }

        default void a0(boolean z10, int i10) {
        }

        default void d0(k kVar, k kVar2, int i10) {
        }

        default void e0(boolean z10) {
        }

        default void f0(int i10) {
        }

        default void g(boolean z10) {
        }

        default void h0(int i10) {
        }

        @androidx.media3.common.util.b1
        @Deprecated
        default void i(List<androidx.media3.common.text.a> list) {
        }

        @androidx.media3.common.util.b1
        @Deprecated
        default void j(boolean z10) {
        }

        default void j0(long j10) {
        }

        default void k0(e4 e4Var) {
        }

        default void l0(@androidx.annotation.p0 k0 k0Var, int i10) {
        }

        default void n(boolean z10) {
        }

        default void q0(boolean z10) {
        }

        default void r0(androidx.media3.common.d dVar) {
        }

        default void u(y0 y0Var) {
        }

        default void v() {
        }

        default void v0(q0 q0Var) {
        }

        default void w0(@androidx.annotation.p0 x0 x0Var) {
        }

        default void x(int i10) {
        }

        default void x0(long j10) {
        }

        default void z(int i10, int i11) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    public static final class k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.l1
        static final String f61939k = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f61940l = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.l1
        static final String f61941m = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @androidx.annotation.l1
        static final String f61942n = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @androidx.annotation.l1
        static final String f61943o = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f61944p = androidx.media3.common.util.k1.c1(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f61945q = androidx.media3.common.util.k1.c1(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f61946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @Deprecated
        public final int f61947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @androidx.annotation.p0
        public final k0 f61949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f61950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f61952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f61953h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61954i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f61955j;

        @androidx.media3.common.util.b1
        @Deprecated
        public k(@androidx.annotation.p0 Object obj, int i10, @androidx.annotation.p0 Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this(obj, i10, k0.f60814j, obj2, i11, j10, j11, i12, i13);
        }

        @androidx.media3.common.util.b1
        public static k c(Bundle bundle) {
            int i10 = bundle.getInt(f61939k, 0);
            Bundle bundle2 = bundle.getBundle(f61940l);
            return new k(null, i10, bundle2 == null ? null : k0.b(bundle2), null, bundle.getInt(f61941m, 0), bundle.getLong(f61942n, 0L), bundle.getLong(f61943o, 0L), bundle.getInt(f61944p, -1), bundle.getInt(f61945q, -1));
        }

        @androidx.media3.common.util.b1
        public boolean a(k kVar) {
            return this.f61948c == kVar.f61948c && this.f61951f == kVar.f61951f && this.f61952g == kVar.f61952g && this.f61953h == kVar.f61953h && this.f61954i == kVar.f61954i && this.f61955j == kVar.f61955j && Objects.equals(this.f61949d, kVar.f61949d);
        }

        @androidx.media3.common.util.b1
        public k b(boolean z10, boolean z11) {
            if (z10 && z11) {
                return this;
            }
            return new k(this.f61946a, z11 ? this.f61948c : 0, z10 ? this.f61949d : null, this.f61950e, z11 ? this.f61951f : 0, z10 ? this.f61952g : 0L, z10 ? this.f61953h : 0L, z10 ? this.f61954i : -1, z10 ? this.f61955j : -1);
        }

        @androidx.media3.common.util.b1
        @Deprecated
        public Bundle d() {
            return e(Integer.MAX_VALUE);
        }

        @androidx.media3.common.util.b1
        public Bundle e(int i10) {
            Bundle bundle = new Bundle();
            if (i10 < 3 || this.f61948c != 0) {
                bundle.putInt(f61939k, this.f61948c);
            }
            k0 k0Var = this.f61949d;
            if (k0Var != null) {
                bundle.putBundle(f61940l, k0Var.e());
            }
            if (i10 < 3 || this.f61951f != 0) {
                bundle.putInt(f61941m, this.f61951f);
            }
            if (i10 < 3 || this.f61952g != 0) {
                bundle.putLong(f61942n, this.f61952g);
            }
            if (i10 < 3 || this.f61953h != 0) {
                bundle.putLong(f61943o, this.f61953h);
            }
            int i11 = this.f61954i;
            if (i11 != -1) {
                bundle.putInt(f61944p, i11);
            }
            int i12 = this.f61955j;
            if (i12 != -1) {
                bundle.putInt(f61945q, i12);
            }
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && k.class == obj.getClass()) {
                k kVar = (k) obj;
                if (a(kVar) && Objects.equals(this.f61946a, kVar.f61946a) && Objects.equals(this.f61950e, kVar.f61950e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f61946a, Integer.valueOf(this.f61948c), this.f61949d, this.f61950e, Integer.valueOf(this.f61951f), Long.valueOf(this.f61952g), Long.valueOf(this.f61953h), Integer.valueOf(this.f61954i), Integer.valueOf(this.f61955j));
        }

        @androidx.media3.common.util.b1
        public k(@androidx.annotation.p0 Object obj, int i10, @androidx.annotation.p0 k0 k0Var, @androidx.annotation.p0 Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f61946a = obj;
            this.f61947b = i10;
            this.f61948c = i10;
            this.f61949d = k0Var;
            this.f61950e = obj2;
            this.f61951f = i11;
            this.f61952g = j10;
            this.f61953h = j11;
            this.f61954i = i12;
            this.f61955j = i13;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    void A();

    void A1();

    void B();

    @Deprecated
    void B1();

    int C();

    @androidx.media3.common.util.b1
    @Deprecated
    void C1();

    void D(int i10);

    void D0(int i10);

    @androidx.media3.common.util.b1
    androidx.media3.common.util.r0 D1();

    int E();

    void F(long j10);

    void F0(q0 q0Var);

    void F1(int i10);

    void G(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10);

    boolean G0();

    int G1();

    int H();

    void H0(int i10, int i11);

    @androidx.media3.common.util.b1
    @Deprecated
    void I0();

    void I1();

    boolean J();

    void K(boolean z10);

    void K0(k0 k0Var);

    void L0();

    i4 M0();

    void M1(int i10);

    long N();

    int O();

    boolean O0();

    void O1(k0 k0Var);

    int P();

    boolean P0(int i10);

    androidx.media3.common.text.d P1();

    void Q(int i10);

    void Q1(g gVar);

    long R();

    @Deprecated
    void R0(boolean z10);

    @androidx.annotation.g0(from = 0, to = 100)
    int S();

    @androidx.media3.common.util.b1
    @Deprecated
    boolean T();

    boolean T1();

    void U();

    @Deprecated
    void U0();

    void U1(g gVar);

    q0 V();

    e4 V0();

    int V1();

    @androidx.annotation.g0(from = 0)
    int W0();

    @androidx.media3.common.util.b1
    @Deprecated
    boolean X();

    long X0();

    void X1();

    @androidx.media3.common.util.b1
    @Deprecated
    int Y();

    k0 Y0(int i10);

    @androidx.annotation.p0
    k0 Z();

    long Z0();

    void Z1(int i10, k0 k0Var);

    @androidx.annotation.p0
    x0 a();

    int a0();

    c a2();

    void b0(boolean z10);

    void b2(@androidx.annotation.g0(from = 0) int i10, int i11);

    y0 c();

    z3 c0();

    void c1(androidx.media3.common.d dVar, boolean z10);

    boolean c2();

    boolean d();

    Looper d0();

    o d1();

    androidx.media3.common.d e();

    int e0();

    void f(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);

    void f0(@androidx.annotation.p0 TextureView textureView);

    void g2(int i10, List<k0> list);

    long getCurrentPosition();

    long getDuration();

    void h(y0 y0Var);

    n4 h0();

    void h1(List<k0> list, int i10, long j10);

    @androidx.media3.common.util.b1
    @Deprecated
    boolean hasNext();

    void i(@androidx.annotation.p0 Surface surface);

    long i1();

    void i2(k0 k0Var, boolean z10);

    boolean isPlaying();

    void j(@androidx.annotation.p0 SurfaceView surfaceView);

    void j0(int i10, long j10);

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    float k0();

    boolean k1();

    void l(@androidx.annotation.p0 SurfaceHolder surfaceHolder);

    int l0();

    void l2(k0 k0Var, long j10);

    void m(@androidx.annotation.p0 SurfaceHolder surfaceHolder);

    void m0();

    long n0();

    void n1(e4 e4Var);

    @androidx.media3.common.util.b1
    @Deprecated
    boolean n2();

    @androidx.media3.common.util.b1
    @Deprecated
    void next();

    void o(int i10, k0 k0Var);

    @androidx.media3.common.util.b1
    @Deprecated
    int o0();

    void o1(int i10, int i11);

    void o2(int i10, int i11, int i12);

    void p(@androidx.annotation.p0 TextureView textureView);

    void p2(List<k0> list);

    void pause();

    @androidx.media3.common.util.b1
    @Deprecated
    int q0();

    boolean q1();

    void r0(@androidx.annotation.p0 SurfaceView surfaceView);

    @Deprecated
    void r2(@androidx.annotation.g0(from = 0) int i10);

    void release();

    boolean s0();

    void stop();

    void t1();

    void t2();

    void u(@androidx.annotation.p0 Surface surface);

    q0 u2();

    long v();

    @androidx.media3.common.util.b1
    @Deprecated
    boolean v0();

    long v2();

    void w(int i10, int i11, List<k0> list);

    void w1(List<k0> list);

    boolean x();

    boolean x1();

    long y();

    void y1(boolean z10, int i10);

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    Object z();

    void z0(List<k0> list, boolean z10);

    void z1();
}
