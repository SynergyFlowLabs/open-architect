package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class u7 implements q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36720b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n7<Integer> f36721a;

    public u7(@NotNull n7<Integer> n7Var) {
        this.f36721a = n7Var;
    }

    @Override // androidx.compose.runtime.q2
    public int m1() {
        return this.f36721a.getValue().intValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedIntState(baseState=" + this.f36721a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.q2, androidx.compose.runtime.n7
    @NotNull
    public Integer getValue() {
        return this.f36721a.getValue();
    }
}
