package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class h extends AtomicBoolean implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f48386a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        super(false);
        this.f48386a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<Unit> dVar = this.f48386a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
