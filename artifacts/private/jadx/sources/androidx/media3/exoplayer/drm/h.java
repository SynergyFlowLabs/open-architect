package androidx.media3.exoplayer.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.analytics.j4;
import com.google.common.collect.l6;
import com.google.common.collect.nb;
import com.google.common.collect.z6;
import com.google.common.collect.z9;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class h implements u {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 3;
    public static final long F = 300000;
    private static final String G = "DefaultDrmSessionMgr";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f63630z = "PRCustomData";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f63631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0.g f63632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f63633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f63634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f63635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f63636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f63637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0579h f63638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.m f63639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i f63640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f63641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<androidx.media3.exoplayer.drm.g> f63642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<g> f63643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<androidx.media3.exoplayer.drm.g> f63644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f63645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private a0 f63646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.drm.g f63647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.drm.g f63648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f63649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f63650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f63651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private byte[] f63652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j4 f63653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    volatile d f63654y;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f63658d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f63655a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f63656b = androidx.media3.common.j.f60719n2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a0.g f63657c = k0.f63678k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f63659e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f63660f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.m f63661g = new androidx.media3.exoplayer.upstream.l();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f63662h = 300000;

        public h a(o0 o0Var) {
            return new h(this.f63656b, this.f63657c, o0Var, this.f63655a, this.f63658d, this.f63659e, this.f63660f, this.f63661g, this.f63662h);
        }

        @z7.a
        public b b(@androidx.annotation.p0 Map<String, String> map) {
            this.f63655a.clear();
            if (map != null) {
                this.f63655a.putAll(map);
            }
            return this;
        }

        @z7.a
        public b c(androidx.media3.exoplayer.upstream.m mVar) {
            this.f63661g = (androidx.media3.exoplayer.upstream.m) androidx.media3.common.util.a.g(mVar);
            return this;
        }

        @z7.a
        public b d(boolean z10) {
            this.f63658d = z10;
            return this;
        }

        @z7.a
        public b e(boolean z10) {
            this.f63660f = z10;
            return this;
        }

        @z7.a
        public b f(long j10) {
            androidx.media3.common.util.a.a(j10 > 0 || j10 == -9223372036854775807L);
            this.f63662h = j10;
            return this;
        }

        @z7.a
        public b g(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                androidx.media3.common.util.a.a(z10);
            }
            this.f63659e = (int[]) iArr.clone();
            return this;
        }

        @z7.a
        public b h(UUID uuid, a0.g gVar) {
            this.f63656b = (UUID) androidx.media3.common.util.a.g(uuid);
            this.f63657c = (a0.g) androidx.media3.common.util.a.g(gVar);
            return this;
        }
    }

    private class c implements a0.d {
        private c() {
        }

        @Override // androidx.media3.exoplayer.drm.a0.d
        public void a(a0 a0Var, @androidx.annotation.p0 byte[] bArr, int i10, int i11, @androidx.annotation.p0 byte[] bArr2) {
            ((d) androidx.media3.common.util.a.g(h.this.f63654y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @e.a({"HandlerLeak"})
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (androidx.media3.exoplayer.drm.g gVar : h.this.f63642m) {
                if (gVar.s(bArr)) {
                    gVar.y(message.what);
                    return;
                }
            }
        }
    }

    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements u.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final t.a f63665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private m f63666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f63667d;

        public g(t.a aVar) {
            this.f63665b = aVar;
        }

        public static /* synthetic */ void b(g gVar, androidx.media3.common.w wVar) {
            if (h.this.f63645p != 0 && !gVar.f63667d) {
                h hVar = h.this;
                gVar.f63666c = hVar.s((Looper) androidx.media3.common.util.a.g(hVar.f63649t), gVar.f63665b, wVar, false);
                h.this.f63643n.add(gVar);
            }
        }

        public static /* synthetic */ void c(g gVar) {
            if (gVar.f63667d) {
                return;
            }
            m mVar = gVar.f63666c;
            if (mVar != null) {
                mVar.d(gVar.f63665b);
            }
            h.this.f63643n.remove(gVar);
            gVar.f63667d = true;
        }

        public void d(final androidx.media3.common.w wVar) {
            ((Handler) androidx.media3.common.util.a.g(h.this.f63650u)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.g.b(this.f63673a, wVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.u.b
        public void release() {
            k1.O1((Handler) androidx.media3.common.util.a.g(h.this.f63650u), new Runnable() { // from class: androidx.media3.exoplayer.drm.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.g.c(this.f63675a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.h$h, reason: collision with other inner class name */
    private class C0579h implements androidx.media3.exoplayer.drm.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<androidx.media3.exoplayer.drm.g> f63669a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.exoplayer.drm.g f63670b;

        public C0579h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.g.a
        public void a() {
            this.f63670b = null;
            l6 l6VarW = l6.w(this.f63669a);
            this.f63669a.clear();
            nb it = l6VarW.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.drm.g) it.next()).z();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.g.a
        public void b(Exception exc, boolean z10) {
            this.f63670b = null;
            l6 l6VarW = l6.w(this.f63669a);
            this.f63669a.clear();
            nb it = l6VarW.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.drm.g) it.next()).A(exc, z10);
            }
        }

        @Override // androidx.media3.exoplayer.drm.g.a
        public void c(androidx.media3.exoplayer.drm.g gVar) {
            this.f63669a.add(gVar);
            if (this.f63670b != null) {
                return;
            }
            this.f63670b = gVar;
            gVar.E();
        }

        public void d(androidx.media3.exoplayer.drm.g gVar) {
            this.f63669a.remove(gVar);
            if (this.f63670b == gVar) {
                this.f63670b = null;
                if (this.f63669a.isEmpty()) {
                    return;
                }
                androidx.media3.exoplayer.drm.g next = this.f63669a.iterator().next();
                this.f63670b = next;
                next.E();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class i implements androidx.media3.exoplayer.drm.g.b {
        private i() {
        }

        @Override // androidx.media3.exoplayer.drm.g.b
        public void a(androidx.media3.exoplayer.drm.g gVar, int i10) {
            if (h.this.f63641l != -9223372036854775807L) {
                h.this.f63644o.remove(gVar);
                ((Handler) androidx.media3.common.util.a.g(h.this.f63650u)).removeCallbacksAndMessages(gVar);
            }
        }

        @Override // androidx.media3.exoplayer.drm.g.b
        public void b(final androidx.media3.exoplayer.drm.g gVar, int i10) {
            if (i10 == 1 && h.this.f63645p > 0 && h.this.f63641l != -9223372036854775807L) {
                h.this.f63644o.add(gVar);
                ((Handler) androidx.media3.common.util.a.g(h.this.f63650u)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        gVar.d(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f63641l);
            } else if (i10 == 0) {
                h.this.f63642m.remove(gVar);
                if (h.this.f63647r == gVar) {
                    h.this.f63647r = null;
                }
                if (h.this.f63648s == gVar) {
                    h.this.f63648s = null;
                }
                h.this.f63638i.d(gVar);
                if (h.this.f63641l != -9223372036854775807L) {
                    ((Handler) androidx.media3.common.util.a.g(h.this.f63650u)).removeCallbacksAndMessages(gVar);
                    h.this.f63644o.remove(gVar);
                }
            }
            h.this.C();
        }
    }

    private void B(Looper looper) {
        if (this.f63654y == null) {
            this.f63654y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f63646q != null && this.f63645p == 0 && this.f63642m.isEmpty() && this.f63643n.isEmpty()) {
            ((a0) androidx.media3.common.util.a.g(this.f63646q)).release();
            this.f63646q = null;
        }
    }

    private void D() {
        nb it = z6.A(this.f63644o).iterator();
        while (it.hasNext()) {
            ((m) it.next()).d(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        nb it = z6.A(this.f63643n).iterator();
        while (it.hasNext()) {
            ((g) it.next()).release();
        }
    }

    private void G(m mVar, @androidx.annotation.p0 t.a aVar) {
        mVar.d(aVar);
        if (this.f63641l != -9223372036854775807L) {
            mVar.d(null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f63649t == null) {
            androidx.media3.common.util.z.o(G, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) androidx.media3.common.util.a.g(this.f63649t)).getThread()) {
            androidx.media3.common.util.z.o(G, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f63649t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.p0
    public m s(Looper looper, @androidx.annotation.p0 t.a aVar, androidx.media3.common.w wVar, boolean z10) {
        List<DrmInitData.SchemeData> listX;
        B(looper);
        DrmInitData drmInitData = wVar.f61765s;
        if (drmInitData == null) {
            return z(androidx.media3.common.s0.m(wVar.f61761o), z10);
        }
        androidx.media3.exoplayer.drm.g gVar = null;
        Object[] objArr = 0;
        if (this.f63652w == null) {
            listX = x((DrmInitData) androidx.media3.common.util.a.g(drmInitData), this.f63631b, false);
            if (listX.isEmpty()) {
                e eVar = new e(this.f63631b);
                androidx.media3.common.util.z.e(G, "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new m.a(eVar, androidx.media3.common.x0.C3));
            }
        } else {
            listX = null;
        }
        if (this.f63635f) {
            for (androidx.media3.exoplayer.drm.g gVar2 : this.f63642m) {
                if (Objects.equals(gVar2.f63601f, listX)) {
                    gVar = gVar2;
                    break;
                }
            }
        } else {
            gVar = this.f63648s;
        }
        if (gVar != null) {
            gVar.f(aVar);
            return gVar;
        }
        androidx.media3.exoplayer.drm.g gVarW = w(listX, false, aVar, z10);
        if (!this.f63635f) {
            this.f63648s = gVarW;
        }
        this.f63642m.add(gVarW);
        return gVarW;
    }

    private static boolean t(m mVar) {
        if (mVar.getState() != 1) {
            return false;
        }
        Throwable cause = ((m.a) androidx.media3.common.util.a.g(mVar.T())).getCause();
        return (cause instanceof ResourceBusyException) || x.e(cause);
    }

    private boolean u(DrmInitData drmInitData) {
        if (this.f63652w != null) {
            return true;
        }
        if (x(drmInitData, this.f63631b, true).isEmpty()) {
            if (drmInitData.f60268d != 1 || !drmInitData.f(0).e(androidx.media3.common.j.f60709l2)) {
                return false;
            }
            androidx.media3.common.util.z.n(G, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f63631b);
        }
        String str = drmInitData.f60267c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return k1.f61540a >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private androidx.media3.exoplayer.drm.g v(@androidx.annotation.p0 List<DrmInitData.SchemeData> list, boolean z10, @androidx.annotation.p0 t.a aVar) {
        androidx.media3.common.util.a.g(this.f63646q);
        androidx.media3.exoplayer.drm.g gVar = new androidx.media3.exoplayer.drm.g(this.f63631b, this.f63646q, this.f63638i, this.f63640k, list, this.f63651v, this.f63637h | z10, z10, this.f63652w, this.f63634e, this.f63633d, (Looper) androidx.media3.common.util.a.g(this.f63649t), this.f63639j, (j4) androidx.media3.common.util.a.g(this.f63653x));
        gVar.f(aVar);
        if (this.f63641l != -9223372036854775807L) {
            gVar.f(null);
        }
        return gVar;
    }

    private androidx.media3.exoplayer.drm.g w(@androidx.annotation.p0 List<DrmInitData.SchemeData> list, boolean z10, @androidx.annotation.p0 t.a aVar, boolean z11) {
        androidx.media3.exoplayer.drm.g gVarV = v(list, z10, aVar);
        if (t(gVarV) && !this.f63644o.isEmpty()) {
            D();
            G(gVarV, aVar);
            gVarV = v(list, z10, aVar);
        }
        if (!t(gVarV) || !z11 || this.f63643n.isEmpty()) {
            return gVarV;
        }
        E();
        if (!this.f63644o.isEmpty()) {
            D();
        }
        G(gVarV, aVar);
        return v(list, z10, aVar);
    }

    private static List<DrmInitData.SchemeData> x(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f60268d);
        for (int i10 = 0; i10 < drmInitData.f60268d; i10++) {
            DrmInitData.SchemeData schemeDataF = drmInitData.f(i10);
            if ((schemeDataF.e(uuid) || (androidx.media3.common.j.f60714m2.equals(uuid) && schemeDataF.e(androidx.media3.common.j.f60709l2))) && (schemeDataF.f60273e != null || z10)) {
                arrayList.add(schemeDataF);
            }
        }
        return arrayList;
    }

    @il.d({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void y(Looper looper) {
        try {
            Looper looper2 = this.f63649t;
            if (looper2 == null) {
                this.f63649t = looper;
                this.f63650u = new Handler(looper);
            } else {
                androidx.media3.common.util.a.i(looper2 == looper);
                androidx.media3.common.util.a.g(this.f63650u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @androidx.annotation.p0
    private m z(int i10, boolean z10) {
        a0 a0Var = (a0) androidx.media3.common.util.a.g(this.f63646q);
        if ((a0Var.q() != 2 || !b0.f63590d) && k1.r1(this.f63636g, i10) != -1 && a0Var.q() != 1) {
            androidx.media3.exoplayer.drm.g gVar = this.f63647r;
            if (gVar == null) {
                androidx.media3.exoplayer.drm.g gVarW = w(l6.F(), true, null, z10);
                this.f63642m.add(gVarW);
                this.f63647r = gVarW;
            } else {
                gVar.f(null);
            }
            return this.f63647r;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.u
    public final void A() {
        H(true);
        int i10 = this.f63645p;
        this.f63645p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f63646q == null) {
            a0 a0VarA = this.f63632c.a(this.f63631b);
            this.f63646q = a0VarA;
            a0VarA.u(new c());
        } else if (this.f63641l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f63642m.size(); i11++) {
                this.f63642m.get(i11).f(null);
            }
        }
    }

    public void F(int i10, @androidx.annotation.p0 byte[] bArr) {
        androidx.media3.common.util.a.i(this.f63642m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            androidx.media3.common.util.a.g(bArr);
        }
        this.f63651v = i10;
        this.f63652w = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.u
    public int a(androidx.media3.common.w wVar) {
        H(false);
        int iQ = ((a0) androidx.media3.common.util.a.g(this.f63646q)).q();
        DrmInitData drmInitData = wVar.f61765s;
        if (drmInitData == null) {
            if (k1.r1(this.f63636g, androidx.media3.common.s0.m(wVar.f61761o)) == -1) {
                return 0;
            }
        } else if (!u(drmInitData)) {
            return 1;
        }
        return iQ;
    }

    @Override // androidx.media3.exoplayer.drm.u
    public void b(Looper looper, j4 j4Var) {
        y(looper);
        this.f63653x = j4Var;
    }

    @Override // androidx.media3.exoplayer.drm.u
    @androidx.annotation.p0
    public m c(@androidx.annotation.p0 t.a aVar, androidx.media3.common.w wVar) {
        H(false);
        androidx.media3.common.util.a.i(this.f63645p > 0);
        androidx.media3.common.util.a.k(this.f63649t);
        return s(this.f63649t, aVar, wVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.u
    public u.b d(@androidx.annotation.p0 t.a aVar, androidx.media3.common.w wVar) {
        androidx.media3.common.util.a.i(this.f63645p > 0);
        androidx.media3.common.util.a.k(this.f63649t);
        g gVar = new g(aVar);
        gVar.d(wVar);
        return gVar;
    }

    @Override // androidx.media3.exoplayer.drm.u
    public final void release() {
        H(true);
        int i10 = this.f63645p - 1;
        this.f63645p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f63641l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f63642m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((androidx.media3.exoplayer.drm.g) arrayList.get(i11)).d(null);
            }
        }
        E();
        C();
    }

    private h(UUID uuid, a0.g gVar, o0 o0Var, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, androidx.media3.exoplayer.upstream.m mVar, long j10) {
        androidx.media3.common.util.a.g(uuid);
        androidx.media3.common.util.a.b(!androidx.media3.common.j.f60709l2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63631b = uuid;
        this.f63632c = gVar;
        this.f63633d = o0Var;
        this.f63634e = map;
        this.f63635f = z10;
        this.f63636g = iArr;
        this.f63637h = z11;
        this.f63639j = mVar;
        this.f63638i = new C0579h();
        this.f63640k = new i();
        this.f63651v = 0;
        this.f63642m = new ArrayList();
        this.f63643n = z9.z();
        this.f63644o = z9.z();
        this.f63641l = j10;
    }
}
