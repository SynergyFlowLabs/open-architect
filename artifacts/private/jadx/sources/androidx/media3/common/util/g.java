package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f61506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f61507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a<T> f61508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f61509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private T f61510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61511f;

    public interface a<T> {
        void a(T t10, T t11);
    }

    public g(T t10, Looper looper, Looper looper2, j jVar, a<T> aVar) {
        this.f61506a = jVar.d(looper, null);
        this.f61507b = jVar.d(looper2, null);
        this.f61509d = t10;
        this.f61510e = t10;
        this.f61508c = aVar;
    }

    public static /* synthetic */ void a(final g gVar, com.google.common.base.t tVar) {
        final T t10 = (T) tVar.apply(gVar.f61510e);
        gVar.f61510e = t10;
        gVar.f61507b.g(new Runnable() { // from class: androidx.media3.common.util.f
            @Override // java.lang.Runnable
            public final void run() {
                g.c(this.f61502a, t10);
            }
        });
    }

    public static /* synthetic */ void b(g gVar, Object obj) {
        if (gVar.f61511f == 0) {
            gVar.h(obj);
        }
    }

    public static /* synthetic */ void c(g gVar, Object obj) {
        int i10 = gVar.f61511f - 1;
        gVar.f61511f = i10;
        if (i10 == 0) {
            gVar.h(obj);
        }
    }

    private void h(T t10) {
        T t11 = this.f61509d;
        this.f61509d = t10;
        if (!t11.equals(t10)) {
            this.f61508c.a(t11, t10);
        }
    }

    public T d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f61507b.f()) {
            return this.f61509d;
        }
        androidx.media3.common.util.a.i(looperMyLooper == this.f61506a.f());
        return this.f61510e;
    }

    public void e(Runnable runnable) {
        this.f61506a.g(runnable);
    }

    public void f(final T t10) {
        this.f61510e = t10;
        this.f61507b.g(new Runnable() { // from class: androidx.media3.common.util.e
            @Override // java.lang.Runnable
            public final void run() {
                g.b(this.f61489a, t10);
            }
        });
    }

    public void g(com.google.common.base.t<T, T> tVar, final com.google.common.base.t<T, T> tVar2) {
        androidx.media3.common.util.a.i(Looper.myLooper() == this.f61507b.f());
        this.f61511f++;
        this.f61506a.g(new Runnable() { // from class: androidx.media3.common.util.d
            @Override // java.lang.Runnable
            public final void run() {
                g.a(this.f61485a, tVar2);
            }
        });
        h(tVar.apply(this.f61509d));
    }
}
