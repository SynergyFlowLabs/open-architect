package kotlin.coroutines.jvm.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class l implements kotlin.coroutines.d<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Result<Unit> f312483a;

    public final void a() {
        synchronized (this) {
            while (true) {
                try {
                    Result<Unit> result = this.f312483a;
                    if (result == null) {
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        ResultKt.m(result.j());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Nullable
    public final Result<Unit> b() {
        return this.f312483a;
    }

    public final void d(@Nullable Result<Unit> result) {
        this.f312483a = result;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.h.f312451a;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            try {
                this.f312483a = Result.a(obj);
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
