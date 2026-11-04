package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class q {
    private static final int A = 5;
    private static final int B = 6;
    private static final int C = 7;
    private static final int D = 8;
    private static final int E = 9;
    private static final int F = 10;
    private static final int G = 11;
    private static final int H = 12;
    private static final int I = 13;
    private static final String J = "DownloadManager";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f64499q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f64500r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Requirements f64501s = new Requirements(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f64502t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f64503u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f64504v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f64505w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f64506x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f64507y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f64508z = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f64509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f64510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f64511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f64512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.exoplayer.scheduler.b.c f64513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<d> f64514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f64515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f64516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f64517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f64518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f64519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f64520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f64521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f64522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<androidx.media3.exoplayer.offline.d> f64523o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.media3.exoplayer.scheduler.b f64524p;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.offline.d f64525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<androidx.media3.exoplayer.offline.d> f64527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final Exception f64528d;

        public b(androidx.media3.exoplayer.offline.d dVar, boolean z10, List<androidx.media3.exoplayer.offline.d> list, @p0 Exception exc) {
            this.f64525a = dVar;
            this.f64526b = z10;
            this.f64527c = list;
            this.f64528d = exc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f64529n = 5000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f64530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f64531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f64532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y f64533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Handler f64534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ArrayList<androidx.media3.exoplayer.offline.d> f64535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final HashMap<String, e> f64536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f64537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f64538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f64539j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f64540k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f64541l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f64542m;

        public c(HandlerThread handlerThread, e0 e0Var, y yVar, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.f64531b = handlerThread;
            this.f64532c = e0Var;
            this.f64533d = yVar;
            this.f64534e = handler;
            this.f64539j = i10;
            this.f64540k = i11;
            this.f64538i = z10;
            this.f64535f = new ArrayList<>();
            this.f64536g = new HashMap<>();
        }

        private void A(@p0 e eVar) {
            if (eVar != null) {
                androidx.media3.common.util.a.i(!eVar.f64546d);
                eVar.f(false);
            }
        }

        private void B() {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f64535f.size(); i11++) {
                androidx.media3.exoplayer.offline.d dVar = this.f64535f.get(i11);
                e eVarY = this.f64536g.get(dVar.f64421a.f64351a);
                int i12 = dVar.f64422b;
                if (i12 == 0) {
                    eVarY = y(eVarY, dVar);
                } else if (i12 == 1) {
                    A(eVarY);
                } else if (i12 != 2) {
                    if (i12 != 5 && i12 != 7) {
                        throw new IllegalStateException();
                    }
                    z(eVarY, dVar);
                } else {
                    androidx.media3.common.util.a.g(eVarY);
                    x(eVarY, dVar, i10);
                }
                if (eVarY != null && !eVarY.f64546d) {
                    i10++;
                }
            }
        }

        private void C() {
            for (int i10 = 0; i10 < this.f64535f.size(); i10++) {
                androidx.media3.exoplayer.offline.d dVar = this.f64535f.get(i10);
                if (dVar.f64422b == 2) {
                    try {
                        this.f64532c.c(dVar);
                    } catch (IOException e10) {
                        androidx.media3.common.util.z.e(q.J, "Failed to update index.", e10);
                    }
                }
            }
            sendEmptyMessageDelayed(12, 5000L);
        }

        private void b(DownloadRequest downloadRequest, int i10) {
            androidx.media3.exoplayer.offline.d dVarF = f(downloadRequest.f64351a, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (dVarF != null) {
                m(q.r(dVarF, downloadRequest, i10, jCurrentTimeMillis));
            } else {
                m(new androidx.media3.exoplayer.offline.d(downloadRequest, i10 == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i10, 0));
            }
            B();
        }

        private boolean c() {
            if (this.f64538i || this.f64537h != 0) {
                return false;
            }
            int i10 = 5 >> 1;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int d(androidx.media3.exoplayer.offline.d dVar, androidx.media3.exoplayer.offline.d dVar2) {
            return k1.u(dVar.f64423c, dVar2.f64423c);
        }

        private static androidx.media3.exoplayer.offline.d e(androidx.media3.exoplayer.offline.d dVar, int i10, int i11) {
            return new androidx.media3.exoplayer.offline.d(dVar.f64421a, i10, dVar.f64423c, System.currentTimeMillis(), dVar.f64425e, i11, 0, dVar.f64428h);
        }

        @p0
        private androidx.media3.exoplayer.offline.d f(String str, boolean z10) {
            int iG = g(str);
            if (iG != -1) {
                return this.f64535f.get(iG);
            }
            if (z10) {
                try {
                    return this.f64532c.e(str);
                } catch (IOException e10) {
                    androidx.media3.common.util.z.e(q.J, "Failed to load download: " + str, e10);
                }
            }
            return null;
        }

        private int g(String str) {
            for (int i10 = 0; i10 < this.f64535f.size(); i10++) {
                if (this.f64535f.get(i10).f64421a.f64351a.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        private void h(int i10) {
            this.f64537h = i10;
            androidx.media3.exoplayer.offline.e eVarA = null;
            try {
                this.f64532c.h();
                int i11 = 3 & 7;
                eVarA = this.f64532c.a(0, 1, 2, 5, 7);
                while (eVarA.moveToNext()) {
                    this.f64535f.add(eVarA.z4());
                }
            } catch (IOException e10) {
                androidx.media3.common.util.z.e(q.J, "Failed to load index.", e10);
                this.f64535f.clear();
            } finally {
                k1.t(eVarA);
            }
            this.f64534e.obtainMessage(1, new ArrayList(this.f64535f)).sendToTarget();
            B();
        }

        private void i(e eVar, long j10) {
            androidx.media3.exoplayer.offline.d dVar = (androidx.media3.exoplayer.offline.d) androidx.media3.common.util.a.g(f(eVar.f64543a.f64351a, false));
            if (j10 == dVar.f64425e || j10 == -1) {
                return;
            }
            m(new androidx.media3.exoplayer.offline.d(dVar.f64421a, dVar.f64422b, dVar.f64423c, System.currentTimeMillis(), j10, dVar.f64426f, dVar.f64427g, dVar.f64428h));
        }

        private void j(androidx.media3.exoplayer.offline.d dVar, @p0 Exception exc) {
            androidx.media3.exoplayer.offline.d dVar2 = new androidx.media3.exoplayer.offline.d(dVar.f64421a, exc == null ? 3 : 4, dVar.f64423c, System.currentTimeMillis(), dVar.f64425e, dVar.f64426f, exc == null ? 0 : 1, dVar.f64428h);
            this.f64535f.remove(g(dVar2.f64421a.f64351a));
            try {
                this.f64532c.c(dVar2);
            } catch (IOException e10) {
                androidx.media3.common.util.z.e(q.J, "Failed to update index.", e10);
            }
            this.f64534e.obtainMessage(3, new b(dVar2, false, new ArrayList(this.f64535f), exc)).sendToTarget();
        }

        private void k(androidx.media3.exoplayer.offline.d dVar) {
            if (dVar.f64422b == 7) {
                int i10 = dVar.f64426f;
                n(dVar, i10 == 0 ? 0 : 1, i10);
                B();
            } else {
                this.f64535f.remove(g(dVar.f64421a.f64351a));
                try {
                    this.f64532c.d(dVar.f64421a.f64351a);
                } catch (IOException unused) {
                    androidx.media3.common.util.z.d(q.J, "Failed to remove from database");
                }
                this.f64534e.obtainMessage(3, new b(dVar, true, new ArrayList(this.f64535f), null)).sendToTarget();
            }
        }

        private void l(e eVar) {
            String str = eVar.f64543a.f64351a;
            this.f64536g.remove(str);
            boolean z10 = eVar.f64546d;
            if (z10) {
                this.f64542m = false;
            } else {
                int i10 = this.f64541l - 1;
                this.f64541l = i10;
                if (i10 == 0) {
                    removeMessages(12);
                }
            }
            if (eVar.f64549g) {
                B();
                return;
            }
            Exception exc = eVar.f64550h;
            if (exc != null) {
                androidx.media3.common.util.z.e(q.J, "Task failed: " + eVar.f64543a + ", " + z10, exc);
            }
            androidx.media3.exoplayer.offline.d dVar = (androidx.media3.exoplayer.offline.d) androidx.media3.common.util.a.g(f(str, false));
            int i11 = dVar.f64422b;
            if (i11 != 2) {
                if (i11 != 5 && i11 != 7) {
                    throw new IllegalStateException();
                }
                androidx.media3.common.util.a.i(z10);
                k(dVar);
            } else {
                androidx.media3.common.util.a.i(!z10);
                j(dVar, exc);
            }
            B();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x000f  */
        private androidx.media3.exoplayer.offline.d m(androidx.media3.exoplayer.offline.d dVar) {
            boolean z10;
            int i10 = dVar.f64422b;
            if (i10 != 3) {
                int i11 = 3 << 4;
                if (i10 != 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            androidx.media3.common.util.a.i(z10);
            int iG = g(dVar.f64421a.f64351a);
            if (iG == -1) {
                this.f64535f.add(dVar);
                Collections.sort(this.f64535f, new r());
            } else {
                boolean z11 = dVar.f64423c != this.f64535f.get(iG).f64423c;
                this.f64535f.set(iG, dVar);
                if (z11) {
                    Collections.sort(this.f64535f, new r());
                }
            }
            try {
                this.f64532c.c(dVar);
            } catch (IOException e10) {
                androidx.media3.common.util.z.e(q.J, "Failed to update index.", e10);
            }
            this.f64534e.obtainMessage(3, new b(dVar, false, new ArrayList(this.f64535f), null)).sendToTarget();
            return dVar;
        }

        private androidx.media3.exoplayer.offline.d n(androidx.media3.exoplayer.offline.d dVar, int i10, int i11) {
            androidx.media3.common.util.a.i((i10 == 3 || i10 == 4) ? false : true);
            return m(e(dVar, i10, i11));
        }

        private void o() {
            Iterator<e> it = this.f64536g.values().iterator();
            while (it.hasNext()) {
                it.next().f(true);
            }
            try {
                this.f64532c.h();
            } catch (IOException e10) {
                androidx.media3.common.util.z.e(q.J, "Failed to update index.", e10);
            }
            this.f64535f.clear();
            this.f64531b.quit();
            synchronized (this) {
                try {
                    this.f64530a = true;
                    notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private void p() {
            ArrayList arrayList = new ArrayList();
            try {
                androidx.media3.exoplayer.offline.e eVarA = this.f64532c.a(3, 4);
                while (eVarA.moveToNext()) {
                    try {
                        arrayList.add(eVarA.z4());
                    } catch (Throwable th2) {
                        if (eVarA != null) {
                            try {
                                eVarA.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                eVarA.close();
            } catch (IOException unused) {
                androidx.media3.common.util.z.d(q.J, "Failed to load downloads.");
            }
            for (int i10 = 0; i10 < this.f64535f.size(); i10++) {
                ArrayList<androidx.media3.exoplayer.offline.d> arrayList2 = this.f64535f;
                arrayList2.set(i10, e(arrayList2.get(i10), 5, 0));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f64535f.add(e((androidx.media3.exoplayer.offline.d) arrayList.get(i11), 5, 0));
            }
            Collections.sort(this.f64535f, new r());
            try {
                this.f64532c.g();
            } catch (IOException e10) {
                androidx.media3.common.util.z.e(q.J, "Failed to update index.", e10);
            }
            ArrayList arrayList3 = new ArrayList(this.f64535f);
            for (int i12 = 0; i12 < this.f64535f.size(); i12++) {
                this.f64534e.obtainMessage(3, new b(this.f64535f.get(i12), false, arrayList3, null)).sendToTarget();
            }
            B();
        }

        private void q(String str) {
            androidx.media3.exoplayer.offline.d dVarF = f(str, true);
            if (dVarF != null) {
                n(dVarF, 5, 0);
                B();
            } else {
                androidx.media3.common.util.z.d(q.J, "Failed to remove nonexistent download: " + str);
            }
        }

        private void r(boolean z10) {
            this.f64538i = z10;
            B();
        }

        private void s(int i10) {
            this.f64539j = i10;
            B();
        }

        private void t(int i10) {
            this.f64540k = i10;
        }

        private void u(int i10) {
            this.f64537h = i10;
            B();
        }

        private void v(androidx.media3.exoplayer.offline.d dVar, int i10) {
            if (i10 == 0) {
                if (dVar.f64422b == 1) {
                    n(dVar, 0, 0);
                }
            } else if (i10 != dVar.f64426f) {
                int i11 = dVar.f64422b;
                if (i11 == 0 || i11 == 2) {
                    i11 = 1;
                }
                m(new androidx.media3.exoplayer.offline.d(dVar.f64421a, i11, dVar.f64423c, System.currentTimeMillis(), dVar.f64425e, i10, 0, dVar.f64428h));
            }
        }

        private void w(@p0 String str, int i10) {
            if (str == null) {
                for (int i11 = 0; i11 < this.f64535f.size(); i11++) {
                    v(this.f64535f.get(i11), i10);
                }
                try {
                    this.f64532c.f(i10);
                } catch (IOException e10) {
                    androidx.media3.common.util.z.e(q.J, "Failed to set manual stop reason", e10);
                }
            } else {
                androidx.media3.exoplayer.offline.d dVarF = f(str, false);
                if (dVarF != null) {
                    v(dVarF, i10);
                } else {
                    try {
                        this.f64532c.b(str, i10);
                    } catch (IOException e11) {
                        androidx.media3.common.util.z.e(q.J, "Failed to set manual stop reason: " + str, e11);
                    }
                }
            }
            B();
        }

        private void x(e eVar, androidx.media3.exoplayer.offline.d dVar, int i10) {
            androidx.media3.common.util.a.i(!eVar.f64546d);
            if (!c() || i10 >= this.f64539j) {
                n(dVar, 0, 0);
                eVar.f(false);
            }
        }

        @androidx.annotation.j
        @p0
        private e y(@p0 e eVar, androidx.media3.exoplayer.offline.d dVar) {
            if (eVar != null) {
                androidx.media3.common.util.a.i(!eVar.f64546d);
                eVar.f(false);
                return eVar;
            }
            if (!c() || this.f64541l >= this.f64539j) {
                return null;
            }
            androidx.media3.exoplayer.offline.d dVarN = n(dVar, 2, 0);
            e eVar2 = new e(dVarN.f64421a, this.f64533d.a(dVarN.f64421a), dVarN.f64428h, false, this.f64540k, this);
            this.f64536g.put(dVarN.f64421a.f64351a, eVar2);
            int i10 = this.f64541l;
            this.f64541l = i10 + 1;
            if (i10 == 0) {
                sendEmptyMessageDelayed(12, 5000L);
            }
            eVar2.start();
            return eVar2;
        }

        private void z(@p0 e eVar, androidx.media3.exoplayer.offline.d dVar) {
            if (eVar != null) {
                if (eVar.f64546d) {
                    return;
                }
                eVar.f(false);
            } else {
                if (this.f64542m) {
                    return;
                }
                e eVar2 = new e(dVar.f64421a, this.f64533d.a(dVar.f64421a), dVar.f64428h, true, this.f64540k, this);
                this.f64536g.put(dVar.f64421a.f64351a, eVar2);
                this.f64542m = true;
                eVar2.start();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = 0;
            switch (message.what) {
                case 1:
                    h(message.arg1);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 2:
                    r(message.arg1 != 0);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 3:
                    u(message.arg1);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 4:
                    w((String) message.obj, message.arg1);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 5:
                    s(message.arg1);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 6:
                    t(message.arg1);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 7:
                    b((DownloadRequest) message.obj, message.arg1);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 8:
                    q((String) message.obj);
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 9:
                    p();
                    i10 = 1;
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 10:
                    l((e) message.obj);
                    this.f64534e.obtainMessage(2, i10, this.f64536g.size()).sendToTarget();
                    return;
                case 11:
                    i((e) message.obj, k1.w2(message.arg1, message.arg2));
                    return;
                case 12:
                    C();
                    return;
                case 13:
                    o();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public interface d {
        default void a(q qVar, boolean z10) {
        }

        default void b(q qVar, androidx.media3.exoplayer.offline.d dVar) {
        }

        default void c(q qVar, boolean z10) {
        }

        default void d(q qVar, Requirements requirements, int i10) {
        }

        default void e(q qVar, androidx.media3.exoplayer.offline.d dVar, @p0 Exception exc) {
        }

        default void f(q qVar) {
        }

        default void g(q qVar) {
        }
    }

    private static class e extends Thread implements x.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DownloadRequest f64543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f64544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t f64545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f64546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f64547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private volatile c f64548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile boolean f64549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private Exception f64550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f64551i;

        private static int g(int i10) {
            return Math.min((i10 - 1) * 1000, 5000);
        }

        @Override // androidx.media3.exoplayer.offline.x.a
        public void a(long j10, long j11, float f10) {
            this.f64545c.f64554a = j11;
            this.f64545c.f64555b = f10;
            if (j10 != this.f64551i) {
                this.f64551i = j10;
                c cVar = this.f64548f;
                if (cVar != null) {
                    cVar.obtainMessage(11, (int) (j10 >> 32), (int) j10, this).sendToTarget();
                }
            }
        }

        public void f(boolean z10) {
            if (z10) {
                this.f64548f = null;
            }
            if (this.f64549g) {
                return;
            }
            this.f64549g = true;
            this.f64544b.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f64546d) {
                    this.f64544b.remove();
                } else {
                    long j10 = -1;
                    int i10 = 0;
                    while (!this.f64549g) {
                        try {
                            this.f64544b.a(this);
                            break;
                        } catch (IOException e10) {
                            if (!this.f64549g) {
                                long j11 = this.f64545c.f64554a;
                                if (j11 != j10) {
                                    i10 = 0;
                                    j10 = j11;
                                }
                                i10++;
                                if (i10 > this.f64547e) {
                                    throw e10;
                                }
                                Thread.sleep(g(i10));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e11) {
                this.f64550h = e11;
            }
            c cVar = this.f64548f;
            if (cVar != null) {
                cVar.obtainMessage(10, this).sendToTarget();
            }
        }

        private e(DownloadRequest downloadRequest, x xVar, t tVar, boolean z10, int i10, c cVar) {
            this.f64543a = downloadRequest;
            this.f64544b = xVar;
            this.f64545c = tVar;
            this.f64546d = z10;
            this.f64547e = i10;
            this.f64548f = cVar;
            this.f64551i = -1L;
        }
    }

    public q(Context context, androidx.media3.database.b bVar, androidx.media3.datasource.cache.a aVar, androidx.media3.datasource.p.a aVar2, Executor executor) {
        this(context, new androidx.media3.exoplayer.offline.a(bVar), new androidx.media3.exoplayer.offline.c(new androidx.media3.datasource.cache.c.d().j(aVar).p(aVar2), executor));
    }

    private void D(boolean z10) {
        if (this.f64518j == z10) {
            return;
        }
        this.f64518j = z10;
        this.f64515g++;
        this.f64512d.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        boolean zI = I();
        Iterator<d> it = this.f64514f.iterator();
        while (it.hasNext()) {
            it.next().c(this, z10);
        }
        if (zI) {
            s();
        }
    }

    private boolean I() {
        boolean z10;
        if (!this.f64518j && this.f64521m != 0) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f64523o.size()) {
                    z10 = false;
                    break;
                }
                if (this.f64523o.get(i10).f64422b == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
            break;
        }
        boolean z11 = this.f64522n != z10;
        this.f64522n = z10;
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            u((List) message.obj);
        } else if (i10 == 2) {
            v(message.arg1, message.arg2);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            t((b) message.obj);
        }
        return true;
    }

    static androidx.media3.exoplayer.offline.d r(androidx.media3.exoplayer.offline.d dVar, DownloadRequest downloadRequest, int i10, long j10) {
        int i11 = dVar.f64422b;
        long j11 = (i11 == 5 || dVar.c()) ? j10 : dVar.f64423c;
        int i12 = 7;
        if (i11 != 5 && i11 != 7) {
            i12 = i10 != 0 ? 1 : 0;
        }
        return new androidx.media3.exoplayer.offline.d(dVar.f64421a.c(downloadRequest), i12, j11, j10, -1L, i10, 0);
    }

    private void s() {
        Iterator<d> it = this.f64514f.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f64522n);
        }
    }

    private void t(b bVar) {
        this.f64523o = Collections.unmodifiableList(bVar.f64527c);
        androidx.media3.exoplayer.offline.d dVar = bVar.f64525a;
        boolean zI = I();
        if (bVar.f64526b) {
            Iterator<d> it = this.f64514f.iterator();
            while (it.hasNext()) {
                it.next().b(this, dVar);
            }
        } else {
            Iterator<d> it2 = this.f64514f.iterator();
            while (it2.hasNext()) {
                it2.next().e(this, dVar, bVar.f64528d);
            }
        }
        if (zI) {
            s();
        }
    }

    private void u(List<androidx.media3.exoplayer.offline.d> list) {
        this.f64517i = true;
        this.f64523o = Collections.unmodifiableList(list);
        boolean zI = I();
        Iterator<d> it = this.f64514f.iterator();
        while (it.hasNext()) {
            it.next().g(this);
        }
        if (zI) {
            s();
        }
    }

    private void v(int i10, int i11) {
        this.f64515g -= i10;
        this.f64516h = i11;
        if (o()) {
            Iterator<d> it = this.f64514f.iterator();
            while (it.hasNext()) {
                it.next().f(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(androidx.media3.exoplayer.scheduler.b bVar, int i10) {
        Requirements requirementsF = bVar.f();
        if (this.f64521m != i10) {
            this.f64521m = i10;
            this.f64515g++;
            this.f64512d.obtainMessage(3, i10, 0).sendToTarget();
        }
        boolean zI = I();
        Iterator<d> it = this.f64514f.iterator();
        while (it.hasNext()) {
            it.next().d(this, requirementsF, i10);
        }
        if (zI) {
            s();
        }
    }

    public void A(String str) {
        this.f64515g++;
        this.f64512d.obtainMessage(8, str).sendToTarget();
    }

    public void B(d dVar) {
        this.f64514f.remove(dVar);
    }

    public void C() {
        D(false);
    }

    public void E(@g0(from = 1) int i10) {
        androidx.media3.common.util.a.a(i10 > 0);
        if (this.f64519k == i10) {
            return;
        }
        this.f64519k = i10;
        this.f64515g++;
        this.f64512d.obtainMessage(5, i10, 0).sendToTarget();
    }

    public void F(int i10) {
        androidx.media3.common.util.a.a(i10 >= 0);
        if (this.f64520l == i10) {
            return;
        }
        this.f64520l = i10;
        this.f64515g++;
        this.f64512d.obtainMessage(6, i10, 0).sendToTarget();
    }

    public void G(Requirements requirements) {
        if (requirements.equals(this.f64524p.f())) {
            return;
        }
        this.f64524p.j();
        androidx.media3.exoplayer.scheduler.b bVar = new androidx.media3.exoplayer.scheduler.b(this.f64509a, this.f64513e, requirements);
        this.f64524p = bVar;
        w(this.f64524p, bVar.i());
    }

    public void H(@p0 String str, int i10) {
        this.f64515g++;
        this.f64512d.obtainMessage(4, i10, 0, str).sendToTarget();
    }

    public void c(DownloadRequest downloadRequest) {
        d(downloadRequest, 0);
    }

    public void d(DownloadRequest downloadRequest, int i10) {
        this.f64515g++;
        this.f64512d.obtainMessage(7, i10, 0, downloadRequest).sendToTarget();
    }

    public void e(d dVar) {
        androidx.media3.common.util.a.g(dVar);
        this.f64514f.add(dVar);
    }

    public Looper f() {
        return this.f64511c.getLooper();
    }

    public List<androidx.media3.exoplayer.offline.d> g() {
        return this.f64523o;
    }

    public n h() {
        return this.f64510b;
    }

    public boolean i() {
        return this.f64518j;
    }

    public int j() {
        return this.f64519k;
    }

    public int k() {
        return this.f64520l;
    }

    public int l() {
        return this.f64521m;
    }

    public Requirements m() {
        return this.f64524p.f();
    }

    public boolean o() {
        return this.f64516h == 0 && this.f64515g == 0;
    }

    public boolean p() {
        return this.f64517i;
    }

    public boolean q() {
        return this.f64522n;
    }

    public void x() {
        D(true);
    }

    public void y() {
        synchronized (this.f64512d) {
            try {
                c cVar = this.f64512d;
                if (cVar.f64530a) {
                    return;
                }
                cVar.sendEmptyMessage(13);
                boolean z10 = false;
                while (true) {
                    c cVar2 = this.f64512d;
                    if (cVar2.f64530a) {
                        break;
                    }
                    try {
                        cVar2.wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                this.f64511c.removeCallbacksAndMessages(null);
                this.f64524p.j();
                this.f64523o = Collections.EMPTY_LIST;
                this.f64515g = 0;
                this.f64516h = 0;
                this.f64517i = false;
                this.f64521m = 0;
                this.f64522n = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        this.f64515g++;
        this.f64512d.obtainMessage(9).sendToTarget();
    }

    public q(Context context, e0 e0Var, y yVar) {
        this.f64509a = context.getApplicationContext();
        this.f64510b = e0Var;
        this.f64519k = 3;
        this.f64520l = 5;
        this.f64518j = true;
        this.f64523o = Collections.EMPTY_LIST;
        this.f64514f = new CopyOnWriteArraySet<>();
        Handler handlerK = k1.K(new Handler.Callback() { // from class: androidx.media3.exoplayer.offline.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f64497a.n(message);
            }
        });
        this.f64511c = handlerK;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        c cVar = new c(handlerThread, e0Var, yVar, handlerK, this.f64519k, this.f64520l, this.f64518j);
        this.f64512d = cVar;
        androidx.media3.exoplayer.scheduler.b.c cVar2 = new androidx.media3.exoplayer.scheduler.b.c() { // from class: androidx.media3.exoplayer.offline.p
            @Override // androidx.media3.exoplayer.scheduler.b.c
            public final void a(androidx.media3.exoplayer.scheduler.b bVar, int i10) {
                this.f64498a.w(bVar, i10);
            }
        };
        this.f64513e = cVar2;
        androidx.media3.exoplayer.scheduler.b bVar = new androidx.media3.exoplayer.scheduler.b(context, cVar2, f64501s);
        this.f64524p = bVar;
        int i10 = bVar.i();
        this.f64521m = i10;
        this.f64515g = 1;
        cVar.obtainMessage(1, i10, 0).sendToTarget();
    }
}
