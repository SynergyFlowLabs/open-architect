package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class t7 implements g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36665b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n7<Float> f36666a;

    public t7(@NotNull n7<Float> n7Var) {
        this.f36666a = n7Var;
    }

    @Override // androidx.compose.runtime.g2
    public float V0() {
        return this.f36666a.getValue().floatValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedFloatState(baseState=" + this.f36666a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.g2, androidx.compose.runtime.n7
    @NotNull
    public Float getValue() {
        return this.f36666a.getValue();
    }
}
