package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class j1 {
    public static final boolean a(@NotNull e0 e0Var, @NotNull e0 previous, @NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (e0Var.e() > previous.e()) {
            return true;
        }
        if (e0Var.e() < previous.e()) {
            return false;
        }
        return g0.a(e0Var.f(), previous.f(), loadType);
    }
}
