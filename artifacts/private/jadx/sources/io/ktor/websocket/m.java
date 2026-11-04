package io.ktor.websocket;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends Exception implements kotlinx.coroutines.h0<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f297335a;

    public m(@NotNull String violation) {
        Intrinsics.checkNotNullParameter(violation, "violation");
        this.f297335a = violation;
    }

    @Override // kotlinx.coroutines.h0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m b() {
        m mVar = new m(this.f297335a);
        io.ktor.util.internal.c.a(mVar, this);
        return mVar;
    }

    @NotNull
    public final String c() {
        return this.f297335a;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return "Received illegal frame: " + this.f297335a;
    }
}
