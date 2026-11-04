package androidx.media2.session;

import android.util.Log;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f58726e = "MS2ControllerMgr";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final boolean f58727f = Log.isLoggable(f58726e, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f58728a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private final androidx.collection.a<T, MediaSession.d> f58729b = new androidx.collection.a<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private final androidx.collection.a<MediaSession.d, a<T>.b> f58730c = new androidx.collection.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MediaSession.e f58731d;

    /* JADX INFO: renamed from: androidx.media2.session.a$a, reason: collision with other inner class name */
    class RunnableC0545a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f58732a;

        RunnableC0545a(MediaSession.d dVar) {
            this.f58732a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f58731d.isClosed()) {
                return;
            }
            a.this.f58731d.u().f(a.this.f58731d.k(), this.f58732a);
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f58734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f58735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SessionCommandGroup f58736c;

        b(T t10, e0 e0Var, SessionCommandGroup sessionCommandGroup) {
            this.f58734a = t10;
            this.f58735b = e0Var;
            this.f58736c = sessionCommandGroup;
            if (sessionCommandGroup == null) {
                this.f58736c = new SessionCommandGroup();
            }
        }
    }

    a(MediaSession.e eVar) {
        this.f58731d = eVar;
    }

    public void a(T t10, MediaSession.d dVar, SessionCommandGroup sessionCommandGroup) {
        if (t10 == null || dVar == null) {
            if (f58727f) {
                throw new IllegalArgumentException("controllerKey and controllerInfo shouldn't be null");
            }
            return;
        }
        synchronized (this.f58728a) {
            try {
                MediaSession.d dVarC = c(t10);
                if (dVarC == null) {
                    this.f58729b.put(t10, dVar);
                    this.f58730c.put(dVar, new b(t10, new e0(), sessionCommandGroup));
                } else {
                    this.f58730c.get(dVarC).f58736c = sessionCommandGroup;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final List<MediaSession.d> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f58728a) {
            try {
                arrayList.addAll(this.f58729b.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public MediaSession.d c(T t10) {
        MediaSession.d dVar;
        synchronized (this.f58728a) {
            try {
                dVar = this.f58729b.get(t10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @p0
    public final e0 d(@p0 MediaSession.d dVar) {
        a<T>.b bVar;
        synchronized (this.f58728a) {
            try {
                bVar = this.f58730c.get(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bVar != null) {
            return bVar.f58735b;
        }
        return null;
    }

    public e0 e(@p0 T t10) {
        a<T>.b bVar;
        synchronized (this.f58728a) {
            try {
                bVar = this.f58730c.get(c(t10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bVar != null) {
            return bVar.f58735b;
        }
        return null;
    }

    public boolean f(MediaSession.d dVar, int i10) {
        a<T>.b bVar;
        synchronized (this.f58728a) {
            try {
                bVar = this.f58730c.get(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar != null && bVar.f58736c.f(i10);
    }

    public boolean g(MediaSession.d dVar, SessionCommand sessionCommand) {
        a<T>.b bVar;
        synchronized (this.f58728a) {
            try {
                bVar = this.f58730c.get(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar != null && bVar.f58736c.g(sessionCommand);
    }

    public final boolean h(MediaSession.d dVar) {
        boolean z10;
        synchronized (this.f58728a) {
            try {
                z10 = this.f58730c.get(dVar) != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void i(MediaSession.d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f58728a) {
            try {
                a<T>.b bVarRemove = this.f58730c.remove(dVar);
                if (bVarRemove == null) {
                    return;
                }
                this.f58729b.remove(bVarRemove.f58734a);
                if (f58727f) {
                    dVar.toString();
                }
                bVarRemove.f58735b.close();
                this.f58731d.r2().execute(new RunnableC0545a(dVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(T t10) {
        if (t10 == null) {
            return;
        }
        i(c(t10));
    }

    public void k(MediaSession.d dVar, SessionCommandGroup sessionCommandGroup) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f58728a) {
            try {
                a<T>.b bVar = this.f58730c.get(dVar);
                if (bVar != null) {
                    bVar.f58736c = sessionCommandGroup;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
