package io.ktor.http;

import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l2 {
    @NotNull
    public static final String a(@NotNull k2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return "http://localhost";
    }

    @NotNull
    public static final Url b(@NotNull Url.a aVar, @NotNull String fullUrl) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(fullUrl, "fullUrl");
        k2 k2Var = new k2(null, null, 0, null, null, null, null, null, false, 511, null);
        u2.b(k2Var, new URI(fullUrl));
        return k2Var.b();
    }
}
