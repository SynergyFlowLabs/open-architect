package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3 f61958a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f61959b = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61960c = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61961d = androidx.media3.common.util.k1.c1(2);

    class a extends z3 {
        a() {
        }

        @Override // androidx.media3.common.z3
        public int f(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.z3
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.z3
        public int m() {
            return 0;
        }

        @Override // androidx.media3.common.z3
        public Object s(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.z3
        public d u(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.z3
        public int v() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f61962h = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f61963i = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f61964j = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f61965k = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f61966l = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f61967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f61968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f61969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public long f61970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public long f61971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f61972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public androidx.media3.common.b f61973g = androidx.media3.common.b.f60416l;

        @androidx.media3.common.util.b1
        public static b a(Bundle bundle) {
            int i10 = bundle.getInt(f61962h, 0);
            long j10 = bundle.getLong(f61963i, -9223372036854775807L);
            long j11 = bundle.getLong(f61964j, 0L);
            boolean z10 = bundle.getBoolean(f61965k, false);
            Bundle bundle2 = bundle.getBundle(f61966l);
            androidx.media3.common.b bVarE = bundle2 != null ? androidx.media3.common.b.e(bundle2) : androidx.media3.common.b.f60416l;
            b bVar = new b();
            bVar.w(null, null, i10, j10, j11, bVarE, z10);
            return bVar;
        }

        public int b(int i10) {
            return this.f61973g.f(i10).f60440b;
        }

        public long c(int i10, int i11) {
            androidx.media3.common.b.C0566b c0566bF = this.f61973g.f(i10);
            if (c0566bF.f60440b != -1) {
                return c0566bF.f60445g[i11];
            }
            return -9223372036854775807L;
        }

        public int d() {
            return this.f61973g.f60423b;
        }

        public int e(long j10) {
            return this.f61973g.g(j10, this.f61970d);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f61967a, bVar.f61967a) && Objects.equals(this.f61968b, bVar.f61968b) && this.f61969c == bVar.f61969c && this.f61970d == bVar.f61970d && this.f61971e == bVar.f61971e && this.f61972f == bVar.f61972f && Objects.equals(this.f61973g, bVar.f61973g)) {
                    return true;
                }
            }
            return false;
        }

        public int f(long j10) {
            return this.f61973g.h(j10, this.f61970d);
        }

        public long g(int i10) {
            return this.f61973g.f(i10).f60439a;
        }

        public long h() {
            return this.f61973g.f60424c;
        }

        public int hashCode() {
            Object obj = this.f61967a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f61968b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f61969c) * 31;
            long j10 = this.f61970d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f61971e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f61972f ? 1 : 0)) * 31) + this.f61973g.hashCode();
        }

        @androidx.media3.common.util.b1
        public int i(int i10, int i11) {
            androidx.media3.common.b.C0566b c0566bF = this.f61973g.f(i10);
            if (c0566bF.f60440b != -1) {
                return c0566bF.f60444f[i11];
            }
            return 0;
        }

        @androidx.annotation.p0
        public Object j() {
            return this.f61973g.f60422a;
        }

        @androidx.media3.common.util.b1
        public long k(int i10) {
            return this.f61973g.f(i10).f60447i;
        }

        public long l() {
            return androidx.media3.common.util.k1.A2(this.f61970d);
        }

        public long m() {
            return this.f61970d;
        }

        public int n(int i10) {
            return this.f61973g.f(i10).e();
        }

        public int o(int i10, int i11) {
            return this.f61973g.f(i10).i(i11);
        }

        public long p() {
            return androidx.media3.common.util.k1.A2(this.f61971e);
        }

        public long q() {
            return this.f61971e;
        }

        public int r() {
            return this.f61973g.f60426e;
        }

        public boolean s(int i10) {
            return !this.f61973g.f(i10).j();
        }

        @androidx.media3.common.util.b1
        public boolean t(int i10) {
            return i10 == d() - 1 && this.f61973g.k(i10);
        }

        @androidx.media3.common.util.b1
        public boolean u(int i10) {
            return this.f61973g.f(i10).f60448j;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b v(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, androidx.media3.common.b.f60416l, false);
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b w(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, int i10, long j10, long j11, androidx.media3.common.b bVar, boolean z10) {
            this.f61967a = obj;
            this.f61968b = obj2;
            this.f61969c = i10;
            this.f61970d = j10;
            this.f61971e = j11;
            this.f61973g = bVar;
            this.f61972f = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        public Bundle x() {
            Bundle bundle = new Bundle();
            int i10 = this.f61969c;
            if (i10 != 0) {
                bundle.putInt(f61962h, i10);
            }
            long j10 = this.f61970d;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f61963i, j10);
            }
            long j11 = this.f61971e;
            if (j11 != 0) {
                bundle.putLong(f61964j, j11);
            }
            boolean z10 = this.f61972f;
            if (z10) {
                bundle.putBoolean(f61965k, z10);
            }
            if (!this.f61973g.equals(androidx.media3.common.b.f60416l)) {
                bundle.putBundle(f61966l, this.f61973g.n());
            }
            return bundle;
        }
    }

    @androidx.media3.common.util.b1
    public static final class c extends z3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final l6<d> f61974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final l6<b> f61975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f61976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f61977h;

        public c(l6<d> l6Var, l6<b> l6Var2, int[] iArr) {
            androidx.media3.common.util.a.a(l6Var.size() == iArr.length);
            this.f61974e = l6Var;
            this.f61975f = l6Var2;
            this.f61976g = iArr;
            this.f61977h = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f61977h[iArr[i10]] = i10;
            }
        }

        @Override // androidx.media3.common.z3
        public int e(boolean z10) {
            if (w()) {
                return -1;
            }
            if (z10) {
                return this.f61976g[0];
            }
            return 0;
        }

        @Override // androidx.media3.common.z3
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.z3
        public int g(boolean z10) {
            if (w()) {
                return -1;
            }
            return z10 ? this.f61976g[v() - 1] : v() - 1;
        }

        @Override // androidx.media3.common.z3
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f61976g[this.f61977h[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return e(z10);
            }
            return -1;
        }

        @Override // androidx.media3.common.z3
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f61975f.get(i10);
            bVar.w(bVar2.f61967a, bVar2.f61968b, bVar2.f61969c, bVar2.f61970d, bVar2.f61971e, bVar2.f61973g, bVar2.f61972f);
            return bVar;
        }

        @Override // androidx.media3.common.z3
        public int m() {
            return this.f61975f.size();
        }

        @Override // androidx.media3.common.z3
        public int r(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f61976g[this.f61977h[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return g(z10);
            }
            return -1;
        }

        @Override // androidx.media3.common.z3
        public Object s(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.z3
        public d u(int i10, d dVar, long j10) {
            d dVar2 = this.f61974e.get(i10);
            dVar.j(dVar2.f61988a, dVar2.f61990c, dVar2.f61991d, dVar2.f61992e, dVar2.f61993f, dVar2.f61994g, dVar2.f61995h, dVar2.f61996i, dVar2.f61997j, dVar2.f61999l, dVar2.f62000m, dVar2.f62001n, dVar2.f62002o, dVar2.f62003p);
            dVar.f61998k = dVar2.f61998k;
            return dVar;
        }

        @Override // androidx.media3.common.z3
        public int v() {
            return this.f61974e.size();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.media3.common.util.b1
        @androidx.annotation.p0
        @Deprecated
        public Object f61989b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f61991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f61992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f61993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f61994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f61995h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f61996i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        public k0.g f61997j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f61998k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public long f61999l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public long f62000m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f62001n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f62002o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @androidx.media3.common.util.b1
        public long f62003p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f61978q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f61979r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final k0 f61980s = new k0.c().E("androidx.media3.common.Timeline").M(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f61981t = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f61982u = androidx.media3.common.util.k1.c1(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f61983v = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f61984w = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f61985x = androidx.media3.common.util.k1.c1(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f61986y = androidx.media3.common.util.k1.c1(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f61987z = androidx.media3.common.util.k1.c1(7);
        private static final String A = androidx.media3.common.util.k1.c1(8);
        private static final String B = androidx.media3.common.util.k1.c1(9);
        private static final String C = androidx.media3.common.util.k1.c1(10);
        private static final String D = androidx.media3.common.util.k1.c1(11);
        private static final String E = androidx.media3.common.util.k1.c1(12);
        private static final String F = androidx.media3.common.util.k1.c1(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f61988a = f61978q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k0 f61990c = f61980s;

        @androidx.media3.common.util.b1
        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f61981t);
            k0 k0VarB = bundle2 != null ? k0.b(bundle2) : k0.f60814j;
            long j10 = bundle.getLong(f61982u, -9223372036854775807L);
            long j11 = bundle.getLong(f61983v, -9223372036854775807L);
            long j12 = bundle.getLong(f61984w, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(f61985x, false);
            boolean z11 = bundle.getBoolean(f61986y, false);
            Bundle bundle3 = bundle.getBundle(f61987z);
            k0.g gVarB = bundle3 != null ? k0.g.b(bundle3) : null;
            boolean z12 = bundle.getBoolean(A, false);
            long j13 = bundle.getLong(B, 0L);
            long j14 = bundle.getLong(C, -9223372036854775807L);
            int i10 = bundle.getInt(D, 0);
            int i11 = bundle.getInt(E, 0);
            long j15 = bundle.getLong(F, 0L);
            d dVar = new d();
            dVar.j(f61979r, k0VarB, null, j10, j11, j12, z10, z11, gVarB, j13, j14, i10, i11, j15);
            dVar.f61998k = z12;
            return dVar;
        }

        public long b() {
            return androidx.media3.common.util.k1.A0(this.f61994g);
        }

        public long c() {
            return androidx.media3.common.util.k1.A2(this.f61999l);
        }

        public long d() {
            return this.f61999l;
        }

        public long e() {
            return androidx.media3.common.util.k1.A2(this.f62000m);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (Objects.equals(this.f61988a, dVar.f61988a) && Objects.equals(this.f61990c, dVar.f61990c) && Objects.equals(this.f61991d, dVar.f61991d) && Objects.equals(this.f61997j, dVar.f61997j) && this.f61992e == dVar.f61992e && this.f61993f == dVar.f61993f && this.f61994g == dVar.f61994g && this.f61995h == dVar.f61995h && this.f61996i == dVar.f61996i && this.f61998k == dVar.f61998k && this.f61999l == dVar.f61999l && this.f62000m == dVar.f62000m && this.f62001n == dVar.f62001n && this.f62002o == dVar.f62002o && this.f62003p == dVar.f62003p) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return this.f62000m;
        }

        public long g() {
            return androidx.media3.common.util.k1.A2(this.f62003p);
        }

        public long h() {
            return this.f62003p;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f61988a.hashCode()) * 31) + this.f61990c.hashCode()) * 31;
            Object obj = this.f61991d;
            int iHashCode2 = 0;
            int iHashCode3 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            k0.g gVar = this.f61997j;
            if (gVar != null) {
                iHashCode2 = gVar.hashCode();
            }
            int i10 = (iHashCode3 + iHashCode2) * 31;
            long j10 = this.f61992e;
            int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f61993f;
            int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f61994g;
            int i13 = (((((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f61995h ? 1 : 0)) * 31) + (this.f61996i ? 1 : 0)) * 31) + (this.f61998k ? 1 : 0)) * 31;
            long j13 = this.f61999l;
            int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f62000m;
            int i15 = (((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f62001n) * 31) + this.f62002o) * 31;
            long j15 = this.f62003p;
            return i15 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public boolean i() {
            return this.f61997j != null;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public d j(Object obj, @androidx.annotation.p0 k0 k0Var, @androidx.annotation.p0 Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, @androidx.annotation.p0 k0.g gVar, long j13, long j14, int i10, int i11, long j15) {
            k0.h hVar;
            this.f61988a = obj;
            this.f61990c = k0Var != null ? k0Var : f61980s;
            this.f61989b = (k0Var == null || (hVar = k0Var.f60822b) == null) ? null : hVar.f60928i;
            this.f61991d = obj2;
            this.f61992e = j10;
            this.f61993f = j11;
            this.f61994g = j12;
            this.f61995h = z10;
            this.f61996i = z11;
            this.f61997j = gVar;
            this.f61999l = j13;
            this.f62000m = j14;
            this.f62001n = i10;
            this.f62002o = i11;
            this.f62003p = j15;
            this.f61998k = false;
            return this;
        }

        @androidx.media3.common.util.b1
        public Bundle k() {
            Bundle bundle = new Bundle();
            if (!k0.f60814j.equals(this.f61990c)) {
                bundle.putBundle(f61981t, this.f61990c.e());
            }
            long j10 = this.f61992e;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f61982u, j10);
            }
            long j11 = this.f61993f;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f61983v, j11);
            }
            long j12 = this.f61994g;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f61984w, j12);
            }
            boolean z10 = this.f61995h;
            if (z10) {
                bundle.putBoolean(f61985x, z10);
            }
            boolean z11 = this.f61996i;
            if (z11) {
                bundle.putBoolean(f61986y, z11);
            }
            k0.g gVar = this.f61997j;
            if (gVar != null) {
                bundle.putBundle(f61987z, gVar.c());
            }
            boolean z12 = this.f61998k;
            if (z12) {
                bundle.putBoolean(A, z12);
            }
            long j13 = this.f61999l;
            if (j13 != 0) {
                bundle.putLong(B, j13);
            }
            long j14 = this.f62000m;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(C, j14);
            }
            int i10 = this.f62001n;
            if (i10 != 0) {
                bundle.putInt(D, i10);
            }
            int i11 = this.f62002o;
            if (i11 != 0) {
                bundle.putInt(E, i11);
            }
            long j15 = this.f62003p;
            if (j15 != 0) {
                bundle.putLong(F, j15);
            }
            return bundle;
        }
    }

    @androidx.media3.common.util.b1
    protected z3() {
    }

    @androidx.media3.common.util.b1
    public static z3 b(Bundle bundle) {
        l6 l6VarC = c(new com.google.common.base.t() { // from class: androidx.media3.common.x3
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return z3.d.a((Bundle) obj);
            }
        }, bundle.getBinder(f61959b));
        l6 l6VarC2 = c(new com.google.common.base.t() { // from class: androidx.media3.common.y3
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return z3.b.a((Bundle) obj);
            }
        }, bundle.getBinder(f61960c));
        int[] intArray = bundle.getIntArray(f61961d);
        if (intArray == null) {
            intArray = d(l6VarC.size());
        }
        return new c(l6VarC, l6VarC2, intArray);
    }

    private static <T> l6<T> c(com.google.common.base.t<Bundle, T> tVar, @androidx.annotation.p0 IBinder iBinder) {
        return iBinder == null ? l6.F() : androidx.media3.common.util.i.d(tVar, i.a(iBinder));
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    @androidx.media3.common.util.b1
    public final z3 a(int i10) {
        if (v() == 1) {
            return this;
        }
        d dVarU = u(i10, new d(), 0L);
        l6.a aVarS = l6.s();
        int i11 = dVarU.f62001n;
        while (true) {
            int i12 = dVarU.f62002o;
            if (i11 > i12) {
                dVarU.f62002o = i12 - dVarU.f62001n;
                dVarU.f62001n = 0;
                return new c(l6.G(dVarU), aVarS.e(), new int[]{0});
            }
            b bVarK = k(i11, new b(), true);
            bVarK.f61969c = 0;
            aVarS.a(bVarK);
            i11++;
        }
    }

    public int e(boolean z10) {
        return w() ? -1 : 0;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        if (z3Var.v() == v() && z3Var.m() == m()) {
            d dVar = new d();
            b bVar = new b();
            d dVar2 = new d();
            b bVar2 = new b();
            for (int i10 = 0; i10 < v(); i10++) {
                if (!t(i10, dVar).equals(z3Var.t(i10, dVar2))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < m(); i11++) {
                if (!k(i11, bVar, true).equals(z3Var.k(i11, bVar2, true))) {
                    return false;
                }
            }
            int iE = e(true);
            if (iE != z3Var.e(true) || (iG = g(true)) != z3Var.g(true)) {
                return false;
            }
            while (iE != iG) {
                int i12 = i(iE, 0, true);
                if (i12 != z3Var.i(iE, 0, true)) {
                    return false;
                }
                iE = i12;
            }
            return true;
        }
        return false;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (w()) {
            return -1;
        }
        return v() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f61969c;
        if (t(i12, dVar).f62002o != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return t(i13, dVar).f62001n;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iV = 217 + v();
        for (int i10 = 0; i10 < v(); i10++) {
            iV = (iV * 31) + t(i10, dVar).hashCode();
        }
        int iM = (iV * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            iM = (iM * 31) + k(i11, bVar, true).hashCode();
        }
        int iE = e(true);
        while (iE != -1) {
            iM = (iM * 31) + iE;
            iE = i(iE, 0, true);
        }
        return iM;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == g(z10) ? e(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    @androidx.media3.common.util.b1
    @z7.m(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return p(dVar, bVar, i10, j10);
    }

    @androidx.media3.common.util.b1
    @Deprecated
    @z7.m(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @androidx.annotation.p0
    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        return q(dVar, bVar, i10, j10, j11);
    }

    public final Pair<Object, Long> p(d dVar, b bVar, int i10, long j10) {
        return (Pair) androidx.media3.common.util.a.g(q(dVar, bVar, i10, j10, 0L));
    }

    @androidx.annotation.p0
    public final Pair<Object, Long> q(d dVar, b bVar, int i10, long j10, long j11) {
        androidx.media3.common.util.a.c(i10, 0, v());
        u(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.d();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f62001n;
        j(i11, bVar);
        while (i11 < dVar.f62002o && bVar.f61971e != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f61971e > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long jMin = j10 - bVar.f61971e;
        long j12 = bVar.f61970d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(androidx.media3.common.util.a.g(bVar.f61968b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int r(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == e(z10) ? g(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object s(int i10);

    public final d t(int i10, d dVar) {
        return u(i10, dVar, 0L);
    }

    public abstract d u(int i10, d dVar, long j10);

    public abstract int v();

    public final boolean w() {
        return v() == 0;
    }

    public final boolean x(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }

    @androidx.media3.common.util.b1
    public final Bundle y() {
        ArrayList arrayList = new ArrayList();
        int iV = v();
        d dVar = new d();
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(u(i10, dVar, 0L).k());
        }
        ArrayList arrayList2 = new ArrayList();
        int iM = m();
        b bVar = new b();
        for (int i11 = 0; i11 < iM; i11++) {
            arrayList2.add(k(i11, bVar, false).x());
        }
        int[] iArr = new int[iV];
        if (iV > 0) {
            iArr[0] = e(true);
        }
        for (int i12 = 1; i12 < iV; i12++) {
            iArr[i12] = i(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(f61959b, new i(arrayList));
        bundle.putBinder(f61960c, new i(arrayList2));
        bundle.putIntArray(f61961d, iArr);
        return bundle;
    }
}
