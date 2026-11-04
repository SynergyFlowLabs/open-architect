package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.media3.common.StreamKey;
import androidx.media3.common.b4;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.w;
import androidx.media3.common.z3;
import androidx.media3.datasource.r1;
import androidx.media3.exoplayer.drm.t;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.h0;
import androidx.media3.exoplayer.source.h2;
import androidx.media3.exoplayer.source.s0;
import androidx.media3.exoplayer.source.s1;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.t3;
import androidx.media3.exoplayer.trackselection.c0;
import com.google.common.collect.n6;
import com.google.common.collect.nb;
import com.google.common.collect.o7;
import com.google.common.collect.s;
import com.google.common.collect.w7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j extends androidx.media3.exoplayer.source.a implements t0.c, androidx.media3.exoplayer.source.b1, t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t0 f64798h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final a f64802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @b0("this")
    @p0
    private Handler f64803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private e f64804n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w7<Pair<Long, Object>, e> f64799i = s.J();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n6<Object, androidx.media3.common.b> f64805o = n6.q();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.b1.a f64800j = X(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t.a f64801k = S(null);

    public interface a {
        boolean a(z3 z3Var);
    }

    private static final class b implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f64806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t0.b f64807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.b1.a f64808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t.a f64809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s0.a f64810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f64811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean[] f64812g = new boolean[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f64813h;

        public b(e eVar, t0.b bVar, androidx.media3.exoplayer.source.b1.a aVar, t.a aVar2) {
            this.f64806a = eVar;
            this.f64807b = bVar;
            this.f64808c = aVar;
            this.f64809d = aVar2;
        }

        public void a() {
            s0.a aVar = this.f64810e;
            if (aVar != null) {
                aVar.j(this);
            }
            this.f64813h = true;
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public long b() {
            return this.f64806a.k(this);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public void c(long j10) {
            this.f64806a.F(this, j10);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public boolean d() {
            return this.f64806a.s(this);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public long e() {
            return this.f64806a.o(this);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public List<StreamKey> f(List<c0> list) {
            return this.f64806a.p(list);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long g(long j10, f5 f5Var) {
            return this.f64806a.i(this, j10, f5Var);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long h(long j10) {
            return this.f64806a.I(this, j10);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long i() {
            return this.f64806a.E(this);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public boolean k(t3 t3Var) {
            return this.f64806a.f(this, t3Var);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public h2 m() {
            return this.f64806a.r();
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void o() throws IOException {
            this.f64806a.x();
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void p(long j10, boolean z10) {
            this.f64806a.g(this, j10, z10);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long t(c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
            if (this.f64812g.length == 0) {
                this.f64812g = new boolean[s1VarArr.length];
            }
            return this.f64806a.J(this, c0VarArr, zArr, s1VarArr, zArr2, j10);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void v(s0.a aVar, long j10) {
            this.f64810e = aVar;
            this.f64806a.C(this, j10);
        }
    }

    private static final class c implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f64814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f64815b;

        public c(b bVar, int i10) {
            this.f64814a = bVar;
            this.f64815b = i10;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() throws IOException {
            this.f64814a.f64806a.w(this.f64815b);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return this.f64814a.f64806a.t(this.f64815b);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) {
            b bVar = this.f64814a;
            return bVar.f64806a.K(bVar, this.f64815b, j10);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            b bVar = this.f64814a;
            return bVar.f64806a.D(bVar, this.f64815b, p3Var, gVar, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d extends androidx.media3.exoplayer.source.b0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final n6<Object, androidx.media3.common.b> f64816f;

        public d(z3 z3Var, n6<Object, androidx.media3.common.b> n6Var) {
            super(z3Var);
            int i10 = 2 ^ 1;
            androidx.media3.common.util.a.i(z3Var.v() == 1);
            z3.b bVar = new z3.b();
            for (int i11 = 0; i11 < z3Var.m(); i11++) {
                z3Var.k(i11, bVar, true);
                androidx.media3.common.util.a.i(n6Var.containsKey(androidx.media3.common.util.a.g(bVar.f61968b)));
            }
            this.f64816f = n6Var;
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            super.k(i10, bVar, true);
            androidx.media3.common.b bVar2 = (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64816f.get(bVar.f61968b));
            long j10 = bVar.f61970d;
            long jF = j10 == -9223372036854775807L ? bVar2.f60425d : k.f(j10, -1, bVar2);
            z3.b bVar3 = new z3.b();
            long jF2 = 0;
            for (int i11 = 0; i11 < i10 + 1; i11++) {
                this.f64829e.k(i11, bVar3, true);
                androidx.media3.common.b bVar4 = (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64816f.get(bVar3.f61968b));
                if (i11 == 0) {
                    jF2 = -k.f(-bVar3.q(), -1, bVar4);
                }
                if (i11 != i10) {
                    jF2 += k.f(bVar3.f61970d, -1, bVar4);
                }
            }
            bVar.w(bVar.f61967a, bVar.f61968b, bVar.f61969c, jF, jF2, bVar2, bVar.f61972f);
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            super.u(i10, dVar, j10);
            z3.b bVar = new z3.b();
            androidx.media3.common.b bVar2 = (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64816f.get(androidx.media3.common.util.a.g(k(dVar.f62001n, bVar, true).f61968b)));
            long jF = k.f(dVar.f62003p, -1, bVar2);
            if (dVar.f62000m == -9223372036854775807L) {
                long j11 = bVar2.f60425d;
                if (j11 != -9223372036854775807L) {
                    dVar.f62000m = j11 - jF;
                }
            } else {
                z3.b bVarK = super.k(dVar.f62002o, bVar, true);
                long j12 = bVarK.f61971e;
                androidx.media3.common.b bVar3 = (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64816f.get(bVarK.f61968b));
                z3.b bVarJ = j(dVar.f62002o, bVar);
                dVar.f62000m = bVarJ.f61971e + k.f(dVar.f62000m - j12, -1, bVar3);
            }
            dVar.f62003p = jF;
            return dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f64817a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f64820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media3.common.b f64821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private b f64822f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f64823g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f64824h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<b> f64818b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Long, Pair<d0, h0>> f64819c = new HashMap();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c0[] f64825i = new c0[0];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public s1[] f64826j = new s1[0];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public h0[] f64827k = new h0[0];

        public e(s0 s0Var, Object obj, androidx.media3.common.b bVar) {
            this.f64817a = s0Var;
            this.f64820d = obj;
            this.f64821e = bVar;
        }

        private int h(h0 h0Var) {
            String str;
            if (h0Var.f65067c == null) {
                return -1;
            }
            int i10 = 0;
            while (true) {
                c0[] c0VarArr = this.f64825i;
                if (i10 >= c0VarArr.length) {
                    return -1;
                }
                c0 c0Var = c0VarArr[i10];
                if (c0Var != null) {
                    b4 b4VarG = c0Var.g();
                    boolean z10 = h0Var.f65066b == 0 && b4VarG.equals(r().c(0));
                    for (int i11 = 0; i11 < b4VarG.f60459a; i11++) {
                        w wVarC = b4VarG.c(i11);
                        if (wVarC.equals(h0Var.f65067c) || (z10 && (str = wVarC.f61747a) != null && str.equals(h0Var.f65067c.f61747a))) {
                            return i10;
                        }
                    }
                }
                i10++;
            }
        }

        private long n(b bVar, long j10) {
            if (j10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long jD = k.d(j10, bVar.f64807b, this.f64821e);
            if (jD >= j.z0(bVar, this.f64821e)) {
                return Long.MIN_VALUE;
            }
            return jD;
        }

        private long q(b bVar, long j10) {
            long j11 = bVar.f64811f;
            return j10 < j11 ? k.g(j11, bVar.f64807b, this.f64821e) - (bVar.f64811f - j10) : k.g(j10, bVar.f64807b, this.f64821e);
        }

        private void v(b bVar, int i10) {
            h0 h0Var;
            boolean[] zArr = bVar.f64812g;
            if (zArr[i10] || (h0Var = this.f64827k[i10]) == null) {
                return;
            }
            zArr[i10] = true;
            bVar.f64808c.k(j.x0(bVar, h0Var, this.f64821e));
        }

        public void A(d0 d0Var) {
            this.f64819c.remove(Long.valueOf(d0Var.f64955a));
        }

        public void B(d0 d0Var, h0 h0Var) {
            this.f64819c.put(Long.valueOf(d0Var.f64955a), Pair.create(d0Var, h0Var));
        }

        public void C(b bVar, long j10) {
            bVar.f64811f = j10;
            if (this.f64823g) {
                if (this.f64824h) {
                    bVar.a();
                }
            } else {
                this.f64823g = true;
                this.f64817a.v(this, k.g(j10, bVar.f64807b, this.f64821e));
            }
        }

        public int D(b bVar, int i10, p3 p3Var, androidx.media3.decoder.g gVar, int i11) {
            long jK = k(bVar);
            int iR = ((s1) k1.o(this.f64826j[i10])).r(p3Var, gVar, i11 | 5);
            long jN = n(bVar, gVar.f62702f);
            if ((iR == -4 && jN == Long.MIN_VALUE) || (iR == -3 && jK == Long.MIN_VALUE && !gVar.f62701e)) {
                v(bVar, i10);
                gVar.o();
                gVar.c(4);
                return -4;
            }
            if (iR == -4) {
                v(bVar, i10);
                ((s1) k1.o(this.f64826j[i10])).r(p3Var, gVar, i11);
                gVar.f62702f = jN;
            }
            return iR;
        }

        public long E(b bVar) {
            if (!bVar.equals(this.f64818b.get(0))) {
                return -9223372036854775807L;
            }
            long jI = this.f64817a.i();
            if (jI == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return k.d(jI, bVar.f64807b, this.f64821e);
        }

        public void F(b bVar, long j10) {
            this.f64817a.c(q(bVar, j10));
        }

        public void G(t0 t0Var) {
            t0Var.l(this.f64817a);
        }

        public void H(b bVar) {
            if (bVar.equals(this.f64822f)) {
                this.f64822f = null;
                this.f64819c.clear();
            }
            this.f64818b.remove(bVar);
        }

        public long I(b bVar, long j10) {
            return k.d(this.f64817a.h(k.g(j10, bVar.f64807b, this.f64821e)), bVar.f64807b, this.f64821e);
        }

        public long J(b bVar, c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
            bVar.f64811f = j10;
            if (!bVar.equals(this.f64818b.get(0))) {
                for (int i10 = 0; i10 < c0VarArr.length; i10++) {
                    c0 c0Var = c0VarArr[i10];
                    boolean z10 = true;
                    if (c0Var != null) {
                        if (zArr[i10] && s1VarArr[i10] != null) {
                            z10 = false;
                        }
                        zArr2[i10] = z10;
                        if (z10) {
                            s1VarArr[i10] = Objects.equals(this.f64825i[i10], c0Var) ? new c(bVar, i10) : new androidx.media3.exoplayer.source.w();
                        }
                    } else {
                        s1VarArr[i10] = null;
                        zArr2[i10] = true;
                    }
                }
                return j10;
            }
            this.f64825i = (c0[]) Arrays.copyOf(c0VarArr, c0VarArr.length);
            long jG = k.g(j10, bVar.f64807b, this.f64821e);
            s1[] s1VarArr2 = this.f64826j;
            s1[] s1VarArr3 = s1VarArr2.length == 0 ? new s1[c0VarArr.length] : (s1[]) Arrays.copyOf(s1VarArr2, s1VarArr2.length);
            long jT = this.f64817a.t(c0VarArr, zArr, s1VarArr3, zArr2, jG);
            this.f64826j = (s1[]) Arrays.copyOf(s1VarArr3, s1VarArr3.length);
            this.f64827k = (h0[]) Arrays.copyOf(this.f64827k, s1VarArr3.length);
            for (int i11 = 0; i11 < s1VarArr3.length; i11++) {
                if (s1VarArr3[i11] == null) {
                    s1VarArr[i11] = null;
                    this.f64827k[i11] = null;
                } else if (s1VarArr[i11] == null || zArr2[i11]) {
                    s1VarArr[i11] = new c(bVar, i11);
                    this.f64827k[i11] = null;
                }
            }
            return k.d(jT, bVar.f64807b, this.f64821e);
        }

        public int K(b bVar, int i10, long j10) {
            return ((s1) k1.o(this.f64826j[i10])).l(k.g(j10, bVar.f64807b, this.f64821e));
        }

        public void L(androidx.media3.common.b bVar) {
            this.f64821e = bVar;
        }

        public void d(b bVar) {
            this.f64818b.add(bVar);
        }

        public boolean e(t0.b bVar, long j10) {
            b bVar2 = (b) o7.w(this.f64818b);
            if (k.g(j10, bVar, this.f64821e) != k.g(j.z0(bVar2, this.f64821e), bVar2.f64807b, this.f64821e)) {
                return false;
            }
            int i10 = 7 | 1;
            return true;
        }

        public boolean f(b bVar, t3 t3Var) {
            b bVar2 = this.f64822f;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                for (Pair<d0, h0> pair : this.f64819c.values()) {
                    bVar2.f64808c.q((d0) pair.first, j.x0(bVar2, (h0) pair.second, this.f64821e));
                    bVar.f64808c.z((d0) pair.first, j.x0(bVar, (h0) pair.second, this.f64821e), 0);
                }
            }
            this.f64822f = bVar;
            return this.f64817a.k(t3Var.a().f(q(bVar, t3Var.f65600a)).d());
        }

        public void g(b bVar, long j10, boolean z10) {
            this.f64817a.p(k.g(j10, bVar.f64807b, this.f64821e), z10);
        }

        public long i(b bVar, long j10, f5 f5Var) {
            return k.d(this.f64817a.g(k.g(j10, bVar.f64807b, this.f64821e), f5Var), bVar.f64807b, this.f64821e);
        }

        @Override // androidx.media3.exoplayer.source.s0.a
        public void j(s0 s0Var) {
            this.f64824h = true;
            for (int i10 = 0; i10 < this.f64818b.size(); i10++) {
                this.f64818b.get(i10).a();
            }
        }

        public long k(b bVar) {
            return n(bVar, this.f64817a.b());
        }

        @p0
        public b m(@p0 h0 h0Var) {
            if (h0Var != null && h0Var.f65070f != -9223372036854775807L) {
                for (int i10 = 0; i10 < this.f64818b.size(); i10++) {
                    b bVar = this.f64818b.get(i10);
                    if (bVar.f64813h) {
                        long jD = k.d(k1.D1(h0Var.f65070f), bVar.f64807b, this.f64821e);
                        long jZ0 = j.z0(bVar, this.f64821e);
                        if (jD >= 0 && jD < jZ0) {
                            return bVar;
                        }
                    }
                }
            }
            return null;
        }

        public long o(b bVar) {
            return n(bVar, this.f64817a.e());
        }

        public List<StreamKey> p(List<c0> list) {
            return this.f64817a.f(list);
        }

        public h2 r() {
            return this.f64817a.m();
        }

        public boolean s(b bVar) {
            return bVar.equals(this.f64822f) && this.f64817a.d();
        }

        public boolean t(int i10) {
            return ((s1) k1.o(this.f64826j[i10])).isReady();
        }

        public boolean u() {
            return this.f64818b.isEmpty();
        }

        public void w(int i10) throws IOException {
            ((s1) k1.o(this.f64826j[i10])).a();
        }

        public void x() throws IOException {
            this.f64817a.o();
        }

        @Override // androidx.media3.exoplayer.source.t1.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void l(s0 s0Var) {
            b bVar = this.f64822f;
            if (bVar == null) {
                return;
            }
            ((s0.a) androidx.media3.common.util.a.g(bVar.f64810e)).l(this.f64822f);
        }

        public void z(b bVar, h0 h0Var) {
            int iH = h(h0Var);
            if (iH != -1) {
                this.f64827k[iH] = h0Var;
                bVar.f64812g[iH] = true;
            }
        }
    }

    public j(t0 t0Var, @p0 a aVar) {
        this.f64798h = t0Var;
        this.f64802l = aVar;
    }

    @p0
    private b A0(@p0 t0.b bVar, @p0 h0 h0Var, boolean z10) {
        if (bVar == null) {
            return null;
        }
        List<e> listX = this.f64799i.x(new Pair<>(Long.valueOf(bVar.f65470d), bVar.f65467a));
        if (listX.isEmpty()) {
            return null;
        }
        if (z10) {
            e eVar = (e) o7.w(listX);
            return eVar.f64822f != null ? eVar.f64822f : (b) o7.w(eVar.f64818b);
        }
        for (int i10 = 0; i10 < listX.size(); i10++) {
            b bVarM = listX.get(i10).m(h0Var);
            if (bVarM != null) {
                return bVarM;
            }
        }
        return (b) listX.get(0).f64818b.get(0);
    }

    private void B0() {
        e eVar = this.f64804n;
        if (eVar != null) {
            eVar.G(this.f64798h);
            this.f64804n = null;
        }
    }

    public static /* synthetic */ void r0(j jVar, n6 n6Var, z3 z3Var) {
        androidx.media3.common.b bVar;
        for (e eVar : jVar.f64799i.values()) {
            androidx.media3.common.b bVar2 = (androidx.media3.common.b) n6Var.get(eVar.f64820d);
            if (bVar2 != null) {
                eVar.L(bVar2);
            }
        }
        e eVar2 = jVar.f64804n;
        if (eVar2 != null && (bVar = (androidx.media3.common.b) n6Var.get(eVar2.f64820d)) != null) {
            jVar.f64804n.L(bVar);
        }
        jVar.f64805o = n6Var;
        jVar.k0(new d(z3Var, n6Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 x0(b bVar, h0 h0Var, androidx.media3.common.b bVar2) {
        return new h0(h0Var.f65065a, h0Var.f65066b, h0Var.f65067c, h0Var.f65068d, h0Var.f65069e, y0(h0Var.f65070f, bVar, bVar2), y0(h0Var.f65071g, bVar, bVar2));
    }

    private static long y0(long j10, b bVar, androidx.media3.common.b bVar2) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jD1 = k1.D1(j10);
        t0.b bVar3 = bVar.f64807b;
        return k1.A2(bVar3.c() ? k.e(jD1, bVar3.f65468b, bVar3.f65469c, bVar2) : k.f(jD1, -1, bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long z0(b bVar, androidx.media3.common.b bVar2) {
        t0.b bVar3 = bVar.f64807b;
        if (bVar3.c()) {
            androidx.media3.common.b.C0566b c0566bF = bVar2.f(bVar3.f65468b);
            if (c0566bF.f60440b == -1) {
                return 0L;
            }
            return c0566bF.f60445g[bVar3.f65469c];
        }
        int i10 = bVar3.f65471e;
        if (i10 == -1) {
            return Long.MAX_VALUE;
        }
        long j10 = bVar2.f(i10).f60439a;
        if (j10 == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.t0.c
    public void B(t0 t0Var, z3 z3Var) {
        a aVar = this.f64802l;
        if ((aVar == null || !aVar.a(z3Var)) && !this.f64805o.isEmpty()) {
            k0(new d(z3Var, this.f64805o));
        }
    }

    public void C0(final n6<Object, androidx.media3.common.b> n6Var, final z3 z3Var) {
        androidx.media3.common.util.a.a(!n6Var.isEmpty());
        Object objG = androidx.media3.common.util.a.g(n6Var.values().c().get(0).f60422a);
        nb<Map.Entry<Object, androidx.media3.common.b>> it = n6Var.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, androidx.media3.common.b> next = it.next();
            Object key = next.getKey();
            androidx.media3.common.b value = next.getValue();
            androidx.media3.common.util.a.a(Objects.equals(objG, value.f60422a));
            androidx.media3.common.b bVar = this.f64805o.get(key);
            if (bVar != null) {
                for (int i10 = value.f60426e; i10 < value.f60423b; i10++) {
                    androidx.media3.common.b.C0566b c0566bF = value.f(i10);
                    androidx.media3.common.util.a.a(c0566bF.f60448j);
                    if (i10 < bVar.f60423b && k.c(value, i10) < k.c(bVar, i10)) {
                        androidx.media3.common.b.C0566b c0566bF2 = value.f(i10 + 1);
                        androidx.media3.common.util.a.a(c0566bF.f60447i + c0566bF2.f60447i == bVar.f(i10).f60447i);
                        androidx.media3.common.util.a.a(c0566bF.f60439a + c0566bF.f60447i == c0566bF2.f60439a);
                    }
                    if (c0566bF.f60439a == Long.MIN_VALUE) {
                        androidx.media3.common.util.a.a(k.c(value, i10) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            try {
                Handler handler = this.f64803m;
                if (handler == null) {
                    this.f64805o = n6Var;
                } else {
                    handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.r0(this.f64795a, n6Var, z3Var);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void K(k0 k0Var) {
        this.f64798h.K(k0Var);
    }

    @Override // androidx.media3.exoplayer.drm.t
    public void L(int i10, @p0 t0.b bVar) {
        b bVarA0 = A0(bVar, null, false);
        if (bVarA0 == null) {
            this.f64801k.h();
        } else {
            bVarA0.f64809d.h();
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(k0 k0Var) {
        return this.f64798h.O(k0Var);
    }

    @Override // androidx.media3.exoplayer.source.b1
    public void P(int i10, @p0 t0.b bVar, d0 d0Var, h0 h0Var, IOException iOException, boolean z10) {
        b bVarA0 = A0(bVar, h0Var, true);
        if (bVarA0 == null) {
            this.f64800j.t(d0Var, h0Var, iOException, z10);
            return;
        }
        if (z10) {
            bVarA0.f64806a.A(d0Var);
        }
        bVarA0.f64808c.t(d0Var, x0(bVarA0, h0Var, (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64805o.get(bVarA0.f64807b.f65467a))), iOException, z10);
    }

    @Override // androidx.media3.exoplayer.source.b1
    public void R(int i10, @p0 t0.b bVar, d0 d0Var, h0 h0Var) {
        b bVarA0 = A0(bVar, h0Var, true);
        if (bVarA0 == null) {
            this.f64800j.n(d0Var, h0Var);
        } else {
            bVarA0.f64806a.A(d0Var);
            bVarA0.f64808c.n(d0Var, x0(bVarA0, h0Var, (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64805o.get(bVarA0.f64807b.f65467a))));
        }
    }

    @Override // androidx.media3.exoplayer.source.b1
    public void U(int i10, @p0 t0.b bVar, h0 h0Var) {
        b bVarA0 = A0(bVar, h0Var, false);
        if (bVarA0 == null) {
            this.f64800j.k(h0Var);
        } else {
            bVarA0.f64806a.z(bVarA0, h0Var);
            bVarA0.f64808c.k(x0(bVarA0, h0Var, (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64805o.get(bVarA0.f64807b.f65467a))));
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void a() throws IOException {
        this.f64798h.a();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void a0() {
        B0();
        this.f64798h.M(this);
    }

    @Override // androidx.media3.exoplayer.drm.t
    public void b0(int i10, @p0 t0.b bVar) {
        b bVarA0 = A0(bVar, null, false);
        if (bVarA0 == null) {
            this.f64801k.m();
        } else {
            bVarA0.f64809d.m();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void d0() {
        this.f64798h.F(this);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public k0 g() {
        return this.f64798h.g();
    }

    @Override // androidx.media3.exoplayer.source.b1
    public void g0(int i10, t0.b bVar, h0 h0Var) {
        b bVarA0 = A0(bVar, h0Var, false);
        if (bVarA0 == null) {
            this.f64800j.C(h0Var);
        } else {
            bVarA0.f64808c.C(x0(bVarA0, h0Var, (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64805o.get(bVarA0.f64807b.f65467a))));
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void j0(@p0 r1 r1Var) {
        Handler handlerH = k1.H();
        synchronized (this) {
            try {
                this.f64803m = handlerH;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f64798h.i(handlerH, this);
        this.f64798h.j(handlerH, this);
        this.f64798h.C(this, r1Var, e0());
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        b bVar = (b) s0Var;
        bVar.f64806a.H(bVar);
        if (bVar.f64806a.u()) {
            this.f64799i.remove(new Pair(Long.valueOf(bVar.f64807b.f65470d), bVar.f64807b.f65467a), bVar.f64806a);
            if (this.f64799i.isEmpty()) {
                this.f64804n = bVar.f64806a;
                return;
            }
            bVar.f64806a.G(this.f64798h);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void l0() {
        B0();
        synchronized (this) {
            try {
                this.f64803m = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f64798h.n(this);
        this.f64798h.v(this);
        this.f64798h.A(this);
    }

    @Override // androidx.media3.exoplayer.source.b1
    public void m0(int i10, @p0 t0.b bVar, d0 d0Var, h0 h0Var, int i11) {
        if (i11 == 0) {
            b bVarA0 = A0(bVar, h0Var, true);
            if (bVarA0 == null) {
                this.f64800j.z(d0Var, h0Var, 0);
            } else {
                bVarA0.f64806a.B(d0Var, h0Var);
                bVarA0.f64808c.z(d0Var, x0(bVarA0, h0Var, (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64805o.get(bVarA0.f64807b.f65467a))), 0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.t
    public void n0(int i10, @p0 t0.b bVar, int i11) {
        b bVarA0 = A0(bVar, null, true);
        if (bVarA0 == null) {
            this.f64801k.k(i11);
        } else {
            bVarA0.f64809d.k(i11);
        }
    }

    @Override // androidx.media3.exoplayer.drm.t
    public void o0(int i10, @p0 t0.b bVar) {
        b bVarA0 = A0(bVar, null, false);
        if (bVarA0 == null) {
            this.f64801k.i();
        } else {
            bVarA0.f64809d.i();
        }
    }

    @Override // androidx.media3.exoplayer.drm.t
    public void p0(int i10, @p0 t0.b bVar, Exception exc) {
        b bVarA0 = A0(bVar, null, false);
        if (bVarA0 == null) {
            this.f64801k.l(exc);
        } else {
            bVarA0.f64809d.l(exc);
        }
    }

    @Override // androidx.media3.exoplayer.source.b1
    public void s0(int i10, @p0 t0.b bVar, d0 d0Var, h0 h0Var) {
        b bVarA0 = A0(bVar, h0Var, true);
        if (bVarA0 == null) {
            this.f64800j.q(d0Var, h0Var);
        } else {
            bVarA0.f64806a.A(d0Var);
            bVarA0.f64808c.q(d0Var, x0(bVarA0, h0Var, (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64805o.get(bVarA0.f64807b.f65467a))));
        }
    }

    @Override // androidx.media3.exoplayer.drm.t
    public void t0(int i10, @p0 t0.b bVar) {
        b bVarA0 = A0(bVar, null, false);
        if (bVarA0 == null) {
            this.f64801k.j();
        } else {
            bVarA0.f64809d.j();
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        e eVar;
        Pair<Long, Object> pair = new Pair<>(Long.valueOf(bVar.f65470d), bVar.f65467a);
        e eVar2 = this.f64804n;
        boolean z10 = false;
        if (eVar2 != null) {
            if (eVar2.f64820d.equals(bVar.f65467a)) {
                eVar = this.f64804n;
                this.f64799i.put(pair, eVar);
                z10 = true;
            } else {
                this.f64804n.G(this.f64798h);
                eVar = null;
            }
            this.f64804n = null;
        } else {
            eVar = null;
        }
        if (eVar == null && ((eVar = (e) o7.x(this.f64799i.x(pair), null)) == null || !eVar.e(bVar, j10))) {
            androidx.media3.common.b bVar3 = (androidx.media3.common.b) androidx.media3.common.util.a.g(this.f64805o.get(bVar.f65467a));
            e eVar3 = new e(this.f64798h.x(new t0.b(bVar.f65467a, bVar.f65470d), bVar2, k.g(j10, bVar, bVar3)), bVar.f65467a, bVar3);
            this.f64799i.put(pair, eVar3);
            eVar = eVar3;
        }
        b bVar4 = new b(eVar, bVar, X(bVar), S(bVar));
        eVar.d(bVar4);
        if (z10 && eVar.f64825i.length > 0) {
            bVar4.h(j10);
        }
        return bVar4;
    }
}
