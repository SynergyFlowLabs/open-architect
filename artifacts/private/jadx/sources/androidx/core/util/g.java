package androidx.core.util;

import androidx.annotation.w0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(24)
final class g<T> extends AtomicBoolean implements Consumer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<T> f48381a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull kotlin.coroutines.d<? super T> dVar) {
        super(false);
        this.f48381a = dVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<T> dVar = this.f48381a;
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
