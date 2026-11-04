package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class h2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b3 f315034a;

    public h2(@NotNull b3 b3Var) {
        this.f315034a = b3Var;
    }

    @Override // kotlinx.coroutines.i2
    @NotNull
    public b3 a() {
        return this.f315034a;
    }

    @Override // kotlinx.coroutines.i2
    public boolean isActive() {
        return false;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
