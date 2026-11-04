package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f297090a = "\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ";

    @NotNull
    public static final String a(@NotNull kotlinx.io.c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return kotlinx.io.i0.j(c0Var);
    }

    @kotlin.l(message = "Use close() instead", replaceWith = @kotlin.b1(expression = "close()", imports = {}))
    public static final void b(@NotNull kotlinx.io.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        xVar.close();
    }
}
