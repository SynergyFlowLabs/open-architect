package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f41504a = false;

    @NotNull
    public static final a1 a(@Nullable y0 y0Var, @Nullable x0 x0Var) {
        return new a1(y0Var, x0Var);
    }

    @NotNull
    public static final x0 b(@NotNull x0 x0Var, @NotNull x0 x0Var2, float f10) {
        return x0Var.c() == x0Var2.c() ? x0Var : new x0(((u) e3.d(u.d(x0Var.b()), u.d(x0Var2.b()), f10)).j(), ((Boolean) e3.d(Boolean.valueOf(x0Var.c()), Boolean.valueOf(x0Var2.c()), f10)).booleanValue(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final y0 c(@NotNull y0 y0Var, @NotNull y0 y0Var2, float f10) {
        return y0Var;
    }
}
