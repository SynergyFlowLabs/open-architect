package io.ktor.client.plugins.websocket;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements io.ktor.client.engine.h<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f295203a = new c0();

    private c0() {
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof c0);
    }

    public int hashCode() {
        return 806573237;
    }

    @NotNull
    public String toString() {
        return "WebSocketExtensionsCapability";
    }
}
