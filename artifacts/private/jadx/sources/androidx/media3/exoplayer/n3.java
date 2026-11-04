package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.common.collect.l6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class n3 implements Handler.Callback, androidx.media3.exoplayer.source.s0.a, androidx.media3.exoplayer.trackselection.k0.b, r4.d, n.a, w4.a, androidx.media3.exoplayer.h.b {
    private static final String K3 = "ExoPlayerImplInternal";
    private static final int L3 = 1;
    private static final int M3 = 2;
    private static final int N3 = 3;
    private static final int O3 = 4;
    private static final int P3 = 5;
    private static final int Q3 = 6;
    private static final int R3 = 7;
    private static final int S3 = 8;
    private static final int T3 = 9;
    private static final int U3 = 10;
    private static final int V3 = 11;
    private static final int W3 = 12;
    private static final int X3 = 13;
    private static final int Y3 = 14;
    private static final int Z3 = 15;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f64240a4 = 16;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f64241b4 = 17;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f64242c4 = 18;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final int f64243d4 = 19;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final int f64244e4 = 20;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final int f64245f4 = 21;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final int f64246g4 = 22;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final int f64247h4 = 23;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final int f64248i4 = 25;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final int f64249j4 = 26;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final int f64250k4 = 27;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final int f64251l4 = 28;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f64252m4 = 29;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f64253n4 = 30;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final int f64254o4 = 31;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final int f64255p4 = 32;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final int f64256q4 = 33;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final int f64257r4 = 34;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final long f64258s4 = androidx.media3.common.util.k1.A2(10000);

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final long f64259t4 = 1000;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final long f64260u4 = 4000;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final long f64261v4 = 500000;
    private int A3;
    private boolean B3;

    @androidx.annotation.p0
    private s0 C3;
    private long D3;
    private ExoPlayer.c F3;
    private final androidx.media3.exoplayer.analytics.a H1;
    private boolean I3;
    private final r4 X;
    private final r3 Y;
    private final long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d5[] f64262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a5[] f64263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f64264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.trackselection.k0 f64265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.exoplayer.trackselection.l0 f64266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s3 f64267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.d f64268g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final boolean f64269g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.common.util.u f64270h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final androidx.media3.exoplayer.h f64271h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v4 f64272i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private f5 f64273i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f64274j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private u4 f64275j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media3.common.z3.d f64276k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private e f64277k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.common.z3.b f64278l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f64279l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f64280m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f64281m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f64282n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f64283n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n f64284o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f64285o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final androidx.media3.exoplayer.analytics.j4 f64286p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final boolean f64287p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final androidx.media3.common.util.u f64288p2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f64290q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f64291r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<d> f64292s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean f64293s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.media3.common.util.j f64294t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f64295t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f64296u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f64297v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f64298v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c4 f64299w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f64300w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.annotation.p0
    private h f64301x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private long f64302y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private long f64303z3;
    private long H3 = -9223372036854775807L;
    private float J3 = 1.0f;
    private long E3 = -9223372036854775807L;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private long f64289p3 = -9223372036854775807L;
    private androidx.media3.common.z3 G3 = androidx.media3.common.z3.f61958a;

    class a implements z4.c {
        a() {
        }

        @Override // androidx.media3.exoplayer.z4.c
        public void a() {
            n3.this.f64296u3 = true;
        }

        @Override // androidx.media3.exoplayer.z4.c
        public void b() {
            if (!n3.this.f64287p1 && !n3.this.f64298v3) {
                return;
            }
            n3.this.f64270h.i(2);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<r4.c> f64305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.u1 f64306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f64307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f64308d;

        /* synthetic */ b(List list, androidx.media3.exoplayer.source.u1 u1Var, int i10, long j10, a aVar) {
            this(list, u1Var, i10, j10);
        }

        private b(List<r4.c> list, androidx.media3.exoplayer.source.u1 u1Var, int i10, long j10) {
            this.f64305a = list;
            this.f64306b = u1Var;
            this.f64307c = i10;
            this.f64308d = j10;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f64311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.u1 f64312d;

        public c(int i10, int i11, int i12, androidx.media3.exoplayer.source.u1 u1Var) {
            this.f64309a = i10;
            this.f64310b = i11;
            this.f64311c = i12;
            this.f64312d = u1Var;
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w4 f64313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f64315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f64316d;

        public d(w4 w4Var) {
            this.f64313a = w4Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f64316d;
            if ((obj == null) != (dVar.f64316d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f64314b - dVar.f64314b;
            return i10 != 0 ? i10 : androidx.media3.common.util.k1.u(this.f64315c, dVar.f64315c);
        }

        public void c(int i10, long j10, Object obj) {
            this.f64314b = i10;
            this.f64315c = j10;
            this.f64316d = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f64317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u4 f64318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f64320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f64321e;

        public e(u4 u4Var) {
            this.f64318b = u4Var;
        }

        public void b(int i10) {
            this.f64317a |= i10 > 0;
            this.f64319c += i10;
        }

        public void c(u4 u4Var) {
            this.f64317a |= this.f64318b != u4Var;
            this.f64318b = u4Var;
        }

        public void d(int i10) {
            if (this.f64320d && this.f64321e != 5) {
                androidx.media3.common.util.a.a(i10 == 5);
                return;
            }
            this.f64317a = true;
            this.f64320d = true;
            this.f64321e = i10;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.t0.b f64322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f64324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f64325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f64326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f64327f;

        public g(androidx.media3.exoplayer.source.t0.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f64322a = bVar;
            this.f64323b = j10;
            this.f64324c = j11;
            this.f64325d = z10;
            this.f64326e = z11;
            this.f64327f = z12;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.z3 f64328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f64330c;

        public h(androidx.media3.common.z3 z3Var, int i10, long j10) {
            this.f64328a = z3Var;
            this.f64329b = i10;
            this.f64330c = j10;
        }
    }

    public n3(Context context, z4[] z4VarArr, z4[] z4VarArr2, androidx.media3.exoplayer.trackselection.k0 k0Var, androidx.media3.exoplayer.trackselection.l0 l0Var, s3 s3Var, androidx.media3.exoplayer.upstream.d dVar, int i10, boolean z10, androidx.media3.exoplayer.analytics.a aVar, f5 f5Var, r3 r3Var, long j10, boolean z11, boolean z12, Looper looper, androidx.media3.common.util.j jVar, f fVar, androidx.media3.exoplayer.analytics.j4 j4Var, @androidx.annotation.p0 v4 v4Var, ExoPlayer.c cVar) {
        this.f64297v = fVar;
        this.f64265d = k0Var;
        this.f64266e = l0Var;
        this.f64267f = s3Var;
        this.f64268g = dVar;
        this.f64291r3 = i10;
        this.f64293s3 = z10;
        this.f64273i3 = f5Var;
        this.Y = r3Var;
        this.Z = j10;
        this.D3 = j10;
        this.f64281m3 = z11;
        this.f64287p1 = z12;
        this.f64294t = jVar;
        this.f64286p0 = j4Var;
        this.F3 = cVar;
        this.H1 = aVar;
        this.f64280m = s3Var.m(j4Var);
        this.f64282n = s3Var.u(j4Var);
        u4 u4VarK = u4.k(l0Var);
        this.f64275j3 = u4VarK;
        this.f64277k3 = new e(u4VarK);
        this.f64263b = new a5[z4VarArr.length];
        this.f64264c = new boolean[z4VarArr.length];
        a5.f fVarD = k0Var.d();
        this.f64262a = new d5[z4VarArr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < z4VarArr.length; i11++) {
            z4VarArr[i11].J(i11, j4Var, jVar);
            this.f64263b[i11] = z4VarArr[i11].p();
            if (fVarD != null) {
                this.f64263b[i11].Q(fVarD);
            }
            z4 z4Var = z4VarArr2[i11];
            if (z4Var != null) {
                z4Var.J(z4VarArr.length + i11, j4Var, jVar);
                z13 = true;
            }
            this.f64262a[i11] = new d5(z4VarArr[i11], z4VarArr2[i11], i11);
        }
        this.f64269g3 = z13;
        this.f64284o = new n(this, jVar);
        this.f64292s = new ArrayList<>();
        this.f64276k = new androidx.media3.common.z3.d();
        this.f64278l = new androidx.media3.common.z3.b();
        k0Var.e(this, dVar);
        this.B3 = true;
        androidx.media3.common.util.u uVarD = jVar.d(looper, null);
        this.f64288p2 = uVarD;
        this.f64299w = new c4(aVar, uVarD, new z3.a() { // from class: androidx.media3.exoplayer.k3
            @Override // androidx.media3.exoplayer.z3.a
            public final z3 a(a4 a4Var, long j11) {
                return this.f63953a.w(a4Var, j11);
            }
        }, cVar);
        this.X = new r4(this, aVar, uVarD, j4Var);
        v4 v4Var2 = v4Var == null ? new v4() : v4Var;
        this.f64272i = v4Var2;
        Looper looperA = v4Var2.a();
        this.f64274j = looperA;
        this.f64270h = jVar.d(looperA, this);
        this.f64271h3 = new androidx.media3.exoplayer.h(context, looperA, this);
    }

    private void A() throws s0 {
        for (int i10 = 0; i10 < this.f64262a.length; i10++) {
            z(i10);
        }
        this.H3 = -9223372036854775807L;
    }

    private void A1(int i10) {
        u4 u4Var = this.f64275j3;
        if (u4Var.f65821e != i10) {
            if (i10 != 2) {
                this.E3 = -9223372036854775807L;
            }
            this.f64275j3 = u4Var.h(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0191  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x0146 A[EDGE_INSN: B:134:0x0146->B:84:0x0146 BREAK  A[LOOP:1: B:78:0x0133->B:83:0x0143], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138  */
    /* JADX WARN: Code duplicated, block: B:82:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c  */
    private void B() throws s0, IOException {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        boolean z14;
        u4 u4Var;
        int i10;
        int i11;
        d5[] d5VarArr;
        u4 u4Var2;
        long jC = this.f64294t.c();
        this.f64270h.k(2);
        S1();
        int i12 = this.f64275j3.f65821e;
        if (i12 == 1 || i12 == 4) {
            return;
        }
        z3 z3VarU = this.f64299w.u();
        if (z3VarU == null) {
            S0(jC);
            return;
        }
        androidx.media3.common.util.z0.a("doSomeWork");
        X1();
        if (z3VarU.f66956f) {
            this.f64303z3 = androidx.media3.common.util.k1.D1(this.f64294t.b());
            z3VarU.f66951a.p(this.f64275j3.f65835s - this.f64280m, this.f64282n);
            z10 = true;
            z11 = true;
            int i13 = 0;
            while (true) {
                d5[] d5VarArr2 = this.f64262a;
                if (i13 >= d5VarArr2.length) {
                    break;
                }
                d5 d5Var = d5VarArr2[i13];
                if (d5Var.h() == 0) {
                    k0(i13, false);
                } else {
                    d5Var.I(this.f64302y3, this.f64303z3);
                    z10 = z10 && d5Var.t();
                    boolean zA = d5Var.a(z3VarU);
                    k0(i13, zA);
                    z11 = z11 && zA;
                    if (!zA) {
                        j0(i13);
                    }
                }
                i13++;
            }
        } else {
            z3VarU.f66951a.o();
            z10 = true;
            z11 = true;
        }
        long j11 = z3VarU.f66958h.f62783e;
        if (z10 && z3VarU.f66956f) {
            if (j11 != -9223372036854775807L) {
                j10 = -9223372036854775807L;
                if (j11 <= this.f64275j3.f65835s) {
                }
                if (z12 && this.f64283n3) {
                    this.f64283n3 = false;
                    n1(false, this.f64275j3.f65830n, false, 5);
                }
                if (!z12 && z3VarU.f66958h.f62788j) {
                    A1(4);
                    N1();
                } else if (this.f64275j3.f65821e != 2 && I1(z11)) {
                    A1(3);
                    this.C3 = null;
                    if (H1()) {
                        a2(false, false);
                        this.f64284o.f();
                        K1();
                    }
                } else if (this.f64275j3.f65821e == 3 && (this.f64300w3 != 0 ? !z11 : !c0())) {
                    a2(H1(), false);
                    A1(2);
                    if (this.f64285o3) {
                        y0();
                        this.Y.d();
                    }
                    N1();
                }
                if (this.f64275j3.f65821e == 2) {
                    i11 = 0;
                    while (true) {
                        d5VarArr = this.f64262a;
                        if (i11 >= d5VarArr.length) {
                            break;
                        }
                        if (d5VarArr[i11].w(z3VarU)) {
                            j0(i11);
                        }
                        i11++;
                    }
                    u4Var2 = this.f64275j3;
                    if (!u4Var2.f65823g || u4Var2.f65834r >= f64261v4 || !b0(this.f64299w.n()) || !H1()) {
                        this.E3 = j10;
                    } else if (this.E3 == j10) {
                        this.E3 = this.f64294t.b();
                    } else if (this.f64294t.b() - this.E3 >= f64260u4) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                } else {
                    this.E3 = j10;
                }
                if (H1() || this.f64275j3.f65821e != 3) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                z14 = !this.f64298v3 && this.f64296u3 && z13;
                u4Var = this.f64275j3;
                if (u4Var.f65832p != z14) {
                    this.f64275j3 = u4Var.i(z14);
                }
                this.f64296u3 = false;
                if (!z14 && (i10 = this.f64275j3.f65821e) != 4 && (z13 || i10 == 2 || (i10 == 3 && this.f64300w3 != 0))) {
                    S0(jC);
                }
                androidx.media3.common.util.z0.b();
            }
            j10 = -9223372036854775807L;
            z12 = true;
            if (z12) {
                this.f64283n3 = false;
                n1(false, this.f64275j3.f65830n, false, 5);
            }
            if (!z12) {
                if (this.f64275j3.f65821e != 2) {
                    if (this.f64275j3.f65821e == 3) {
                        a2(H1(), false);
                        A1(2);
                        if (this.f64285o3) {
                            y0();
                            this.Y.d();
                        }
                        N1();
                    }
                } else if (this.f64275j3.f65821e == 3) {
                    a2(H1(), false);
                    A1(2);
                    if (this.f64285o3) {
                        y0();
                        this.Y.d();
                    }
                    N1();
                }
            } else if (this.f64275j3.f65821e != 2) {
                if (this.f64275j3.f65821e == 3) {
                    a2(H1(), false);
                    A1(2);
                    if (this.f64285o3) {
                        y0();
                        this.Y.d();
                    }
                    N1();
                }
            } else if (this.f64275j3.f65821e == 3) {
                a2(H1(), false);
                A1(2);
                if (this.f64285o3) {
                    y0();
                    this.Y.d();
                }
                N1();
            }
            if (this.f64275j3.f65821e == 2) {
                i11 = 0;
                while (true) {
                    d5VarArr = this.f64262a;
                    if (i11 >= d5VarArr.length) {
                        break;
                        break;
                    } else {
                        if (d5VarArr[i11].w(z3VarU)) {
                            j0(i11);
                        }
                        i11++;
                    }
                }
                u4Var2 = this.f64275j3;
                if (!u4Var2.f65823g) {
                    this.E3 = j10;
                } else {
                    this.E3 = j10;
                }
            } else {
                this.E3 = j10;
            }
            if (H1()) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (this.f64298v3) {
            }
            u4Var = this.f64275j3;
            if (u4Var.f65832p != z14) {
                this.f64275j3 = u4Var.i(z14);
            }
            this.f64296u3 = false;
            if (!z14) {
                S0(jC);
            }
            androidx.media3.common.util.z0.b();
        }
        j10 = -9223372036854775807L;
        z12 = false;
        if (z12) {
            this.f64283n3 = false;
            n1(false, this.f64275j3.f65830n, false, 5);
        }
        if (!z12) {
            if (this.f64275j3.f65821e != 2) {
                if (this.f64275j3.f65821e == 3) {
                    a2(H1(), false);
                    A1(2);
                    if (this.f64285o3) {
                        y0();
                        this.Y.d();
                    }
                    N1();
                }
            } else if (this.f64275j3.f65821e == 3) {
                a2(H1(), false);
                A1(2);
                if (this.f64285o3) {
                    y0();
                    this.Y.d();
                }
                N1();
            }
        } else if (this.f64275j3.f65821e != 2) {
            if (this.f64275j3.f65821e == 3) {
                a2(H1(), false);
                A1(2);
                if (this.f64285o3) {
                    y0();
                    this.Y.d();
                }
                N1();
            }
        } else if (this.f64275j3.f65821e == 3) {
            a2(H1(), false);
            A1(2);
            if (this.f64285o3) {
                y0();
                this.Y.d();
            }
            N1();
        }
        if (this.f64275j3.f65821e == 2) {
            i11 = 0;
            while (true) {
                d5VarArr = this.f64262a;
                if (i11 >= d5VarArr.length) {
                    break;
                    break;
                } else {
                    if (d5VarArr[i11].w(z3VarU)) {
                        j0(i11);
                    }
                    i11++;
                }
            }
            u4Var2 = this.f64275j3;
            if (!u4Var2.f65823g) {
                this.E3 = j10;
            } else {
                this.E3 = j10;
            }
        } else {
            this.E3 = j10;
        }
        if (H1()) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (this.f64298v3) {
        }
        u4Var = this.f64275j3;
        if (u4Var.f65832p != z14) {
            this.f64275j3 = u4Var.i(z14);
        }
        this.f64296u3 = false;
        if (!z14) {
            S0(jC);
        }
        androidx.media3.common.util.z0.b();
    }

    private void B0() throws s0 {
        this.f64277k3.b(1);
        J0(false, false, false, true);
        this.f64267f.h(this.f64286p0);
        A1(this.f64275j3.f65817a.w() ? 4 : 2);
        U1();
        this.X.y(this.f64268g.e());
        this.f64270h.i(2);
    }

    private void C(z3 z3Var, int i10, boolean z10, long j10) throws s0 {
        d5 d5Var = this.f64262a[i10];
        if (d5Var.x()) {
            return;
        }
        boolean z11 = z3Var == this.f64299w.u();
        androidx.media3.exoplayer.trackselection.l0 l0VarP = z3Var.p();
        c5 c5Var = l0VarP.f65719b[i10];
        androidx.media3.exoplayer.trackselection.c0 c0Var = l0VarP.f65720c[i10];
        boolean z12 = H1() && this.f64275j3.f65821e == 3;
        boolean z13 = !z10 && z12;
        this.f64300w3++;
        d5Var.e(c5Var, c0Var, z3Var.f66953c[i10], this.f64302y3, z13, z11, j10, z3Var.m(), z3Var.f66958h.f62779a, this.f64284o);
        d5Var.n(11, new a(), z3Var);
        if (z12 && z11) {
            d5Var.U();
        }
    }

    private void C1(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 AtomicBoolean atomicBoolean) throws s0 {
        for (d5 d5Var : this.f64262a) {
            d5Var.S(obj);
        }
        int i10 = this.f64275j3.f65821e;
        if (i10 == 3 || i10 == 2) {
            this.f64270h.i(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                try {
                    atomicBoolean.set(true);
                    notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void D() throws s0 {
        E(new boolean[this.f64262a.length], this.f64299w.y().n());
    }

    private void D0() {
        try {
            J0(true, false, true, false);
            E0();
            this.f64267f.r(this.f64286p0);
            this.f64271h3.i();
            this.f64265d.j();
            A1(1);
            this.f64272i.b();
            synchronized (this) {
                try {
                    this.f64279l3 = true;
                    notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.f64272i.b();
            synchronized (this) {
                try {
                    this.f64279l3 = true;
                    notifyAll();
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private void E(boolean[] zArr, long j10) throws s0 {
        n3 n3Var;
        long j11;
        z3 z3VarY = this.f64299w.y();
        androidx.media3.exoplayer.trackselection.l0 l0VarP = z3VarY.p();
        for (int i10 = 0; i10 < this.f64262a.length; i10++) {
            if (!l0VarP.c(i10)) {
                this.f64262a[i10].L();
            }
        }
        int i11 = 0;
        while (i11 < this.f64262a.length) {
            if (!l0VarP.c(i11) || this.f64262a[i11].w(z3VarY)) {
                n3Var = this;
                j11 = j10;
            } else {
                n3Var = this;
                j11 = j10;
                n3Var.C(z3VarY, i11, zArr[i11], j11);
            }
            i11++;
            this = n3Var;
            j10 = j11;
        }
    }

    private void E0() {
        for (int i10 = 0; i10 < this.f64262a.length; i10++) {
            this.f64263b[i10].G();
            this.f64262a[i10].H();
        }
    }

    private void E1(float f10) throws s0 {
        this.J3 = f10;
        float fG = f10 * this.f64271h3.g();
        for (d5 d5Var : this.f64262a) {
            d5Var.T(fG);
        }
    }

    private void F0(int i10, int i11, androidx.media3.exoplayer.source.u1 u1Var) throws Throwable {
        this.f64277k3.b(1);
        U(this.X.C(i10, i11, u1Var), false);
    }

    private boolean F1() {
        z3 z3VarU;
        z3 z3VarK;
        return H1() && !this.f64283n3 && (z3VarU = this.f64299w.u()) != null && (z3VarK = z3VarU.k()) != null && this.f64302y3 >= z3VarK.n() && z3VarK.f66959i;
    }

    private l6<androidx.media3.common.r0> G(androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        l6.a aVar = new l6.a();
        boolean z10 = false;
        for (androidx.media3.exoplayer.trackselection.c0 c0Var : c0VarArr) {
            if (c0Var != null) {
                androidx.media3.common.r0 r0Var = c0Var.l(0).f61758l;
                if (r0Var == null) {
                    aVar.a(new androidx.media3.common.r0(new androidx.media3.common.r0.a[0]));
                } else {
                    aVar.a(r0Var);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.e() : l6.F();
    }

    private boolean G1() {
        if (!b0(this.f64299w.n())) {
            return false;
        }
        z3 z3VarN = this.f64299w.n();
        long jN = N(z3VarN.l());
        s3.a aVar = new s3.a(this.f64286p0, this.f64275j3.f65817a, z3VarN.f66958h.f62779a, z3VarN == this.f64299w.u() ? z3VarN.C(this.f64302y3) : z3VarN.C(this.f64302y3) - z3VarN.f66958h.f62780b, jN, this.f64284o.c().f61874a, this.f64275j3.f65828l, this.f64285o3, J1(this.f64275j3.f65817a, z3VarN.f66958h.f62779a) ? this.Y.c() : -9223372036854775807L, this.f64289p3);
        boolean zJ = this.f64267f.j(aVar);
        z3 z3VarU = this.f64299w.u();
        if (zJ || !z3VarU.f66956f || jN >= f64261v4 || (this.f64280m <= 0 && !this.f64282n)) {
            return zJ;
        }
        z3VarU.f66951a.p(this.f64275j3.f65835s, false);
        return this.f64267f.j(aVar);
    }

    private long H() {
        u4 u4Var = this.f64275j3;
        return I(u4Var.f65817a, u4Var.f65818b.f65467a, u4Var.f65835s);
    }

    private void H0() throws s0 {
        float f10 = this.f64284o.c().f61874a;
        z3 z3VarY = this.f64299w.y();
        androidx.media3.exoplayer.trackselection.l0 l0Var = null;
        boolean z10 = true;
        for (z3 z3VarU = this.f64299w.u(); z3VarU != null && z3VarU.f66956f; z3VarU = z3VarU.k()) {
            u4 u4Var = this.f64275j3;
            androidx.media3.exoplayer.trackselection.l0 l0VarZ = z3VarU.z(f10, u4Var.f65817a, u4Var.f65828l);
            if (z3VarU == this.f64299w.u()) {
                l0Var = l0VarZ;
            }
            if (!l0VarZ.a(z3VarU.p())) {
                if (z10) {
                    z3 z3VarU2 = this.f64299w.u();
                    boolean z11 = (this.f64299w.N(z3VarU2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f64262a.length];
                    long jB = z3VarU2.b((androidx.media3.exoplayer.trackselection.l0) androidx.media3.common.util.a.g(l0Var), this.f64275j3.f65835s, z11, zArr);
                    u4 u4Var2 = this.f64275j3;
                    boolean z12 = (u4Var2.f65821e == 4 || jB == u4Var2.f65835s) ? false : true;
                    u4 u4Var3 = this.f64275j3;
                    this.f64275j3 = Y(u4Var3.f65818b, jB, u4Var3.f65819c, u4Var3.f65820d, z12, 5);
                    if (z12) {
                        L0(jB);
                    }
                    y();
                    boolean[] zArr2 = new boolean[this.f64262a.length];
                    int i10 = 0;
                    while (true) {
                        d5[] d5VarArr = this.f64262a;
                        if (i10 >= d5VarArr.length) {
                            break;
                        }
                        int iH = d5VarArr[i10].h();
                        zArr2[i10] = this.f64262a[i10].x();
                        this.f64262a[i10].B(z3VarU2.f66953c[i10], this.f64284o, this.f64302y3, zArr[i10]);
                        if (iH - this.f64262a[i10].h() > 0) {
                            k0(i10, false);
                        }
                        this.f64300w3 -= iH - this.f64262a[i10].h();
                        i10++;
                    }
                    E(zArr2, this.f64302y3);
                    z3VarU2.f66959i = true;
                } else {
                    this.f64299w.N(z3VarU);
                    if (z3VarU.f66956f) {
                        long jMax = Math.max(z3VarU.f66958h.f62780b, z3VarU.C(this.f64302y3));
                        if (this.f64269g3 && t() && this.f64299w.x() == z3VarU) {
                            y();
                        }
                        z3VarU.a(l0VarZ, jMax, false);
                    }
                }
                S(true);
                if (this.f64275j3.f65821e != 4) {
                    e0();
                    X1();
                    this.f64270h.i(2);
                    return;
                }
                return;
            }
            if (z3VarU == z3VarY) {
                z10 = false;
            }
        }
    }

    private boolean H1() {
        u4 u4Var = this.f64275j3;
        return u4Var.f65828l && u4Var.f65830n == 0;
    }

    private long I(androidx.media3.common.z3 z3Var, Object obj, long j10) {
        z3Var.t(z3Var.l(obj, this.f64278l).f61969c, this.f64276k);
        androidx.media3.common.z3.d dVar = this.f64276k;
        if (dVar.f61993f != -9223372036854775807L && dVar.i()) {
            androidx.media3.common.z3.d dVar2 = this.f64276k;
            if (dVar2.f61996i) {
                return androidx.media3.common.util.k1.D1(dVar2.b() - this.f64276k.f61993f) - (j10 + this.f64278l.q());
            }
        }
        return -9223372036854775807L;
    }

    private void I0() throws s0 {
        H0();
        U0(true);
    }

    private boolean I1(boolean z10) {
        if (this.f64300w3 == 0) {
            return c0();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f64275j3.f65823g) {
            return true;
        }
        z3 z3VarU = this.f64299w.u();
        long jC = J1(this.f64275j3.f65817a, z3VarU.f66958h.f62779a) ? this.Y.c() : -9223372036854775807L;
        z3 z3VarN = this.f64299w.n();
        boolean z12 = z3VarN.s() && z3VarN.f66958h.f62788j;
        if (z3VarN.f66958h.f62779a.c() && !z3VarN.f66956f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f64267f.n(new s3.a(this.f64286p0, this.f64275j3.f65817a, z3VarU.f66958h.f62779a, z3VarU.C(this.f64302y3), N(z3VarN.j()), this.f64284o.c().f61874a, this.f64275j3.f65828l, this.f64285o3, jC, this.f64289p3));
    }

    private long J(z3 z3Var) {
        if (z3Var == null) {
            return 0L;
        }
        long jM = z3Var.m();
        if (!z3Var.f66956f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            d5[] d5VarArr = this.f64262a;
            if (i10 >= d5VarArr.length) {
                return jM;
            }
            if (d5VarArr[i10].w(z3Var)) {
                long jK = this.f64262a[i10].k(z3Var);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094 A[PHI: r2 r6 r8
      0x0094: PHI (r2v2 androidx.media3.exoplayer.source.t0$b) = (r2v1 androidx.media3.exoplayer.source.t0$b), (r2v12 androidx.media3.exoplayer.source.t0$b) binds: [B:23:0x006a, B:25:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r6v4 long) = (r6v3 long), (r6v11 long) binds: [B:23:0x006a, B:25:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r8v2 long) = (r8v1 long), (r8v8 long) binds: [B:23:0x006a, B:25:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc A[PHI: r0
      0x00dc: PHI (r0v11 androidx.media3.common.z3) = 
      (r0v10 androidx.media3.common.z3)
      (r0v10 androidx.media3.common.z3)
      (r0v21 androidx.media3.common.z3)
      (r0v21 androidx.media3.common.z3)
     binds: [B:29:0x00a1, B:31:0x00a5, B:33:0x00b6, B:35:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    private void J0(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        androidx.media3.common.z3 z3Var;
        androidx.media3.exoplayer.source.t0.b bVar;
        this.f64270h.k(2);
        this.C3 = null;
        a2(false, true);
        this.f64284o.g();
        this.f64302y3 = c4.f63520s;
        try {
            A();
        } catch (s0 | RuntimeException e10) {
            androidx.media3.common.util.z.e(K3, "Disable failed.", e10);
        }
        if (z10) {
            for (d5 d5Var : this.f64262a) {
                try {
                    d5Var.L();
                } catch (RuntimeException e11) {
                    androidx.media3.common.util.z.e(K3, "Reset failed.", e11);
                }
            }
        }
        this.f64300w3 = 0;
        u4 u4Var = this.f64275j3;
        androidx.media3.exoplayer.source.t0.b bVar2 = u4Var.f65818b;
        long jLongValue = u4Var.f65835s;
        long j10 = (this.f64275j3.f65818b.c() || d0(this.f64275j3, this.f64278l)) ? this.f64275j3.f65819c : this.f64275j3.f65835s;
        if (z11) {
            this.f64301x3 = null;
            Pair<androidx.media3.exoplayer.source.t0.b, Long> pairK = K(this.f64275j3.f65817a);
            bVar2 = (androidx.media3.exoplayer.source.t0.b) pairK.first;
            jLongValue = ((Long) pairK.second).longValue();
            j10 = -9223372036854775807L;
            z14 = bVar2.equals(this.f64275j3.f65818b) ? false : true;
        }
        long j11 = jLongValue;
        long j12 = j10;
        this.f64299w.g();
        this.f64290q3 = false;
        androidx.media3.common.z3 z3VarL = this.f64275j3.f65817a;
        if (z12 && (z3VarL instanceof x4)) {
            z3VarL = ((x4) z3VarL).L(this.X.r());
            if (bVar2.f65468b != -1) {
                z3VarL.l(bVar2.f65467a, this.f64278l);
                if (z3VarL.t(this.f64278l.f61969c, this.f64276k).i()) {
                    z3Var = z3VarL;
                    bVar = new androidx.media3.exoplayer.source.t0.b(bVar2.f65467a, bVar2.f65470d);
                } else {
                    z3Var = z3VarL;
                    bVar = bVar2;
                }
            } else {
                z3Var = z3VarL;
                bVar = bVar2;
            }
        } else {
            z3Var = z3VarL;
            bVar = bVar2;
        }
        u4 u4Var2 = this.f64275j3;
        int i10 = u4Var2.f65821e;
        s0 s0Var = z13 ? null : u4Var2.f65822f;
        androidx.media3.exoplayer.source.h2 h2Var = z14 ? androidx.media3.exoplayer.source.h2.f65074e : u4Var2.f65824h;
        androidx.media3.exoplayer.trackselection.l0 l0Var = z14 ? this.f64266e : u4Var2.f65825i;
        List listF = z14 ? l6.F() : u4Var2.f65826j;
        u4 u4Var3 = this.f64275j3;
        this.f64275j3 = new u4(z3Var, bVar, j12, j11, i10, s0Var, false, h2Var, l0Var, listF, bVar, u4Var3.f65828l, u4Var3.f65829m, u4Var3.f65830n, u4Var3.f65831o, j11, 0L, j11, 0L, false);
        if (z12) {
            this.f64299w.M();
            this.X.A();
        }
    }

    private boolean J1(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar) {
        if (!bVar.c() && !z3Var.w()) {
            z3Var.t(z3Var.l(bVar.f65467a, this.f64278l).f61969c, this.f64276k);
            if (this.f64276k.i()) {
                androidx.media3.common.z3.d dVar = this.f64276k;
                if (dVar.f61996i && dVar.f61993f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private Pair<androidx.media3.exoplayer.source.t0.b, Long> K(androidx.media3.common.z3 z3Var) {
        if (z3Var.w()) {
            return Pair.create(u4.l(), 0L);
        }
        Pair<Object, Long> pairP = z3Var.p(this.f64276k, this.f64278l, z3Var.e(this.f64293s3), -9223372036854775807L);
        androidx.media3.exoplayer.source.t0.b bVarR = this.f64299w.R(z3Var, pairP.first, 0L);
        long jLongValue = ((Long) pairP.second).longValue();
        if (bVarR.c()) {
            z3Var.l(bVarR.f65467a, this.f64278l);
            jLongValue = bVarR.f65469c == this.f64278l.n(bVarR.f65468b) ? this.f64278l.h() : 0L;
        }
        return Pair.create(bVarR, Long.valueOf(jLongValue));
    }

    private void K0() {
        z3 z3VarU = this.f64299w.u();
        this.f64283n3 = z3VarU != null && z3VarU.f66958h.f62787i && this.f64281m3;
    }

    private void K1() throws s0 {
        z3 z3VarU = this.f64299w.u();
        if (z3VarU == null) {
            return;
        }
        androidx.media3.exoplayer.trackselection.l0 l0VarP = z3VarU.p();
        for (int i10 = 0; i10 < this.f64262a.length; i10++) {
            if (l0VarP.c(i10)) {
                this.f64262a[i10].U();
            }
        }
    }

    private void L0(long j10) throws s0 {
        z3 z3VarU = this.f64299w.u();
        long jD = z3VarU == null ? j10 + c4.f63520s : z3VarU.D(j10);
        this.f64302y3 = jD;
        this.f64284o.d(jD);
        for (d5 d5Var : this.f64262a) {
            d5Var.M(z3VarU, this.f64302y3);
        }
        w0();
    }

    private long M() {
        return N(this.f64275j3.f65833q);
    }

    private static void M0(androidx.media3.common.z3 z3Var, d dVar, androidx.media3.common.z3.d dVar2, androidx.media3.common.z3.b bVar) {
        int i10 = z3Var.t(z3Var.l(dVar.f64316d, bVar).f61969c, dVar2).f62002o;
        Object obj = z3Var.k(i10, bVar, true).f61968b;
        long j10 = bVar.f61970d;
        dVar.c(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void M1(boolean z10, boolean z11) {
        J0(z10 || !this.f64295t3, false, true, false);
        this.f64277k3.b(z11 ? 1 : 0);
        this.f64267f.s(this.f64286p0);
        this.f64271h3.o(this.f64275j3.f65828l, 1);
        A1(1);
    }

    private long N(long j10) {
        z3 z3VarN = this.f64299w.n();
        if (z3VarN == null) {
            return 0L;
        }
        return Math.max(0L, j10 - z3VarN.C(this.f64302y3));
    }

    private static boolean N0(d dVar, androidx.media3.common.z3 z3Var, androidx.media3.common.z3 z3Var2, int i10, boolean z10, androidx.media3.common.z3.d dVar2, androidx.media3.common.z3.b bVar) {
        Object obj = dVar.f64316d;
        if (obj == null) {
            Pair<Object, Long> pairQ0 = Q0(z3Var, new h(dVar.f64313a.j(), dVar.f64313a.f(), dVar.f64313a.h() == Long.MIN_VALUE ? -9223372036854775807L : androidx.media3.common.util.k1.D1(dVar.f64313a.h())), false, i10, z10, dVar2, bVar);
            if (pairQ0 == null) {
                return false;
            }
            dVar.c(z3Var.f(pairQ0.first), ((Long) pairQ0.second).longValue(), pairQ0.first);
            if (dVar.f64313a.h() == Long.MIN_VALUE) {
                M0(z3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int iF = z3Var.f(obj);
        if (iF == -1) {
            return false;
        }
        if (dVar.f64313a.h() == Long.MIN_VALUE) {
            M0(z3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f64314b = iF;
        z3Var2.l(dVar.f64316d, bVar);
        if (bVar.f61972f && z3Var2.t(bVar.f61969c, dVar2).f62001n == z3Var2.f(dVar.f64316d)) {
            Pair<Object, Long> pairP = z3Var.p(dVar2, bVar, z3Var.l(dVar.f64316d, bVar).f61969c, dVar.f64315c + bVar.q());
            dVar.c(z3Var.f(pairP.first), ((Long) pairP.second).longValue(), pairP.first);
        }
        return true;
    }

    private void N1() throws s0 {
        this.f64284o.g();
        for (d5 d5Var : this.f64262a) {
            d5Var.W();
        }
    }

    private void O(int i10) throws s0 {
        u4 u4Var = this.f64275j3;
        W1(u4Var.f65828l, i10, u4Var.f65830n, u4Var.f65829m);
    }

    private void O0(androidx.media3.common.z3 z3Var, androidx.media3.common.z3 z3Var2) {
        if (z3Var.w() && z3Var2.w()) {
            return;
        }
        int size = this.f64292s.size() - 1;
        while (size >= 0) {
            androidx.media3.common.z3 z3Var3 = z3Var;
            androidx.media3.common.z3 z3Var4 = z3Var2;
            if (!N0(this.f64292s.get(size), z3Var3, z3Var4, this.f64291r3, this.f64293s3, this.f64276k, this.f64278l)) {
                this.f64292s.get(size).f64313a.m(false);
                this.f64292s.remove(size);
            }
            size--;
            z3Var = z3Var3;
            z3Var2 = z3Var4;
        }
        Collections.sort(this.f64292s);
    }

    private void O1() {
        z3 z3VarN = this.f64299w.n();
        boolean z10 = this.f64290q3 || (z3VarN != null && z3VarN.f66951a.d());
        u4 u4Var = this.f64275j3;
        if (z10 != u4Var.f65823g) {
            this.f64275j3 = u4Var.b(z10);
        }
    }

    private void P() throws s0 {
        E1(this.J3);
    }

    private static g P0(androidx.media3.common.z3 z3Var, u4 u4Var, @androidx.annotation.p0 h hVar, c4 c4Var, int i10, boolean z10, androidx.media3.common.z3.d dVar, androidx.media3.common.z3.b bVar) {
        int i11;
        long j10;
        int iE;
        long jLongValue;
        boolean z11;
        boolean z12;
        boolean z13;
        int iE2;
        boolean z14;
        androidx.media3.common.z3 z3Var2;
        androidx.media3.common.z3.b bVar2;
        long j11;
        int i12;
        long jLongValue2;
        int iE3;
        boolean z15;
        boolean z16;
        boolean z17;
        if (z3Var.w()) {
            return new g(u4.l(), 0L, -9223372036854775807L, false, true, false);
        }
        androidx.media3.exoplayer.source.t0.b bVar3 = u4Var.f65818b;
        Object obj = bVar3.f65467a;
        boolean zD0 = d0(u4Var, bVar);
        long jH = (u4Var.f65818b.c() || zD0) ? u4Var.f65819c : u4Var.f65835s;
        if (hVar != null) {
            i11 = -1;
            j10 = -9223372036854775807L;
            Pair<Object, Long> pairQ0 = Q0(z3Var, hVar, true, i10, z10, dVar, bVar);
            if (pairQ0 == null) {
                iE3 = z3Var.e(z10);
                jLongValue2 = jH;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f64330c == -9223372036854775807L) {
                    iE3 = z3Var.l(pairQ0.first, bVar).f61969c;
                    jLongValue2 = jH;
                    z15 = false;
                } else {
                    obj = pairQ0.first;
                    jLongValue2 = ((Long) pairQ0.second).longValue();
                    iE3 = -1;
                    z15 = true;
                }
                z16 = u4Var.f65821e == 4;
                z17 = false;
            }
            iE = iE3;
            jH = jLongValue2;
            z13 = z15;
            z11 = z16;
            z12 = z17;
        } else {
            i11 = -1;
            j10 = -9223372036854775807L;
            if (u4Var.f65817a.w()) {
                iE = z3Var.e(z10);
            } else if (z3Var.f(obj) == -1) {
                int iR0 = R0(dVar, bVar, i10, z10, obj, u4Var.f65817a, z3Var);
                if (iR0 == -1) {
                    iE2 = z3Var.e(z10);
                    z14 = true;
                } else {
                    iE2 = iR0;
                    z14 = false;
                }
                iE = iE2;
                obj = obj;
                jH = jH;
                z12 = z14;
                z11 = false;
                z13 = false;
            } else if (jH == -9223372036854775807L) {
                iE = z3Var.l(obj, bVar).f61969c;
                obj = obj;
            } else if (zD0) {
                u4Var.f65817a.l(bVar3.f65467a, bVar);
                if (u4Var.f65817a.t(bVar.f61969c, dVar).f62001n == u4Var.f65817a.f(bVar3.f65467a)) {
                    Pair<Object, Long> pairP = z3Var.p(dVar, bVar, z3Var.l(obj, bVar).f61969c, bVar.q() + jH);
                    obj = pairP.first;
                    jLongValue = ((Long) pairP.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jH;
                }
                jH = jLongValue;
                iE = -1;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                obj = obj;
                iE = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (iE != i11) {
            bVar2 = bVar;
            Pair<Object, Long> pairP2 = z3Var.p(dVar, bVar2, iE, -9223372036854775807L);
            z3Var2 = z3Var;
            obj = pairP2.first;
            jH = ((Long) pairP2.second).longValue();
            j11 = j10;
        } else {
            z3Var2 = z3Var;
            bVar2 = bVar;
            j11 = jH;
        }
        androidx.media3.exoplayer.source.t0.b bVarR = c4Var.R(z3Var2, obj, jH);
        int i13 = bVarR.f65471e;
        boolean z18 = bVar3.f65467a.equals(obj) && !bVar3.c() && !bVarR.c() && (i13 == i11 || ((i12 = bVar3.f65471e) != i11 && i13 >= i12));
        long j12 = j11;
        androidx.media3.exoplayer.source.t0.b bVar4 = bVarR;
        boolean zA0 = a0(zD0, bVar3, jH, bVar4, z3Var2.l(obj, bVar2), j12);
        if (z18 || zA0) {
            bVar4 = bVar3;
        }
        if (bVar4.c()) {
            if (bVar4.equals(bVar3)) {
                jH = u4Var.f65835s;
            } else {
                z3Var2.l(bVar4.f65467a, bVar2);
                jH = bVar4.f65469c == bVar2.n(bVar4.f65468b) ? bVar2.h() : 0L;
            }
        }
        return new g(bVar4, jH, j12, z11, z12, z13);
    }

    private void P1(androidx.media3.exoplayer.source.t0.b bVar, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.l0 l0Var) {
        z3 z3Var = (z3) androidx.media3.common.util.a.g(this.f64299w.n());
        this.f64267f.q(new s3.a(this.f64286p0, this.f64275j3.f65817a, bVar, z3Var == this.f64299w.u() ? z3Var.C(this.f64302y3) : z3Var.C(this.f64302y3) - z3Var.f66958h.f62780b, N(z3Var.j()), this.f64284o.c().f61874a, this.f64275j3.f65828l, this.f64285o3, J1(this.f64275j3.f65817a, z3Var.f66958h.f62779a) ? this.Y.c() : -9223372036854775807L, this.f64289p3), h2Var, l0Var.f65720c);
    }

    private void Q(androidx.media3.exoplayer.source.s0 s0Var) {
        if (this.f64299w.F(s0Var)) {
            this.f64299w.K(this.f64302y3);
            e0();
        } else if (this.f64299w.G(s0Var)) {
            f0();
        }
    }

    @androidx.annotation.p0
    private static Pair<Object, Long> Q0(androidx.media3.common.z3 z3Var, h hVar, boolean z10, int i10, boolean z11, androidx.media3.common.z3.d dVar, androidx.media3.common.z3.b bVar) {
        androidx.media3.common.z3 z3Var2;
        int iR0;
        androidx.media3.common.z3 z3Var3 = hVar.f64328a;
        if (z3Var.w()) {
            return null;
        }
        if (z3Var3.w()) {
            z3Var2 = z3Var3;
            z3Var2 = z3Var;
        }
        try {
            z3Var2 = z3Var3;
            Pair<Object, Long> pairP = z3Var2.p(dVar, bVar, hVar.f64329b, hVar.f64330c);
            androidx.media3.common.z3 z3Var4 = z3Var2;
            if (z3Var.equals(z3Var4)) {
                return pairP;
            }
            if (z3Var.f(pairP.first) != -1) {
                return (z3Var4.l(pairP.first, bVar).f61972f && z3Var4.t(bVar.f61969c, dVar).f62001n == z3Var4.f(pairP.first)) ? z3Var.p(dVar, bVar, z3Var.l(pairP.first, bVar).f61969c, hVar.f64330c) : pairP;
            }
            if (z10 && (iR0 = R0(dVar, bVar, i10, z11, pairP.first, z3Var4, z3Var)) != -1) {
                return z3Var.p(dVar, bVar, iR0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void R(IOException iOException, int i10) {
        s0 s0VarM = s0.m(iOException, i10);
        z3 z3VarU = this.f64299w.u();
        if (z3VarU != null) {
            s0VarM = s0VarM.j(z3VarU.f66958h.f62779a);
        }
        androidx.media3.common.util.z.e(K3, "Playback error", s0VarM);
        M1(false, false);
        this.f64275j3 = this.f64275j3.f(s0VarM);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    static int R0(androidx.media3.common.z3.d dVar, androidx.media3.common.z3.b bVar, int i10, boolean z10, Object obj, androidx.media3.common.z3 z3Var, androidx.media3.common.z3 z3Var2) {
        androidx.media3.common.z3.b bVar2;
        Object obj2 = z3Var.t(z3Var.l(obj, bVar).f61969c, dVar).f61988a;
        int i11 = 0;
        for (int i12 = 0; i12 < z3Var2.v(); i12++) {
            if (z3Var2.t(i12, dVar).f61988a.equals(obj2)) {
                return i12;
            }
        }
        int iF = z3Var.f(obj);
        int iM = z3Var.m();
        int iH = iF;
        int iF2 = -1;
        while (i11 < iM && iF2 == -1) {
            androidx.media3.common.z3.d dVar2 = dVar;
            bVar2 = bVar;
            int i13 = i10;
            boolean z11 = z10;
            androidx.media3.common.z3 z3Var3 = z3Var;
            iH = z3Var3.h(iH, bVar2, dVar2, i13, z11);
            if (iH == -1) {
                if (iF2 == -1) {
                    return -1;
                }
                return z3Var2.j(iF2, bVar2).f61969c;
            }
            iF2 = z3Var2.f(z3Var3.s(iH));
            i11++;
            z3Var = z3Var3;
            bVar = bVar2;
            dVar = dVar2;
            i10 = i13;
            z10 = z11;
        }
        bVar2 = bVar;
        if (iF2 == -1) {
            return -1;
        }
        return z3Var2.j(iF2, bVar2).f61969c;
    }

    private void R1(int i10, int i11, List<androidx.media3.common.k0> list) throws Throwable {
        this.f64277k3.b(1);
        U(this.X.G(i10, i11, list), false);
    }

    private void S(boolean z10) {
        z3 z3VarN = this.f64299w.n();
        androidx.media3.exoplayer.source.t0.b bVar = z3VarN == null ? this.f64275j3.f65818b : z3VarN.f66958h.f62779a;
        boolean zEquals = this.f64275j3.f65827k.equals(bVar);
        if (!zEquals) {
            this.f64275j3 = this.f64275j3.c(bVar);
        }
        u4 u4Var = this.f64275j3;
        u4Var.f65833q = z3VarN == null ? u4Var.f65835s : z3VarN.j();
        this.f64275j3.f65834r = M();
        if ((!zEquals || z10) && z3VarN != null && z3VarN.f66956f) {
            P1(z3VarN.f66958h.f62779a, z3VarN.o(), z3VarN.p());
        }
    }

    private void S0(long j10) {
        long jMin = (this.f64275j3.f65821e != 3 || (!this.f64287p1 && H1())) ? f64258s4 : 1000L;
        if (this.f64287p1 && H1()) {
            int i10 = 5 ^ 0;
            for (d5 d5Var : this.f64262a) {
                jMin = Math.min(jMin, androidx.media3.common.util.k1.A2(d5Var.j(this.f64302y3, this.f64303z3)));
            }
            z3 z3VarK = this.f64299w.u() != null ? this.f64299w.u().k() : null;
            if (z3VarK != null && this.f64302y3 + (androidx.media3.common.util.k1.D1(jMin) * this.f64275j3.f65831o.f61874a) >= z3VarK.n()) {
                jMin = Math.min(jMin, f64258s4);
            }
        }
        this.f64270h.j(2, j10 + jMin);
    }

    private void S1() throws s0 {
        if (!this.f64275j3.f65817a.w() && this.X.u()) {
            boolean zM0 = m0();
            q0();
            r0();
            s0();
            o0();
            p0(zM0);
        }
    }

    private void T(z3 z3Var) throws s0 {
        n3 n3Var;
        if (!z3Var.f66956f) {
            float f10 = this.f64284o.c().f61874a;
            u4 u4Var = this.f64275j3;
            z3Var.q(f10, u4Var.f65817a, u4Var.f65828l);
        }
        P1(z3Var.f66958h.f62779a, z3Var.o(), z3Var.p());
        if (z3Var == this.f64299w.u()) {
            L0(z3Var.f66958h.f62780b);
            D();
            z3Var.f66959i = true;
            u4 u4Var2 = this.f64275j3;
            androidx.media3.exoplayer.source.t0.b bVar = u4Var2.f65818b;
            long j10 = z3Var.f66958h.f62780b;
            n3Var = this;
            n3Var.f64275j3 = n3Var.Y(bVar, j10, u4Var2.f65819c, j10, false, 5);
        } else {
            n3Var = this;
        }
        n3Var.e0();
    }

    private static int T1(int i10, int i11) {
        if (i10 == -1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0208  */
    /* JADX WARN: Code duplicated, block: B:116:0x0213  */
    /* JADX WARN: Code duplicated, block: B:118:0x0219  */
    /* JADX WARN: Code duplicated, block: B:122:0x023c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [long] */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7, types: [long] */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.media3.exoplayer.n3] */
    /* JADX WARN: Type inference failed for: r5v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    private void U(androidx.media3.common.z3 z3Var, boolean z10) throws Throwable {
        androidx.media3.exoplayer.source.t0.b bVar;
        boolean z11;
        boolean z12;
        ?? r21;
        int i10;
        ?? r12;
        long j10;
        androidx.media3.exoplayer.source.t0.b bVar2;
        Object obj;
        ?? r10;
        int i11;
        ?? r22;
        int i12;
        ?? r23;
        ?? r24;
        boolean z13;
        ?? r25;
        androidx.media3.common.z3 z3Var2 = z3Var;
        g gVarP0 = P0(z3Var2, this.f64275j3, this.f64301x3, this.f64299w, this.f64291r3, this.f64293s3, this.f64276k, this.f64278l);
        androidx.media3.exoplayer.source.t0.b bVar3 = gVarP0.f64322a;
        ?? r13 = gVarP0.f64324c;
        boolean z14 = gVarP0.f64325d;
        long jW0 = gVarP0.f64323b;
        boolean z15 = (this.f64275j3.f65818b.equals(bVar3) && jW0 == this.f64275j3.f65835s) ? false : true;
        int i13 = 4;
        try {
            if (gVarP0.f64326e) {
                if (this.f64275j3.f65821e != 1) {
                    A1(4);
                }
                J0(false, false, false, true);
            }
            for (d5 d5Var : this.f64262a) {
                try {
                    d5Var.R(z3Var2);
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar3;
                    z12 = false;
                    z11 = true;
                    i10 = -1;
                    r12 = z12;
                    r21 = r13;
                    u4 u4Var = this.f64275j3;
                    androidx.media3.common.z3 z3Var3 = u4Var.f65817a;
                    androidx.media3.exoplayer.source.t0.b bVar4 = u4Var.f65818b;
                    if (gVarP0.f64327f) {
                        j10 = jW0;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    bVar2 = bVar;
                    Y1(z3Var2, bVar2, z3Var3, bVar4, j10, false);
                    if (z15) {
                        u4 u4Var2 = this.f64275j3;
                        obj = u4Var2.f65818b.f65467a;
                        androidx.media3.common.z3 z3Var4 = u4Var2.f65817a;
                        if (z15) {
                            r10 = r12;
                        } else {
                            r10 = r12;
                        }
                        long j11 = this.f64275j3.f65820d;
                        if (z3Var2.f(obj) == i10) {
                            i11 = i13;
                        } else {
                            i11 = 3;
                        }
                        this.f64275j3 = Y(bVar2, jW0, r21, j11, r10, i11);
                    } else {
                        u4 u4Var3 = this.f64275j3;
                        obj = u4Var3.f65818b.f65467a;
                        androidx.media3.common.z3 z3Var5 = u4Var3.f65817a;
                        if (z15) {
                            r10 = r12;
                        } else {
                            r10 = r12;
                        }
                        long j12 = this.f64275j3.f65820d;
                        if (z3Var2.f(obj) == i10) {
                            i11 = i13;
                        } else {
                            i11 = 3;
                        }
                        this.f64275j3 = Y(bVar2, jW0, r21, j12, r10, i11);
                    }
                    K0();
                    O0(z3Var2, this.f64275j3.f65817a);
                    this.f64275j3 = this.f64275j3.j(z3Var2);
                    if (!z3Var2.w()) {
                        this.f64301x3 = null;
                    }
                    S(r12);
                    this.f64270h.i(2);
                    throw th;
                }
            }
            try {
                if (z15) {
                    i12 = 2;
                    i13 = 4;
                    r25 = r13;
                    z13 = false;
                    z13 = false;
                    z11 = true;
                    i10 = -1;
                    if (!z3Var2.w()) {
                        for (z3 z3VarU = this.f64299w.u(); z3VarU != null; z3VarU = z3VarU.k()) {
                            if (z3VarU.f66958h.f62779a.equals(bVar3)) {
                                r24 = r25;
                                z3VarU.f66958h = this.f64299w.z(z3Var2, z3VarU.f66958h);
                                z3VarU.E();
                            } else {
                                r24 = r25;
                            }
                        }
                        r24 = r25;
                        jW0 = W0(bVar3, jW0, z14);
                        r24 = r25;
                    }
                } else {
                    try {
                        long J = 0;
                        long J2 = this.f64299w.y() == null ? 0L : J(this.f64299w.y());
                        if (t() && this.f64299w.x() != null) {
                            J = J(this.f64299w.x());
                        }
                        try {
                            try {
                                i12 = 2;
                                z11 = true;
                                i13 = 4;
                                r23 = r13;
                                r13 = 0;
                                z13 = false;
                                z13 = false;
                                z13 = false;
                                i10 = -1;
                                try {
                                    int iX = this.f64299w.X(z3Var, this.f64302y3, J2, J);
                                    z3Var2 = z3Var;
                                    if ((iX & 1) != 0) {
                                        U0(false);
                                        r24 = r23;
                                    } else if ((iX & 2) != 0) {
                                        r24 = r23;
                                        y();
                                        r24 = r23;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z3Var2 = z3Var;
                                    r22 = r23;
                                    z3Var2 = z3Var2;
                                    bVar = bVar3;
                                    r12 = r13;
                                    r21 = r22;
                                    u4 u4Var4 = this.f64275j3;
                                    androidx.media3.common.z3 z3Var6 = u4Var4.f65817a;
                                    androidx.media3.exoplayer.source.t0.b bVar5 = u4Var4.f65818b;
                                    if (gVarP0.f64327f) {
                                        j10 = jW0;
                                    } else {
                                        j10 = -9223372036854775807L;
                                    }
                                    bVar2 = bVar;
                                    Y1(z3Var2, bVar2, z3Var6, bVar5, j10, false);
                                    if (z15 || r21 != this.f64275j3.f65819c) {
                                        u4 u4Var5 = this.f64275j3;
                                        obj = u4Var5.f65818b.f65467a;
                                        androidx.media3.common.z3 z3Var7 = u4Var5.f65817a;
                                        if (z15 || !z10 || z3Var7.w() || z3Var7.l(obj, this.f64278l).f61972f) {
                                            r10 = r12;
                                        } else {
                                            r10 = z11;
                                        }
                                        long j13 = this.f64275j3.f65820d;
                                        if (z3Var2.f(obj) == i10) {
                                            i11 = i13;
                                        } else {
                                            i11 = 3;
                                        }
                                        this.f64275j3 = Y(bVar2, jW0, r21, j13, r10, i11);
                                    }
                                    K0();
                                    O0(z3Var2, this.f64275j3.f65817a);
                                    this.f64275j3 = this.f64275j3.j(z3Var2);
                                    if (!z3Var2.w()) {
                                        this.f64301x3 = null;
                                    }
                                    S(r12);
                                    this.f64270h.i(2);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z3Var2 = z3Var;
                                i13 = 4;
                                r22 = r13;
                                r13 = 0;
                                z11 = true;
                                i10 = -1;
                                z3Var2 = z3Var2;
                                bVar = bVar3;
                                r12 = r13;
                                r21 = r22;
                                u4 u4Var6 = this.f64275j3;
                                androidx.media3.common.z3 z3Var8 = u4Var6.f65817a;
                                androidx.media3.exoplayer.source.t0.b bVar6 = u4Var6.f65818b;
                                if (gVarP0.f64327f) {
                                    j10 = jW0;
                                } else {
                                    j10 = -9223372036854775807L;
                                }
                                bVar2 = bVar;
                                Y1(z3Var2, bVar2, z3Var8, bVar6, j10, false);
                                if (z15) {
                                    u4 u4Var7 = this.f64275j3;
                                    obj = u4Var7.f65818b.f65467a;
                                    androidx.media3.common.z3 z3Var9 = u4Var7.f65817a;
                                    if (z15) {
                                        r10 = r12;
                                    } else {
                                        r10 = r12;
                                    }
                                    long j14 = this.f64275j3.f65820d;
                                    if (z3Var2.f(obj) == i10) {
                                        i11 = i13;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f64275j3 = Y(bVar2, jW0, r21, j14, r10, i11);
                                } else {
                                    u4 u4Var8 = this.f64275j3;
                                    obj = u4Var8.f65818b.f65467a;
                                    androidx.media3.common.z3 z3Var10 = u4Var8.f65817a;
                                    if (z15) {
                                        r10 = r12;
                                    } else {
                                        r10 = r12;
                                    }
                                    long j15 = this.f64275j3.f65820d;
                                    if (z3Var2.f(obj) == i10) {
                                        i11 = i13;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f64275j3 = Y(bVar2, jW0, r21, j15, r10, i11);
                                }
                                K0();
                                O0(z3Var2, this.f64275j3.f65817a);
                                this.f64275j3 = this.f64275j3.j(z3Var2);
                                if (!z3Var2.w()) {
                                    this.f64301x3 = null;
                                }
                                S(r12);
                                this.f64270h.i(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z3Var2 = z3Var;
                            i13 = 4;
                            r22 = r13;
                            r13 = 0;
                            z11 = true;
                            i10 = -1;
                            z3Var2 = z3Var2;
                            bVar = bVar3;
                            r12 = r13;
                            r21 = r22;
                            u4 u4Var9 = this.f64275j3;
                            androidx.media3.common.z3 z3Var11 = u4Var9.f65817a;
                            androidx.media3.exoplayer.source.t0.b bVar7 = u4Var9.f65818b;
                            if (gVarP0.f64327f) {
                                j10 = jW0;
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            bVar2 = bVar;
                            Y1(z3Var2, bVar2, z3Var11, bVar7, j10, false);
                            if (z15) {
                                u4 u4Var10 = this.f64275j3;
                                obj = u4Var10.f65818b.f65467a;
                                androidx.media3.common.z3 z3Var12 = u4Var10.f65817a;
                                if (z15) {
                                    r10 = r12;
                                } else {
                                    r10 = r12;
                                }
                                long j16 = this.f64275j3.f65820d;
                                if (z3Var2.f(obj) == i10) {
                                    i11 = i13;
                                } else {
                                    i11 = 3;
                                }
                                this.f64275j3 = Y(bVar2, jW0, r21, j16, r10, i11);
                            } else {
                                u4 u4Var11 = this.f64275j3;
                                obj = u4Var11.f65818b.f65467a;
                                androidx.media3.common.z3 z3Var13 = u4Var11.f65817a;
                                if (z15) {
                                    r10 = r12;
                                } else {
                                    r10 = r12;
                                }
                                long j17 = this.f64275j3.f65820d;
                                if (z3Var2.f(obj) == i10) {
                                    i11 = i13;
                                } else {
                                    i11 = 3;
                                }
                                this.f64275j3 = Y(bVar2, jW0, r21, j17, r10, i11);
                            }
                            K0();
                            O0(z3Var2, this.f64275j3.f65817a);
                            this.f64275j3 = this.f64275j3.j(z3Var2);
                            if (!z3Var2.w()) {
                                this.f64301x3 = null;
                            }
                            S(r12);
                            this.f64270h.i(2);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                r24 = r23;
                r24 = r25;
                u4 u4Var12 = this.f64275j3;
                Y1(z3Var2, bVar3, u4Var12.f65817a, u4Var12.f65818b, gVarP0.f64327f ? jW0 : -9223372036854775807L, false);
                androidx.media3.common.z3 z3Var14 = z3Var2;
                if (z15 || r24 != this.f64275j3.f65819c) {
                    u4 u4Var13 = this.f64275j3;
                    Object obj2 = u4Var13.f65818b.f65467a;
                    androidx.media3.common.z3 z3Var15 = u4Var13.f65817a;
                    this.f64275j3 = Y(bVar3, jW0, r24, this.f64275j3.f65820d, (!z15 || !z10 || z3Var15.w() || z3Var15.l(obj2, this.f64278l).f61972f) ? z13 : z11, z3Var14.f(obj2) == i10 ? i13 : 3);
                }
                K0();
                O0(z3Var14, this.f64275j3.f65817a);
                this.f64275j3 = this.f64275j3.j(z3Var14);
                if (!z3Var14.w()) {
                    this.f64301x3 = null;
                }
                S(z13);
                this.f64270h.i(i12);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            bVar = bVar3;
            z11 = true;
            z12 = false;
        }
    }

    private void U0(boolean z10) throws s0 {
        androidx.media3.exoplayer.source.t0.b bVar = this.f64299w.u().f66958h.f62779a;
        long jX0 = X0(bVar, this.f64275j3.f65835s, true, false);
        if (jX0 != this.f64275j3.f65835s) {
            u4 u4Var = this.f64275j3;
            this.f64275j3 = Y(bVar, jX0, u4Var.f65819c, u4Var.f65820d, z10, 5);
        }
    }

    private void U1() throws s0 {
        u4 u4Var = this.f64275j3;
        V1(u4Var.f65828l, u4Var.f65830n, u4Var.f65829m);
    }

    private void V(androidx.media3.exoplayer.source.s0 s0Var) throws s0 {
        if (this.f64299w.F(s0Var)) {
            T((z3) androidx.media3.common.util.a.g(this.f64299w.n()));
            return;
        }
        z3 z3VarV = this.f64299w.v(s0Var);
        if (z3VarV != null) {
            androidx.media3.common.util.a.i(!z3VarV.f66956f);
            float f10 = this.f64284o.c().f61874a;
            u4 u4Var = this.f64275j3;
            z3VarV.q(f10, u4Var.f65817a, u4Var.f65828l);
            if (this.f64299w.G(s0Var)) {
                f0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a4 A[Catch: all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:22:0x009a, B:24:0x00a4, B:30:0x00b0, B:32:0x00b6, B:33:0x00b9, B:35:0x00c1, B:39:0x00d3, B:43:0x00db), top: B:95:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[Catch: all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:22:0x009a, B:24:0x00a4, B:30:0x00b0, B:32:0x00b6, B:33:0x00b9, B:35:0x00c1, B:39:0x00d3, B:43:0x00db), top: B:95:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[Catch: all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:22:0x009a, B:24:0x00a4, B:30:0x00b0, B:32:0x00b6, B:33:0x00b9, B:35:0x00c1, B:39:0x00d3, B:43:0x00db), top: B:95:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #3 {all -> 0x00a7, blocks: (B:22:0x009a, B:24:0x00a4, B:30:0x00b0, B:32:0x00b6, B:33:0x00b9, B:35:0x00c1, B:39:0x00d3, B:43:0x00db), top: B:95:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void V0(h hVar) throws Throwable {
        long jLongValue;
        androidx.media3.exoplayer.source.t0.b bVarR;
        long j10;
        boolean z10;
        long j11;
        androidx.media3.exoplayer.source.t0.b bVar;
        long j12;
        androidx.media3.exoplayer.source.t0.b bVar2;
        z3 z3VarU;
        long jG;
        u4 u4Var;
        int i10;
        int i11;
        long j13;
        androidx.media3.exoplayer.source.t0.b bVar3;
        long j14;
        boolean z11;
        long jW0;
        androidx.media3.exoplayer.source.t0.b bVar4;
        long j15;
        n3 n3Var = this;
        n3Var.f64277k3.b(1);
        Pair<Object, Long> pairQ0 = Q0(n3Var.f64275j3.f65817a, hVar, true, n3Var.f64291r3, n3Var.f64293s3, n3Var.f64276k, n3Var.f64278l);
        try {
            if (pairQ0 != null) {
                Object obj = pairQ0.first;
                jLongValue = ((Long) pairQ0.second).longValue();
                long j16 = hVar.f64330c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                bVarR = n3Var.f64299w.R(n3Var.f64275j3.f65817a, obj, jLongValue);
                if (bVarR.c()) {
                    n3Var.f64275j3.f65817a.l(bVarR.f65467a, n3Var.f64278l);
                    jLongValue = n3Var.f64278l.n(bVarR.f65468b) == bVarR.f65469c ? n3Var.f64278l.h() : 0L;
                    z10 = true;
                    j11 = j16;
                } else {
                    j10 = 0;
                    z10 = hVar.f64330c == -9223372036854775807L;
                    j11 = j16;
                }
                if (n3Var.f64275j3.f65817a.w()) {
                    if (pairQ0 == null) {
                        if (n3Var.f64275j3.f65821e != 1) {
                            n3Var.A1(4);
                        }
                        n3Var.J0(false, true, false, true);
                    } else {
                        if (bVarR.equals(n3Var.f64275j3.f65818b)) {
                            try {
                                z3VarU = n3Var.f64299w.u();
                                if (z3VarU == null && z3VarU.f66956f && jLongValue != j10) {
                                    jG = z3VarU.f66951a.g(jLongValue, n3Var.f64273i3);
                                } else {
                                    jG = jLongValue;
                                }
                                bVar2 = bVarR;
                                try {
                                    if (androidx.media3.common.util.k1.A2(jG) != androidx.media3.common.util.k1.A2(n3Var.f64275j3.f65835s) && ((i10 = (u4Var = n3Var.f64275j3).f65821e) == 2 || i10 == 3)) {
                                        long j17 = u4Var.f65835s;
                                        i11 = 2;
                                        z10 = z10;
                                        j13 = j17;
                                        bVar3 = bVar2;
                                        j14 = j17;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z10 = z10;
                                    bVar = bVar2;
                                    j12 = jLongValue;
                                    n3Var.f64275j3 = n3Var.Y(bVar, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = z10;
                                bVar2 = bVarR;
                            }
                        } else {
                            bVar2 = bVarR;
                            jG = jLongValue;
                        }
                        try {
                            if (n3Var.f64275j3.f65821e == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            jW0 = n3Var.W0(bVar2, jG, z11);
                            z10 |= jLongValue != jW0;
                            try {
                                u4 u4Var2 = n3Var.f64275j3;
                                androidx.media3.common.z3 z3Var = u4Var2.f65817a;
                                bVar4 = bVar2;
                                j15 = j11;
                                try {
                                    n3Var.Y1(z3Var, bVar4, z3Var, u4Var2.f65818b, j15, true);
                                    bVar3 = bVar4;
                                    j11 = j15;
                                    j14 = jW0;
                                    i11 = 2;
                                    j13 = j14;
                                    n3Var = this;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar = bVar4;
                                    j11 = j15;
                                    j12 = jW0;
                                    n3Var.f64275j3 = n3Var.Y(bVar, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = bVar2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = bVar2;
                            j12 = jLongValue;
                            n3Var.f64275j3 = n3Var.Y(bVar, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    n3Var.f64275j3 = n3Var.Y(bVar3, j14, j11, j13, z10, i11);
                    return;
                }
                n3Var.f64301x3 = hVar;
                z10 = z10;
                bVar3 = bVarR;
                j14 = jLongValue;
                i11 = 2;
                j13 = j14;
                n3Var = this;
                n3Var.f64275j3 = n3Var.Y(bVar3, j14, j11, j13, z10, i11);
                return;
            }
            Pair<androidx.media3.exoplayer.source.t0.b, Long> pairK = n3Var.K(n3Var.f64275j3.f65817a);
            bVarR = (androidx.media3.exoplayer.source.t0.b) pairK.first;
            jLongValue = ((Long) pairK.second).longValue();
            z10 = !n3Var.f64275j3.f65817a.w();
            j11 = -9223372036854775807L;
            if (n3Var.f64275j3.f65817a.w()) {
                if (pairQ0 == null) {
                    if (n3Var.f64275j3.f65821e != 1) {
                        n3Var.A1(4);
                    }
                    n3Var.J0(false, true, false, true);
                } else {
                    if (bVarR.equals(n3Var.f64275j3.f65818b)) {
                        z3VarU = n3Var.f64299w.u();
                        if (z3VarU == null) {
                            jG = jLongValue;
                        } else {
                            jG = jLongValue;
                        }
                        bVar2 = bVarR;
                        if (androidx.media3.common.util.k1.A2(jG) != androidx.media3.common.util.k1.A2(n3Var.f64275j3.f65835s)) {
                        }
                    } else {
                        bVar2 = bVarR;
                        jG = jLongValue;
                    }
                    if (n3Var.f64275j3.f65821e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jW0 = n3Var.W0(bVar2, jG, z11);
                    z10 |= jLongValue != jW0;
                    u4 u4Var3 = n3Var.f64275j3;
                    androidx.media3.common.z3 z3Var2 = u4Var3.f65817a;
                    bVar4 = bVar2;
                    j15 = j11;
                    n3Var.Y1(z3Var2, bVar4, z3Var2, u4Var3.f65818b, j15, true);
                    bVar3 = bVar4;
                    j11 = j15;
                    j14 = jW0;
                    i11 = 2;
                    j13 = j14;
                    n3Var = this;
                }
                n3Var.f64275j3 = n3Var.Y(bVar3, j14, j11, j13, z10, i11);
                return;
            }
            n3Var.f64301x3 = hVar;
            z10 = z10;
            bVar3 = bVarR;
            j14 = jLongValue;
            i11 = 2;
            j13 = j14;
            n3Var = this;
            n3Var.f64275j3 = n3Var.Y(bVar3, j14, j11, j13, z10, i11);
            return;
        } catch (Throwable th7) {
            th = th7;
            z10 = z10;
            bVar = bVarR;
        }
        j10 = 0;
    }

    private void V1(boolean z10, int i10, int i11) throws s0 {
        W1(z10, this.f64271h3.o(z10, this.f64275j3.f65821e), i10, i11);
    }

    private void W(androidx.media3.common.y0 y0Var, float f10, boolean z10, boolean z11) throws s0 {
        if (z10) {
            if (z11) {
                this.f64277k3.b(1);
            }
            this.f64275j3 = this.f64275j3.g(y0Var);
        }
        c2(y0Var.f61874a);
        for (d5 d5Var : this.f64262a) {
            d5Var.Q(f10, y0Var.f61874a);
        }
    }

    private long W0(androidx.media3.exoplayer.source.t0.b bVar, long j10, boolean z10) throws s0 {
        return X0(bVar, j10, this.f64299w.u() != this.f64299w.y(), z10);
    }

    private void W1(boolean z10, int i10, int i11, int i12) throws s0 {
        boolean z11 = z10 && i10 != -1;
        int iT1 = T1(i10, i12);
        int iZ1 = Z1(i10, i11);
        u4 u4Var = this.f64275j3;
        if (u4Var.f65828l != z11 || u4Var.f65830n != iZ1 || u4Var.f65829m != iT1) {
            this.f64275j3 = u4Var.e(z11, iT1, iZ1);
            a2(false, false);
            x0(z11);
            if (!H1()) {
                N1();
                X1();
                this.f64299w.K(this.f64302y3);
                return;
            }
            int i13 = this.f64275j3.f65821e;
            if (i13 == 3) {
                this.f64284o.f();
                K1();
                this.f64270h.i(2);
            } else if (i13 == 2) {
                this.f64270h.i(2);
            }
        }
    }

    private void X(androidx.media3.common.y0 y0Var, boolean z10) throws s0 {
        W(y0Var, y0Var.f61874a, true, z10);
    }

    private long X0(androidx.media3.exoplayer.source.t0.b bVar, long j10, boolean z10, boolean z11) throws s0 {
        N1();
        a2(false, true);
        if (z11 || this.f64275j3.f65821e == 3) {
            A1(2);
        }
        z3 z3VarU = this.f64299w.u();
        z3 z3VarK = z3VarU;
        while (z3VarK != null && !bVar.equals(z3VarK.f66958h.f62779a)) {
            z3VarK = z3VarK.k();
        }
        if (z10 || z3VarU != z3VarK || (z3VarK != null && z3VarK.D(j10) < 0)) {
            A();
            if (z3VarK != null) {
                while (this.f64299w.u() != z3VarK) {
                    this.f64299w.b();
                }
                this.f64299w.N(z3VarK);
                z3VarK.B(c4.f63520s);
                D();
                z3VarK.f66959i = true;
            }
        }
        y();
        if (z3VarK != null) {
            this.f64299w.N(z3VarK);
            if (!z3VarK.f66956f) {
                z3VarK.f66958h = z3VarK.f66958h.b(j10);
            } else if (z3VarK.f66957g) {
                j10 = z3VarK.f66951a.h(j10);
                z3VarK.f66951a.p(j10 - this.f64280m, this.f64282n);
            }
            L0(j10);
            e0();
        } else {
            this.f64299w.g();
            L0(j10);
        }
        S(false);
        this.f64270h.i(2);
        return j10;
    }

    private void X1() throws s0 {
        z3 z3VarU = this.f64299w.u();
        if (z3VarU != null) {
            long jI = z3VarU.f66956f ? z3VarU.f66951a.i() : -9223372036854775807L;
            if (jI != -9223372036854775807L) {
                if (!z3VarU.s()) {
                    this.f64299w.N(z3VarU);
                    S(false);
                    e0();
                }
                L0(jI);
                if (jI != this.f64275j3.f65835s) {
                    u4 u4Var = this.f64275j3;
                    long j10 = jI;
                    this.f64275j3 = Y(u4Var.f65818b, j10, u4Var.f65819c, j10, true, 5);
                }
            } else {
                long jI2 = this.f64284o.i(z3VarU != this.f64299w.y());
                this.f64302y3 = jI2;
                long jC = z3VarU.C(jI2);
                l0(this.f64275j3.f65835s, jC);
                if (this.f64284o.w()) {
                    boolean z10 = !this.f64277k3.f64320d;
                    u4 u4Var2 = this.f64275j3;
                    this.f64275j3 = Y(u4Var2.f65818b, jC, u4Var2.f65819c, jC, z10, 6);
                } else {
                    this.f64275j3.o(jC);
                }
            }
            this.f64275j3.f65833q = this.f64299w.n().j();
            this.f64275j3.f65834r = M();
            u4 u4Var3 = this.f64275j3;
            if (u4Var3.f65828l && u4Var3.f65821e == 3 && J1(u4Var3.f65817a, u4Var3.f65818b) && this.f64275j3.f65831o.f61874a == 1.0f) {
                float fB = this.Y.b(H(), this.f64275j3.f65834r);
                if (this.f64284o.c().f61874a != fB) {
                    g1(this.f64275j3.f65831o.d(fB));
                    W(this.f64275j3.f65831o, this.f64284o.c().f61874a, false, false);
                }
            }
        }
    }

    @androidx.annotation.j
    private u4 Y(androidx.media3.exoplayer.source.t0.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List<androidx.media3.common.r0> list;
        androidx.media3.exoplayer.source.h2 h2Var;
        androidx.media3.exoplayer.trackselection.l0 l0Var;
        this.B3 = (!this.B3 && j10 == this.f64275j3.f65835s && bVar.equals(this.f64275j3.f65818b)) ? false : true;
        K0();
        u4 u4Var = this.f64275j3;
        androidx.media3.exoplayer.source.h2 h2Var2 = u4Var.f65824h;
        androidx.media3.exoplayer.trackselection.l0 l0Var2 = u4Var.f65825i;
        List<androidx.media3.common.r0> listF = u4Var.f65826j;
        if (this.X.u()) {
            z3 z3VarU = this.f64299w.u();
            androidx.media3.exoplayer.source.h2 h2VarO = z3VarU == null ? androidx.media3.exoplayer.source.h2.f65074e : z3VarU.o();
            androidx.media3.exoplayer.trackselection.l0 l0VarP = z3VarU == null ? this.f64266e : z3VarU.p();
            l6<androidx.media3.common.r0> l6VarG = G(l0VarP.f65720c);
            if (z3VarU != null) {
                a4 a4Var = z3VarU.f66958h;
                if (a4Var.f62781c != j11) {
                    z3VarU.f66958h = a4Var.a(j11);
                }
            }
            n0();
            h2Var = h2VarO;
            l0Var = l0VarP;
            list = l6VarG;
        } else {
            if (!bVar.equals(this.f64275j3.f65818b)) {
                h2Var2 = androidx.media3.exoplayer.source.h2.f65074e;
                l0Var2 = this.f64266e;
                listF = l6.F();
            }
            list = listF;
            h2Var = h2Var2;
            l0Var = l0Var2;
        }
        if (z10) {
            this.f64277k3.d(i10);
        }
        return this.f64275j3.d(bVar, j10, j11, j12, M(), h2Var, l0Var, list);
    }

    private void Y0(w4 w4Var) throws s0 {
        if (w4Var.h() == -9223372036854775807L) {
            Z0(w4Var);
            return;
        }
        if (this.f64275j3.f65817a.w()) {
            this.f64292s.add(new d(w4Var));
            return;
        }
        d dVar = new d(w4Var);
        androidx.media3.common.z3 z3Var = this.f64275j3.f65817a;
        if (!N0(dVar, z3Var, z3Var, this.f64291r3, this.f64293s3, this.f64276k, this.f64278l)) {
            w4Var.m(false);
        } else {
            this.f64292s.add(dVar);
            Collections.sort(this.f64292s);
        }
    }

    private void Y1(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, androidx.media3.common.z3 z3Var2, androidx.media3.exoplayer.source.t0.b bVar2, long j10, boolean z10) throws s0 {
        if (!J1(z3Var, bVar)) {
            androidx.media3.common.y0 y0Var = bVar.c() ? androidx.media3.common.y0.f61871d : this.f64275j3.f65831o;
            if (this.f64284o.c().equals(y0Var)) {
                return;
            }
            g1(y0Var);
            W(this.f64275j3.f65831o, y0Var.f61874a, false, false);
            return;
        }
        z3Var.t(z3Var.l(bVar.f65467a, this.f64278l).f61969c, this.f64276k);
        this.Y.a((androidx.media3.common.k0.g) androidx.media3.common.util.k1.o(this.f64276k.f61997j));
        if (j10 != -9223372036854775807L) {
            this.Y.e(I(z3Var, bVar.f65467a, j10));
            return;
        }
        if (!Objects.equals(!z3Var2.w() ? z3Var2.t(z3Var2.l(bVar2.f65467a, this.f64278l).f61969c, this.f64276k).f61988a : null, this.f64276k.f61988a) || z10) {
            this.Y.e(-9223372036854775807L);
        }
    }

    private boolean Z() {
        z3 z3VarY = this.f64299w.y();
        if (!z3VarY.f66956f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            d5[] d5VarArr = this.f64262a;
            if (i10 >= d5VarArr.length) {
                return true;
            }
            if (!d5VarArr[i10].o(z3VarY)) {
                return false;
            }
            i10++;
        }
    }

    private void Z0(w4 w4Var) throws s0 {
        if (w4Var.e() != this.f64274j) {
            this.f64270h.b(15, w4Var).a();
            return;
        }
        x(w4Var);
        int i10 = this.f64275j3.f65821e;
        if (i10 != 3 && i10 != 2) {
            return;
        }
        this.f64270h.i(2);
    }

    private static int Z1(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    private static boolean a0(boolean z10, androidx.media3.exoplayer.source.t0.b bVar, long j10, androidx.media3.exoplayer.source.t0.b bVar2, androidx.media3.common.z3.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f65467a.equals(bVar2.f65467a)) {
            if (bVar.c() && bVar3.u(bVar.f65468b)) {
                return (bVar3.i(bVar.f65468b, bVar.f65469c) == 4 || bVar3.i(bVar.f65468b, bVar.f65469c) == 2) ? false : true;
            }
            if (bVar2.c() && bVar3.u(bVar2.f65468b)) {
                return true;
            }
        }
        return false;
    }

    private void a1(final w4 w4Var) {
        Looper looperE = w4Var.e();
        if (looperE.getThread().isAlive()) {
            this.f64294t.d(looperE, null).g(new Runnable() { // from class: androidx.media3.exoplayer.m3
                @Override // java.lang.Runnable
                public final void run() {
                    n3.i(this.f64035a, w4Var);
                }
            });
        } else {
            androidx.media3.common.util.z.n("TAG", "Trying to send message on a dead thread.");
            w4Var.m(false);
        }
    }

    private void a2(boolean z10, boolean z11) {
        this.f64285o3 = z10;
        this.f64289p3 = (!z10 || z11) ? -9223372036854775807L : this.f64294t.b();
    }

    private boolean b0(@androidx.annotation.p0 z3 z3Var) {
        return (z3Var == null || z3Var.r() || z3Var.l() == Long.MIN_VALUE) ? false : true;
    }

    private void b1(long j10) {
        for (d5 d5Var : this.f64262a) {
            d5Var.N(j10);
        }
    }

    private boolean b2() throws s0 {
        n3 n3Var;
        z3 z3VarY = this.f64299w.y();
        androidx.media3.exoplayer.trackselection.l0 l0VarP = z3VarY.p();
        int i10 = 0;
        boolean z10 = true;
        int i11 = 0;
        while (true) {
            d5[] d5VarArr = this.f64262a;
            if (i11 >= d5VarArr.length) {
                break;
            }
            int iH = d5VarArr[i11].h();
            int iJ = this.f64262a[i11].J(z3VarY, l0VarP, this.f64284o);
            if ((iJ & 2) != 0 && this.f64298v3) {
                j1(false);
            }
            this.f64300w3 -= iH - this.f64262a[i11].h();
            z10 &= (iJ & 1) != 0;
            i11++;
        }
        if (z10) {
            while (i10 < this.f64262a.length) {
                if (!l0VarP.c(i10) || this.f64262a[i10].w(z3VarY)) {
                    n3Var = this;
                } else {
                    n3Var = this;
                    n3Var.C(z3VarY, i10, false, z3VarY.n());
                }
                i10++;
                this = n3Var;
            }
        }
        return z10;
    }

    private boolean c0() {
        z3 z3VarU = this.f64299w.u();
        long j10 = z3VarU.f66958h.f62783e;
        if (z3VarU.f66956f) {
            return j10 == -9223372036854775807L || this.f64275j3.f65835s < j10 || !H1();
        }
        return false;
    }

    private void c2(float f10) {
        for (z3 z3VarU = this.f64299w.u(); z3VarU != null; z3VarU = z3VarU.k()) {
            for (androidx.media3.exoplayer.trackselection.c0 c0Var : z3VarU.p().f65720c) {
                if (c0Var != null) {
                    c0Var.m(f10);
                }
            }
        }
    }

    private static boolean d0(u4 u4Var, androidx.media3.common.z3.b bVar) {
        androidx.media3.exoplayer.source.t0.b bVar2 = u4Var.f65818b;
        androidx.media3.common.z3 z3Var = u4Var.f65817a;
        return z3Var.w() || z3Var.l(bVar2.f65467a, bVar).f61972f;
    }

    private void d1(androidx.media3.common.d dVar, boolean z10) throws s0 {
        this.f64265d.l(dVar);
        androidx.media3.exoplayer.h hVar = this.f64271h3;
        if (!z10) {
            dVar = null;
        }
        hVar.l(dVar);
        U1();
    }

    private synchronized void d2(com.google.common.base.s0<Boolean> s0Var, long j10) {
        try {
            long jB = this.f64294t.b() + j10;
            boolean z10 = false;
            while (!s0Var.get().booleanValue() && j10 > 0) {
                try {
                    this.f64294t.e();
                    wait(j10);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                j10 = jB - this.f64294t.b();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void e0() {
        boolean zG1 = G1();
        this.f64290q3 = zG1;
        if (zG1) {
            z3 z3Var = (z3) androidx.media3.common.util.a.g(this.f64299w.n());
            z3Var.e(new t3.b().f(z3Var.C(this.f64302y3)).g(this.f64284o.c().f61874a).e(this.f64289p3).d());
        }
        O1();
    }

    private void f0() {
        this.f64299w.I();
        z3 z3VarW = this.f64299w.w();
        if (z3VarW != null) {
            if ((!z3VarW.f66955e || z3VarW.f66956f) && !z3VarW.f66951a.d()) {
                if (this.f64267f.p(this.f64275j3.f65817a, z3VarW.f66958h.f62779a, z3VarW.f66956f ? z3VarW.f66951a.b() : 0L)) {
                    if (z3VarW.f66955e) {
                        z3VarW.e(new t3.b().f(z3VarW.C(this.f64302y3)).g(this.f64284o.c().f61874a).e(this.f64289p3).d());
                    } else {
                        z3VarW.v(this, z3VarW.f66958h.f62780b);
                    }
                }
            }
        }
    }

    private void f1(boolean z10, @androidx.annotation.p0 AtomicBoolean atomicBoolean) {
        if (this.f64295t3 != z10) {
            this.f64295t3 = z10;
            if (!z10) {
                for (d5 d5Var : this.f64262a) {
                    d5Var.L();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                try {
                    atomicBoolean.set(true);
                    notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void g0() throws s0 {
        for (d5 d5Var : this.f64262a) {
            d5Var.D();
        }
    }

    private void g1(androidx.media3.common.y0 y0Var) {
        this.f64270h.k(16);
        this.f64284o.h(y0Var);
    }

    private void h0() {
        this.f64277k3.c(this.f64275j3);
        if (this.f64277k3.f64317a) {
            this.f64297v.a(this.f64277k3);
            this.f64277k3 = new e(this.f64275j3);
        }
    }

    private void h1(b bVar) throws Throwable {
        this.f64277k3.b(1);
        if (bVar.f64307c != -1) {
            this.f64301x3 = new h(new x4(bVar.f64305a, bVar.f64306b), bVar.f64307c, bVar.f64308d);
        }
        U(this.X.E(bVar.f64305a, bVar.f64306b), false);
    }

    public static /* synthetic */ void i(n3 n3Var, w4 w4Var) {
        n3Var.getClass();
        try {
            n3Var.x(w4Var);
        } catch (s0 e10) {
            androidx.media3.common.util.z.e(K3, "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void i0() throws s0 {
        n3 n3Var;
        z3 z3VarX = this.f64299w.x();
        if (z3VarX == null) {
            return;
        }
        androidx.media3.exoplayer.trackselection.l0 l0VarP = z3VarX.p();
        int i10 = 0;
        while (i10 < this.f64262a.length) {
            if (l0VarP.c(i10) && this.f64262a[i10].s() && !this.f64262a[i10].u()) {
                this.f64262a[i10].V();
                n3Var = this;
                n3Var.C(z3VarX, i10, false, z3VarX.n());
            } else {
                n3Var = this;
            }
            i10++;
            this = n3Var;
        }
        n3 n3Var2 = this;
        if (n3Var2.t()) {
            n3Var2.H3 = z3VarX.f66951a.i();
            if (z3VarX.s()) {
                return;
            }
            n3Var2.f64299w.N(z3VarX);
            n3Var2.S(false);
            n3Var2.e0();
        }
    }

    private void j0(int i10) throws s0, IOException {
        d5 d5Var = this.f64262a[i10];
        try {
            d5Var.G((z3) androidx.media3.common.util.a.g(this.f64299w.u()));
        } catch (IOException | RuntimeException e10) {
            int iM = d5Var.m();
            if (iM != 3 && iM != 5) {
                throw e10;
            }
            androidx.media3.exoplayer.trackselection.l0 l0VarP = this.f64299w.u().p();
            androidx.media3.common.util.z.e(K3, "Disabling track due to error: " + androidx.media3.common.w.l(l0VarP.f65720c[i10].k()), e10);
            androidx.media3.exoplayer.trackselection.l0 l0Var = new androidx.media3.exoplayer.trackselection.l0((c5[]) l0VarP.f65719b.clone(), (androidx.media3.exoplayer.trackselection.c0[]) l0VarP.f65720c.clone(), l0VarP.f65721d, l0VarP.f65722e);
            l0Var.f65719b[i10] = null;
            l0Var.f65720c[i10] = null;
            z(i10);
            this.f64299w.u().a(l0Var, this.f64275j3.f65835s, false);
        }
    }

    private void j1(boolean z10) {
        if (z10 == this.f64298v3) {
            return;
        }
        this.f64298v3 = z10;
        if (z10 || !this.f64275j3.f65832p) {
            return;
        }
        this.f64270h.i(2);
    }

    private void k0(final int i10, final boolean z10) {
        boolean[] zArr = this.f64264c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f64288p2.g(new Runnable() { // from class: androidx.media3.exoplayer.j3
                @Override // java.lang.Runnable
                public final void run() {
                    n3 n3Var = this.f63922a;
                    int i11 = i10;
                    n3Var.H1.u0(i11, n3Var.f64262a[i11].m(), z10);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0090, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l0(long r10, long r12) throws androidx.media3.exoplayer.s0 {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.n3.l0(long, long):void");
    }

    private void l1(boolean z10) throws s0 {
        this.f64281m3 = z10;
        K0();
        if (this.f64283n3 && this.f64299w.y() != this.f64299w.u()) {
            U0(true);
            S(false);
        }
    }

    private boolean m0() throws s0 {
        a4 a4VarT;
        this.f64299w.K(this.f64302y3);
        boolean z10 = false;
        if (this.f64299w.U() && (a4VarT = this.f64299w.t(this.f64302y3, this.f64275j3)) != null) {
            z3 z3VarH = this.f64299w.h(a4VarT);
            if (!z3VarH.f66955e) {
                z3VarH.v(this, a4VarT.f62780b);
            } else if (z3VarH.f66956f) {
                this.f64270h.b(8, z3VarH.f66951a).a();
            }
            if (this.f64299w.u() == z3VarH) {
                L0(a4VarT.f62780b);
            }
            S(false);
            z10 = true;
        }
        if (!this.f64290q3) {
            e0();
            return z10;
        }
        this.f64290q3 = b0(this.f64299w.n());
        O1();
        return z10;
    }

    private void n0() {
        boolean z10;
        z3 z3VarU = this.f64299w.u();
        if (z3VarU != null) {
            androidx.media3.exoplayer.trackselection.l0 l0VarP = z3VarU.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f64262a.length) {
                    z10 = true;
                    break;
                }
                if (l0VarP.c(i10)) {
                    if (this.f64262a[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (l0VarP.f65719b[i10].f63543a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            j1(z11);
        }
    }

    private void n1(boolean z10, int i10, boolean z11, int i11) throws s0 {
        this.f64277k3.b(z11 ? 1 : 0);
        V1(z10, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    private void o0() throws s0 {
        boolean z10;
        boolean z11 = false;
        while (this.F1()) {
            if (z11) {
                this.h0();
            }
            this.I3 = false;
            z3 z3Var = (z3) androidx.media3.common.util.a.g(this.f64299w.b());
            if (this.f64275j3.f65818b.f65467a.equals(z3Var.f66958h.f62779a.f65467a)) {
                androidx.media3.exoplayer.source.t0.b bVar = this.f64275j3.f65818b;
                if (bVar.f65468b == -1) {
                    androidx.media3.exoplayer.source.t0.b bVar2 = z3Var.f66958h.f62779a;
                    if (bVar2.f65468b != -1 || bVar.f65471e == bVar2.f65471e) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            a4 a4Var = z3Var.f66958h;
            androidx.media3.exoplayer.source.t0.b bVar3 = a4Var.f62779a;
            long j10 = a4Var.f62780b;
            n3 n3Var = this;
            n3Var.f64275j3 = n3Var.Y(bVar3, j10, a4Var.f62781c, j10, !z10, 0);
            n3Var.K0();
            n3Var.X1();
            if (n3Var.t() && z3Var == n3Var.f64299w.x()) {
                n3Var.g0();
            }
            if (n3Var.f64275j3.f65821e == 3) {
                n3Var.K1();
            }
            n3Var.s();
            z11 = true;
            this = n3Var;
        }
    }

    private void p0(boolean z10) {
        if (this.F3.f62771a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f64275j3.f65817a.equals(this.G3)) {
            androidx.media3.common.z3 z3Var = this.f64275j3.f65817a;
            this.G3 = z3Var;
            this.f64299w.B(z3Var);
        }
        f0();
    }

    private void p1(androidx.media3.common.y0 y0Var) throws s0 {
        g1(y0Var);
        X(this.f64284o.c(), true);
    }

    private void q(b bVar, int i10) throws Throwable {
        this.f64277k3.b(1);
        r4 r4Var = this.X;
        if (i10 == -1) {
            i10 = r4Var.s();
        }
        U(r4Var.f(i10, bVar.f64305a, bVar.f64306b), false);
    }

    private void q0() throws s0 {
        z3 z3VarX;
        if (!this.f64283n3 && this.f64269g3 && !this.I3 && !t() && (z3VarX = this.f64299w.x()) != null && z3VarX == this.f64299w.y() && z3VarX.k() != null && z3VarX.k().f66956f) {
            this.f64299w.c();
            i0();
        }
    }

    private void r0() throws s0 {
        z3 z3VarY = this.f64299w.y();
        if (z3VarY == null) {
            return;
        }
        int i10 = 0;
        if (z3VarY.k() == null || this.f64283n3) {
            if (z3VarY.f66958h.f62788j || this.f64283n3) {
                d5[] d5VarArr = this.f64262a;
                int length = d5VarArr.length;
                while (i10 < length) {
                    d5 d5Var = d5VarArr[i10];
                    if (d5Var.w(z3VarY) && d5Var.r(z3VarY)) {
                        long j10 = z3VarY.f66958h.f62783e;
                        d5Var.O(z3VarY, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : z3VarY.m() + z3VarY.f66958h.f62783e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (Z()) {
            if (t() && this.f64299w.x() == this.f64299w.y()) {
                return;
            }
            if (z3VarY.k().f66956f || this.f64302y3 >= z3VarY.k().n()) {
                androidx.media3.exoplayer.trackselection.l0 l0VarP = z3VarY.p();
                z3 z3VarD = this.f64299w.d();
                androidx.media3.exoplayer.trackselection.l0 l0VarP2 = z3VarD.p();
                androidx.media3.common.z3 z3Var = this.f64275j3.f65817a;
                Y1(z3Var, z3VarD.f66958h.f62779a, z3Var, z3VarY.f66958h.f62779a, -9223372036854775807L, false);
                if (z3VarD.f66956f && ((this.f64269g3 && this.H3 != -9223372036854775807L) || z3VarD.f66951a.i() != -9223372036854775807L)) {
                    this.H3 = -9223372036854775807L;
                    boolean z10 = this.f64269g3 && !this.I3;
                    if (z10) {
                        for (int i11 = 0; i11 < this.f64262a.length; i11++) {
                            if (l0VarP2.c(i11) && !androidx.media3.common.s0.a(l0VarP2.f65720c[i11].k().f61761o, l0VarP2.f65720c[i11].k().f61757k) && !this.f64262a[i11].u()) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        b1(z3VarD.n());
                        if (z3VarD.s()) {
                            return;
                        }
                        this.f64299w.N(z3VarD);
                        S(false);
                        e0();
                        return;
                    }
                }
                d5[] d5VarArr2 = this.f64262a;
                int length2 = d5VarArr2.length;
                while (i10 < length2) {
                    d5VarArr2[i10].F(l0VarP, l0VarP2, z3VarD.n());
                    i10++;
                }
            }
        }
    }

    private void r1(ExoPlayer.c cVar) {
        this.F3 = cVar;
        this.f64299w.W(this.f64275j3.f65817a, cVar);
    }

    private void s() {
        androidx.media3.exoplayer.trackselection.l0 l0VarP = this.f64299w.u().p();
        for (int i10 = 0; i10 < this.f64262a.length; i10++) {
            if (l0VarP.c(i10)) {
                this.f64262a[i10].f();
            }
        }
    }

    private void s0() throws s0 {
        z3 z3VarY = this.f64299w.y();
        if (z3VarY != null && this.f64299w.u() != z3VarY && !z3VarY.f66959i && b2()) {
            this.f64299w.y().f66959i = true;
        }
    }

    private boolean t() {
        if (!this.f64269g3) {
            return false;
        }
        for (d5 d5Var : this.f64262a) {
            if (d5Var.u()) {
                return true;
            }
        }
        return false;
    }

    private void t0() throws Throwable {
        U(this.X.j(), true);
    }

    private void t1(int i10) throws s0 {
        this.f64291r3 = i10;
        int iY = this.f64299w.Y(this.f64275j3.f65817a, i10);
        if ((iY & 1) != 0) {
            U0(true);
        } else if ((iY & 2) != 0) {
            y();
        }
        S(false);
    }

    private void u0(c cVar) throws Throwable {
        this.f64277k3.b(1);
        U(this.X.x(cVar.f64309a, cVar.f64310b, cVar.f64311c, cVar.f64312d), false);
    }

    private void v() throws s0 {
        I0();
    }

    private void v1(f5 f5Var) {
        this.f64273i3 = f5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public z3 w(a4 a4Var, long j10) {
        return new z3(this.f64263b, j10, this.f64265d, this.f64267f.e(), this.X, a4Var, this.f64266e, this.F3.f62771a);
    }

    private void w0() {
        for (z3 z3VarU = this.f64299w.u(); z3VarU != null; z3VarU = z3VarU.k()) {
            for (androidx.media3.exoplayer.trackselection.c0 c0Var : z3VarU.p().f65720c) {
                if (c0Var != null) {
                    c0Var.e();
                }
            }
        }
    }

    private void x(w4 w4Var) throws s0 {
        if (w4Var.l()) {
            return;
        }
        try {
            w4Var.i().i(w4Var.k(), w4Var.g());
        } finally {
            w4Var.m(true);
        }
    }

    private void x0(boolean z10) {
        for (z3 z3VarU = this.f64299w.u(); z3VarU != null; z3VarU = z3VarU.k()) {
            for (androidx.media3.exoplayer.trackselection.c0 c0Var : z3VarU.p().f65720c) {
                if (c0Var != null) {
                    c0Var.w(z10);
                }
            }
        }
    }

    private void x1(boolean z10) throws s0 {
        this.f64293s3 = z10;
        int iZ = this.f64299w.Z(this.f64275j3.f65817a, z10);
        if ((iZ & 1) != 0) {
            U0(true);
        } else if ((iZ & 2) != 0) {
            y();
        }
        S(false);
    }

    private void y() {
        if (this.f64269g3 && t()) {
            for (d5 d5Var : this.f64262a) {
                int iH = d5Var.h();
                d5Var.c(this.f64284o);
                this.f64300w3 -= iH - d5Var.h();
            }
            this.H3 = -9223372036854775807L;
        }
    }

    private void y0() {
        for (z3 z3VarU = this.f64299w.u(); z3VarU != null; z3VarU = z3VarU.k()) {
            for (androidx.media3.exoplayer.trackselection.c0 c0Var : z3VarU.p().f65720c) {
                if (c0Var != null) {
                    c0Var.t();
                }
            }
        }
    }

    private void z(int i10) throws s0 {
        int iH = this.f64262a[i10].h();
        this.f64262a[i10].b(this.f64284o);
        k0(i10, false);
        this.f64300w3 -= iH;
    }

    private void z1(androidx.media3.exoplayer.source.u1 u1Var) throws Throwable {
        this.f64277k3.b(1);
        U(this.X.F(u1Var), false);
    }

    public void A0() {
        this.f64270h.a(29).a();
    }

    public synchronized boolean B1(@androidx.annotation.p0 Object obj, long j10) {
        try {
            if (!this.f64279l3 && this.f64274j.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                this.f64270h.b(30, new Pair(obj, atomicBoolean)).a();
                if (j10 == -9223372036854775807L) {
                    return true;
                }
                d2(new l3(atomicBoolean), j10);
                return atomicBoolean.get();
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean C0() {
        try {
            if (!this.f64279l3 && this.f64274j.getThread().isAlive()) {
                this.f64270h.i(7);
                d2(new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.i3
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return Boolean.valueOf(this.f63860a.f64279l3);
                    }
                }, this.Z);
                return this.f64279l3;
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void D1(float f10) {
        this.f64270h.b(32, Float.valueOf(f10)).a();
    }

    public void F(long j10) {
        this.D3 = j10;
    }

    public void G0(int i10, int i11, androidx.media3.exoplayer.source.u1 u1Var) {
        this.f64270h.e(20, i10, i11, u1Var).a();
    }

    public Looper L() {
        return this.f64274j;
    }

    public void L1() {
        this.f64270h.a(6).a();
    }

    public void Q1(int i10, int i11, List<androidx.media3.common.k0> list) {
        this.f64270h.e(27, i10, i11, list).a();
    }

    public void T0(androidx.media3.common.z3 z3Var, int i10, long j10) {
        this.f64270h.b(3, new h(z3Var, i10, j10)).a();
    }

    @Override // androidx.media3.exoplayer.trackselection.k0.b
    public void a(z4 z4Var) {
        this.f64270h.i(26);
    }

    @Override // androidx.media3.exoplayer.trackselection.k0.b
    public void b() {
        this.f64270h.i(10);
    }

    @Override // androidx.media3.exoplayer.r4.d
    public void c() {
        this.f64270h.k(2);
        this.f64270h.i(22);
    }

    public void c1(androidx.media3.common.d dVar, boolean z10) {
        this.f64270h.e(31, z10 ? 1 : 0, 0, dVar).a();
    }

    @Override // androidx.media3.exoplayer.w4.a
    public synchronized void d(w4 w4Var) {
        try {
            if (!this.f64279l3 && this.f64274j.getThread().isAlive()) {
                this.f64270h.b(14, w4Var).a();
                return;
            }
            androidx.media3.common.util.z.n(K3, "Ignoring messages sent after release.");
            w4Var.m(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean e1(boolean z10) {
        try {
            if (!this.f64279l3 && this.f64274j.getThread().isAlive()) {
                if (z10) {
                    this.f64270h.d(13, 1, 0).a();
                    return true;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                this.f64270h.e(13, 0, 0, atomicBoolean).a();
                d2(new l3(atomicBoolean), this.D3);
                return atomicBoolean.get();
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.h.b
    public void g(float f10) {
        this.f64270h.i(34);
    }

    @Override // androidx.media3.exoplayer.h.b
    public void h(int i10) {
        this.f64270h.d(33, i10, 0).a();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ef A[LOOP:1: B:143:0x02de->B:145:0x02ef, LOOP_END] */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        s0 s0Var;
        int i10;
        z3 z3VarY;
        int i11;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    n1(z10, i13 >> 4, true, i13 & 15);
                    break;
                case 2:
                    B();
                    break;
                case 3:
                    V0((h) message.obj);
                    break;
                case 4:
                    p1((androidx.media3.common.y0) message.obj);
                    break;
                case 5:
                    v1((f5) message.obj);
                    break;
                case 6:
                    M1(false, true);
                    break;
                case 7:
                    D0();
                    return true;
                case 8:
                    V((androidx.media3.exoplayer.source.s0) message.obj);
                    break;
                case 9:
                    Q((androidx.media3.exoplayer.source.s0) message.obj);
                    break;
                case 10:
                    H0();
                    break;
                case 11:
                    t1(message.arg1);
                    break;
                case 12:
                    x1(message.arg1 != 0);
                    break;
                case 13:
                    f1(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    Y0((w4) message.obj);
                    break;
                case 15:
                    a1((w4) message.obj);
                    break;
                case 16:
                    X((androidx.media3.common.y0) message.obj, false);
                    break;
                case 17:
                    h1((b) message.obj);
                    break;
                case 18:
                    q((b) message.obj, message.arg1);
                    break;
                case 19:
                    u0((c) message.obj);
                    break;
                case 20:
                    F0(message.arg1, message.arg2, (androidx.media3.exoplayer.source.u1) message.obj);
                    break;
                case 21:
                    z1((androidx.media3.exoplayer.source.u1) message.obj);
                    break;
                case 22:
                    t0();
                    break;
                case 23:
                    l1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    v();
                    break;
                case 26:
                    I0();
                    break;
                case 27:
                    R1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    r1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    B0();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    C1(pair.first, (AtomicBoolean) pair.second);
                    break;
                case 31:
                    d1((androidx.media3.common.d) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    E1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    O(message.arg1);
                    break;
                case 34:
                    P();
                    break;
            }
        } catch (androidx.media3.common.v0 e10) {
            int i14 = e10.f61712b;
            if (i14 == 1) {
                i11 = e10.f61711a ? 3001 : 3003;
            } else {
                if (i14 == 4) {
                    i11 = e10.f61711a ? 3002 : 3004;
                }
                R(e10, i12);
            }
            i12 = i11;
            R(e10, i12);
        } catch (androidx.media3.datasource.u e11) {
            R(e11, e11.f62580a);
        } catch (androidx.media3.exoplayer.drm.m.a e12) {
            R(e12, e12.f63701a);
        } catch (s0 e13) {
            e = e13;
            if (e.S3 == 1 && (z3VarY = this.f64299w.y()) != null) {
                d5[] d5VarArr = this.f64262a;
                int i15 = e.U3;
                e = e.j((!d5VarArr[i15 % d5VarArr.length].z(i15) || z3VarY.k() == null) ? z3VarY.f66958h.f62779a : z3VarY.k().f66958h.f62779a);
            }
            if (e.Y3 && (this.C3 == null || (i10 = e.f61851a) == 5004 || i10 == 5003)) {
                androidx.media3.common.util.z.o(K3, "Recoverable renderer error", e);
                s0 s0Var2 = this.C3;
                if (s0Var2 != null) {
                    s0Var2.addSuppressed(e);
                    e = this.C3;
                } else {
                    this.C3 = e;
                }
                androidx.media3.common.util.u uVar = this.f64270h;
                uVar.o(uVar.b(25, e));
            } else if (e.S3 == 1) {
                d5[] d5VarArr2 = this.f64262a;
                int i16 = e.U3;
                if (d5VarArr2[i16 % d5VarArr2.length].z(i16)) {
                    this.I3 = true;
                    y();
                    z3 z3VarX = this.f64299w.x();
                    z3 z3VarU = this.f64299w.u();
                    if (this.f64299w.u() != z3VarX) {
                        while (z3VarU != null && z3VarU.k() != z3VarX) {
                            z3VarU = z3VarU.k();
                        }
                    }
                    this.f64299w.N(z3VarU);
                    if (this.f64275j3.f65821e != 4) {
                        e0();
                        this.f64270h.i(2);
                    }
                } else {
                    s0Var = this.C3;
                    if (s0Var != null) {
                        s0Var.addSuppressed(e);
                        e = this.C3;
                    }
                    androidx.media3.common.util.z.e(K3, "Playback error", e);
                    if (e.S3 == 1 && this.f64299w.u() != this.f64299w.y()) {
                        while (this.f64299w.u() != this.f64299w.y()) {
                            this.f64299w.b();
                        }
                        z3 z3Var = (z3) androidx.media3.common.util.a.g(this.f64299w.u());
                        h0();
                        a4 a4Var = z3Var.f66958h;
                        androidx.media3.exoplayer.source.t0.b bVar = a4Var.f62779a;
                        long j10 = a4Var.f62780b;
                        this.f64275j3 = Y(bVar, j10, a4Var.f62781c, j10, true, 0);
                    }
                    M1(true, false);
                    this.f64275j3 = this.f64275j3.f(e);
                }
            } else {
                s0Var = this.C3;
                if (s0Var != null) {
                    s0Var.addSuppressed(e);
                    e = this.C3;
                }
                androidx.media3.common.util.z.e(K3, "Playback error", e);
                if (e.S3 == 1) {
                    while (this.f64299w.u() != this.f64299w.y()) {
                        this.f64299w.b();
                    }
                    z3 z3Var2 = (z3) androidx.media3.common.util.a.g(this.f64299w.u());
                    h0();
                    a4 a4Var2 = z3Var2.f66958h;
                    androidx.media3.exoplayer.source.t0.b bVar2 = a4Var2.f62779a;
                    long j11 = a4Var2.f62780b;
                    this.f64275j3 = Y(bVar2, j11, a4Var2.f62781c, j11, true, 0);
                }
                M1(true, false);
                this.f64275j3 = this.f64275j3.f(e);
            }
        } catch (androidx.media3.exoplayer.source.b e14) {
            R(e14, 1002);
        } catch (IOException e15) {
            R(e15, 2000);
        } catch (RuntimeException e16) {
            s0 s0VarO = s0.o(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            androidx.media3.common.util.z.e(K3, "Playback error", s0VarO);
            M1(true, false);
            this.f64275j3 = this.f64275j3.f(s0VarO);
        }
        h0();
        return true;
    }

    public void i1(List<r4.c> list, int i10, long j10, androidx.media3.exoplayer.source.u1 u1Var) {
        this.f64270h.b(17, new b(list, u1Var, i10, j10, null)).a();
    }

    @Override // androidx.media3.exoplayer.source.s0.a
    public void j(androidx.media3.exoplayer.source.s0 s0Var) {
        this.f64270h.b(8, s0Var).a();
    }

    public void k1(boolean z10) {
        this.f64270h.d(23, z10 ? 1 : 0, 0).a();
    }

    public void m1(boolean z10, int i10, int i11) {
        this.f64270h.d(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    public void o1(androidx.media3.common.y0 y0Var) {
        this.f64270h.b(4, y0Var).a();
    }

    public void q1(ExoPlayer.c cVar) {
        this.f64270h.b(28, cVar).a();
    }

    public void r(int i10, List<r4.c> list, androidx.media3.exoplayer.source.u1 u1Var) {
        this.f64270h.e(18, i10, 0, new b(list, u1Var, -1, -9223372036854775807L, null)).a();
    }

    public void s1(int i10) {
        this.f64270h.d(11, i10, 0).a();
    }

    @Override // androidx.media3.exoplayer.n.a
    public void u(androidx.media3.common.y0 y0Var) {
        this.f64270h.b(16, y0Var).a();
    }

    public void u1(f5 f5Var) {
        this.f64270h.b(5, f5Var).a();
    }

    public void v0(int i10, int i11, int i12, androidx.media3.exoplayer.source.u1 u1Var) {
        this.f64270h.b(19, new c(i10, i11, i12, u1Var)).a();
    }

    public void w1(boolean z10) {
        this.f64270h.d(12, z10 ? 1 : 0, 0).a();
    }

    public void y1(androidx.media3.exoplayer.source.u1 u1Var) {
        this.f64270h.b(21, u1Var).a();
    }

    @Override // androidx.media3.exoplayer.source.t1.a
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void l(androidx.media3.exoplayer.source.s0 s0Var) {
        this.f64270h.b(9, s0Var).a();
    }
}
