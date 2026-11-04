package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.b4;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class l1 implements s0, androidx.media3.extractor.t, androidx.media3.exoplayer.upstream.o.b<b>, androidx.media3.exoplayer.upstream.o.f, r1.d {

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final String f65125x3 = "ProgressiveMediaPeriod";

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final long f65126y3 = 10000;
    private boolean H1;

    @androidx.annotation.p0
    private s0.a X;

    @androidx.annotation.p0
    private androidx.media3.extractor.metadata.icy.b Y;
    private r1[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f65128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.p f65129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.u f65130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.m f65131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1.a f65132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.t.a f65133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f65134g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f65135g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f65136h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private f f65137h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f65138i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private androidx.media3.extractor.p0 f65139i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f65140j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private long f65141j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f65142k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f65143k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.common.w f65144l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f65145l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f65146m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f65147m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.o f65148n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f65149n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g1 f65150o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f65151o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private e[] f65152p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f65153p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f65154p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f65155p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f65156q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private long f65157r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.media3.common.util.m f65158s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f65159s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f65160t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f65161t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private int f65162u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f65163v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f65164v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Handler f65165w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f65166w3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final Map<String, String> f65127z3 = O();
    private static final androidx.media3.common.w A3 = new androidx.media3.common.w.b().f0("icy").u0("application/x-icy").N();

    class a extends androidx.media3.extractor.e0 {
        a(androidx.media3.extractor.p0 p0Var) {
            super(p0Var);
        }

        @Override // androidx.media3.extractor.e0, androidx.media3.extractor.p0
        public long Q1() {
            return l1.this.f65141j3;
        }
    }

    final class b implements androidx.media3.exoplayer.upstream.o.e, c0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f65169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.datasource.p1 f65170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g1 f65171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media3.extractor.t f65172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final androidx.media3.common.util.m f65173f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f65175h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f65177j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.extractor.u0 f65179l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f65180m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final androidx.media3.extractor.n0 f65174g = new androidx.media3.extractor.n0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f65176i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f65168a = d0.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private androidx.media3.datasource.x f65178k = i(0);

        public b(Uri uri, androidx.media3.datasource.p pVar, g1 g1Var, androidx.media3.extractor.t tVar, androidx.media3.common.util.m mVar) {
            this.f65169b = uri;
            this.f65170c = new androidx.media3.datasource.p1(pVar);
            this.f65171d = g1Var;
            this.f65172e = tVar;
            this.f65173f = mVar;
        }

        private androidx.media3.datasource.x i(long j10) {
            return new androidx.media3.datasource.x.b().j(this.f65169b).i(j10).g(l1.this.f65138i).c(6).f(l1.f65127z3).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f65174g.f68159a = j10;
            this.f65177j = j11;
            this.f65176i = true;
            this.f65180m = false;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0048 */
        @Override // androidx.media3.exoplayer.upstream.o.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.l1.b.a():void");
        }

        @Override // androidx.media3.exoplayer.upstream.o.e
        public void b() {
            this.f65175h = true;
        }

        @Override // androidx.media3.exoplayer.source.c0.a
        public void c(androidx.media3.common.util.o0 o0Var) {
            long jMax = !this.f65180m ? this.f65177j : Math.max(l1.this.Q(true), this.f65177j);
            int iA = o0Var.a();
            androidx.media3.extractor.u0 u0Var = (androidx.media3.extractor.u0) androidx.media3.common.util.a.g(this.f65179l);
            u0Var.b(o0Var, iA);
            u0Var.g(jMax, 1, iA, 0, null);
            this.f65180m = true;
        }
    }

    interface c {
        void E(long j10, androidx.media3.extractor.p0 p0Var, boolean z10);
    }

    private final class d implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65182a;

        public d(int i10) {
            this.f65182a = i10;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() throws IOException {
            l1.this.Y(this.f65182a);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return l1.this.T(this.f65182a);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) {
            return l1.this.j0(this.f65182a, j10);
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            return l1.this.f0(this.f65182a, p3Var, gVar, i10);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65185b;

        public e(int i10, boolean z10) {
            this.f65184a = i10;
            this.f65185b = z10;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f65184a == eVar.f65184a && this.f65185b == eVar.f65185b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f65184a * 31) + (this.f65185b ? 1 : 0);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h2 f65186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f65187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f65188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f65189d;

        public f(h2 h2Var, boolean[] zArr) {
            this.f65186a = h2Var;
            this.f65187b = zArr;
            int i10 = h2Var.f65076a;
            this.f65188c = new boolean[i10];
            this.f65189d = new boolean[i10];
        }
    }

    public l1(Uri uri, androidx.media3.datasource.p pVar, g1 g1Var, androidx.media3.exoplayer.drm.u uVar, androidx.media3.exoplayer.drm.t.a aVar, androidx.media3.exoplayer.upstream.m mVar, b1.a aVar2, c cVar, androidx.media3.exoplayer.upstream.b bVar, @androidx.annotation.p0 String str, int i10, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, long j10, @androidx.annotation.p0 androidx.media3.exoplayer.util.c cVar2) {
        this.f65128a = uri;
        this.f65129b = pVar;
        this.f65130c = uVar;
        this.f65133f = aVar;
        this.f65131d = mVar;
        this.f65132e = aVar2;
        this.f65134g = cVar;
        this.f65136h = bVar;
        this.f65138i = str;
        this.f65140j = i10;
        this.f65142k = i11;
        this.f65144l = wVar;
        this.f65148n = cVar2 != null ? new androidx.media3.exoplayer.upstream.o(cVar2) : new androidx.media3.exoplayer.upstream.o(f65125x3);
        this.f65150o = g1Var;
        this.f65146m = j10;
        this.f65158s = new androidx.media3.common.util.m();
        this.f65160t = new Runnable() { // from class: androidx.media3.exoplayer.source.i1
            @Override // java.lang.Runnable
            public final void run() {
                this.f65083a.U();
            }
        };
        this.f65163v = new Runnable() { // from class: androidx.media3.exoplayer.source.j1
            @Override // java.lang.Runnable
            public final void run() {
                l1.z(this.f65086a);
            }
        };
        this.f65165w = androidx.media3.common.util.k1.H();
        this.f65152p0 = new e[0];
        this.Z = new r1[0];
        this.f65159s3 = -9223372036854775807L;
        this.f65145l3 = 1;
    }

    @il.d({"trackState", "seekMap"})
    private void M() {
        androidx.media3.common.util.a.i(this.H1);
        androidx.media3.common.util.a.g(this.f65137h3);
        androidx.media3.common.util.a.g(this.f65139i3);
    }

    private boolean N(b bVar, int i10) {
        androidx.media3.extractor.p0 p0Var;
        if (this.f65156q3 || !((p0Var = this.f65139i3) == null || p0Var.Q1() == -9223372036854775807L)) {
            this.f65162u3 = i10;
            return true;
        }
        if (this.H1 && !l0()) {
            this.f65161t3 = true;
            return false;
        }
        this.f65149n3 = this.H1;
        this.f65157r3 = 0L;
        this.f65162u3 = 0;
        for (r1 r1Var : this.Z) {
            r1Var.Y();
        }
        bVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> O() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int P() {
        int iK = 0;
        for (r1 r1Var : this.Z) {
            iK += r1Var.K();
        }
        return iK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long Q(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.Z.length; i10++) {
            if (z10 || ((f) androidx.media3.common.util.a.g(this.f65137h3)).f65188c[i10]) {
                jMax = Math.max(jMax, this.Z[i10].D());
            }
        }
        return jMax;
    }

    private boolean S() {
        return this.f65159s3 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f65166w3 || this.H1 || !this.f65153p1 || this.f65139i3 == null) {
            return;
        }
        for (r1 r1Var : this.Z) {
            if (r1Var.J() == null) {
                return;
            }
        }
        this.f65158s.d();
        int length = this.Z.length;
        b4[] b4VarArr = new b4[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            androidx.media3.common.w wVarN = (androidx.media3.common.w) androidx.media3.common.util.a.g(this.Z[i10].J());
            String str = wVarN.f61761o;
            boolean zQ = androidx.media3.common.s0.q(str);
            boolean z10 = zQ || androidx.media3.common.s0.v(str);
            zArr[i10] = z10;
            this.f65154p2 = z10 | this.f65154p2;
            this.f65135g3 = this.f65146m != -9223372036854775807L && length == 1 && androidx.media3.common.s0.s(str);
            androidx.media3.extractor.metadata.icy.b bVar = this.Y;
            if (bVar != null) {
                if (zQ || this.f65152p0[i10].f65185b) {
                    androidx.media3.common.r0 r0Var = wVarN.f61758l;
                    wVarN = wVarN.b().n0(r0Var == null ? new androidx.media3.common.r0(bVar) : r0Var.a(bVar)).N();
                }
                if (zQ && wVarN.f61754h == -1 && wVarN.f61755i == -1 && bVar.f67517a != -1) {
                    wVarN = wVarN.b().Q(bVar.f67517a).N();
                }
            }
            androidx.media3.common.w wVarC = wVarN.c(this.f65130c.a(wVarN));
            b4VarArr[i10] = new b4(Integer.toString(i10), wVarC);
            this.f65151o3 = wVarC.f61767u | this.f65151o3;
        }
        this.f65137h3 = new f(new h2(b4VarArr), zArr);
        if (this.f65135g3 && this.f65141j3 == -9223372036854775807L) {
            this.f65141j3 = this.f65146m;
            this.f65139i3 = new a(this.f65139i3);
        }
        this.f65134g.E(this.f65141j3, this.f65139i3, this.f65143k3);
        this.H1 = true;
        ((s0.a) androidx.media3.common.util.a.g(this.X)).j(this);
    }

    private void V(int i10) {
        M();
        f fVar = this.f65137h3;
        boolean[] zArr = fVar.f65189d;
        if (zArr[i10]) {
            return;
        }
        androidx.media3.common.w wVarC = fVar.f65186a.c(i10).c(0);
        this.f65132e.j(androidx.media3.common.s0.m(wVarC.f61761o), wVarC, 0, null, this.f65157r3);
        zArr[i10] = true;
    }

    private void W(int i10) {
        M();
        if (this.f65161t3) {
            if (!this.f65154p2 || this.f65137h3.f65187b[i10]) {
                if (this.Z[i10].O(false)) {
                    return;
                }
                this.f65159s3 = 0L;
                this.f65161t3 = false;
                this.f65149n3 = true;
                this.f65157r3 = 0L;
                this.f65162u3 = 0;
                for (r1 r1Var : this.Z) {
                    r1Var.Y();
                }
                ((s0.a) androidx.media3.common.util.a.g(this.X)).l(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.f65165w.post(new Runnable() { // from class: androidx.media3.exoplayer.source.h1
            @Override // java.lang.Runnable
            public final void run() {
                this.f65072a.f65156q3 = true;
            }
        });
    }

    private androidx.media3.extractor.u0 e0(e eVar) {
        int length = this.Z.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f65152p0[i10])) {
                return this.Z[i10];
            }
        }
        if (this.f65153p1) {
            androidx.media3.common.util.z.n(f65125x3, "Extractor added new track (id=" + eVar.f65184a + ") after finishing tracks.");
            return new androidx.media3.extractor.m();
        }
        r1 r1VarM = r1.m(this.f65136h, this.f65130c, this.f65133f);
        r1VarM.g0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f65152p0, i11);
        eVarArr[length] = eVar;
        this.f65152p0 = (e[]) androidx.media3.common.util.k1.p(eVarArr);
        r1[] r1VarArr = (r1[]) Arrays.copyOf(this.Z, i11);
        r1VarArr[length] = r1VarM;
        this.Z = (r1[]) androidx.media3.common.util.k1.p(r1VarArr);
        return r1VarM;
    }

    private boolean h0(boolean[] zArr, long j10, boolean z10) {
        int length = this.Z.length;
        for (int i10 = 0; i10 < length; i10++) {
            r1 r1Var = this.Z[i10];
            if (r1Var.G() != 0 || !z10) {
                if (!(this.f65135g3 ? r1Var.b0(r1Var.B()) : r1Var.c0(j10, false)) && (zArr[i10] || !this.f65154p2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(androidx.media3.extractor.p0 p0Var) {
        this.f65139i3 = this.Y == null ? p0Var : new androidx.media3.extractor.p0.b(-9223372036854775807L);
        this.f65141j3 = p0Var.Q1();
        boolean z10 = !this.f65156q3 && p0Var.Q1() == -9223372036854775807L;
        this.f65143k3 = z10;
        this.f65145l3 = z10 ? 7 : 1;
        if (this.H1) {
            this.f65134g.E(this.f65141j3, p0Var, z10);
        } else {
            U();
        }
    }

    private void k0() {
        b bVar = new b(this.f65128a, this.f65129b, this.f65150o, this, this.f65158s);
        if (this.H1) {
            androidx.media3.common.util.a.i(S());
            long j10 = this.f65141j3;
            if (j10 != -9223372036854775807L && this.f65159s3 > j10) {
                this.f65164v3 = true;
                this.f65159s3 = -9223372036854775807L;
                return;
            }
            bVar.j(((androidx.media3.extractor.p0) androidx.media3.common.util.a.g(this.f65139i3)).R1(this.f65159s3).f68280a.f68290b, this.f65159s3);
            for (r1 r1Var : this.Z) {
                r1Var.e0(this.f65159s3);
            }
            this.f65159s3 = -9223372036854775807L;
        }
        this.f65162u3 = P();
        this.f65148n.n(bVar, this, this.f65131d.a(this.f65145l3));
    }

    private boolean l0() {
        return this.f65149n3 || S();
    }

    public static /* synthetic */ void z(l1 l1Var) {
        if (l1Var.f65166w3) {
            return;
        }
        ((s0.a) androidx.media3.common.util.a.g(l1Var.X)).l(l1Var);
    }

    androidx.media3.extractor.u0 R() {
        return e0(new e(0, true));
    }

    boolean T(int i10) {
        return !l0() && this.Z[i10].O(this.f65164v3);
    }

    void X() throws IOException {
        this.f65148n.b(this.f65131d.a(this.f65145l3));
    }

    void Y(int i10) throws IOException {
        this.Z[i10].Q();
        X();
    }

    @Override // androidx.media3.extractor.t
    public androidx.media3.extractor.u0 a(int i10, int i11) {
        return e0(new e(i10, false));
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, long j10, long j11, boolean z10) {
        androidx.media3.datasource.p1 p1Var = bVar.f65170c;
        d0 d0Var = new d0(bVar.f65168a, bVar.f65178k, p1Var.v(), p1Var.w(), j10, j11, p1Var.u());
        this.f65131d.b(bVar.f65168a);
        this.f65132e.m(d0Var, 1, -1, null, 0, null, bVar.f65177j, this.f65141j3);
        if (z10) {
            return;
        }
        for (r1 r1Var : this.Z) {
            r1Var.Y();
        }
        if (this.f65155p3 > 0) {
            ((s0.a) androidx.media3.common.util.a.g(this.X)).l(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        long jQ;
        M();
        if (!this.f65164v3 && this.f65155p3 != 0) {
            if (S()) {
                return this.f65159s3;
            }
            if (this.f65154p2) {
                int length = this.Z.length;
                jQ = Long.MAX_VALUE;
                for (int i10 = 0; i10 < length; i10++) {
                    f fVar = this.f65137h3;
                    if (fVar.f65187b[i10] && fVar.f65188c[i10] && !this.Z[i10].N()) {
                        jQ = Math.min(jQ, this.Z[i10].D());
                    }
                }
            } else {
                jQ = Long.MAX_VALUE;
            }
            if (jQ == Long.MAX_VALUE) {
                jQ = Q(false);
            }
            return jQ == Long.MIN_VALUE ? this.f65157r3 : jQ;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void w(b bVar, long j10, long j11) {
        if (this.f65141j3 == -9223372036854775807L && this.f65139i3 != null) {
            long jQ = Q(true);
            long j12 = jQ == Long.MIN_VALUE ? 0L : jQ + 10000;
            this.f65141j3 = j12;
            this.f65134g.E(j12, this.f65139i3, this.f65143k3);
        }
        androidx.media3.datasource.p1 p1Var = bVar.f65170c;
        d0 d0Var = new d0(bVar.f65168a, bVar.f65178k, p1Var.v(), p1Var.w(), j10, j11, p1Var.u());
        this.f65131d.b(bVar.f65168a);
        this.f65132e.p(d0Var, 1, -1, null, 0, null, bVar.f65177j, this.f65141j3);
        this.f65164v3 = true;
        ((s0.a) androidx.media3.common.util.a.g(this.X)).l(this);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public androidx.media3.exoplayer.upstream.o.c n(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        androidx.media3.exoplayer.upstream.o.c cVarI;
        androidx.media3.datasource.p1 p1Var = bVar.f65170c;
        d0 d0Var = new d0(bVar.f65168a, bVar.f65178k, p1Var.v(), p1Var.w(), j10, j11, p1Var.u());
        long jD = this.f65131d.d(new androidx.media3.exoplayer.upstream.m.d(d0Var, new h0(1, -1, null, 0, null, androidx.media3.common.util.k1.A2(bVar.f65177j), androidx.media3.common.util.k1.A2(this.f65141j3)), iOException, i10));
        if (jD == -9223372036854775807L) {
            cVarI = androidx.media3.exoplayer.upstream.o.f66131l;
            bVar2 = bVar;
        } else {
            int iP = P();
            bVar2 = bVar;
            cVarI = N(bVar2, iP) ? androidx.media3.exoplayer.upstream.o.i(iP > this.f65162u3, jD) : androidx.media3.exoplayer.upstream.o.f66130k;
        }
        boolean zC = cVarI.c();
        this.f65132e.r(d0Var, 1, -1, null, 0, null, bVar2.f65177j, this.f65141j3, iOException, !zC);
        if (!zC) {
            this.f65131d.b(bVar2.f65168a);
        }
        return cVarI;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        return this.f65148n.k() && this.f65158s.e();
    }

    @Override // androidx.media3.exoplayer.upstream.o.b
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void q(b bVar, long j10, long j11, int i10) {
        androidx.media3.datasource.p1 p1Var = bVar.f65170c;
        this.f65132e.x(i10 == 0 ? new d0(bVar.f65168a, bVar.f65178k, j10) : new d0(bVar.f65168a, bVar.f65178k, p1Var.v(), p1Var.w(), j10, j11, p1Var.u()), 1, -1, null, 0, null, bVar.f65177j, this.f65141j3, i10);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        return b();
    }

    int f0(int i10, p3 p3Var, androidx.media3.decoder.g gVar, int i11) {
        if (l0()) {
            return -3;
        }
        V(i10);
        int iV = this.Z[i10].V(p3Var, gVar, i11, this.f65164v3);
        if (iV == -3) {
            W(i10);
        }
        return iV;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        M();
        if (!this.f65139i3.S1()) {
            return 0L;
        }
        androidx.media3.extractor.p0.a aVarR1 = this.f65139i3.R1(j10);
        return f5Var.a(j10, aVarR1.f68280a.f68289a, aVarR1.f68281b.f68289a);
    }

    public void g0() {
        if (this.H1) {
            for (r1 r1Var : this.Z) {
                r1Var.U();
            }
        }
        this.f65148n.m(this);
        this.f65165w.removeCallbacksAndMessages(null);
        this.X = null;
        this.f65166w3 = true;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        M();
        boolean[] zArr = this.f65137h3.f65187b;
        if (!this.f65139i3.S1()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f65149n3 = false;
        boolean z10 = this.f65157r3 == j10;
        this.f65157r3 = j10;
        if (S()) {
            this.f65159s3 = j10;
            return j10;
        }
        if (this.f65145l3 == 7 || ((!this.f65164v3 && !this.f65148n.k()) || !h0(zArr, j10, z10))) {
            this.f65161t3 = false;
            this.f65159s3 = j10;
            this.f65164v3 = false;
            this.f65151o3 = false;
            if (this.f65148n.k()) {
                r1[] r1VarArr = this.Z;
                int length = r1VarArr.length;
                while (i10 < length) {
                    r1VarArr[i10].t();
                    i10++;
                }
                this.f65148n.g();
                return j10;
            }
            this.f65148n.h();
            r1[] r1VarArr2 = this.Z;
            int length2 = r1VarArr2.length;
            while (i10 < length2) {
                r1VarArr2[i10].Y();
                i10++;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        if (this.f65151o3) {
            this.f65151o3 = false;
            return this.f65157r3;
        }
        if (!this.f65149n3) {
            return -9223372036854775807L;
        }
        if (!this.f65164v3 && P() <= this.f65162u3) {
            return -9223372036854775807L;
        }
        this.f65149n3 = false;
        return this.f65157r3;
    }

    @Override // androidx.media3.exoplayer.upstream.o.f
    public void j() {
        for (r1 r1Var : this.Z) {
            r1Var.W();
        }
        this.f65150o.release();
    }

    int j0(int i10, long j10) throws Throwable {
        if (l0()) {
            return 0;
        }
        V(i10);
        r1 r1Var = this.Z[i10];
        int I = r1Var.I(j10, this.f65164v3);
        r1Var.h0(I);
        if (I == 0) {
            W(i10);
        }
        return I;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        if (this.f65164v3 || this.f65148n.j() || this.f65161t3) {
            return false;
        }
        if ((this.H1 || this.f65144l != null) && this.f65155p3 == 0) {
            return false;
        }
        boolean zF = this.f65158s.f();
        if (this.f65148n.k()) {
            return zF;
        }
        k0();
        return true;
    }

    @Override // androidx.media3.extractor.t
    public void l() {
        this.f65153p1 = true;
        this.f65165w.post(this.f65160t);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        M();
        return this.f65137h3.f65186a;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() throws IOException {
        X();
        if (this.f65164v3 && !this.H1) {
            throw androidx.media3.common.v0.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
        if (this.f65135g3) {
            return;
        }
        M();
        if (S()) {
            return;
        }
        boolean[] zArr = this.f65137h3.f65188c;
        int length = this.Z.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.Z[i10].s(j10, z10, zArr[i10]);
        }
    }

    @Override // androidx.media3.exoplayer.source.r1.d
    public void r(androidx.media3.common.w wVar) {
        this.f65165w.post(this.f65160t);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        androidx.media3.exoplayer.trackselection.c0 c0Var;
        M();
        f fVar = this.f65137h3;
        h2 h2Var = fVar.f65186a;
        boolean[] zArr3 = fVar.f65188c;
        int i10 = this.f65155p3;
        int i11 = 0;
        for (int i12 = 0; i12 < c0VarArr.length; i12++) {
            s1 s1Var = s1VarArr[i12];
            if (s1Var != null && (c0VarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) s1Var).f65182a;
                androidx.media3.common.util.a.i(zArr3[i13]);
                this.f65155p3--;
                zArr3[i13] = false;
                s1VarArr[i12] = null;
            }
        }
        if (this.f65147m3) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (j10 == 0 || this.f65135g3) {
            z10 = false;
        } else {
            z10 = true;
        }
        for (int i14 = 0; i14 < c0VarArr.length; i14++) {
            if (s1VarArr[i14] == null && (c0Var = c0VarArr[i14]) != null) {
                androidx.media3.common.util.a.i(c0Var.length() == 1);
                androidx.media3.common.util.a.i(c0Var.b(0) == 0);
                int iE = h2Var.e(c0Var.g());
                androidx.media3.common.util.a.i(!zArr3[iE]);
                this.f65155p3++;
                zArr3[iE] = true;
                this.f65151o3 = c0Var.k().f61767u | this.f65151o3;
                s1VarArr[i14] = new d(iE);
                zArr2[i14] = true;
                if (!z10) {
                    r1 r1Var = this.Z[iE];
                    z10 = (r1Var.G() == 0 || r1Var.c0(j10, true)) ? false : true;
                }
            }
        }
        if (this.f65155p3 == 0) {
            this.f65161t3 = false;
            this.f65149n3 = false;
            this.f65151o3 = false;
            if (this.f65148n.k()) {
                r1[] r1VarArr = this.Z;
                int length = r1VarArr.length;
                while (i11 < length) {
                    r1VarArr[i11].t();
                    i11++;
                }
                this.f65148n.g();
            } else {
                this.f65164v3 = false;
                r1[] r1VarArr2 = this.Z;
                int length2 = r1VarArr2.length;
                while (i11 < length2) {
                    r1VarArr2[i11].Y();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = h(j10);
            while (i11 < s1VarArr.length) {
                if (s1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f65147m3 = true;
        return j10;
    }

    @Override // androidx.media3.extractor.t
    public void u(final androidx.media3.extractor.p0 p0Var) {
        this.f65165w.post(new Runnable() { // from class: androidx.media3.exoplayer.source.k1
            @Override // java.lang.Runnable
            public final void run() {
                this.f65090a.i0(p0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        this.X = aVar;
        if (this.f65144l == null) {
            this.f65158s.f();
            k0();
        } else {
            a(this.f65142k, 3).e(this.f65144l);
            i0(new androidx.media3.extractor.j0(new long[]{0}, new long[]{0}, -9223372036854775807L));
            l();
            this.f65159s3 = j10;
        }
    }
}
