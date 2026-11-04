package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.d;
import androidx.work.impl.constraints.e;
import androidx.work.impl.constraints.f;
import androidx.work.impl.constraints.trackers.o;
import androidx.work.impl.model.w;
import androidx.work.impl.r0;
import androidx.work.impl.utils.b0;
import androidx.work.impl.utils.futures.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.u;
import androidx.work.v;
import com.google.common.util.concurrent.t1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
public final class ConstraintTrackingWorker extends u implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WorkerParameters f77310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f77311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f77312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c<u.a> f77313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private u f77314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f77310a = workerParameters;
        this.f77311b = new Object();
        this.f77313d = c.u();
    }

    private final void f() {
        if (this.f77313d.isCancelled()) {
            return;
        }
        String strA = getInputData().A(f4.d.f274937b);
        v vVarE = v.e();
        Intrinsics.checkNotNullExpressionValue(vVarE, "get()");
        if (strA == null || strA.length() == 0) {
            vVarE.c(f4.d.f274936a, "No worker to delegate to.");
            c<u.a> future = this.f77313d;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            f4.d.d(future);
            return;
        }
        u uVarB = getWorkerFactory().b(getApplicationContext(), strA, this.f77310a);
        this.f77314e = uVarB;
        if (uVarB == null) {
            vVarE.a(f4.d.f274936a, "No worker to delegate to.");
            c<u.a> future2 = this.f77313d;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            f4.d.d(future2);
            return;
        }
        r0 r0VarM = r0.M(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(r0VarM, "getInstance(applicationContext)");
        w wVarK = r0VarM.S().k();
        String string = getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        androidx.work.impl.model.v vVarH = wVarK.H(string);
        if (vVarH == null) {
            c<u.a> future3 = this.f77313d;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            f4.d.d(future3);
            return;
        }
        o oVarR = r0VarM.R();
        Intrinsics.checkNotNullExpressionValue(oVarR, "workManagerImpl.trackers");
        e eVar = new e(oVarR);
        n0 n0VarA = r0VarM.U().a();
        Intrinsics.checkNotNullExpressionValue(n0VarA, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        final p2 p2VarB = f.b(eVar, vVarH, n0VarA, this);
        this.f77313d.m0(new Runnable() { // from class: f4.b
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.g(p2VarB);
            }
        }, new b0());
        if (!eVar.a(vVarH)) {
            vVarE.a(f4.d.f274936a, "Constraints not met for delegate " + strA + ". Requesting retry.");
            c<u.a> future4 = this.f77313d;
            Intrinsics.checkNotNullExpressionValue(future4, "future");
            f4.d.e(future4);
            return;
        }
        vVarE.a(f4.d.f274936a, "Constraints met for delegate " + strA);
        try {
            u uVar = this.f77314e;
            Intrinsics.checkNotNull(uVar);
            final t1<u.a> t1VarStartWork = uVar.startWork();
            Intrinsics.checkNotNullExpressionValue(t1VarStartWork, "delegate!!.startWork()");
            t1VarStartWork.m0(new Runnable() { // from class: f4.c
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.h(this.f274934a, t1VarStartWork);
                }
            }, getBackgroundExecutor());
        } catch (Throwable th2) {
            vVarE.b(f4.d.f274936a, "Delegated worker " + strA + " threw exception in startWork.", th2);
            synchronized (this.f77311b) {
                try {
                    if (!this.f77312c) {
                        c<u.a> future5 = this.f77313d;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        f4.d.d(future5);
                    } else {
                        vVarE.a(f4.d.f274936a, "Constraints were unmet, Retrying.");
                        c<u.a> future6 = this.f77313d;
                        Intrinsics.checkNotNullExpressionValue(future6, "future");
                        f4.d.e(future6);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p2 job) {
        Intrinsics.checkNotNullParameter(job, "$job");
        job.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ConstraintTrackingWorker this$0, t1 innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.f77311b) {
            try {
                if (this$0.f77312c) {
                    c<u.a> future = this$0.f77313d;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    f4.d.e(future);
                } else {
                    this$0.f77313d.r(innerFuture);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f();
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public final u d() {
        return this.f77314e;
    }

    @Override // androidx.work.impl.constraints.d
    public void e(@NotNull androidx.work.impl.model.v workSpec, @NotNull b state) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(state, "state");
        v.e().a(f4.d.f274936a, "Constraints changed for " + workSpec);
        if (state instanceof b.C0778b) {
            synchronized (this.f77311b) {
                try {
                    this.f77312c = true;
                    Unit unit = Unit.f312394a;
                } finally {
                }
            }
        }
    }

    @Override // androidx.work.u
    public void onStopped() {
        super.onStopped();
        u uVar = this.f77314e;
        if (uVar == null || uVar.isStopped()) {
            return;
        }
        uVar.stop(Build.VERSION.SDK_INT >= 31 ? getStopReason() : 0);
    }

    @Override // androidx.work.u
    @NotNull
    public t1<u.a> startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: f4.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.i(this.f274932a);
            }
        });
        c<u.a> future = this.f77313d;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
