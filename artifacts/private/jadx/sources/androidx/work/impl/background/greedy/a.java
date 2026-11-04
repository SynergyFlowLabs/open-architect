package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.h0;
import androidx.work.impl.w;
import androidx.work.v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f76612e = v.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w f76613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f76614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.b f76615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Runnable> f76616d = new HashMap();

    /* JADX INFO: renamed from: androidx.work.impl.background.greedy.a$a, reason: collision with other inner class name */
    class RunnableC0775a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.model.v f76617a;

        RunnableC0775a(final androidx.work.impl.model.v val$workSpec) {
            this.f76617a = val$workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.e().a(a.f76612e, "Scheduling work " + this.f76617a.f76983a);
            a.this.f76613a.c(this.f76617a);
        }
    }

    public a(@NonNull w immediateScheduler, @NonNull h0 runnableScheduler, @NonNull androidx.work.b clock) {
        this.f76613a = immediateScheduler;
        this.f76614b = runnableScheduler;
        this.f76615c = clock;
    }

    public void a(@NonNull final androidx.work.impl.model.v workSpec, long nextRunTime) {
        Runnable runnableRemove = this.f76616d.remove(workSpec.f76983a);
        if (runnableRemove != null) {
            this.f76614b.a(runnableRemove);
        }
        RunnableC0775a runnableC0775a = new RunnableC0775a(workSpec);
        this.f76616d.put(workSpec.f76983a, runnableC0775a);
        this.f76614b.b(nextRunTime - this.f76615c.currentTimeMillis(), runnableC0775a);
    }

    public void b(@NonNull String workSpecId) {
        Runnable runnableRemove = this.f76616d.remove(workSpecId);
        if (runnableRemove != null) {
            this.f76614b.a(runnableRemove);
        }
    }
}
