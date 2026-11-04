package androidx.compose.runtime.snapshots;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface c1 {

    public static final class a {
        @Deprecated
        @Nullable
        public static e1 a(@NotNull c1 c1Var, @NotNull e1 e1Var, @NotNull e1 e1Var2, @NotNull e1 e1Var3) {
            return c1.super.t(e1Var, e1Var2, e1Var3);
        }
    }

    @NotNull
    e1 A();

    void p(@NotNull e1 e1Var);

    @Nullable
    default e1 t(@NotNull e1 e1Var, @NotNull e1 e1Var2, @NotNull e1 e1Var3) {
        return null;
    }
}
