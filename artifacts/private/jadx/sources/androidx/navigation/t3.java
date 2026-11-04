package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class t3 {
    @NotNull
    public static final <T extends q3<? extends y1>> T a(@NotNull r3 r3Var, @NotNull String name) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return (T) r3Var.f(name);
    }

    public static final void b(@NotNull r3 r3Var, @NotNull q3<? extends y1> navigator) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        r3Var.b(navigator);
    }

    @Nullable
    public static final q3<? extends y1> c(@NotNull r3 r3Var, @NotNull String name, @NotNull q3<? extends y1> navigator) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return r3Var.c(name, navigator);
    }
}
