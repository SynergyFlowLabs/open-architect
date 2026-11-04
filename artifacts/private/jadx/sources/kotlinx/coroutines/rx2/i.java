package kotlinx.coroutines.rx2;

import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements dj.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p2 f315368a;

    public i(@NotNull p2 p2Var) {
        this.f315368a = p2Var;
    }

    @Override // dj.f
    public void cancel() {
        p2.a.b(this.f315368a, null, 1, null);
    }
}
