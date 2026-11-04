package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class v extends v2 implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public final w f315661e;

    public v(@NotNull w wVar) {
        this.f315661e = wVar;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return true;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        this.f315661e.r(C());
    }

    @Override // kotlinx.coroutines.u
    public boolean c(@NotNull Throwable th2) {
        return C().A0(th2);
    }

    @Override // kotlinx.coroutines.u
    @NotNull
    public p2 getParent() {
        return C();
    }
}
