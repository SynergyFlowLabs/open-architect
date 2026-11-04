package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface k3 extends g2, n3<Float> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
        @Deprecated
        @NotNull
        public static Float a(@NotNull k3 k3Var) {
            return Float.valueOf(k3.B(k3Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
        @Deprecated
        public static void b(@NotNull k3 k3Var, float f10) {
            k3.super.n(f10);
        }
    }

    static /* synthetic */ float B(k3 k3Var) {
        return super.getValue().floatValue();
    }

    @Override // androidx.compose.runtime.g2
    float V0();

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
    default void n(float f10) {
        q(f10);
    }

    void q(float f10);

    @Override // androidx.compose.runtime.n3
    /* bridge */ /* synthetic */ default void setValue(Float f10) {
        n(f10.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.g2, androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
    @NotNull
    default Float getValue() {
        return Float.valueOf(V0());
    }
}
