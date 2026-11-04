package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface q2 extends n7<Integer> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
        @Deprecated
        @NotNull
        public static Integer a(@NotNull q2 q2Var) {
            return Integer.valueOf(q2.n1(q2Var));
        }
    }

    static /* synthetic */ int n1(q2 q2Var) {
        return super.getValue().intValue();
    }

    int m1();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
    @NotNull
    default Integer getValue() {
        return Integer.valueOf(m1());
    }
}
