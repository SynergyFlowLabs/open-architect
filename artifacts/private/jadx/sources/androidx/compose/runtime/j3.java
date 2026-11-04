package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface j3 extends x1, n3<Double> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
        @Deprecated
        @NotNull
        public static Double a(@NotNull j3 j3Var) {
            return Double.valueOf(j3.r(j3Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
        @Deprecated
        public static void b(@NotNull j3 j3Var, double d10) {
            j3.super.o(d10);
        }
    }

    static /* synthetic */ double r(j3 j3Var) {
        return super.getValue().doubleValue();
    }

    @Override // androidx.compose.runtime.x1
    double X();

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
    default void o(double d10) {
        x(d10);
    }

    @Override // androidx.compose.runtime.n3
    /* bridge */ /* synthetic */ default void setValue(Double d10) {
        o(d10.doubleValue());
    }

    void x(double d10);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.x1, androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
    @NotNull
    default Double getValue() {
        return Double.valueOf(X());
    }
}
