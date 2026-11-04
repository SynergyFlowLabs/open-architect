package io.ktor.client.utils;

import io.ktor.http.content.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends w.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f295415b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f295416c = 0;

    private h() {
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public Long a() {
        return Long.valueOf(f295416c);
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof h);
    }

    public int hashCode() {
        return 1450860306;
    }

    @NotNull
    public String toString() {
        return "EmptyContent";
    }
}
