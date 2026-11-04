package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends t1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Thread f315032h;

    public h(@NotNull Thread thread) {
        this.f315032h = thread;
    }

    @Override // kotlinx.coroutines.u1
    @NotNull
    protected Thread E1() {
        return this.f315032h;
    }
}
