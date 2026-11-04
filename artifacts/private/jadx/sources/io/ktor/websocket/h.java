package io.ktor.websocket;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends Exception implements kotlinx.coroutines.h0<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f297294a;

    public h(long j10) {
        this.f297294a = j10;
    }

    @Override // kotlinx.coroutines.h0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h b() {
        h hVar = new h(this.f297294a);
        io.ktor.util.internal.c.a(hVar, this);
        return hVar;
    }

    public final long c() {
        return this.f297294a;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return "Frame is too big: " + this.f297294a;
    }
}
