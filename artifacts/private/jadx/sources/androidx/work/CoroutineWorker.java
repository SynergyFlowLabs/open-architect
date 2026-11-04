package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.t1;
import java.util.concurrent.ExecutionException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCoroutineWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n+ 2 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,144:1\n40#2,8:145\n48#2:162\n60#2,7:163\n40#2,8:172\n48#2:189\n60#2,7:190\n314#3,9:153\n323#3,2:170\n314#3,9:180\n323#3,2:197\n*S KotlinDebug\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n*L\n110#1:145,8\n110#1:162\n110#1:163,7\n125#1:172,8\n125#1:189\n125#1:190,7\n110#1:153,9\n110#1:170,2\n125#1:180,9\n125#1:197,2\n*E\n"})
public abstract class CoroutineWorker extends u {

    @NotNull
    private final kotlinx.coroutines.n0 coroutineContext;

    @NotNull
    private final androidx.work.impl.utils.futures.c<u.a> future;

    @NotNull
    private final kotlinx.coroutines.a0 job;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f76462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s<n> f76464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f76465d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<n> sVar, CoroutineWorker coroutineWorker, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f76464c = sVar;
            this.f76465d = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f76464c, this.f76465d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            s sVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f76463b;
            if (i10 == 0) {
                ResultKt.m(obj);
                s<n> sVar2 = this.f76464c;
                CoroutineWorker coroutineWorker = this.f76465d;
                this.f76462a = sVar2;
                this.f76463b = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == objL) {
                    return objL;
                }
                obj = foregroundInfo;
                sVar = sVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) this.f76462a;
                ResultKt.m(obj);
            }
            sVar.b(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f76466a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return CoroutineWorker.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f76466a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f76466a = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_release().p((u.a) obj);
            } catch (Throwable th2) {
                CoroutineWorker.this.getFuture$work_runtime_release().q(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = u2.c(null, 1, null);
        androidx.work.impl.utils.futures.c<u.a> cVarU = androidx.work.impl.utils.futures.c.u();
        Intrinsics.checkNotNullExpressionValue(cVarU, "create()");
        this.future = cVarU;
        cVarU.m0(new Runnable() { // from class: androidx.work.g
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker.b(this.f76556a);
            }
        }, getTaskExecutor().d());
        this.coroutineContext = l1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            p2.a.b(this$0.job, null, 1, null);
        }
    }

    @kotlin.l(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, kotlin.coroutines.d<? super n> dVar) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    public abstract Object doWork(@NotNull kotlin.coroutines.d<? super u.a> dVar);

    @NotNull
    public kotlinx.coroutines.n0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull kotlin.coroutines.d<? super n> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.u
    @NotNull
    public final t1<n> getForegroundInfoAsync() {
        kotlinx.coroutines.a0 a0VarC = u2.c(null, 1, null);
        s0 s0VarA = t0.a(getCoroutineContext().plus(a0VarC));
        s sVar = new s(a0VarC, null, 2, null);
        kotlinx.coroutines.k.f(s0VarA, null, null, new a(sVar, this, null), 3, null);
        return sVar;
    }

    @NotNull
    public final androidx.work.impl.utils.futures.c<u.a> getFuture$work_runtime_release() {
        return this.future;
    }

    @NotNull
    public final kotlinx.coroutines.a0 getJob$work_runtime_release() {
        return this.job;
    }

    @Override // androidx.work.u
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Nullable
    public final Object setForeground(@NotNull n nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        t1<Void> foregroundAsync = setForegroundAsync(nVar);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            foregroundAsync.m0(new t.a(pVar, foregroundAsync), k.INSTANCE);
            pVar.e0(new t.b(foregroundAsync));
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                return objU;
            }
        }
        return Unit.f312394a;
    }

    @Nullable
    public final Object setProgress(@NotNull h hVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        t1<Void> progressAsync = setProgressAsync(hVar);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            progressAsync.m0(new t.a(pVar, progressAsync), k.INSTANCE);
            pVar.e0(new t.b(progressAsync));
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                return objU;
            }
        }
        return Unit.f312394a;
    }

    @Override // androidx.work.u
    @NotNull
    public final t1<u.a> startWork() {
        kotlinx.coroutines.k.f(t0.a(getCoroutineContext().plus(this.job)), null, null, new b(null), 3, null);
        return this.future;
    }
}
