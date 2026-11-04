package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class t extends v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public final p<?> f315633e;

    public t(@NotNull p<?> pVar) {
        this.f315633e = pVar;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return true;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        p<?> pVar = this.f315633e;
        pVar.Q(pVar.s(C()));
    }
}
