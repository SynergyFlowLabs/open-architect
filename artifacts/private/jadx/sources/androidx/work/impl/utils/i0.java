package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f77237e = androidx.work.v.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.h0 f77238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<androidx.work.impl.model.n, b> f77239b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<androidx.work.impl.model.n, a> f77240c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f77241d = new Object();

    @b1({b1.a.LIBRARY_GROUP})
    public interface a {
        void a(@NonNull androidx.work.impl.model.n id2);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public static class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String f77242c = "WrkTimerRunnable";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i0 f77243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.work.impl.model.n f77244b;

        b(@NonNull i0 workTimer, @NonNull androidx.work.impl.model.n id2) {
            this.f77243a = workTimer;
            this.f77244b = id2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f77243a.f77241d) {
                try {
                    if (this.f77243a.f77239b.remove(this.f77244b) != null) {
                        a aVarRemove = this.f77243a.f77240c.remove(this.f77244b);
                        if (aVarRemove != null) {
                            aVarRemove.a(this.f77244b);
                        }
                    } else {
                        androidx.work.v.e().a(f77242c, String.format("Timer with %s is already marked as complete.", this.f77244b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public i0(@NonNull androidx.work.h0 scheduler) {
        this.f77238a = scheduler;
    }

    @NonNull
    @l1
    public Map<androidx.work.impl.model.n, a> a() {
        Map<androidx.work.impl.model.n, a> map;
        synchronized (this.f77241d) {
            try {
                map = this.f77240c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    @NonNull
    @l1
    public Map<androidx.work.impl.model.n, b> b() {
        Map<androidx.work.impl.model.n, b> map;
        synchronized (this.f77241d) {
            map = this.f77239b;
        }
        return map;
    }

    public void c(@NonNull final androidx.work.impl.model.n id2, long processingTimeMillis, @NonNull a listener) {
        synchronized (this.f77241d) {
            androidx.work.v.e().a(f77237e, "Starting timer for " + id2);
            d(id2);
            b bVar = new b(this, id2);
            this.f77239b.put(id2, bVar);
            this.f77240c.put(id2, listener);
            this.f77238a.b(processingTimeMillis, bVar);
        }
    }

    public void d(@NonNull final androidx.work.impl.model.n id2) {
        synchronized (this.f77241d) {
            try {
                if (this.f77239b.remove(id2) != null) {
                    androidx.work.v.e().a(f77237e, "Stopping timer for " + id2);
                    this.f77240c.remove(id2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
