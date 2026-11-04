package androidx.compose.foundation.layout;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class w6 extends CancellationException {
    public w6() {
        super("Window insets animation cancelled");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
