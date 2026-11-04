package kotlinx.coroutines.future;

import java.util.concurrent.Future;
import kotlinx.coroutines.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class a extends v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Future<?> f315003e;

    public a(@NotNull Future<?> future) {
        this.f315003e = future;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        if (th2 == null || this.f315003e.isDone()) {
            return;
        }
        this.f315003e.cancel(false);
    }
}
