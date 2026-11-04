package com.devtodev.analytics.internal.backend.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendUserDataRetry extends BackendUserData {
    private final long retryAfter;

    public BackendUserDataRetry(long j10) {
        super(null);
        this.retryAfter = j10;
    }

    public static /* synthetic */ BackendUserDataRetry copy$default(BackendUserDataRetry backendUserDataRetry, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = backendUserDataRetry.retryAfter;
        }
        return backendUserDataRetry.copy(j10);
    }

    public final long component1() {
        return this.retryAfter;
    }

    @NotNull
    public final BackendUserDataRetry copy(long j10) {
        return new BackendUserDataRetry(j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BackendUserDataRetry) && this.retryAfter == ((BackendUserDataRetry) obj).retryAfter;
    }

    public final long getRetryAfter() {
        return this.retryAfter;
    }

    public int hashCode() {
        return Long.hashCode(this.retryAfter);
    }

    @NotNull
    public String toString() {
        return "BackendUserDataRetry(retryAfter=" + this.retryAfter + ")";
    }
}
