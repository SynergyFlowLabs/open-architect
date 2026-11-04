package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.impl.WorkDatabase;
import androidx.work.l0;
import com.google.common.util.concurrent.t1;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class h0 implements androidx.work.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f77230c = androidx.work.v.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f77231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.b f77232b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f77233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.h f77234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f77235c;

        a(final UUID val$id, final androidx.work.h val$data, final androidx.work.impl.utils.futures.c val$future) {
            this.f77233a = val$id;
            this.f77234b = val$data;
            this.f77235c = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = this.f77233a.toString();
            androidx.work.v vVarE = androidx.work.v.e();
            String str = h0.f77230c;
            vVarE.a(str, "Updating progress for " + this.f77233a + " (" + this.f77234b + ")");
            h0.this.f77231a.beginTransaction();
            try {
                androidx.work.impl.model.v vVarH = h0.this.f77231a.k().H(string);
                if (vVarH == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (vVarH.f76984b == l0.c.RUNNING) {
                    h0.this.f77231a.j().c(new androidx.work.impl.model.r(string, this.f77234b));
                } else {
                    androidx.work.v.e().l(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                this.f77235c.p(null);
                h0.this.f77231a.setTransactionSuccessful();
                h0.this.f77231a.endTransaction();
            } catch (Throwable th2) {
                try {
                    androidx.work.v.e().d(h0.f77230c, "Error updating Worker progress", th2);
                    this.f77235c.q(th2);
                } catch (Throwable th3) {
                    h0.this.f77231a.endTransaction();
                    throw th3;
                }
            }
        }
    }

    public h0(@NonNull WorkDatabase workDatabase, @NonNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        this.f77231a = workDatabase;
        this.f77232b = taskExecutor;
    }

    @Override // androidx.work.f0
    @NonNull
    public t1<Void> a(@NonNull final Context context, @NonNull final UUID id2, @NonNull final androidx.work.h data) {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f77232b.b(new a(id2, data, cVarU));
        return cVarU;
    }
}
