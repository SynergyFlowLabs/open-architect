package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class s7 implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36379b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n7<Double> f36380a;

    public s7(@NotNull n7<Double> n7Var) {
        this.f36380a = n7Var;
    }

    @Override // androidx.compose.runtime.x1
    public double X() {
        return this.f36380a.getValue().doubleValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedDoubleState(baseState=" + this.f36380a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.x1, androidx.compose.runtime.n7
    @NotNull
    public Double getValue() {
        return this.f36380a.getValue();
    }
}
