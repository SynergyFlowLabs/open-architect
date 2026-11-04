package androidx.media3.exoplayer.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.analytics.j4;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
class g implements m {
    private static final String E = "DefaultDrmSession";
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 60;

    @androidx.annotation.p0
    private byte[] A;
    private byte[] B;

    @androidx.annotation.p0
    private a0.b C;

    @androidx.annotation.p0
    private a0.h D;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final List<DrmInitData.SchemeData> f63601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0 f63602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f63603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f63604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f63605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f63606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f63607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HashMap<String, String> f63608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media3.common.util.p<t.a> f63609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.m f63610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final j4 f63611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o0 f63612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final UUID f63613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Looper f63614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final e f63615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f63616u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f63617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private HandlerThread f63618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private c f63619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.decoder.b f63620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    private m.a f63621z;

    public interface a {
        void a();

        void b(Exception exc, boolean z10);

        void c(g gVar);
    }

    public interface b {
        void a(g gVar, int i10);

        void b(g gVar, int i10);
    }

    @e.a({"HandlerLeak"})
    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f63622a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, p0 p0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f63625b) {
                return false;
            }
            int i10 = dVar.f63628e + 1;
            dVar.f63628e = i10;
            if (i10 > g.this.f63610o.a(3)) {
                return false;
            }
            long jD = g.this.f63610o.d(new androidx.media3.exoplayer.upstream.m.d(new androidx.media3.exoplayer.source.d0(dVar.f63624a, p0Var.f63710a, p0Var.f63711b, p0Var.f63712c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f63626c, p0Var.f63713d), new androidx.media3.exoplayer.source.h0(3), p0Var.getCause() instanceof IOException ? (IOException) p0Var.getCause() : new f(p0Var.getCause()), dVar.f63628e));
            if (jD == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f63622a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jD);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(androidx.media3.exoplayer.source.d0.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            try {
                removeCallbacksAndMessages(null);
                this.f63622a = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    objB = g.this.f63612q.b(g.this.f63613r, (a0.h) dVar.f63627d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    objB = g.this.f63612q.a(g.this.f63613r, (a0.b) dVar.f63627d);
                }
            } catch (p0 e10) {
                boolean zA = a(message, e10);
                objB = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                androidx.media3.common.util.z.o(g.E, "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objB = e11;
            }
            g.this.f63610o.b(dVar.f63624a);
            synchronized (this) {
                try {
                    if (!this.f63622a) {
                        g.this.f63615t.obtainMessage(message.what, Pair.create(dVar.f63627d, objB)).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f63626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f63627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f63628e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f63624a = j10;
            this.f63625b = z10;
            this.f63626c = j11;
            this.f63627d = obj;
        }
    }

    @e.a({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                g.this.B(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                g.this.v(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(@androidx.annotation.p0 Throwable th2) {
            super(th2);
        }
    }

    public g(UUID uuid, a0 a0Var, a aVar, b bVar, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, @androidx.annotation.p0 byte[] bArr, HashMap<String, String> map, o0 o0Var, Looper looper, androidx.media3.exoplayer.upstream.m mVar, j4 j4Var) {
        if (i10 == 1 || i10 == 3) {
            androidx.media3.common.util.a.g(bArr);
        }
        this.f63613r = uuid;
        this.f63603h = aVar;
        this.f63604i = bVar;
        this.f63602g = a0Var;
        this.f63605j = i10;
        this.f63606k = z10;
        this.f63607l = z11;
        if (bArr != null) {
            this.B = bArr;
            this.f63601f = null;
        } else {
            this.f63601f = Collections.unmodifiableList((List) androidx.media3.common.util.a.g(list));
        }
        this.f63608m = map;
        this.f63612q = o0Var;
        this.f63609n = new androidx.media3.common.util.p<>();
        this.f63610o = mVar;
        this.f63611p = j4Var;
        this.f63616u = 2;
        this.f63614s = looper;
        this.f63615t = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Object obj, Object obj2) {
        if (obj == this.D) {
            if (this.f63616u == 2 || t()) {
                this.D = null;
                if (obj2 instanceof Exception) {
                    this.f63603h.b((Exception) obj2, false);
                    return;
                }
                try {
                    this.f63602g.i((byte[]) obj2);
                    this.f63603h.a();
                } catch (Exception e10) {
                    this.f63603h.b(e10, true);
                }
            }
        }
    }

    @il.e(expression = {UserEntry.sessionId}, result = true)
    private boolean C() {
        if (t()) {
            return true;
        }
        try {
            byte[] bArrC = this.f63602g.c();
            this.A = bArrC;
            this.f63602g.o(bArrC, this.f63611p);
            this.f63620y = this.f63602g.r(this.A);
            final int i10 = 3;
            this.f63616u = 3;
            p(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.drm.b
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    ((t.a) obj).k(i10);
                }
            });
            androidx.media3.common.util.a.g(this.A);
            return true;
        } catch (NotProvisionedException unused) {
            this.f63603h.c(this);
            return false;
        } catch (Exception | NoSuchMethodError e10) {
            if (x.d(e10)) {
                this.f63603h.c(this);
            } else {
                u(e10, 1);
            }
            return false;
        }
    }

    private void D(byte[] bArr, int i10, boolean z10) {
        try {
            this.C = this.f63602g.l(bArr, this.f63601f, i10, this.f63608m);
            ((c) k1.o(this.f63619x)).b(2, androidx.media3.common.util.a.g(this.C), z10);
        } catch (Exception | NoSuchMethodError e10) {
            w(e10, true);
        }
    }

    @il.m({UserEntry.sessionId, "offlineLicenseKeySetId"})
    private boolean F() {
        try {
            this.f63602g.d(this.A, this.B);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            u(e10, 1);
            return false;
        }
    }

    private void G() {
        if (Thread.currentThread() != this.f63614s.getThread()) {
            androidx.media3.common.util.z.o(E, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f63614s.getThread().getName(), new IllegalStateException());
        }
    }

    private void p(androidx.media3.common.util.o<t.a> oVar) {
        Iterator<t.a> it = this.f63609n.o().iterator();
        while (it.hasNext()) {
            oVar.accept(it.next());
        }
    }

    @il.m({UserEntry.sessionId})
    private void q(boolean z10) {
        if (this.f63607l) {
            return;
        }
        byte[] bArr = (byte[]) k1.o(this.A);
        int i10 = this.f63605j;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.B == null || F()) {
                    D(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            androidx.media3.common.util.a.g(this.B);
            androidx.media3.common.util.a.g(this.A);
            D(this.B, 3, z10);
            return;
        }
        if (this.B == null) {
            D(bArr, 1, z10);
            return;
        }
        if (this.f63616u != 4 && !F()) {
            return;
        }
        long jR = r();
        if (this.f63605j != 0 || jR > 60) {
            if (jR <= 0) {
                u(new m0(), 2);
                return;
            } else {
                this.f63616u = 4;
                p(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.drm.f
                    @Override // androidx.media3.common.util.o
                    public final void accept(Object obj) {
                        ((t.a) obj).j();
                    }
                });
                return;
            }
        }
        androidx.media3.common.util.z.b(E, "Offline license has expired or will expire soon. Remaining seconds: " + jR);
        D(bArr, 2, z10);
    }

    private long r() {
        if (!androidx.media3.common.j.f60719n2.equals(this.f63613r)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) androidx.media3.common.util.a.g(x0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @il.e(expression = {UserEntry.sessionId}, result = true)
    private boolean t() {
        int i10 = this.f63616u;
        return i10 == 3 || i10 == 4;
    }

    private void u(final Throwable th2, int i10) {
        this.f63621z = new m.a(th2, x.b(th2, i10));
        androidx.media3.common.util.z.e(E, "DRM session error", th2);
        if (th2 instanceof Exception) {
            p(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.drm.e
                @Override // androidx.media3.common.util.o
                public final void accept(Object obj) {
                    ((t.a) obj).l((Exception) th2);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!x.e(th2) && !x.d(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f63616u != 4) {
            this.f63616u = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Object obj, Object obj2) {
        if (obj == this.C && t()) {
            this.C = null;
            if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (this.f63605j == 3) {
                        this.f63602g.h((byte[]) k1.o(this.B), bArr);
                        p(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.drm.c
                            @Override // androidx.media3.common.util.o
                            public final void accept(Object obj3) {
                                ((t.a) obj3).i();
                            }
                        });
                        return;
                    }
                    byte[] bArrH = this.f63602g.h(this.A, bArr);
                    int i10 = this.f63605j;
                    if ((i10 == 2 || (i10 == 0 && this.B != null)) && bArrH != null && bArrH.length != 0) {
                        this.B = bArrH;
                    }
                    this.f63616u = 4;
                    p(new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.drm.d
                        @Override // androidx.media3.common.util.o
                        public final void accept(Object obj3) {
                            ((t.a) obj3).h();
                        }
                    });
                    return;
                } catch (Exception | NoSuchMethodError e10) {
                    w(e10, true);
                    return;
                }
            }
            w((Throwable) obj2, false);
        }
    }

    private void w(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || x.d(th2)) {
            this.f63603h.c(this);
        } else {
            u(th2, z10 ? 1 : 2);
        }
    }

    private void x() {
        if (this.f63605j == 0 && this.f63616u == 4) {
            k1.o(this.A);
            q(false);
        }
    }

    void A(Exception exc, boolean z10) {
        u(exc, z10 ? 1 : 3);
    }

    void E() {
        this.D = this.f63602g.b();
        ((c) k1.o(this.f63619x)).b(1, androidx.media3.common.util.a.g(this.D), true);
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public final m.a T() {
        G();
        if (this.f63616u == 1) {
            return this.f63621z;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public Map<String, String> U() {
        G();
        byte[] bArr = this.A;
        if (bArr == null) {
            return null;
        }
        return this.f63602g.a(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public byte[] V() {
        G();
        return this.B;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean a() {
        G();
        return this.f63606k;
    }

    @Override // androidx.media3.exoplayer.drm.m
    @androidx.annotation.p0
    public final androidx.media3.decoder.b c() {
        G();
        return this.f63620y;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void d(@androidx.annotation.p0 t.a aVar) {
        G();
        int i10 = this.f63617v;
        if (i10 <= 0) {
            androidx.media3.common.util.z.d(E, "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f63617v = i11;
        if (i11 == 0) {
            this.f63616u = 0;
            ((e) k1.o(this.f63615t)).removeCallbacksAndMessages(null);
            ((c) k1.o(this.f63619x)).c();
            this.f63619x = null;
            ((HandlerThread) k1.o(this.f63618w)).quit();
            this.f63618w = null;
            this.f63620y = null;
            this.f63621z = null;
            this.C = null;
            this.D = null;
            byte[] bArr = this.A;
            if (bArr != null) {
                this.f63602g.j(bArr);
                this.A = null;
            }
        }
        if (aVar != null) {
            this.f63609n.d(aVar);
            if (this.f63609n.P3(aVar) == 0) {
                aVar.m();
            }
        }
        this.f63604i.b(this, this.f63617v);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public final UUID e() {
        G();
        return this.f63613r;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void f(@androidx.annotation.p0 t.a aVar) {
        G();
        if (this.f63617v < 0) {
            androidx.media3.common.util.z.d(E, "Session reference count less than zero: " + this.f63617v);
            this.f63617v = 0;
        }
        if (aVar != null) {
            this.f63609n.c(aVar);
        }
        int i10 = this.f63617v + 1;
        this.f63617v = i10;
        if (i10 == 1) {
            androidx.media3.common.util.a.i(this.f63616u == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f63618w = handlerThread;
            handlerThread.start();
            this.f63619x = new c(this.f63618w.getLooper());
            if (C()) {
                q(true);
            }
        } else if (aVar != null && t() && this.f63609n.P3(aVar) == 1) {
            aVar.k(this.f63616u);
        }
        this.f63604i.a(this, this.f63617v);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean g(String str) {
        G();
        return this.f63602g.t((byte[]) androidx.media3.common.util.a.k(this.A), str);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public final int getState() {
        G();
        return this.f63616u;
    }

    public boolean s(byte[] bArr) {
        G();
        return Arrays.equals(this.A, bArr);
    }

    void y(int i10) {
        if (i10 != 2) {
            return;
        }
        x();
    }

    void z() {
        if (C()) {
            q(true);
        }
    }
}
