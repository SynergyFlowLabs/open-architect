package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class v7 implements b3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36749b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n7<Long> f36750a;

    public v7(@NotNull n7<Long> n7Var) {
        this.f36750a = n7Var;
    }

    @Override // androidx.compose.runtime.b3
    public long e() {
        return this.f36750a.getValue().longValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedLongState(baseState=" + this.f36750a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.b3, androidx.compose.runtime.n7
    @NotNull
    public Long getValue() {
        return this.f36750a.getValue();
    }
}
