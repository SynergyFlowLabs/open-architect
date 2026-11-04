package io.ktor.client.plugins.websocket;

import io.ktor.http.d1;
import io.ktor.http.v0;
import io.ktor.http.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends fi.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f295258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v0 f295259d;

    public z() {
        String str = io.ktor.util.f.g(io.ktor.util.b0.f(16));
        this.f295258c = str;
        w0 w0Var = new w0(0, 1, null);
        d1 d1Var = d1.f295782a;
        w0Var.l(d1Var.K0(), "websocket");
        w0Var.l(d1Var.v(), com.google.common.net.d.N);
        w0Var.l(d1Var.x0(), str);
        w0Var.l(d1Var.z0(), "13");
        this.f295259d = w0Var.build();
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public v0 c() {
        return this.f295259d;
    }

    @Override // fi.u
    public void m(@NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        d1 d1Var = d1.f295782a;
        String str = headers.get(d1Var.v0());
        if (str == null) {
            throw new IllegalStateException(("Server should specify header " + d1Var.v0()).toString());
        }
        String strA = ki.a.a(this.f295258c);
        if (Intrinsics.areEqual(strA, str)) {
            return;
        }
        throw new IllegalStateException(("Failed to verify server accept header. Expected: " + strA + ", received: " + str).toString());
    }

    @NotNull
    public String toString() {
        return "WebSocketContent";
    }
}
