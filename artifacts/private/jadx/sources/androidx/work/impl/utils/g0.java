package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.t1;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class g0 implements androidx.work.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f77221d = androidx.work.v.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.b f77222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f77223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final androidx.work.impl.model.w f77224c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f77225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f77226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.n f77227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f77228d;

        a(final androidx.work.impl.utils.futures.c val$future, final UUID val$id, final androidx.work.n val$foregroundInfo, final Context val$context) {
            this.f77225a = val$future;
            this.f77226b = val$id;
            this.f77227c = val$foregroundInfo;
            this.f77228d = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f77225a.isCancelled()) {
                    String string = this.f77226b.toString();
                    androidx.work.impl.model.v vVarH = g0.this.f77224c.H(string);
                    if (vVarH == null || vVarH.f76984b.l()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    g0.this.f77223b.a(string, this.f77227c);
                    this.f77228d.startService(androidx.work.impl.foreground.b.f(this.f77228d, androidx.work.impl.model.z.a(vVarH), this.f77227c));
                }
                this.f77225a.p(null);
            } catch (Throwable th2) {
                this.f77225a.q(th2);
            }
        }
    }

    @e.a({"LambdaLast"})
    public g0(@NonNull WorkDatabase workDatabase, @NonNull androidx.work.impl.foreground.a foregroundProcessor, @NonNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        this.f77223b = foregroundProcessor;
        this.f77222a = taskExecutor;
        this.f77224c = workDatabase.k();
    }

    @Override // androidx.work.o
    @NonNull
    public t1<Void> a(@NonNull final Context context, @NonNull final UUID id2, @NonNull final androidx.work.n foregroundInfo) {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f77222a.b(new a(cVarU, id2, foregroundInfo, context));
        return cVarU;
    }
}
