package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
final class l extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final l f315495b = new l();

    private l() {
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public n0 Y(int i10, @Nullable String str) {
        a0.a(i10);
        return i10 >= k.f315490d ? a0.b(this, str) : super.Y(i10, str);
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        d.f315477h.R0(runnable, true, false);
    }

    @Override // kotlinx.coroutines.n0
    @k2
    public void j(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        d.f315477h.R0(runnable, true, true);
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}
