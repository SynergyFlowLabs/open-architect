package androidx.media2.exoplayer.external.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.t;
import androidx.media2.exoplayer.external.util.q0;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@e.b(18)
@b1({b1.a.LIBRARY_GROUP})
public class i<T extends t> implements p<T> {
    private static final String A = "DefaultDrmSession";
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 60;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final List<DrmInitData.SchemeData> f53839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u<T> f53840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a<T> f53841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b<T> f53842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f53843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final HashMap<String, String> f53844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.i<k> f53845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.f0 f53846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final c0 f53847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final UUID f53848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final i<T>.e f53849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f53850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f53851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private HandlerThread f53852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private i<T>.c f53853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private T f53854u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private p.a f53855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f53856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte[] f53857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private u.a f53858y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private u.e f53859z;

    public interface a<T extends t> {
        void a();

        void b(i<T> session);

        void e(Exception error);
    }

    public interface b<T extends t> {
        void a(i<T> session);
    }

    @e.a({"HandlerLeak"})
    private class c extends Handler {
        public c(Looper backgroundLooper) {
            super(backgroundLooper);
        }

        private boolean a(Message originalMsg, Exception e10) {
            d dVar = (d) originalMsg.obj;
            if (!dVar.f53861a) {
                return false;
            }
            int i10 = dVar.f53864d + 1;
            dVar.f53864d = i10;
            if (i10 > i.this.f53846m.a(3)) {
                return false;
            }
            sendMessageDelayed(Message.obtain(originalMsg), i.this.f53846m.c(3, SystemClock.elapsedRealtime() - dVar.f53862b, e10 instanceof IOException ? (IOException) e10 : new f(e10), dVar.f53864d));
            return true;
        }

        void b(int what, Object request, boolean allowRetry) {
            obtainMessage(what, new d(allowRetry, SystemClock.elapsedRealtime(), request)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Exception {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    i iVar = i.this;
                    objA = iVar.f53847n.a(iVar.f53848o, (u.e) dVar.f53863c);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    i iVar2 = i.this;
                    objA = iVar2.f53847n.b(iVar2.f53848o, (u.a) dVar.f53863c);
                }
            } catch (Exception e10) {
                boolean zA = a(message, e10);
                objA = e10;
                if (zA) {
                    return;
                }
            }
            i.this.f53849p.obtainMessage(message.what, Pair.create(dVar.f53863c, objA)).sendToTarget();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f53861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f53862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f53863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f53864d;

        public d(boolean allowRetry, long startTimeMs, Object request) {
            this.f53861a = allowRetry;
            this.f53862b = startTimeMs;
            this.f53863c = request;
        }
    }

