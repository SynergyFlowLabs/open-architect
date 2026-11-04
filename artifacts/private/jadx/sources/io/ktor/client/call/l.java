package io.ktor.client.call;

import io.ktor.http.j1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static final void a(@Nullable Long l10, long j10, @NotNull j1 method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (l10 == null || l10.longValue() < 0 || Intrinsics.areEqual(method, j1.f295897b.d()) || l10.longValue() == j10) {
            return;
        }
        throw new IllegalStateException("Content-Length mismatch: expected " + l10 + " bytes, but received " + j10 + " bytes");
    }
}
