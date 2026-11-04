package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends kotlinx.coroutines.n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final r f52335b = new r();

    @Override // kotlinx.coroutines.n0
    public boolean N(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (kotlinx.coroutines.l1.e().R0().N(context)) {
            return true;
        }
        return !this.f52335b.b();
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f52335b.c(context, block);
    }
}
