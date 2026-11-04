package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface b3 extends n7<Long> {

    public static final class a {
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
        @Deprecated
        @NotNull
        public static Long a(@NotNull b3 b3Var) {
            return Long.valueOf(b3.v(b3Var));
        }
    }

    static /* synthetic */ long v(b3 b3Var) {
        return super.getValue().longValue();
    }

    long e();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.n7
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
    @NotNull
    default Long getValue() {
        return Long.valueOf(e());
    }
}
