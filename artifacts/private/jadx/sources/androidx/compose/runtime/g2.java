package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface g2 extends n7<Float> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
        @Deprecated
        @NotNull
        public static Float a(@NotNull g2 g2Var) {
            return Float.valueOf(g2.W0(g2Var));
        }
    }

    static /* synthetic */ float W0(g2 g2Var) {
        return super.getValue().floatValue();
    }

    float V0();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
    @NotNull
    default Float getValue() {
        return Float.valueOf(V0());
    }
}
