package io.ktor.serialization.kotlinx;

import io.ktor.http.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static final void a(@NotNull io.ktor.serialization.b bVar, @NotNull m contentType, @NotNull kotlinx.serialization.a format) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(format, "format");
        io.ktor.serialization.b.a.b(bVar, contentType, new c(format), null, 4, null);
    }

    public static final void b(@NotNull io.ktor.serialization.b bVar, @NotNull m contentType, @NotNull r0 format) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(format, "format");
        io.ktor.serialization.b.a.b(bVar, contentType, new c(format), null, 4, null);
    }
}
