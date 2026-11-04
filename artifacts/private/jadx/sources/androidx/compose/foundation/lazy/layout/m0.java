package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static final int a(@NotNull l0 l0Var, @Nullable Object obj, int i10) {
        int iC;
        return (obj == null || l0Var.a() == 0 || (i10 < l0Var.a() && Intrinsics.areEqual(obj, l0Var.d(i10))) || (iC = l0Var.c(obj)) == -1) ? i10 : iC;
    }
}
