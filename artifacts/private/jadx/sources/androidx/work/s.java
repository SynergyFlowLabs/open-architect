package androidx.work;

import com.google.common.util.concurrent.t1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class s<R> implements t1<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p2 f77435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.utils.futures.c<R> f77436b;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s<R> f77437a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<R> sVar) {
            super(1);
            this.f77437a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            if (th2 == null) {
                if (!((s) this.f77437a).f77436b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (th2 instanceof CancellationException) {
                    ((s) this.f77437a).f77436b.cancel(true);
                    return;
                }
                androidx.work.impl.utils.futures.c cVar = ((s) this.f77437a).f77436b;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                cVar.q(th2);
            }
        }
    }

    public s(@NotNull p2 job, @NotNull androidx.work.impl.utils.futures.c<R> underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f77435a = job;
        this.f77436b = underlying;
        job.E(new a(this));
    }

    public final void b(R r10) {
        this.f77436b.p(r10);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f77436b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f77436b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f77436b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f77436b.isDone();
    }

    @Override // com.google.common.util.concurrent.t1
    public void m0(Runnable runnable, Executor executor) {
        this.f77436b.m0(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return this.f77436b.get(j10, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s(p2 p2Var, androidx.work.impl.utils.futures.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            cVar = androidx.work.impl.utils.futures.c.u();
            Intrinsics.checkNotNullExpressionValue(cVar, "create()");
        }
        this(p2Var, cVar);
    }
}
