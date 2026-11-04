package androidx.media3.exoplayer.source;

import androidx.media3.common.b4;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.t3;
import com.google.common.collect.x7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class e1 implements s0, s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0[] f64980a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f64982c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private s0.a f64985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private h2 f64986g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t1 f64988i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<s0> f64983d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<b4, b4> f64984e = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<s1, Integer> f64981b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s0[] f64987h = new s0[0];

    private static final class a implements androidx.media3.exoplayer.trackselection.c0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.exoplayer.trackselection.c0 f64989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b4 f64990d;

        public a(androidx.media3.exoplayer.trackselection.c0 c0Var, b4 b4Var) {
            this.f64989c = c0Var;
            this.f64990d = b4Var;
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public int a() {
            return this.f64989c.a();
        }

        @Override // androidx.media3.exoplayer.trackselection.h0
        public int b(int i10) {
            return this.f64989c.b(i10);
        }

        @Override // androidx.media3.exoplayer.trackselection.h0
        public int c() {
            return this.f64989c.c();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void d() {
            this.f64989c.d();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void e() {
            this.f64989c.e();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64989c.equals(aVar.f64989c) && this.f64990d.equals(aVar.f64990d);
        }

        @Override // androidx.media3.exoplayer.trackselection.h0
        public int f(int i10) {
            return this.f64989c.f(i10);
        }

        @Override // androidx.media3.exoplayer.trackselection.h0
        public b4 g() {
            return this.f64990d;
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void h() {
            this.f64989c.h();
        }

        public int hashCode() {
            return ((527 + this.f64990d.hashCode()) * 31) + this.f64989c.hashCode();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public int i(long j10, List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
            return this.f64989c.i(j10, list);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public int j() {
            return this.f64989c.j();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public androidx.media3.common.w k() {
            return this.f64990d.c(this.f64989c.j());
        }

        @Override // androidx.media3.exoplayer.trackselection.h0
        public androidx.media3.common.w l(int i10) {
            return this.f64990d.c(this.f64989c.b(i10));
        }

        @Override // androidx.media3.exoplayer.trackselection.h0
        public int length() {
            return this.f64989c.length();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void m(float f10) {
            this.f64989c.m(f10);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        @androidx.annotation.p0
        public Object n() {
            return this.f64989c.n();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public int o() {
            return this.f64989c.o();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public long p() {
            return this.f64989c.p();
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public boolean q(int i10, long j10) {
            return this.f64989c.q(i10, j10);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public boolean r(int i10, long j10) {
            return this.f64989c.r(i10, j10);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public boolean s(long j10, androidx.media3.exoplayer.source.chunk.e eVar, List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
            return this.f64989c.s(j10, eVar, list);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void t() {
            this.f64989c.t();
        }

        @Override // androidx.media3.exoplayer.trackselection.h0
        public int u(androidx.media3.common.w wVar) {
            return this.f64989c.f(this.f64990d.d(wVar));
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void v(long j10, long j11, long j12, List<? extends androidx.media3.exoplayer.source.chunk.m> list, androidx.media3.exoplayer.source.chunk.n[] nVarArr) {
            this.f64989c.v(j10, j11, j12, list, nVarArr);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void w(boolean z10) {
            this.f64989c.w(z10);
        }
    }

    public e1(j jVar, long[] jArr, s0... s0VarArr) {
        this.f64982c = jVar;
        this.f64980a = s0VarArr;
        this.f64988i = jVar.empty();
        for (int i10 = 0; i10 < s0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f64980a[i10] = new c2(s0VarArr[i10], j10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        return this.f64988i.b();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
        this.f64988i.c(j10);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        return this.f64988i.d();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        return this.f64988i.e();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        s0[] s0VarArr = this.f64987h;
        return (s0VarArr.length > 0 ? s0VarArr[0] : this.f64980a[0]).g(j10, f5Var);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        long jH = this.f64987h[0].h(j10);
        int i10 = 1;
        while (true) {
            s0[] s0VarArr = this.f64987h;
            if (i10 >= s0VarArr.length) {
                return jH;
            }
            if (s0VarArr[i10].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        long j10 = -9223372036854775807L;
        for (s0 s0Var : this.f64987h) {
            long jI = s0Var.i();
            if (jI == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && s0Var.h(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (s0 s0Var2 : this.f64987h) {
                    if (s0Var2 == s0Var) {
                        break;
                    }
                    if (s0Var2.h(jI) != jI) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jI;
            } else if (jI != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.s0.a
    public void j(s0 s0Var) {
        this.f64983d.remove(s0Var);
        if (!this.f64983d.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (s0 s0Var2 : this.f64980a) {
            i10 += s0Var2.m().f65076a;
        }
        b4[] b4VarArr = new b4[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            s0[] s0VarArr = this.f64980a;
            if (i11 >= s0VarArr.length) {
                this.f64986g = new h2(b4VarArr);
                ((s0.a) androidx.media3.common.util.a.g(this.f64985f)).j(this);
                return;
            }
            h2 h2VarM = s0VarArr[i11].m();
            int i13 = h2VarM.f65076a;
            int i14 = 0;
            while (i14 < i13) {
                b4 b4VarC = h2VarM.c(i14);
                androidx.media3.common.w[] wVarArr = new androidx.media3.common.w[b4VarC.f60459a];
                for (int i15 = 0; i15 < b4VarC.f60459a; i15++) {
                    androidx.media3.common.w wVarC = b4VarC.c(i15);
                    androidx.media3.common.w.b bVarB = wVarC.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = wVarC.f61747a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    wVarArr[i15] = bVarB.f0(sb2.toString()).N();
                }
                b4 b4Var = new b4(i11 + ":" + b4VarC.f60460b, wVarArr);
                this.f64984e.put(b4Var, b4VarC);
                b4VarArr[i12] = b4Var;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        if (this.f64983d.isEmpty()) {
            return this.f64988i.k(t3Var);
        }
        int size = this.f64983d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f64983d.get(i10).k(t3Var);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        return (h2) androidx.media3.common.util.a.g(this.f64986g);
    }

    public s0 n(int i10) {
        s0 s0Var = this.f64980a[i10];
        return s0Var instanceof c2 ? ((c2) s0Var).a() : s0Var;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() throws IOException {
        for (s0 s0Var : this.f64980a) {
            s0Var.o();
        }
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
        for (s0 s0Var : this.f64987h) {
            s0Var.p(j10, z10);
        }
    }

    @Override // androidx.media3.exoplayer.source.t1.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void l(s0 s0Var) {
        ((s0.a) androidx.media3.common.util.a.g(this.f64985f)).l(this);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[c0VarArr.length];
        int[] iArr2 = new int[c0VarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            s1 s1Var = s1VarArr[i11];
            Integer num = s1Var == null ? null : this.f64981b.get(s1Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.c0 c0Var = c0VarArr[i11];
            if (c0Var != null) {
                String str = c0Var.g().f60460b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f64981b.clear();
        int length = c0VarArr.length;
        s1[] s1VarArr2 = new s1[length];
        s1[] s1VarArr3 = new s1[c0VarArr.length];
        androidx.media3.exoplayer.trackselection.c0[] c0VarArr2 = new androidx.media3.exoplayer.trackselection.c0[c0VarArr.length];
        ArrayList arrayList = new ArrayList(this.f64980a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f64980a.length) {
            for (int i13 = i10; i13 < c0VarArr.length; i13++) {
                s1VarArr3[i13] = iArr[i13] == i12 ? s1VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    androidx.media3.exoplayer.trackselection.c0 c0Var2 = (androidx.media3.exoplayer.trackselection.c0) androidx.media3.common.util.a.g(c0VarArr[i13]);
                    c0VarArr2[i13] = new a(c0Var2, (b4) androidx.media3.common.util.a.g(this.f64984e.get(c0Var2.g())));
                } else {
                    c0VarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jT = this.f64980a[i12].t(c0VarArr2, zArr, s1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jT;
            } else if (jT != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < c0VarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    s1 s1Var2 = (s1) androidx.media3.common.util.a.g(s1VarArr3[i15]);
                    s1VarArr2[i15] = s1VarArr3[i15];
                    this.f64981b.put(s1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    androidx.media3.common.util.a.i(s1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f64980a[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(s1VarArr2, i16, s1VarArr, i16, length);
        this.f64987h = (s0[]) arrayList.toArray(new s0[i16]);
        this.f64988i = this.f64982c.b(arrayList, x7.D(arrayList, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.source.d1
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((s0) obj).m().d();
            }
        }));
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        this.f64985f = aVar;
        Collections.addAll(this.f64983d, this.f64980a);
        for (s0 s0Var : this.f64980a) {
            s0Var.v(this, j10);
        }
    }
}
