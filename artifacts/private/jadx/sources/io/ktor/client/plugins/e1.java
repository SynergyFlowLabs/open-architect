package io.ktor.client.plugins;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class e1 implements io.ktor.client.engine.h<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e1 f294787a = new e1();

    private e1() {
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof e1);
    }

    public int hashCode() {
        return 2058496954;
    }

    @NotNull
    public String toString() {
        return "HttpTimeoutCapability";
    }
}
