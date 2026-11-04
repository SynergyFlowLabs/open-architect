package io.ktor.client.plugins.websocket;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements io.ktor.client.engine.h<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y f295257a = new y();

    private y() {
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof y);
    }

    public int hashCode() {
        return -1146563391;
    }

    @NotNull
    public String toString() {
        return "WebSocketCapability";
    }
}
