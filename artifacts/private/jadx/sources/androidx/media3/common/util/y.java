package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class y<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f61687j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f61688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f61689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f61690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f61691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f61692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f61693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f61694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("releasedLock")
    private boolean f61695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f61696i;

    public interface a<T> {
        void invoke(T t10);
    }

    public interface b<T> {
        void a(T t10, androidx.media3.common.s sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f61697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.common.s.b f61698b = new androidx.media3.common.s.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f61699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f61700d;

        public c(T t10) {
            this.f61697a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f61700d) {
                return;
            }
            if (i10 != -1) {
                this.f61698b.a(i10);
            }
            this.f61699c = true;
            aVar.invoke(this.f61697a);
        }

        public void b(b<T> bVar) {
            if (this.f61700d || !this.f61699c) {
                return;
            }
            androidx.media3.common.s sVarE = this.f61698b.e();
            this.f61698b = new androidx.media3.common.s.b();
            this.f61699c = false;
            bVar.a(this.f61697a, sVarE);
        }

        public void c(b<T> bVar) {
            this.f61700d = true;
            if (this.f61699c) {
                boolean z10 = false;
                this.f61699c = false;
                bVar.a(this.f61697a, this.f61698b.e());
            }
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f61697a.equals(((c) obj).f61697a);
        }

        public int hashCode() {
            return this.f61697a.hashCode();
        }
    }

    public y(Looper looper, j jVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, jVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(Message message) {
        Iterator<c<T>> it = this.f61691d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f61690c);
            if (this.f61689b.n(1)) {
                break;
            }
        }
        return true;
    }

    private void o() {
        boolean z10;
        if (this.f61696i) {
            if (Thread.currentThread() == this.f61689b.f().getThread()) {
                z10 = true;
                int i10 = 4 & 1;
            } else {
                z10 = false;
            }
            androidx.media3.common.util.a.i(z10);
        }
    }

    public void c(T t10) {
        androidx.media3.common.util.a.g(t10);
        synchronized (this.f61694g) {
            try {
                if (this.f61695h) {
                    return;
                }
                this.f61691d.add(new c<>(t10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        o();
        Iterator<c<T>> it = this.f61691d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f61690c);
        }
        this.f61691d.clear();
    }

    @androidx.annotation.j
    public y<T> e(Looper looper, j jVar, b<T> bVar) {
        return new y<>(this.f61691d, looper, jVar, bVar, this.f61696i);
    }

    @androidx.annotation.j
    public y<T> f(Looper looper, b<T> bVar) {
        return e(looper, this.f61688a, bVar);
    }

    public void g() {
        o();
        if (!this.f61693f.isEmpty()) {
            if (!this.f61689b.n(1)) {
                u uVar = this.f61689b;
                uVar.o(uVar.a(1));
            }
            boolean zIsEmpty = this.f61692e.isEmpty();
            this.f61692e.addAll(this.f61693f);
            this.f61693f.clear();
            if (zIsEmpty) {
                while (!this.f61692e.isEmpty()) {
                    this.f61692e.peekFirst().run();
                    this.f61692e.removeFirst();
                }
            }
        }
    }

    public void i(final int i10, final a<T> aVar) {
        o();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f61691d);
        this.f61693f.add(new Runnable() { // from class: androidx.media3.common.util.x
            @Override // java.lang.Runnable
            public final void run() {
                y.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        o();
        synchronized (this.f61694g) {
            int i10 = 4 << 1;
            this.f61695h = true;
        }
        Iterator<c<T>> it = this.f61691d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f61690c);
        }
        this.f61691d.clear();
    }

    public void k(T t10) {
        o();
        for (c<T> cVar : this.f61691d) {
            if (cVar.f61697a.equals(t10)) {
                cVar.c(this.f61690c);
                this.f61691d.remove(cVar);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        g();
    }

    @Deprecated
    public void m(boolean z10) {
        this.f61696i = z10;
    }

    public int n() {
        o();
        return this.f61691d.size();
    }

    private y(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, j jVar, b<T> bVar, boolean z10) {
        this.f61688a = jVar;
        this.f61691d = copyOnWriteArraySet;
        this.f61690c = bVar;
        this.f61694g = new Object();
        this.f61692e = new ArrayDeque<>();
        this.f61693f = new ArrayDeque<>();
        this.f61689b = jVar.d(looper, new Handler.Callback() { // from class: androidx.media3.common.util.w
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f61676a.h(message);
            }
        });
        this.f61696i = z10;
    }
}
