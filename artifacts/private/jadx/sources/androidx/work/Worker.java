package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Worker extends u {
    androidx.work.impl.utils.futures.c<u.a> mFuture;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.p(Worker.this.doWork());
            } catch (Throwable th2) {
                Worker.this.mFuture.q(th2);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f76470a;

        b(final androidx.work.impl.utils.futures.c val$future) {
            this.f76470a = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f76470a.p(Worker.this.getForegroundInfo());
            } catch (Throwable th2) {
                this.f76470a.q(th2);
            }
        }
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @m1
    public abstract u.a doWork();

    @NonNull
    @m1
    public n getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.u
    @NonNull
    public t1<n> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        getBackgroundExecutor().execute(new b(cVarU));
        return cVarU;
    }

    @Override // androidx.work.u
    @NonNull
    public final t1<u.a> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.c.u();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
