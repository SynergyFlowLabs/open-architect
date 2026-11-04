package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.c4;
import androidx.media3.common.e4;
import androidx.media3.common.i4;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.z3;
import androidx.media3.datasource.r1;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.analytics.j4;
import androidx.media3.exoplayer.b5;
import androidx.media3.exoplayer.e5;
import androidx.media3.exoplayer.source.h2;
import androidx.media3.exoplayer.source.s0;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.t3;
import androidx.media3.exoplayer.trackselection.j0;
import androidx.media3.exoplayer.trackselection.l0;
import com.google.common.collect.nb;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final androidx.media3.exoplayer.trackselection.n.e f64463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final androidx.media3.exoplayer.trackselection.n.e f64464p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0.h f64465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final t0 f64466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.trackselection.n f64467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b5 f64468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseIntArray f64469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f64470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z3.d f64471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f64472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f64473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f64474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private h2[] f64475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.exoplayer.trackselection.e0.a[] f64476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<androidx.media3.exoplayer.trackselection.c0>[][] f64477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<androidx.media3.exoplayer.trackselection.c0>[][] f64478n;

    public interface b {
        void a(l lVar);

        void b(l lVar, IOException iOException);
    }

    private static final class c extends androidx.media3.exoplayer.trackselection.c {

        private static final class a implements androidx.media3.exoplayer.trackselection.c0.b {
            private a() {
            }

            @Override // androidx.media3.exoplayer.trackselection.c0.b
            public androidx.media3.exoplayer.trackselection.c0[] a(androidx.media3.exoplayer.trackselection.c0.a[] aVarArr, androidx.media3.exoplayer.upstream.d dVar, t0.b bVar, z3 z3Var) {
                androidx.media3.exoplayer.trackselection.c0[] c0VarArr = new androidx.media3.exoplayer.trackselection.c0[aVarArr.length];
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    androidx.media3.exoplayer.trackselection.c0.a aVar = aVarArr[i10];
                    c0VarArr[i10] = aVar == null ? null : new c(aVar.f65676a, aVar.f65677b);
                }
                return c0VarArr;
            }
        }

        public c(b4 b4Var, int[] iArr) {
            super(b4Var, iArr);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public int a() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        @p0
        public Object n() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public int o() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.c0
        public void v(long j10, long j11, long j12, List<? extends androidx.media3.exoplayer.source.chunk.m> list, androidx.media3.exoplayer.source.chunk.n[] nVarArr) {
        }
    }

    private static final class d implements androidx.media3.exoplayer.upstream.d {
        private d() {
        }

        @Override // androidx.media3.exoplayer.upstream.d
        public void a(androidx.media3.exoplayer.upstream.d.a aVar) {
        }

        @Override // androidx.media3.exoplayer.upstream.d
        public long b() {
            return 0L;
        }

        @Override // androidx.media3.exoplayer.upstream.d
        public void d(Handler handler, androidx.media3.exoplayer.upstream.d.a aVar) {
        }

        @Override // androidx.media3.exoplayer.upstream.d
        @p0
        public r1 e() {
            return null;
        }
    }

    public static class e extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements t0.c, s0.a, Handler.Callback {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f64479k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f64480l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f64481m = 3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f64482n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f64483o = 1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f64484s = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t0 f64485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f64486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.exoplayer.upstream.b f64487c = new androidx.media3.exoplayer.upstream.i(true, 65536);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList<s0> f64488d = new ArrayList<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Handler f64489e = k1.K(new Handler.Callback() { // from class: androidx.media3.exoplayer.offline.m
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f64496a.b(message);
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final HandlerThread f64490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Handler f64491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public z3 f64492h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public s0[] f64493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f64494j;

        public f(t0 t0Var, l lVar) {
            this.f64485a = t0Var;
            this.f64486b = lVar;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f64490f = handlerThread;
            handlerThread.start();
            Handler handlerG = k1.G(handlerThread.getLooper(), this);
            this.f64491g = handlerG;
            handlerG.sendEmptyMessage(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(Message message) {
            boolean z10 = true | false;
            if (this.f64494j) {
                return false;
            }
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    this.f64486b.G();
                } catch (androidx.media3.exoplayer.s0 e10) {
                    this.f64489e.obtainMessage(2, new IOException(e10)).sendToTarget();
                }
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            d();
            this.f64486b.F((IOException) k1.o(message.obj));
            return true;
        }

        @Override // androidx.media3.exoplayer.source.t0.c
        public void B(t0 t0Var, z3 z3Var) {
            s0[] s0VarArr;
            if (this.f64492h == null) {
                if (z3Var.t(0, new z3.d()).i()) {
                    this.f64489e.obtainMessage(2, new e()).sendToTarget();
                    return;
                }
                this.f64492h = z3Var;
                this.f64493i = new s0[z3Var.m()];
                int i10 = 0;
                while (true) {
                    s0VarArr = this.f64493i;
                    if (i10 >= s0VarArr.length) {
                        break;
                    }
                    s0 s0VarX = this.f64485a.x(new t0.b(z3Var.s(i10)), this.f64487c, 0L);
                    this.f64493i[i10] = s0VarX;
                    this.f64488d.add(s0VarX);
                    i10++;
                }
                for (s0 s0Var : s0VarArr) {
                    s0Var.v(this, 0L);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.t1.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l(s0 s0Var) {
            if (this.f64488d.contains(s0Var)) {
                this.f64491g.obtainMessage(3, s0Var).sendToTarget();
            }
        }

        public void d() {
            if (this.f64494j) {
                return;
            }
            this.f64494j = true;
            this.f64491g.sendEmptyMessage(4);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.f64485a.C(this, null, j4.f63008d);
                this.f64491g.sendEmptyMessage(2);
                return true;
            }
            int i11 = 0;
            if (i10 == 2) {
                try {
                    if (this.f64493i == null) {
                        this.f64485a.a();
                    } else {
                        while (i11 < this.f64488d.size()) {
                            this.f64488d.get(i11).o();
                            i11++;
                        }
                    }
                    this.f64491g.sendEmptyMessageDelayed(2, 100L);
                } catch (IOException e10) {
                    this.f64489e.obtainMessage(2, e10).sendToTarget();
                }
                return true;
            }
            if (i10 == 3) {
                s0 s0Var = (s0) message.obj;
                if (this.f64488d.contains(s0Var)) {
                    s0Var.k(new t3.b().f(0L).d());
                }
                return true;
            }
            if (i10 != 4) {
                return false;
            }
            s0[] s0VarArr = this.f64493i;
            if (s0VarArr != null) {
                int length = s0VarArr.length;
                while (i11 < length) {
                    this.f64485a.l(s0VarArr[i11]);
                    i11++;
                }
            }
            this.f64485a.n(this);
            this.f64491g.removeCallbacksAndMessages(null);
            this.f64490f.quit();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.s0.a
        public void j(s0 s0Var) {
            this.f64488d.remove(s0Var);
            if (this.f64488d.isEmpty()) {
                this.f64491g.removeMessages(2);
                this.f64489e.sendEmptyMessage(1);
            }
        }
    }

    private static final class g implements b5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a5[] f64495a;

        @Override // androidx.media3.exoplayer.b5
        public a5[] a() {
            return this.f64495a;
        }

        @Override // androidx.media3.exoplayer.b5
        public void release() {
        }

        @Override // androidx.media3.exoplayer.b5
        public int size() {
            return this.f64495a.length;
        }

        private g(a5[] a5VarArr) {
            this.f64495a = a5VarArr;
        }
    }

    static {
        androidx.media3.exoplayer.trackselection.n.e eVarG = androidx.media3.exoplayer.trackselection.n.e.H0.I().S(true).q1(false).G();
        f64463o = eVarG;
        f64464p = eVarG;
    }

    public l(k0 k0Var, @p0 t0 t0Var, e4 e4Var, b5 b5Var) {
        this.f64465a = (k0.h) androidx.media3.common.util.a.g(k0Var.f60822b);
        this.f64466b = t0Var;
        int i10 = 2 ^ 0;
        androidx.media3.exoplayer.trackselection.n nVar = new androidx.media3.exoplayer.trackselection.n(e4Var, new c.a());
        this.f64467c = nVar;
        this.f64468d = b5Var;
        this.f64469e = new SparseIntArray();
        nVar.e(new androidx.media3.exoplayer.trackselection.k0.b() { // from class: androidx.media3.exoplayer.offline.k
            @Override // androidx.media3.exoplayer.trackselection.k0.b
            public final void b() {
                l.a();
            }
        }, new d());
        this.f64470f = k1.J();
        this.f64471g = new z3.d();
    }

    private static boolean E(k0.h hVar) {
        return k1.a1(hVar.f60920a, hVar.f60921b) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(final IOException iOException) {
        ((Handler) androidx.media3.common.util.a.g(this.f64470f)).post(new Runnable() { // from class: androidx.media3.exoplayer.offline.i
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = this.f64459a;
                ((l.b) androidx.media3.common.util.a.g(lVar.f64473i)).b(lVar, iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() throws androidx.media3.exoplayer.s0 {
        androidx.media3.common.util.a.g(this.f64474j);
        androidx.media3.common.util.a.g(this.f64474j.f64493i);
        androidx.media3.common.util.a.g(this.f64474j.f64492h);
        int length = this.f64474j.f64493i.length;
        int size = this.f64468d.size();
        this.f64477m = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        this.f64478n = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                this.f64477m[i10][i11] = new ArrayList();
                this.f64478n[i10][i11] = Collections.unmodifiableList(this.f64477m[i10][i11]);
            }
        }
        this.f64475k = new h2[length];
        this.f64476l = new androidx.media3.exoplayer.trackselection.e0.a[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f64475k[i12] = this.f64474j.f64493i[i12].m();
            this.f64467c.i(K(i12).f65722e);
            this.f64476l[i12] = (androidx.media3.exoplayer.trackselection.e0.a) androidx.media3.common.util.a.g(this.f64467c.o());
        }
        L();
        ((Handler) androidx.media3.common.util.a.g(this.f64470f)).post(new Runnable() { // from class: androidx.media3.exoplayer.offline.h
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = this.f64458a;
                ((l.b) androidx.media3.common.util.a.g(lVar.f64473i)).a(lVar);
            }
        });
    }

    @il.m({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private l0 K(int i10) throws androidx.media3.exoplayer.s0 {
        l0 l0VarK = this.f64467c.k(this.f64468d.a(), this.f64475k[i10], new t0.b(this.f64474j.f64492h.s(i10)), this.f64474j.f64492h);
        for (int i11 = 0; i11 < l0VarK.f65718a; i11++) {
            androidx.media3.exoplayer.trackselection.c0 c0Var = l0VarK.f65720c[i11];
            if (c0Var != null) {
                List<androidx.media3.exoplayer.trackselection.c0> list = this.f64477m[i10][i11];
                int i12 = 0;
                while (true) {
                    if (i12 >= list.size()) {
                        list.add(c0Var);
                        break;
                    }
                    androidx.media3.exoplayer.trackselection.c0 c0Var2 = list.get(i12);
                    if (c0Var2.g().equals(c0Var.g())) {
                        this.f64469e.clear();
                        for (int i13 = 0; i13 < c0Var2.length(); i13++) {
                            this.f64469e.put(c0Var2.b(i13), 0);
                        }
                        for (int i14 = 0; i14 < c0Var.length(); i14++) {
                            this.f64469e.put(c0Var.b(i14), 0);
                        }
                        int[] iArr = new int[this.f64469e.size()];
                        for (int i15 = 0; i15 < this.f64469e.size(); i15++) {
                            iArr[i15] = this.f64469e.keyAt(i15);
                        }
                        list.set(i12, new c(c0Var2.g(), iArr));
                        break;
                    }
                    i12++;
                }
            }
        }
        return l0VarK;
    }

    @il.m({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void L() {
        this.f64472h = true;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ androidx.media3.exoplayer.drm.u d(androidx.media3.exoplayer.drm.u uVar, k0 k0Var) {
        return uVar;
    }

    public static /* synthetic */ void e(l lVar, b bVar) {
        lVar.getClass();
        bVar.a(lVar);
    }

    @il.m({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void l(int i10, e4 e4Var) throws androidx.media3.exoplayer.s0 {
        this.f64467c.m(e4Var);
        K(i10);
        nb<c4> it = e4Var.D.values().iterator();
        while (it.hasNext()) {
            this.f64467c.m(e4Var.I().e0(it.next()).G());
            K(i10);
        }
    }

    @il.d({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void m() {
        androidx.media3.common.util.a.i(this.f64472h);
    }

    public static t0 o(DownloadRequest downloadRequest, androidx.media3.datasource.p.a aVar) {
        return p(downloadRequest, aVar, null);
    }

    public static t0 p(DownloadRequest downloadRequest, androidx.media3.datasource.p.a aVar, @p0 androidx.media3.exoplayer.drm.u uVar) {
        return q(downloadRequest.e(), aVar, uVar);
    }

    private static t0 q(k0 k0Var, androidx.media3.datasource.p.a aVar, @p0 final androidx.media3.exoplayer.drm.u uVar) {
        androidx.media3.exoplayer.source.q qVar = new androidx.media3.exoplayer.source.q(aVar, androidx.media3.extractor.w.f69568a);
        if (uVar != null) {
            qVar.e(new androidx.media3.exoplayer.drm.w() { // from class: androidx.media3.exoplayer.offline.g
                @Override // androidx.media3.exoplayer.drm.w
                public final androidx.media3.exoplayer.drm.u a(k0 k0Var2) {
                    return l.d(uVar, k0Var2);
                }
            });
        }
        return qVar.h(k0Var);
    }

    public static l r(Context context, k0 k0Var) {
        androidx.media3.common.util.a.a(E((k0.h) androidx.media3.common.util.a.g(k0Var.f60822b)));
        return u(k0Var, f64463o, null, null, null);
    }

    public static l s(Context context, k0 k0Var, @p0 e5 e5Var, @p0 androidx.media3.datasource.p.a aVar) {
        return u(k0Var, f64463o, e5Var, aVar, null);
    }

    public static l t(k0 k0Var, e4 e4Var, @p0 e5 e5Var, @p0 androidx.media3.datasource.p.a aVar) {
        return u(k0Var, e4Var, e5Var, aVar, null);
    }

    public static l u(k0 k0Var, e4 e4Var, @p0 e5 e5Var, @p0 androidx.media3.datasource.p.a aVar, @p0 androidx.media3.exoplayer.drm.u uVar) {
        boolean zE = E((k0.h) androidx.media3.common.util.a.g(k0Var.f60822b));
        androidx.media3.common.util.a.a(zE || aVar != null);
        return new l(k0Var, zE ? null : q(k0Var, (androidx.media3.datasource.p.a) k1.o(aVar), uVar), e4Var, e5Var != null ? new androidx.media3.exoplayer.o.b(e5Var).a() : new g(new a5[0]));
    }

    @Deprecated
    public static androidx.media3.exoplayer.trackselection.n.e v(Context context) {
        return f64463o;
    }

    public int A() {
        if (this.f64466b == null) {
            return 0;
        }
        m();
        return this.f64475k.length;
    }

    public h2 B(int i10) {
        m();
        return this.f64475k[i10];
    }

    public List<androidx.media3.exoplayer.trackselection.c0> C(int i10, int i11) {
        m();
        return this.f64478n[i10][i11];
    }

    public i4 D(int i10) {
        m();
        return j0.b(this.f64476l[i10], this.f64478n[i10]);
    }

    public void H(final b bVar) {
        androidx.media3.common.util.a.i(this.f64473i == null);
        this.f64473i = bVar;
        t0 t0Var = this.f64466b;
        if (t0Var != null) {
            this.f64474j = new f(t0Var, this);
        } else {
            this.f64470f.post(new Runnable() { // from class: androidx.media3.exoplayer.offline.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.e(this.f64461a, bVar);
                }
            });
        }
    }

    public void I() {
        f fVar = this.f64474j;
        if (fVar != null) {
            fVar.d();
        }
        this.f64467c.j();
        this.f64468d.release();
    }

    public void J(int i10, e4 e4Var) {
        try {
            m();
            n(i10);
            l(i10, e4Var);
        } catch (androidx.media3.exoplayer.s0 e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void h(String... strArr) {
        try {
            m();
            androidx.media3.exoplayer.trackselection.n.e.a aVarI = f64463o.I();
            aVarI.S(true);
            for (a5 a5Var : this.f64468d.a()) {
                int iF = a5Var.f();
                aVarI.w0(iF, iF != 1);
            }
            int iA = A();
            for (String str : strArr) {
                e4 e4VarG = aVarI.f0(str).G();
                for (int i10 = 0; i10 < iA; i10++) {
                    l(i10, e4VarG);
                }
            }
        } catch (androidx.media3.exoplayer.s0 e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void i(boolean z10, String... strArr) {
        try {
            m();
            androidx.media3.exoplayer.trackselection.n.e.a aVarI = f64463o.I();
            aVarI.v0(z10);
            aVarI.S(true);
            for (a5 a5Var : this.f64468d.a()) {
                int iF = a5Var.f();
                aVarI.w0(iF, iF != 3);
            }
            int iA = A();
            for (String str : strArr) {
                e4 e4VarG = aVarI.k0(str).G();
                for (int i10 = 0; i10 < iA; i10++) {
                    l(i10, e4VarG);
                }
            }
        } catch (androidx.media3.exoplayer.s0 e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void j(int i10, e4 e4Var) {
        try {
            m();
            l(i10, e4Var);
        } catch (androidx.media3.exoplayer.s0 e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void k(int i10, int i11, androidx.media3.exoplayer.trackselection.n.e eVar, List<androidx.media3.exoplayer.trackselection.n.g> list) {
        try {
            m();
            androidx.media3.exoplayer.trackselection.n.e.a aVarI = eVar.I();
            int i12 = 0;
            while (i12 < this.f64476l[i10].d()) {
                aVarI.Z1(i12, i12 != i11);
                i12++;
            }
            if (list.isEmpty()) {
                l(i10, aVarI.G());
                return;
            }
            h2 h2VarH = this.f64476l[i10].h(i11);
            for (int i13 = 0; i13 < list.size(); i13++) {
                aVarI.b2(i11, h2VarH, list.get(i13));
                l(i10, aVarI.G());
            }
        } catch (androidx.media3.exoplayer.s0 e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void n(int i10) {
        m();
        for (int i11 = 0; i11 < this.f64468d.size(); i11++) {
            this.f64477m[i10][i11].clear();
        }
    }

    public DownloadRequest w(String str, @p0 byte[] bArr) {
        DownloadRequest.b bVarF = new DownloadRequest.b(str, this.f64465a.f60920a).f(this.f64465a.f60921b);
        k0.f fVar = this.f64465a.f60922c;
        DownloadRequest.b bVarD = bVarF.e(fVar != null ? fVar.d() : null).c(this.f64465a.f60925f).d(bArr);
        if (this.f64466b == null) {
            return bVarD.a();
        }
        m();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.f64477m.length;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList2.clear();
            int length2 = this.f64477m[i10].length;
            for (int i11 = 0; i11 < length2; i11++) {
                arrayList2.addAll(this.f64477m[i10][i11]);
            }
            arrayList.addAll(this.f64474j.f64493i[i10].f(arrayList2));
        }
        return bVarD.g(arrayList).a();
    }

    public DownloadRequest x(@p0 byte[] bArr) {
        return w(this.f64465a.f60920a.toString(), bArr);
    }

    @p0
    public Object y() {
        if (this.f64466b == null) {
            return null;
        }
        m();
        if (this.f64474j.f64492h.v() > 0) {
            return this.f64474j.f64492h.t(0, this.f64471g).f61991d;
        }
        return null;
    }

    public androidx.media3.exoplayer.trackselection.e0.a z(int i10) {
        m();
        return this.f64476l[i10];
    }
}
