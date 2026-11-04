package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface l3 extends q2, n3<Integer> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
        @Deprecated
        @NotNull
        public static Integer a(@NotNull l3 l3Var) {
            return Integer.valueOf(l3.w(l3Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
        @Deprecated
        public static void b(@NotNull l3 l3Var, int i10) {
            l3.super.m(i10);
        }
    }

    static /* synthetic */ int w(l3 l3Var) {
        return super.getValue().intValue();
    }

    void j(int i10);

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
    default void m(int i10) {
        j(i10);
    }

    @Override // androidx.compose.runtime.q2
    int m1();

    @Override // androidx.compose.runtime.n3
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        m(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.q2, androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
    @NotNull
    default Integer getValue() {
        return Integer.valueOf(m1());
    }
}
