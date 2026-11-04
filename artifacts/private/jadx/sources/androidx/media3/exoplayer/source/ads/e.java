package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.p0;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.z3;
import androidx.media3.datasource.r1;
import androidx.media3.datasource.x;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.f0;
import androidx.media3.exoplayer.source.g0;
import androidx.media3.exoplayer.source.s0;
import androidx.media3.exoplayer.source.t0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e extends androidx.media3.exoplayer.source.h<t0.b> {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final t0.b f64761p1 = new t0.b(new Object());

    @p0
    private d X;

    @p0
    private z3 Y;

    @p0
    private androidx.media3.common.b Z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g0 f64762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    final k0.f f64763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t0.a f64764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.ads.a f64765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media3.common.c f64766o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private b[][] f64767p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final x f64768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f64769t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Handler f64770v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z3.b f64771w;

    public static final class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f64772b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f64773c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f64774d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f64775e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64776a;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.ads.e$a$a, reason: collision with other inner class name */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0591a {
        }

        private a(int i10, Exception exc) {
            super(exc);
            this.f64776a = i10;
        }

        public static a a(Exception exc) {
            return new a(0, exc);
        }

        public static a b(Exception exc, int i10) {
            return new a(1, new IOException("Failed to load ad group " + i10, exc));
        }

        public static a c(Exception exc) {
            return new a(2, exc);
        }

        public static a d(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        public RuntimeException e() {
            boolean z10;
            if (this.f64776a == 3) {
                z10 = true;
                int i10 = 7 << 1;
            } else {
                z10 = false;
            }
            androidx.media3.common.util.a.i(z10);
            return (RuntimeException) androidx.media3.common.util.a.g(getCause());
        }
    }

    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t0.b f64777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<f0> f64778b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private k0 f64779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t0 f64780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private z3 f64781e;

        public b(t0.b bVar) {
            this.f64777a = bVar;
        }

        public s0 a(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
            f0 f0Var = new f0(bVar, bVar2, j10);
            this.f64778b.add(f0Var);
            t0 t0Var = this.f64780d;
            if (t0Var != null) {
                f0Var.x(t0Var);
                f0Var.y(e.this.new c((k0) androidx.media3.common.util.a.g(this.f64779c)));
            }
            z3 z3Var = this.f64781e;
            if (z3Var != null) {
                f0Var.a(new t0.b(z3Var.s(0), bVar.f65470d));
            }
            return f0Var;
        }

        public long b() {
            z3 z3Var = this.f64781e;
            if (z3Var == null) {
                return -9223372036854775807L;
            }
            return z3Var.j(0, e.this.f64771w).m();
        }

        public void c(z3 z3Var) {
            androidx.media3.common.util.a.a(z3Var.m() == 1);
            if (this.f64781e == null) {
                Object objS = z3Var.s(0);
                for (int i10 = 0; i10 < this.f64778b.size(); i10++) {
                    f0 f0Var = this.f64778b.get(i10);
                    f0Var.a(new t0.b(objS, f0Var.f65016a.f65470d));
                }
            }
            this.f64781e = z3Var;
        }

        public boolean d() {
            return this.f64780d != null;
        }

        public void e(t0 t0Var, k0 k0Var) {
            this.f64780d = t0Var;
            this.f64779c = k0Var;
            boolean z10 = true & false;
            for (int i10 = 0; i10 < this.f64778b.size(); i10++) {
                f0 f0Var = this.f64778b.get(i10);
                f0Var.x(t0Var);
                f0Var.y(e.this.new c(k0Var));
            }
            e.this.B0(this.f64777a, t0Var);
        }

        public boolean f() {
            return this.f64778b.isEmpty();
        }

        public void g() {
            if (d()) {
                e.this.C0(this.f64777a);
            }
        }

        public void h(f0 f0Var) {
            this.f64778b.remove(f0Var);
            f0Var.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k0 f64783a;

        public c(k0 k0Var) {
            this.f64783a = k0Var;
        }

        @Override // androidx.media3.exoplayer.source.f0.a
        public void a(final t0.b bVar) {
            e.this.f64770v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.g
                @Override // java.lang.Runnable
                public final void run() {
                    e.c cVar = this.f64791a;
                    t0.b bVar2 = bVar;
                    e.this.f64765n.d(e.this, bVar2.f65468b, bVar2.f65469c);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.f0.a
        public void b(final t0.b bVar, final IOException iOException) {
            e.this.X(bVar).s(new d0(d0.a(), new x(((k0.h) androidx.media3.common.util.a.g(this.f64783a.f60822b)).f60920a), SystemClock.elapsedRealtime()), 6, a.a(iOException), true);
            e.this.f64770v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    e.c cVar = this.f64788a;
                    t0.b bVar2 = bVar;
                    e.this.f64765n.g(e.this, bVar2.f65468b, bVar2.f65469c, iOException);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements androidx.media3.exoplayer.source.ads.a.InterfaceC0590a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f64785a = k1.H();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f64786b;

        public d() {
        }

        public static /* synthetic */ void e(d dVar, androidx.media3.common.b bVar) {
            if (dVar.f64786b) {
                return;
            }
            e.this.W0(bVar);
        }

        @Override // androidx.media3.exoplayer.source.ads.a.InterfaceC0590a
        public void c(final androidx.media3.common.b bVar) {
            if (this.f64786b) {
                return;
            }
            this.f64785a.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.h
                @Override // java.lang.Runnable
                public final void run() {
                    e.d.e(this.f64793a, bVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.ads.a.InterfaceC0590a
        public void d(a aVar, x xVar) {
            if (this.f64786b) {
                return;
            }
            e.this.X(null).s(new d0(d0.a(), xVar, SystemClock.elapsedRealtime()), 6, aVar, true);
        }

        public void f() {
            this.f64786b = true;
            int i10 = 3 >> 0;
            this.f64785a.removeCallbacksAndMessages(null);
        }
    }

    public e(t0 t0Var, x xVar, Object obj, t0.a aVar, androidx.media3.exoplayer.source.ads.a aVar2, androidx.media3.common.c cVar) {
        this(t0Var, xVar, obj, aVar, aVar2, cVar, true);
    }

    private static int O0(androidx.media3.common.b bVar, androidx.media3.common.b bVar2) {
        androidx.media3.common.util.a.i(bVar.b() == bVar2.b());
        int i10 = bVar2.f60423b - bVar.f60423b;
        androidx.media3.common.util.a.i(i10 >= 0);
        int i11 = bVar2.f60426e;
        while (i11 < bVar.f60423b) {
            androidx.media3.common.b.C0566b c0566bF = bVar.f(i11);
            if (c0566bF.k()) {
                androidx.media3.common.util.a.i(i11 == bVar.f60423b - 1);
                return i10;
            }
            androidx.media3.common.b.C0566b c0566bF2 = bVar2.f(i11);
            androidx.media3.common.util.a.i(c0566bF.f60440b <= c0566bF2.f60440b);
            androidx.media3.common.util.a.i(c0566bF.f60439a == c0566bF2.f60439a);
            for (int i12 = 0; i12 < c0566bF.f60440b; i12++) {
                k0 k0Var = c0566bF.f60443e[i12];
                if (k0Var != null) {
                    androidx.media3.common.util.a.i(k0Var.equals(c0566bF2.f60443e[i12]));
                }
            }
            i11++;
        }
        return i10;
    }

    @il.m({"adPlaybackState"})
    private long[][] P0() {
        boolean zB = ((androidx.media3.common.b) androidx.media3.common.util.a.g(this.Z)).b();
        int length = this.f64767p0.length + (zB ? 1 : 0);
        long[][] jArr = new long[length][];
        int i10 = 0;
        while (true) {
            b[][] bVarArr = this.f64767p0;
            if (i10 >= bVarArr.length) {
                break;
            }
            jArr[i10] = new long[bVarArr[i10].length];
            int i11 = 0;
            while (true) {
                b[] bVarArr2 = this.f64767p0[i10];
                if (i11 < bVarArr2.length) {
                    b bVar = bVarArr2[i11];
                    jArr[i10][i11] = bVar == null ? -9223372036854775807L : bVar.b();
                    i11++;
                }
            }
            i10++;
        }
        if (zB) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    @p0
    private static k0.b Q0(k0 k0Var) {
        k0.h hVar = k0Var.f60822b;
        if (hVar == null) {
            return null;
        }
        return hVar.f60923d;
    }

    private static b[][] T0(b[][] bVarArr, int i10) {
        int length = bVarArr.length + i10;
        b[][] bVarArr2 = new b[length][];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
        for (int length2 = bVarArr.length; length2 < length; length2++) {
            bVarArr2[length2] = new b[0];
        }
        return bVarArr2;
    }

    private void U0() {
        k0 k0VarA;
        androidx.media3.common.b bVar = this.Z;
        if (bVar == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f64767p0.length; i10++) {
            int i11 = 0;
            while (true) {
                b[] bVarArr = this.f64767p0[i10];
                if (i11 < bVarArr.length) {
                    b bVar2 = bVarArr[i11];
                    androidx.media3.common.b.C0566b c0566bF = bVar.f(i10);
                    if (bVar2 != null && !bVar2.d()) {
                        k0[] k0VarArr = c0566bF.f60443e;
                        if (i11 < k0VarArr.length && (k0VarA = k0VarArr[i11]) != null) {
                            if (this.f64763l != null) {
                                k0VarA = k0VarA.a().m(this.f64763l).a();
                            }
                            bVar2.e(this.f64764m.h(k0VarA), k0VarA);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    private void V0() {
        z3 z3Var = this.Y;
        androidx.media3.common.b bVar = this.Z;
        if (bVar == null || z3Var == null) {
            return;
        }
        if (bVar.f60423b == 0) {
            k0(z3Var);
        } else {
            this.Z = bVar.q(P0());
            k0(new l(z3Var, this.Z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(androidx.media3.common.b bVar) {
        androidx.media3.common.b bVar2 = this.Z;
        if (bVar2 == null) {
            b[][] bVarArr = new b[bVar.f60423b - (bVar.b() ? 1 : 0)][];
            this.f64767p0 = bVarArr;
            Arrays.fill(bVarArr, new b[0]);
        } else {
            int iO0 = O0(bVar2, bVar);
            if (iO0 > 0) {
                this.f64767p0 = T0(this.f64767p0, iO0);
            }
        }
        this.Z = bVar;
        U0();
        V0();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void K(k0 k0Var) {
        this.f64762k.K(k0Var);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(k0 k0Var) {
        return Objects.equals(Q0(g()), Q0(k0Var)) && this.f64762k.O(k0Var);
    }

    public Object R0() {
        return this.f64769t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public t0.b x0(t0.b bVar, t0.b bVar2) {
        return bVar.c() ? bVar : bVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public void A0(t0.b bVar, t0 t0Var, final z3 z3Var) {
        if (bVar.c()) {
            ((b) androidx.media3.common.util.a.g(this.f64767p0[bVar.f65468b][bVar.f65469c])).c(z3Var);
        } else {
            androidx.media3.common.util.a.a(z3Var.m() == 1);
            this.Y = z3Var;
            this.f64770v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.f64757a;
                    eVar.f64765n.f(eVar, z3Var);
                }
            });
        }
        V0();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public k0 g() {
        return this.f64762k.g();
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void j0(@p0 r1 r1Var) {
        super.j0(r1Var);
        final d dVar = new d();
        this.X = dVar;
        this.Y = this.f64762k.T0();
        B0(f64761p1, this.f64762k);
        this.f64770v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.b
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.f64755a;
                eVar.f64765n.b(eVar, eVar.f64768s, eVar.f64769t, eVar.f64766o, dVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        f0 f0Var = (f0) s0Var;
        t0.b bVar = f0Var.f65016a;
        if (!bVar.c()) {
            f0Var.w();
            return;
        }
        b bVar2 = (b) androidx.media3.common.util.a.g(this.f64767p0[bVar.f65468b][bVar.f65469c]);
        bVar2.h(f0Var);
        if (bVar2.f()) {
            bVar2.g();
            this.f64767p0[bVar.f65468b][bVar.f65469c] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void l0() {
        super.l0();
        final d dVar = (d) androidx.media3.common.util.a.g(this.X);
        this.X = null;
        dVar.f();
        this.Y = null;
        this.Z = null;
        this.f64767p0 = new b[0][];
        this.f64770v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.f64759a;
                eVar.f64765n.c(eVar, dVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        if (((androidx.media3.common.b) androidx.media3.common.util.a.g(this.Z)).f60423b <= 0 || !bVar.c()) {
            f0 f0Var = new f0(bVar, bVar2, j10);
            f0Var.x(this.f64762k);
            f0Var.a(bVar);
            return f0Var;
        }
        int i10 = bVar.f65468b;
        int i11 = bVar.f65469c;
        b[][] bVarArr = this.f64767p0;
        b[] bVarArr2 = bVarArr[i10];
        if (bVarArr2.length <= i11) {
            bVarArr[i10] = (b[]) Arrays.copyOf(bVarArr2, i11 + 1);
        }
        b bVar3 = this.f64767p0[i10][i11];
        if (bVar3 == null) {
            bVar3 = new b(bVar);
            this.f64767p0[i10][i11] = bVar3;
            U0();
        }
        return bVar3.a(bVar, bVar2, j10);
    }

    public e(t0 t0Var, x xVar, Object obj, t0.a aVar, androidx.media3.exoplayer.source.ads.a aVar2, androidx.media3.common.c cVar, boolean z10) {
        this.f64762k = new g0(t0Var, z10);
        this.f64763l = ((k0.h) androidx.media3.common.util.a.g(t0Var.g().f60822b)).f60922c;
        this.f64764m = aVar;
        this.f64765n = aVar2;
        this.f64766o = cVar;
        this.f64768s = xVar;
        this.f64769t = obj;
        this.f64770v = new Handler(Looper.getMainLooper());
        this.f64771w = new z3.b();
        this.f64767p0 = new b[0][];
        aVar2.a(aVar.c());
    }
}
