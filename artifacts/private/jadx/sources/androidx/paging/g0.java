package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class g0 {
    public static final boolean a(@NotNull j3 j3Var, @Nullable j3 j3Var2, @NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (j3Var2 == null) {
            return true;
        }
        if ((j3Var2 instanceof j3.b) && (j3Var instanceof j3.a)) {
            return true;
        }
        if ((j3Var instanceof j3.b) && (j3Var2 instanceof j3.a)) {
            return false;
        }
        return (j3Var.a() == j3Var2.a() && j3Var.b() == j3Var2.b() && j3Var2.e(loadType) <= j3Var.e(loadType)) ? false : true;
    }
}
