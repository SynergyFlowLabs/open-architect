package io.ktor.websocket;

import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f297309a = new j();

    private j() {
    }

    @Override // kotlinx.coroutines.o1
    public void dispose() {
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof j);
    }

    public int hashCode() {
        return 207988788;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }
}
