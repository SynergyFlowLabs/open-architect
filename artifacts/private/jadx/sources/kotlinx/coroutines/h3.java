package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class h3 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Future<?> f315035a;

    public h3(@NotNull Future<?> future) {
        this.f315035a = future;
    }

    @Override // kotlinx.coroutines.m
    public void e(@Nullable Throwable th2) {
        if (th2 != null) {
            this.f315035a.cancel(false);
        }
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.f315035a + AbstractJsonLexerKt.END_LIST;
    }
}
