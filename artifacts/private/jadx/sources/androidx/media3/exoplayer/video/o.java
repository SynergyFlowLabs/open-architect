package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.media3.common.a1;
import androidx.media3.common.j4;
import androidx.media3.common.k4;
import androidx.media3.common.l4;
import androidx.media3.common.m4;
import androidx.media3.common.n4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.r0;
import androidx.media3.common.util.v0;
import androidx.media3.common.util.y0;
import androidx.media3.common.v3;
import androidx.media3.exoplayer.z4;
import com.google.common.base.s0;
import com.google.common.base.t0;
import com.google.common.collect.l6;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class o implements n0, m4.a {
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 0;
    private static final Executor D = new Executor() { // from class: androidx.media3.exoplayer.video.n
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            o.i(runnable);
        }
    };

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f66397z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f66398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0<Long> f66399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1.a f66400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<d> f66401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<androidx.media3.common.p> f66402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j4 f66403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m0 f66404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m0.c f66405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.common.util.j f66406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArraySet<e> f66407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f66408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.common.w f66409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.media3.common.util.u f66410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a1 f66411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f66412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private Pair<Surface, r0> f66413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f66414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f66415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private z4.c f66416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f66417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f66418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f66419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f66420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f66421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f66422y;

    class a implements m0.c {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.m0.c
        public void a() {
            ((a1) androidx.media3.common.util.a.k(o.this.f66411n)).a(-2L);
        }

        @Override // androidx.media3.exoplayer.video.m0.c
        public void b(long j10) {
            ((a1) androidx.media3.common.util.a.k(o.this.f66411n)).a(j10);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f66424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f66425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l4.a f66426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a1.a f66427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<androidx.media3.common.p> f66428e = l6.F();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private j4 f66429f = j4.f60790a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.media3.common.util.j f66430g = androidx.media3.common.util.j.f61520a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f66431h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f66432i;

        public b(Context context, x xVar) {
            this.f66424a = context.getApplicationContext();
            this.f66425b = xVar;
        }

        public o h() {
            androidx.media3.common.util.a.i(!this.f66432i);
            a aVar = null;
            int i10 = 5 >> 0;
            if (this.f66427d == null) {
                if (this.f66426c == null) {
                    this.f66426c = new f(aVar);
                }
                this.f66427d = new g(this.f66426c);
            }
            o oVar = new o(this, aVar);
            this.f66432i = true;
            return oVar;
        }

        @z7.a
        public b i(androidx.media3.common.util.j jVar) {
            this.f66430g = jVar;
            return this;
        }

        @z7.a
        public b j(List<androidx.media3.common.p> list) {
            this.f66428e = list;
            return this;
        }

        @z7.a
        public b k(j4 j4Var) {
            this.f66429f = j4Var;
            return this;
        }

        @z7.a
        public b l(a1.a aVar) {
            this.f66427d = aVar;
            return this;
        }

        @z7.a
        public b m(boolean z10) {
            this.f66431h = z10;
            return this;
        }

        @z7.a
        public b n(l4.a aVar) {
            this.f66426c = aVar;
            return this;
        }
    }

    private final class c implements m0.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void a(m0 m0Var) {
            Iterator it = o.this.f66407j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).A(o.this);
            }
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void b(m0 m0Var, m0.d dVar) {
            Iterator it = o.this.f66407j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).u(o.this, k4.a(dVar));
            }
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void c(m0 m0Var) {
            Iterator it = o.this.f66407j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).p(o.this);
            }
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void d(m0 m0Var, n4 n4Var) {
            Iterator it = o.this.f66407j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).e(o.this, n4Var);
            }
        }

        /* synthetic */ c(o oVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements m0, e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f66434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f66435d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private l4 f66437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private androidx.media3.common.w f66438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f66439h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f66440i;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f66444m;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private l6<androidx.media3.common.p> f66436e = l6.F();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f66441j = -9223372036854775807L;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private m0.b f66442k = m0.b.f66395a;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Executor f66443l = o.D;

        public d(Context context, int i10) {
            this.f66435d = i10;
            this.f66434c = k1.y0(context);
        }

        public static /* synthetic */ void C(d dVar, m0.b bVar, k4 k4Var) {
            dVar.getClass();
            bVar.b(dVar, new m0.d(k4Var, (androidx.media3.common.w) androidx.media3.common.util.a.k(dVar.f66438g)));
        }

        public static /* synthetic */ void D(d dVar, m0.b bVar, n4 n4Var) {
            dVar.getClass();
            bVar.d(dVar, n4Var);
        }

        public static /* synthetic */ void E(d dVar, m0.b bVar) {
            dVar.getClass();
            bVar.c((m0) androidx.media3.common.util.a.k(dVar));
        }

        public static /* synthetic */ void F(d dVar, m0.b bVar) {
            dVar.getClass();
            bVar.a(dVar);
        }

        private void H(androidx.media3.common.w wVar) {
            ((l4) androidx.media3.common.util.a.k(this.f66437f)).i(this.f66439h, wVar.b().T(o.I(wVar.C)).N(), this.f66436e, 0L);
        }

        private void I(List<androidx.media3.common.p> list) {
            if (o.this.f66400c.b()) {
                this.f66436e = l6.w(list);
            } else {
                this.f66436e = new l6.a().c(list).c(o.this.f66402e).e();
            }
        }

        @Override // androidx.media3.exoplayer.video.o.e
        public void A(o oVar) {
            final m0.b bVar = this.f66442k;
            this.f66443l.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.r
                @Override // java.lang.Runnable
                public final void run() {
                    o.d.F(this.f66454a, bVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void B(boolean z10) {
            o.this.f66404g.B(z10);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void G(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
            o.this.R(f10);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void L(List<androidx.media3.common.p> list) {
            if (this.f66436e.equals(list)) {
                return;
            }
            I(list);
            androidx.media3.common.w wVar = this.f66438g;
            if (wVar != null) {
                H(wVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.m0
        @il.e(expression = {"videoFrameProcessor"}, result = true)
        public boolean Z() {
            return this.f66437f != null;
        }

        @Override // androidx.media3.exoplayer.video.m0
        public boolean a() {
            return Z() && o.this.J();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public Surface b() {
            androidx.media3.common.util.a.i(Z());
            return ((l4) androidx.media3.common.util.a.k(this.f66437f)).b();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void c(Surface surface, r0 r0Var) {
            o.this.c(surface, r0Var);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void d() {
            if (!this.f66444m && Z()) {
                this.f66437f.d();
                this.f66444m = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.o.e
        public void e(o oVar, final n4 n4Var) {
            final m0.b bVar = this.f66442k;
            this.f66443l.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.p
                @Override // java.lang.Runnable
                public final void run() {
                    o.d.D(this.f66448a, bVar, n4Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void f() {
            o.this.f();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void g(long j10, long j11) throws m0.d {
            o.this.P(j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void h() {
            o.this.f66418u = this.f66441j;
            if (o.this.f66417t >= o.this.f66418u) {
                o.this.f66404g.h();
                o.this.f66419v = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void i() {
            o.this.f66404g.i();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void j() {
            o.this.f66404g.j();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void k(w wVar) {
            o.this.T(wVar);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public boolean l(androidx.media3.common.w wVar) throws m0.d {
            androidx.media3.common.util.a.i(!Z());
            l4 l4VarN = o.this.N(wVar, this.f66435d);
            this.f66437f = l4VarN;
            return l4VarN != null;
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void m(boolean z10) {
            o.this.f66404g.m(z10);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void n(int i10) {
            o.this.f66404g.n(i10);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public boolean o(Bitmap bitmap, y0 y0Var) {
            androidx.media3.common.util.a.i(Z());
            if (!o.this.U() || !((l4) androidx.media3.common.util.a.g(this.f66437f)).g(bitmap, y0Var)) {
                return false;
            }
            long jA = y0Var.a() - this.f66440i;
            androidx.media3.common.util.a.i(jA != -9223372036854775807L);
            this.f66441j = jA;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.o.e
        public void p(o oVar) {
            final m0.b bVar = this.f66442k;
            this.f66443l.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.s
                @Override // java.lang.Runnable
                public final void run() {
                    o.d.E(this.f66456a, bVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void q(m0.b bVar, Executor executor) {
            this.f66442k = bVar;
            this.f66443l = executor;
        }

        @Override // androidx.media3.exoplayer.video.m0
        public boolean r(long j10, boolean z10, m0.c cVar) {
            androidx.media3.common.util.a.i(Z());
            if (!o.this.U() || ((l4) androidx.media3.common.util.a.k(this.f66437f)).k() >= this.f66434c || !((l4) androidx.media3.common.util.a.k(this.f66437f)).j()) {
                return false;
            }
            this.f66441j = j10 - this.f66440i;
            cVar.b(j10 * 1000);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void release() {
            o.this.release();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void s(long j10, long j11) {
            v0 v0Var = o.this.f66399b;
            long j12 = this.f66441j;
            v0Var.a(j12 == -9223372036854775807L ? 0L : j12 + 1, Long.valueOf(j10));
            this.f66440i = j11;
            o.this.Q(j11);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void t(z4.c cVar) {
            o.this.f66416s = cVar;
        }

        @Override // androidx.media3.exoplayer.video.o.e
        public void u(o oVar, final k4 k4Var) {
            final m0.b bVar = this.f66442k;
            this.f66443l.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.q
                @Override // java.lang.Runnable
                public final void run() {
                    o.d.C(this.f66451a, bVar, k4Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.m0
        public boolean v(boolean z10) {
            boolean z11;
            o oVar = o.this;
            if (z10 && Z()) {
                z11 = true;
                int i10 = 7 << 1;
            } else {
                z11 = false;
            }
            return oVar.L(z11);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void w() {
            o.this.f66404g.w();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void x(int i10, androidx.media3.common.w wVar, List<androidx.media3.common.p> list) {
            androidx.media3.common.util.a.i(Z());
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            I(list);
            this.f66439h = i10;
            this.f66438g = wVar;
            o.this.f66418u = -9223372036854775807L;
            o.this.f66419v = false;
            H(wVar);
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void y() {
            o.this.f66404g.y();
        }

        @Override // androidx.media3.exoplayer.video.m0
        public void z(boolean z10) {
            if (Z()) {
                this.f66437f.flush();
            }
            this.f66441j = -9223372036854775807L;
            o.this.H(z10);
            this.f66444m = false;
        }
    }

    public interface e {
        void A(o oVar);

        void e(o oVar, n4 n4Var);

        void p(o oVar);

        void u(o oVar, k4 k4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements l4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s0<l4.a> f66446a = t0.b(new s0() { // from class: androidx.media3.exoplayer.video.t
            @Override // com.google.common.base.s0
            public final Object get() {
                return o.f.b();
            }
        });

        private f() {
        }

        public static /* synthetic */ l4.a b() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (l4.a) androidx.media3.common.util.a.g(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // androidx.media3.common.l4.a
        public l4 a(Context context, androidx.media3.common.n nVar, androidx.media3.common.k kVar, boolean z10, Executor executor, l4.c cVar) throws k4 {
            return f66446a.get().a(context, nVar, kVar, z10, executor, cVar);
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static final class g implements a1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l4.a f66447a;

        public g(l4.a aVar) {
            this.f66447a = aVar;
        }

        @Override // androidx.media3.common.a1.a
        public a1 a(Context context, androidx.media3.common.k kVar, androidx.media3.common.n nVar, m4.a aVar, Executor executor, j4 j4Var, List<androidx.media3.common.p> list, long j10) throws k4 {
            try {
                return ((a1.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(l4.a.class).newInstance(this.f66447a)).a(context, kVar, nVar, aVar, executor, j4Var, list, j10);
            } catch (Exception e10) {
                throw k4.a(e10);
            }
        }

        @Override // androidx.media3.common.a1.a
        public boolean b() {
            return false;
        }
    }

    /* synthetic */ o(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(boolean z10) {
        if (K()) {
            this.f66414q++;
            this.f66404g.z(z10);
            while (this.f66399b.l() > 1) {
                this.f66399b.i();
            }
            if (this.f66399b.l() == 1) {
                this.f66404g.s(((Long) androidx.media3.common.util.a.g(this.f66399b.i())).longValue(), this.f66420w);
            }
            this.f66417t = -9223372036854775807L;
            this.f66418u = -9223372036854775807L;
            this.f66419v = false;
            ((androidx.media3.common.util.u) androidx.media3.common.util.a.k(this.f66410m)).g(new Runnable() { // from class: androidx.media3.exoplayer.video.m
                @Override // java.lang.Runnable
                public final void run() {
                    o.j(this.f66392a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.common.k I(@p0 androidx.media3.common.k kVar) {
        if (kVar != null && kVar.k()) {
            return kVar;
        }
        return androidx.media3.common.k.f60792h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        return this.f66414q == 0 && this.f66419v && this.f66404g.a();
    }

    private boolean K() {
        return this.f66415r == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L(boolean z10) {
        return this.f66404g.v(z10 && this.f66414q == 0);
    }

    private void M(@p0 Surface surface, int i10, int i11) {
        a1 a1Var = this.f66411n;
        if (a1Var == null) {
            return;
        }
        if (surface != null) {
            a1Var.c(new v3(surface, i10, i11));
            this.f66404g.c(surface, new r0(i10, i11));
        } else {
            a1Var.c(null);
            this.f66404g.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public l4 N(androidx.media3.common.w wVar, int i10) throws m0.d {
        o oVar;
        a aVar = null;
        if (i10 == 0) {
            androidx.media3.common.util.a.i(this.f66415r == 0);
            androidx.media3.common.k kVarI = I(wVar.C);
            if (this.f66408k) {
                kVarI = androidx.media3.common.k.f60792h;
            } else if (kVarI.f60802c == 7 && k1.f61540a < 34) {
                kVarI = kVarI.a().e(6).a();
            }
            androidx.media3.common.k kVar = kVarI;
            final androidx.media3.common.util.u uVarD = this.f66406i.d((Looper) androidx.media3.common.util.a.k(Looper.myLooper()), null);
            this.f66410m = uVarD;
            try {
                a1.a aVar2 = this.f66400c;
                Context context = this.f66398a;
                androidx.media3.common.n nVar = androidx.media3.common.n.f60985a;
                Objects.requireNonNull(uVarD);
                oVar = this;
                a1 a1VarA = aVar2.a(context, kVar, nVar, oVar, new Executor() { // from class: androidx.media3.exoplayer.video.l
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        uVarD.g(runnable);
                    }
                }, this.f66403f, this.f66402e, 0L);
                oVar.f66411n = a1VarA;
                a1VarA.initialize();
                Pair<Surface, r0> pair = oVar.f66413p;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    r0 r0Var = (r0) pair.second;
                    oVar.M(surface, r0Var.b(), r0Var.a());
                }
                oVar.f66404g.l(wVar);
                oVar.f66415r = 1;
            } catch (k4 e10) {
                throw new m0.d(e10, wVar);
            }
        } else {
            oVar = this;
            if (!oVar.K()) {
                return null;
            }
        }
        try {
            ((a1) androidx.media3.common.util.a.g(oVar.f66411n)).e(i10);
            oVar.f66422y++;
            m0 m0Var = oVar.f66404g;
            c cVar = new c(oVar, aVar);
            final androidx.media3.common.util.u uVar = (androidx.media3.common.util.u) androidx.media3.common.util.a.g(oVar.f66410m);
            Objects.requireNonNull(uVar);
            m0Var.q(cVar, new Executor() { // from class: androidx.media3.exoplayer.video.l
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    uVar.g(runnable);
                }
            });
            return oVar.f66411n.b(i10);
        } catch (k4 e11) {
            throw new m0.d(e11, wVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(long j10, long j11) throws m0.d {
        this.f66404g.g(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(long j10) {
        this.f66420w = j10;
        this.f66404g.s(this.f66412o, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(float f10) {
        this.f66404g.G(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(w wVar) {
        this.f66404g.k(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        int i10 = this.f66421x;
        return i10 != -1 && i10 == this.f66422y;
    }

    public static /* synthetic */ void i(Runnable runnable) {
    }

    public static /* synthetic */ void j(o oVar) {
        oVar.f66414q--;
    }

    public void G(e eVar) {
        this.f66407j.add(eVar);
    }

    public void O(e eVar) {
        this.f66407j.remove(eVar);
    }

    public void S(int i10) {
        this.f66421x = i10;
    }

    @Override // androidx.media3.common.m4.a
    public void a(k4 k4Var) {
        Iterator<e> it = this.f66407j.iterator();
        while (it.hasNext()) {
            it.next().u(this, k4Var);
        }
    }

    @Override // androidx.media3.common.m4.a
    public void b(float f10) {
        androidx.media3.common.w wVarN = this.f66409l.b().b0(f10).N();
        this.f66409l = wVarN;
        this.f66404g.x(1, wVarN, l6.F());
    }

    @Override // androidx.media3.exoplayer.video.n0
    public void c(Surface surface, r0 r0Var) {
        Pair<Surface, r0> pair = this.f66413p;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((r0) this.f66413p.second).equals(r0Var)) {
            return;
        }
        this.f66413p = Pair.create(surface, r0Var);
        M(surface, r0Var.b(), r0Var.a());
    }

    @Override // androidx.media3.common.m4.a
    public void d(long j10) {
        if (this.f66414q <= 0) {
            z4.c cVar = this.f66416s;
            if (cVar != null) {
                cVar.b();
            }
            long j11 = j10 - this.f66420w;
            this.f66417t = j11;
            Long lJ = this.f66399b.j(j11);
            if (lJ != null && lJ.longValue() != this.f66412o) {
                this.f66404g.s(lJ.longValue(), this.f66420w);
                this.f66412o = lJ.longValue();
            }
            long j12 = this.f66418u;
            boolean z10 = j12 != -9223372036854775807L && j11 >= j12;
            this.f66404g.r(j10, z10, this.f66405h);
            if (z10) {
                this.f66404g.h();
                this.f66419v = true;
            }
        }
    }

    @Override // androidx.media3.common.m4.a
    public void e(int i10, int i11) {
        androidx.media3.common.w wVarN = this.f66409l.b().B0(i10).d0(i11).N();
        this.f66409l = wVarN;
        this.f66404g.x(1, wVarN, l6.F());
    }

    @Override // androidx.media3.exoplayer.video.n0
    public void f() {
        r0 r0Var = r0.f61638c;
        M(null, r0Var.b(), r0Var.a());
        this.f66413p = null;
    }

    @Override // androidx.media3.exoplayer.video.n0
    public m0 g(int i10) {
        androidx.media3.common.util.a.i(!k1.y(this.f66401d, i10));
        d dVar = new d(this.f66398a, i10);
        G(dVar);
        this.f66401d.put(i10, dVar);
        return dVar;
    }

    @Override // androidx.media3.common.m4.a
    public void h(long j10) {
    }

    @Override // androidx.media3.exoplayer.video.n0
    public void release() {
        if (this.f66415r == 2) {
            return;
        }
        androidx.media3.common.util.u uVar = this.f66410m;
        if (uVar != null) {
            uVar.c(null);
        }
        a1 a1Var = this.f66411n;
        if (a1Var != null) {
            a1Var.release();
        }
        this.f66413p = null;
        this.f66415r = 2;
    }

    private o(b bVar) {
        this.f66398a = bVar.f66424a;
        this.f66399b = new v0<>();
        this.f66400c = (a1.a) androidx.media3.common.util.a.k(bVar.f66427d);
        this.f66401d = new SparseArray<>();
        this.f66402e = bVar.f66428e;
        this.f66403f = bVar.f66429f;
        androidx.media3.common.util.j jVar = bVar.f66430g;
        this.f66406i = jVar;
        this.f66404g = new androidx.media3.exoplayer.video.e(bVar.f66425b, jVar);
        this.f66405h = new a();
        this.f66407j = new CopyOnWriteArraySet<>();
        this.f66408k = bVar.f66431h;
        this.f66409l = new androidx.media3.common.w.b().N();
        this.f66417t = -9223372036854775807L;
        this.f66418u = -9223372036854775807L;
        this.f66421x = -1;
        this.f66415r = 0;
    }
}
