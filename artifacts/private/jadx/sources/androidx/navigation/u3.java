package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class u3 {
    @NotNull
    public static final <T extends q3<? extends y1>> T a(@NotNull r3 r3Var, @NotNull kotlin.reflect.d<T> clazz) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) r3Var.e(oj.b.e(clazz));
    }
}
