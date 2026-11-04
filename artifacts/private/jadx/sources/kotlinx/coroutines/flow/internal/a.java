package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final transient Object f314480a;

    public a(@NotNull Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f314480a = obj;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
