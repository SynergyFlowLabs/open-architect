package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class n1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Future<?> f315181a;

    public n1(@NotNull Future<?> future) {
        this.f315181a = future;
    }

    @Override // kotlinx.coroutines.o1
    public void dispose() {
        this.f315181a.cancel(false);
    }

    @NotNull
    public String toString() {
        return "DisposableFutureHandle[" + this.f315181a + AbstractJsonLexerKt.END_LIST;
    }
}
