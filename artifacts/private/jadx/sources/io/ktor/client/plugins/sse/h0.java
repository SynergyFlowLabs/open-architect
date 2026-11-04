package io.ktor.client.plugins.sse;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements io.ktor.client.engine.h<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h0 f295070a = new h0();

    private h0() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj && !(obj instanceof h0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -177755299;
    }

    @NotNull
    public String toString() {
        return "SSECapability";
    }
}
