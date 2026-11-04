package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public final class f3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f289193d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f3 f289194e = new f3(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap<d<?>, c> f289195a = new IdentityHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f289196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f289197c;

    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.f3.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(v0.m("grpc-shared-destroyer-%d", true));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f289198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f289199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f289200c;

        b(c cVar, d dVar, Object obj) {
            this.f289198a = cVar;
            this.f289199b = dVar;
            this.f289200c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f3.this) {
                try {
                    if (this.f289198a.f289203b == 0) {
                        try {
                            this.f289199b.b(this.f289200c);
                            f3.this.f289195a.remove(this.f289199b);
                            if (f3.this.f289195a.isEmpty()) {
                                f3.this.f289197c.shutdown();
                                f3.this.f289197c = null;
                            }
                        } catch (Throwable th2) {
                            f3.this.f289195a.remove(this.f289199b);
                            if (f3.this.f289195a.isEmpty()) {
                                f3.this.f289197c.shutdown();
                                f3.this.f289197c = null;
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f289202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f289203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ScheduledFuture<?> f289204c;

        c(Object obj) {
            this.f289202a = obj;
        }
    }

    public interface d<T> {
        void b(T t10);

        T k();
    }

    interface e {
        ScheduledExecutorService a();
    }

    f3(e eVar) {
        this.f289196b = eVar;
    }

    public static <T> T d(d<T> dVar) {
        return (T) f289194e.e(dVar);
    }

    public static <T> T f(d<T> dVar, T t10) {
        return (T) f289194e.g(dVar, t10);
    }

    synchronized <T> T e(d<T> dVar) {
        c cVar;
        try {
            cVar = this.f289195a.get(dVar);
            if (cVar == null) {
                cVar = new c(dVar.k());
                this.f289195a.put(dVar, cVar);
            }
            ScheduledFuture<?> scheduledFuture = cVar.f289204c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                cVar.f289204c = null;
            }
            cVar.f289203b++;
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) cVar.f289202a;
    }

    synchronized <T> T g(d<T> dVar, T t10) {
        try {
            c cVar = this.f289195a.get(dVar);
            if (cVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + dVar);
            }
            com.google.common.base.j0.e(t10 == cVar.f289202a, "Releasing the wrong instance");
            com.google.common.base.j0.h0(cVar.f289203b > 0, "Refcount has already reached zero");
            int i10 = cVar.f289203b - 1;
            cVar.f289203b = i10;
            if (i10 == 0) {
                com.google.common.base.j0.h0(cVar.f289204c == null, "Destroy task already scheduled");
                if (this.f289197c == null) {
                    this.f289197c = this.f289196b.a();
                }
                cVar.f289204c = this.f289197c.schedule(new k1(new b(cVar, dVar, t10)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return null;
    }
}
