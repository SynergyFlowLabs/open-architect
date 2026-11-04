package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface m3 extends b3, n3<Long> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
        @Deprecated
        @NotNull
        public static Long a(@NotNull m3 m3Var) {
            return Long.valueOf(m3.k(m3Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
        @Deprecated
        public static void b(@NotNull m3 m3Var, long j10) {
            m3.super.l(j10);
        }
    }

    static /* synthetic */ long k(m3 m3Var) {
        return super.getValue().longValue();
    }

    void C(long j10);

    @Override // androidx.compose.runtime.b3
    long e();

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
    default void l(long j10) {
        C(j10);
    }

    @Override // androidx.compose.runtime.n3
    /* bridge */ /* synthetic */ default void setValue(Long l10) {
        l(l10.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.b3, androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
    @NotNull
    default Long getValue() {
        return Long.valueOf(e());
    }
}
