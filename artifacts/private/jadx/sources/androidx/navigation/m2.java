package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class m2 {
    public static final boolean a(@NotNull e2 e2Var, @androidx.annotation.d0 int i10) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        return e2Var.F0(i10) != null;
    }

    @NotNull
    public static final y1 b(@NotNull e2 e2Var, @androidx.annotation.d0 int i10) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        y1 y1VarF0 = e2Var.F0(i10);
        if (y1VarF0 != null) {
            return y1VarF0;
        }
        throw new IllegalArgumentException("No destination for " + i10 + " was found in " + e2Var);
    }
}
