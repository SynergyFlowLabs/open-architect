package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface x1 extends n7<Double> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
        @Deprecated
        @NotNull
        public static Double a(@NotNull x1 x1Var) {
            return Double.valueOf(x1.Z(x1Var));
        }
    }

    static /* synthetic */ double Z(x1 x1Var) {
        return super.getValue().doubleValue();
    }

    double X();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
    @NotNull
    default Double getValue() {
        return Double.valueOf(X());
    }
}
