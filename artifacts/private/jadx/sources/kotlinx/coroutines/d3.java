package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
public final class d3 implements o1, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d3 f313923a = new d3();

    private d3() {
    }

    @Override // kotlinx.coroutines.u
    public boolean c(@NotNull Throwable th2) {
        return false;
    }

    @Override // kotlinx.coroutines.o1
    public void dispose() {
    }

    @Override // kotlinx.coroutines.u
    @Nullable
    public p2 getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }
}
