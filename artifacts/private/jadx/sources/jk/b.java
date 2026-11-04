package jk;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.l;
import okhttp3.m;
import okhttp3.u;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@i(name = "Internal")
public final class b {
    @NotNull
    public static final u.a a(@NotNull u.a builder, @NotNull String line) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(line, "line");
        return builder.f(line);
    }

    @NotNull
    public static final u.a b(@NotNull u.a builder, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return builder.g(name, value);
    }

    public static final void c(@NotNull l connectionSpec, @NotNull SSLSocket sslSocket, boolean z10) {
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        connectionSpec.f(sslSocket, z10);
    }

    @Nullable
    public static final f0 d(@NotNull okhttp3.c cache, @NotNull d0 request) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(request, "request");
        return cache.f(request);
    }

    @NotNull
    public static final String e(@NotNull m cookie, boolean z10) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return cookie.y(z10);
    }

    @Nullable
    public static final m f(long j10, @NotNull v url, @NotNull String setCookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(setCookie, "setCookie");
        return m.f334715j.f(j10, url, setCookie);
    }
}
