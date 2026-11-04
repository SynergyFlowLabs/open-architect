package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.p0;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.source.t0;
import com.google.common.base.s0;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f65337a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Comparator<T> f65338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0<T> f65339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0.a f65340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.y<w> f65341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<k0, g<T>.b> f65342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f65343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private final PriorityQueue<g<T>.b> f65344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @p0
    private g0.a f65345i;

    protected static abstract class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Comparator<T> f65346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final g0<T> f65347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected s0<t0.a> f65348c;

        public a(Comparator<T> comparator, g0<T> g0Var, s0<t0.a> s0Var) {
            this.f65346a = comparator;
            this.f65347b = g0Var;
            this.f65348c = s0Var;
        }

        public abstract g<T> a();
    }

    private final class b implements Comparable<g<T>.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t0 f65349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f65350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f65351c;

        public b(g gVar, t0 t0Var, T t10) {
            this(t0Var, t10, -9223372036854775807L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(g<T>.b bVar) {
            return g.this.f65338b.compare(this.f65350b, bVar.f65350b);
        }

        public b(t0 t0Var, T t10, long j10) {
            this.f65349a = t0Var;
            this.f65350b = t10;
            this.f65351c = j10;
        }
    }

    protected g(Comparator<T> comparator, g0<T> g0Var, t0.a aVar) {
        Handler handlerJ = k1.J();
        this.f65343g = handlerJ;
        this.f65338b = comparator;
        this.f65339c = g0Var;
        this.f65340d = aVar;
        this.f65341e = new androidx.media3.common.util.y<>(handlerJ.getLooper(), androidx.media3.common.util.j.f61520a, new androidx.media3.common.util.y.b() { // from class: androidx.media3.exoplayer.source.preload.f
            @Override // androidx.media3.common.util.y.b
            public final void a(Object obj, androidx.media3.common.s sVar) {
                g.f((w) obj, sVar);
            }
        });
        this.f65342f = new HashMap();
        this.f65344h = new PriorityQueue<>();
    }

    private void F() {
        if (Looper.myLooper() != this.f65343g.getLooper()) {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public static /* synthetic */ void a(g gVar, final t0 t0Var) {
        gVar.f65341e.l(-1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.source.preload.a
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((w) obj).a(t0Var.g());
            }
        });
        gVar.r(t0Var);
    }

    public static /* synthetic */ void c(g gVar, final v vVar, t0 t0Var) {
        gVar.f65341e.l(-1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.exoplayer.source.preload.b
            @Override // androidx.media3.common.util.y.a
            public final void invoke(Object obj) {
                ((w) obj).b(vVar);
            }
        });
        gVar.r(t0Var);
    }

    public static /* synthetic */ void f(w wVar, androidx.media3.common.s sVar) {
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private boolean q(t0 t0Var) {
        return !this.f65344h.isEmpty() && ((b) androidx.media3.common.util.a.g(this.f65344h.peek())).f65349a == t0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(t0 t0Var) {
        synchronized (this.f65337a) {
            try {
                if (q(t0Var)) {
                    do {
                        this.f65344h.poll();
                        if (this.f65344h.isEmpty()) {
                            break;
                        }
                    } while (!s());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private boolean s() {
        if (!E()) {
            return false;
        }
        b bVar = (b) androidx.media3.common.util.a.g(this.f65344h.peek());
        g0.a aVarA = this.f65339c.a(bVar.f65350b);
        this.f65345i = aVarA;
        if (aVarA != null) {
            w(bVar.f65349a, bVar.f65351c);
            return true;
        }
        k(bVar.f65349a);
        return false;
    }

    public final boolean A(k0 k0Var) {
        if (!this.f65342f.containsKey(k0Var)) {
            return false;
        }
        t0 t0Var = this.f65342f.get(k0Var).f65349a;
        this.f65342f.remove(k0Var);
        z(t0Var);
        return true;
    }

    public final boolean B(t0 t0Var) {
        k0 k0VarG = t0Var.g();
        if (!this.f65342f.containsKey(k0VarG) || t0Var != this.f65342f.get(k0VarG).f65349a) {
            return false;
        }
        this.f65342f.remove(k0VarG);
        z(t0Var);
        return true;
    }

    public void C(w wVar) {
        F();
        this.f65341e.k(wVar);
    }

    public final void D() {
        Iterator<g<T>.b> it = this.f65342f.values().iterator();
        while (it.hasNext()) {
            z(it.next().f65349a);
        }
        this.f65342f.clear();
        synchronized (this.f65337a) {
            try {
                this.f65344h.clear();
                this.f65345i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected boolean E() {
        return true;
    }

    public final void g(k0 k0Var, T t10) {
        h(this.f65340d.h(k0Var), t10);
    }

    public final void h(t0 t0Var, T t10) {
        t0 t0VarL = l(t0Var);
        this.f65342f.put(t0VarL.g(), new b(this, t0VarL, t10));
    }

    public void i(w wVar) {
        this.f65341e.c(wVar);
    }

    public void j() {
        F();
        this.f65341e.d();
    }

    protected abstract void k(t0 t0Var);

    protected t0 l(t0 t0Var) {
        return t0Var;
    }

    @p0
    public final t0 m(k0 k0Var) {
        if (this.f65342f.containsKey(k0Var)) {
            return this.f65342f.get(k0Var).f65349a;
        }
        return null;
    }

    public final int n() {
        return this.f65342f.size();
    }

    @p0
    protected final g0.a o(t0 t0Var) {
        synchronized (this.f65337a) {
            try {
                if (!q(t0Var)) {
                    return null;
                }
                return this.f65345i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        synchronized (this.f65337a) {
            try {
                this.f65344h.clear();
                this.f65344h.addAll(this.f65342f.values());
                while (!this.f65344h.isEmpty() && !s()) {
                    this.f65344h.poll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void t(final t0 t0Var) {
        synchronized (this.f65337a) {
            try {
                if (q(t0Var)) {
                    this.f65343g.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.a(this.f65299a, t0Var);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void u(final v vVar, final t0 t0Var) {
        synchronized (this.f65337a) {
            try {
                if (q(t0Var)) {
                    this.f65343g.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.c(this.f65330a, vVar, t0Var);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void v(final t0 t0Var) {
        synchronized (this.f65337a) {
            try {
                if (q(t0Var)) {
                    this.f65343g.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f65303a.r(t0Var);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract void w(t0 t0Var, long j10);

    public final void x() {
        D();
        y();
        j();
    }

    protected void y() {
    }

    protected abstract void z(t0 t0Var);
}
