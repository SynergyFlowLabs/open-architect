package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39125a = 8;

    public t(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(x0.f39148a);
        return this;
    }
}