    @e.a({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Pair pair = (Pair) msg.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = msg.what;
            if (i10 == 0) {
                i.this.p(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                i.this.j(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable cause) {
            String simpleName = cause.getClass().getSimpleName();
            String message = cause.getMessage();
            StringBuilder sb2 = new StringBuilder(simpleName.length() + 13 + String.valueOf(message).length());
            sb2.append("Unexpected ");
            sb2.append(simpleName);
            sb2.append(": ");
            sb2.append(message);
            super(sb2.toString(), cause);
        }
    }

    public i(UUID uuid, u<T> mediaDrm, a<T> provisioningManager, b<T> releaseCallback, @p0 List<DrmInitData.SchemeData> schemeDatas, int mode, @p0 byte[] offlineLicenseKeySetId, @p0 HashMap<String, String> optionalKeyRequestParameters, c0 callback, Looper playbackLooper, androidx.media2.exoplayer.external.util.i<k> eventDispatcher, androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy) {
        if (mode == 1 || mode == 3) {
            androidx.media2.exoplayer.external.util.a.g(offlineLicenseKeySetId);
        }
        this.f53848o = uuid;
        this.f53841h = provisioningManager;
        this.f53842i = releaseCallback;
        this.f53840g = mediaDrm;
        this.f53843j = mode;
        if (offlineLicenseKeySetId != null) {
            this.f53857x = offlineLicenseKeySetId;
            this.f53839f = null;
        } else {
            this.f53839f = Collections.unmodifiableList((List) androidx.media2.exoplayer.external.util.a.g(schemeDatas));
        }
        this.f53844k = optionalKeyRequestParameters;
        this.f53847n = callback;
        this.f53845l = eventDispatcher;
        this.f53846m = loadErrorHandlingPolicy;
        this.f53850q = 2;
        this.f53849p = new e(playbackLooper);
    }

    @il.m({UserEntry.sessionId})
    private void d(boolean allowRetry) {
        byte[] bArr = (byte[]) q0.i(this.f53856w);
        int i10 = this.f53843j;
        if (i10 == 0 || i10 == 1) {
            if (this.f53857x == null) {
                r(bArr, 1, allowRetry);
                return;
            }
            if (this.f53850q != 4) {
                if (t()) {
                }
            }
            long jE = e();
            if (this.f53843j != 0 || jE > 60) {
                if (jE <= 0) {
                    i(new a0());
                    return;
                } else {
                    this.f53850q = 4;
                    this.f53845l.b(androidx.media2.exoplayer.external.drm.e.f53830a);
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder(88);
            sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb2.append(jE);
            androidx.media2.exoplayer.external.util.p.b(A, sb2.toString());
            r(bArr, 2, allowRetry);
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                androidx.media2.exoplayer.external.util.a.g(this.f53857x);
                androidx.media2.exoplayer.external.util.a.g(this.f53856w);
                if (t()) {
                    r(this.f53857x, 3, allowRetry);
                }
            }
        } else if (this.f53857x == null) {
            r(bArr, 2, allowRetry);
        } else if (t()) {
            r(bArr, 2, allowRetry);
        }
    }

    private long e() {
        if (!androidx.media2.exoplayer.external.c.f53750z1.equals(this.f53848o)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) androidx.media2.exoplayer.external.util.a.g(f0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @il.e(expression = {UserEntry.sessionId}, result = true)
    private boolean g() {
        int i10 = this.f53850q;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    private void i(final Exception e10) {
        this.f53855v = new p.a(e10);
        this.f53845l.b(new androidx.media2.exoplayer.external.util.i.a(e10) { // from class: androidx.media2.exoplayer.external.drm.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f53838a;

            {
                this.f53838a = e10;
            }

            @Override // androidx.media2.exoplayer.external.util.i.a
            public void a(Object obj) {
                ((k) obj).g(this.f53838a);
            }
        });
        if (this.f53850q != 4) {
            this.f53850q = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Object request, Object response) {
        if (request == this.f53858y && g()) {
            this.f53858y = null;
            if (response instanceof Exception) {
                k((Exception) response);
                return;
            }
            try {
                byte[] bArr = (byte[]) response;
                if (this.f53843j == 3) {
                    this.f53840g.h((byte[]) q0.i(this.f53857x), bArr);
                    this.f53845l.b(androidx.media2.exoplayer.external.drm.f.f53834a);
                    return;
                }
                byte[] bArrH = this.f53840g.h(this.f53856w, bArr);
                int i10 = this.f53843j;
                if ((i10 == 2 || (i10 == 0 && this.f53857x != null)) && bArrH != null && bArrH.length != 0) {
                    this.f53857x = bArrH;
                }
                this.f53850q = 4;
                this.f53845l.b(g.f53837a);
            } catch (Exception e10) {
                k(e10);
            }
        }
    }

    private void k(Exception e10) {
        if (e10 instanceof NotProvisionedException) {
            this.f53841h.b(this);
        } else {
            i(e10);
        }
    }

    private void l() {
        if (this.f53843j == 0 && this.f53850q == 4) {
            q0.i(this.f53856w);
            int i10 = 7 & 0;
            d(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Object request, Object response) {
        if (request == this.f53859z) {
            if (this.f53850q == 2 || g()) {
                this.f53859z = null;
                if (response instanceof Exception) {
                    this.f53841h.e((Exception) response);
                    return;
                }
                try {
                    this.f53840g.i((byte[]) response);
                    this.f53841h.a();
                } catch (Exception e10) {
                    this.f53841h.e(e10);
                }
            }
        }
    }

    @il.e(expression = {UserEntry.sessionId}, result = true)
    private boolean q(boolean z10) {
        if (g()) {
            return true;
        }
        try {
            byte[] bArrC = this.f53840g.c();
            this.f53856w = bArrC;
            this.f53854u = (T) this.f53840g.p(bArrC);
            this.f53845l.b(androidx.media2.exoplayer.external.drm.d.f53824a);
            this.f53850q = 3;
            androidx.media2.exoplayer.external.util.a.g(this.f53856w);
            return true;
        } catch (NotProvisionedException e10) {
            if (z10) {
                this.f53841h.b(this);
            } else {
                i(e10);
            }
            return false;
        } catch (Exception e11) {
            i(e11);
            return false;
        }
    }

    private void r(byte[] scope, int type, boolean allowRetry) {
        try {
            this.f53858y = this.f53840g.l(scope, this.f53839f, type, this.f53844k);
            ((c) q0.i(this.f53853t)).b(1, androidx.media2.exoplayer.external.util.a.g(this.f53858y), allowRetry);
        } catch (Exception e10) {
            k(e10);
        }
    }

    @il.m({UserEntry.sessionId, "offlineLicenseKeySetId"})
    private boolean t() {
        try {
            this.f53840g.d(this.f53856w, this.f53857x);
            return true;
        } catch (Exception e10) {
            androidx.media2.exoplayer.external.util.p.e(A, "Error trying to restore Widevine keys.", e10);
            i(e10);
            return false;
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public final p.a T() {
        if (this.f53850q == 1) {
            return this.f53855v;
        }
        return null;
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public Map<String, String> U() {
        byte[] bArr = this.f53856w;
        if (bArr == null) {
            return null;
        }
        return this.f53840g.a(bArr);
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public byte[] V() {
        return this.f53857x;
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    @p0
    public final T W() {
        return this.f53854u;
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    public void X() {
        int i10 = this.f53851r - 1;
        this.f53851r = i10;
        if (i10 == 0) {
            this.f53850q = 0;
            ((e) q0.i(this.f53849p)).removeCallbacksAndMessages(null);
            ((c) q0.i(this.f53853t)).removeCallbacksAndMessages(null);
            this.f53853t = null;
            ((HandlerThread) q0.i(this.f53852s)).quit();
            this.f53852s = null;
            this.f53854u = null;
            this.f53855v = null;
            this.f53858y = null;
            this.f53859z = null;
            byte[] bArr = this.f53856w;
            if (bArr != null) {
                this.f53840g.j(bArr);
                this.f53856w = null;
                this.f53845l.b(androidx.media2.exoplayer.external.drm.c.f53823a);
            }
            this.f53842i.a(this);
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    public void Y() {
        int i10 = this.f53851r + 1;
        this.f53851r = i10;
        if (i10 == 1) {
            androidx.media2.exoplayer.external.util.a.i(this.f53850q == 2);
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.f53852s = handlerThread;
            handlerThread.start();
            this.f53853t = new c(this.f53852s.getLooper());
            if (q(true)) {
                d(true);
            }
        }
    }

    public boolean f(byte[] sessionId) {
        return Arrays.equals(this.f53856w, sessionId);
    }

    @Override // androidx.media2.exoplayer.external.drm.p
    public final int getState() {
        return this.f53850q;
    }

    public void m(int what) {
        if (what != 2) {
            return;
        }
        l();
    }

    public void n() {
        if (q(false)) {
            d(true);
        }
    }

    public void o(Exception error) {
        i(error);
    }

    public void s() {
        this.f53859z = this.f53840g.b();
        ((c) q0.i(this.f53853t)).b(0, androidx.media2.exoplayer.external.util.a.g(this.f53859z), true);
    }
}
