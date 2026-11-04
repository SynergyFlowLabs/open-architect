package io.ktor.client.engine;

import io.ktor.http.Url;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f294352a = new p();

    private p() {
    }

    @NotNull
    public final Proxy a(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(url.u(), url.z()));
    }

    @NotNull
    public final Proxy b(@NotNull String host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(host, i10));
    }
}
