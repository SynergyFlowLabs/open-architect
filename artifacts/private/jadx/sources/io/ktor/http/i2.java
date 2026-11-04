package io.ktor.http;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface i2 {

    public static final class a {
        @kotlin.l(level = kotlin.n.ERROR, message = "Use localHost or serverHost instead")
        public static /* synthetic */ void a() {
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Use localPort or serverPort instead")
        public static /* synthetic */ void b() {
        }
    }

    @NotNull
    String A1();

    @NotNull
    String P2();

    @NotNull
    String a();

    @NotNull
    String b();

    @NotNull
    String c();

    int d();

    @NotNull
    String getLocalAddress();

    int getLocalPort();

    @NotNull
    j1 getMethod();

    int getPort();

    @NotNull
    String getRemoteAddress();

    int getRemotePort();

    @NotNull
    String getUri();

    @NotNull
    String getVersion();
}
