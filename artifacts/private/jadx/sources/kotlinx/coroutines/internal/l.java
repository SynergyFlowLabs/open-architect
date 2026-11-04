package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final transient CoroutineContext f315088a;

    public l(@NotNull CoroutineContext coroutineContext) {
        this.f315088a = coroutineContext;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getLocalizedMessage() {
        return String.valueOf(this.f315088a);
    }
}
