package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class f0 implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f77182g = androidx.work.v.i("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f77183a = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f77184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final androidx.work.impl.model.v f77185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.work.u f77186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.work.o f77187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.b f77188f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f77189a;

        a(final androidx.work.impl.utils.futures.c val$foregroundFuture) {
            this.f77189a = val$foregroundFuture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (f0.this.f77183a.isCancelled()) {
                return;
            }
            try {
                androidx.work.n nVar = (androidx.work.n) this.f77189a.get();
                if (nVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + f0.this.f77185c.f76985c + ") but did not provide ForegroundInfo");
                }
                androidx.work.v.e().a(f0.f77182g, "Updating notification for " + f0.this.f77185c.f76985c);
                f0 f0Var = f0.this;
                f0Var.f77183a.r(f0Var.f77187e.a(f0Var.f77184b, f0Var.f77186d.getId(), nVar));
            } catch (Throwable th2) {
                f0.this.f77183a.q(th2);
            }
        }
    }

    @e.a({"LambdaLast"})
    public f0(@NonNull Context context, @NonNull androidx.work.impl.model.v workSpec, @NonNull androidx.work.u worker, @NonNull androidx.work.o foregroundUpdater, @NonNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        this.f77184b = context;
        this.f77185c = workSpec;
        this.f77186d = worker;
        this.f77187e = foregroundUpdater;
        this.f77188f = taskExecutor;
    }

    public static /* synthetic */ void a(f0 f0Var, androidx.work.impl.utils.futures.c cVar) {
        if (f0Var.f77183a.isCancelled()) {
            cVar.cancel(true);
        } else {
            cVar.r(f0Var.f77186d.getForegroundInfoAsync());
        }
    }

    @NonNull
    public t1<Void> b() {
        return this.f77183a;
    }

    @Override // java.lang.Runnable
    @e.a({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f77185c.f76999q || Build.VERSION.SDK_INT >= 31) {
            this.f77183a.p(null);
            return;
        }
        final androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f77188f.c().execute(new Runnable() { // from class: androidx.work.impl.utils.e0
            @Override // java.lang.Runnable
            public final void run() {
                f0.a(this.f77180a, cVarU);
            }
        });
        cVarU.m0(new a(cVarU), this.f77188f.c());
    }
}
