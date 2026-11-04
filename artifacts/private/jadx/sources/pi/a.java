package pi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    @NotNull
    public static final org.slf4j.c a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        org.slf4j.c cVarL = e.l(name);
        Intrinsics.checkNotNullExpressionValue(cVarL, "getLogger(...)");
        return cVarL;
    }
}
