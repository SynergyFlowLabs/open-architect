package io.ktor.client.engine;

import io.ktor.http.w2;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    @NotNull
    public static final Proxy a(@NotNull p pVar, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return pVar.a(w2.f(urlString));
    }
}
