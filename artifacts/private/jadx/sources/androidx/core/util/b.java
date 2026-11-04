package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class b<T> extends AtomicBoolean implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<T> f48366a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull kotlin.coroutines.d<? super T> dVar) {
        super(false);
        this.f48366a = dVar;
    }

    @Override // androidx.core.util.e
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<T> dVar = this.f48366a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(t10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
